package view.Estudantes;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListarEstudante extends JFrame {
  private JButton paginaInicial, estudantes, disciplinas, formacao, financas;
  private JLabel labelLogo, labelImagemFormacao;
  private JButton botaoComTi, botaoCadastrar, botaoMaisProcurado, botaoMenosProcurado, botaoGerarRelatorio;
  private ImageIcon logo, ImagemFormacao;
  private Color corFundo, corMais, corMenos;
  private GridBagConstraints g1, g2, g3, g4, g5, g6;
  private Object[][] dados = {
      { "01", "Matematica", "2000" },
      { "01", "Matematica", "2000" },
      { "01", "Matematica", "2000" },
      { "01", "Matematica", "2000" },
      { "01", "Matematica", "2000" },
      { "01", "Matematica", "2000" },

  };
  private String[] colunas = { "idDisplina", "Nome", "Preco" };
  private JScrollPane barraRolagem;
  private JTable tabela;

  public ListarEstudante() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(BorderLayout.NORTH, Logo());
    add(BorderLayout.CENTER, conteuddo());
    add(BorderLayout.WEST, Menu());
    pack();
    setVisible(true);
  }

  public void inicializarComponents() {
    paginaInicial = new JButton("Pagina Inicial");
    estudantes = new JButton("Estudantes   ");
    disciplinas = new JButton("Disciplinas    ");
    formacao = new JButton("   Formacao   ");
    financas = new JButton("  Finanacas   ");
    botaoComTi = new JButton("    Lista     de  Disciplinas          ");botaoComTi.setHorizontalAlignment(SwingConstants.LEFT);barraRolagem = new JScrollPane(tabela);     
    logo = new ImageIcon();
    corFundo = new Color(30, 30, 30);
    corMenos = new Color(216, 155, 155, 1);
    corMais = new Color(83, 231, 133, 1);
    g1 = new GridBagConstraints();
    g2 = new GridBagConstraints();
    g3 = new GridBagConstraints();
    g4 = new GridBagConstraints();
    g5 = new GridBagConstraints();
    g6 = new GridBagConstraints();
    botaoCadastrar = new JButton("Cadastra Novo");botaoCadastrar.setPreferredSize(new Dimension(150,35));
    botaoMaisProcurado = new JButton("Mais Procuradas"); botaoMaisProcurado.setBackground(Color.GREEN);
    botaoMenosProcurado = new JButton("Menos Procuradas");     botaoMenosProcurado.setBackground(Color.pink);
    botaoGerarRelatorio = new JButton("Gerar Relatorio");botaoGerarRelatorio.setPreferredSize(new Dimension(150,35));
    tabela = new JTable(dados, colunas);
    botaoComTi.setEnabled(false);
    ImagemFormacao = new ImageIcon("Img/addpeople.png");
  }

  public JPanel Logo() {
    inicializarComponents();
    logo = new ImageIcon("Img/logo.png");
    JPanel aux = new JPanel(new FlowLayout(FlowLayout.LEFT));
    aux.add(labelLogo = new JLabel(logo));
    aux.setPreferredSize(new Dimension(1500, 130));
    aux.setBackground(corFundo);
    return aux;
  }

  public JPanel Menu() {
    inicializarComponents();
    JPanel aux = new JPanel();
    aux.setLayout(new BoxLayout(aux, BoxLayout.PAGE_AXIS));
    aux.add(Box.createRigidArea(new Dimension(10, 10)));
    aux.add(paginaInicial);
    aux.add(Box.createRigidArea(new Dimension(10, 10)));
    aux.add(estudantes);
    aux.add(Box.createRigidArea(new Dimension(10, 10)));
    aux.add(disciplinas);
    aux.add(Box.createRigidArea(new Dimension(10, 10)));
    aux.add(formacao);
    aux.add(Box.createRigidArea(new Dimension(10, 10)));
    aux.add(financas);
    aux.setPreferredSize(new Dimension(150,600));
    aux.setBackground(corFundo);
    return aux;
  }

  private JPanel conteuddo() {
    inicializarComponents();
    JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));

    
    JPanel conteudoPrincipal = new JPanel(new GridBagLayout());
    conteudoPrincipal.setBorder(new EmptyBorder(30, 3, 4, 5));

    JPanel agrupaDoisBotoes = new JPanel(new GridLayout(2,1,10,10));
    agrupaDoisBotoes.setBorder(new EmptyBorder(30, 2, 40, 5));
    agrupaDoisBotoes.setBackground(Color.white);


    agrupaDoisBotoes.add(new JLabel("Pesquisar estudante")); 
    agrupaDoisBotoes.add(new JLabel(""));



    g1.gridx = 0;
    g1.anchor = GridBagConstraints.WEST;

    g2.gridx = 0;
    g2.anchor = GridBagConstraints.WEST;

    g3.gridx = 0;
    g3.anchor = GridBagConstraints.WEST;
    g3.ipadx = 700;

    g4.gridx = 0;
    g4.anchor = GridBagConstraints.WEST;

    g5.gridx = 0;
    g5.anchor = GridBagConstraints.EAST;


    JPanel listaComTabela = new JPanel();
    barraRolagem.setPreferredSize(new Dimension(700, 100));
    listaComTabela.add(barraRolagem);
    listaComTabela.setBackground(Color.white);



    labelImagemFormacao = new JLabel(ImagemFormacao);

    JPanel agrupaCadastrarRela  = new JPanel();
    agrupaCadastrarRela.setBorder(new EmptyBorder(100, 10, 10, 5));
    botaoCadastrar.setForeground(Color.WHITE);
    botaoCadastrar.setBackground(corFundo);

    botaoGerarRelatorio.setBackground(corFundo);
    botaoGerarRelatorio.setForeground(Color.WHITE);

    agrupaCadastrarRela.add(botaoCadastrar);
    agrupaCadastrarRela.add(botaoGerarRelatorio);
    agrupaCadastrarRela.setBackground(Color.white);

    conteudoPrincipal.add(labelImagemFormacao, g1);
    conteudoPrincipal.add(agrupaDoisBotoes, g2);
    conteudoPrincipal.add(botaoComTi,g3);
    conteudoPrincipal.add(listaComTabela,g4);
    conteudoPrincipal.setBackground(Color.white);
    conteudoPrincipal.add(agrupaCadastrarRela,g5);

    flow.add(conteudoPrincipal);
    flow.setBackground(Color.white);
    return flow;
  }

  public static void main(String[] args) {
    new ListarEstudante();
  }

}
