package view.Disciplina;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CadastrarDisciplina extends JFrame {
private JButton paginaInicial,estudantes,disciplinas,formacao,financas;
private JLabel labelLogo;
private JButton botaoComTi,botaoCadastrar;
private ImageIcon logo;
private Color corFundo;
private GridBagConstraints  g1,g2, g3, g4, g5,g6;
private JTextField nomeDisciplina,precoDisciplina;


public CadastrarDisciplina() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(BorderLayout.NORTH, Logo());
    add(BorderLayout.CENTER , conteuddo());
    add(BorderLayout.WEST, Menu());
    pack();
    setVisible(true);
  }


  public void inicializarComponents() {
    paginaInicial = new JButton("Pagina Inicial");
    estudantes = new   JButton("Estudantes   ");
    disciplinas =  new JButton("Disciplinas    ");
    formacao =  new JButton("   Formacao   ");
    financas =   new JButton("  Finanacas   ");
    botaoComTi = new JButton("Formulario Para Cadastro de  Disciplinas      ");
    corFundo = new Color(30, 30, 30);
    g1 = new GridBagConstraints();
    g2 = new GridBagConstraints();
    g3 = new GridBagConstraints();
    g4 = new GridBagConstraints();
    g5 = new GridBagConstraints();
    g6 = new GridBagConstraints();
    botaoCadastrar = new JButton("Cadastra");  botaoCadastrar.setPreferredSize(new Dimension(100,50));
    logo = new ImageIcon("Img/logo.png");
    labelLogo = new JLabel(logo);
    nomeDisciplina = new  JTextField(); nomeDisciplina.setPreferredSize(new Dimension(700,50));
    precoDisciplina =  new JTextField(); precoDisciplina.setPreferredSize(new Dimension(700,50  ));
  }
 
  public JPanel Logo() {
    inicializarComponents();
    JPanel aux = new JPanel(new FlowLayout(FlowLayout.LEFT));
    aux.add(labelLogo);
    aux.setPreferredSize(new Dimension(1500, 130));
    aux.setBackground(corFundo);
    return aux;
  }


  public JPanel Menu() {
    inicializarComponents();
    JPanel aux = new JPanel();
    aux.setLayout(new BoxLayout(aux, BoxLayout.PAGE_AXIS));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(paginaInicial);
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(estudantes);
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(disciplinas);
    aux.add(Box.createRigidArea(new Dimension(10,10))) ;
    aux.add(formacao);
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(financas);
    aux.setPreferredSize(new Dimension(150,600));
    aux.setBackground(corFundo);
    return aux;
  }

  
  private JPanel conteuddo() {
    inicializarComponents();
    JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JPanel conteudoPrincipal = new JPanel(new GridBagLayout());
    conteudoPrincipal.setBorder(new EmptyBorder(30,3, 4, 5));
                                                      
    g1.gridx = 0;
    g1.ipadx = 700;

    g2.gridx = 0;                                                                                                                                                                             
    g2.anchor = GridBagConstraints.WEST;
    g2.insets = new Insets(20, 1, 1, 1);

    g3.gridx = 0;
    g3.anchor = GridBagConstraints.WEST;
    g3.insets = new Insets(20, 1, 1, 1);

    g4.gridx = 0;
    g4.anchor = GridBagConstraints.WEST;
    g4.insets = new Insets(20, 1, 1, 1);


    g5.gridx = 0;
    g5.anchor = GridBagConstraints.WEST;
    g5.insets = new Insets(20, 1, 1, 1);


    g6.gridx = 0;
    g6.anchor = GridBagConstraints.WEST;
    g6.insets = new Insets(20, 1, 1, 1);



    botaoComTi.setHorizontalAlignment(SwingConstants.LEFT);
    botaoComTi.setEnabled(false);
    conteudoPrincipal.add(botaoComTi,g1); 
    conteudoPrincipal.add(new JLabel("Nome da Disciplina "),g2);
    conteudoPrincipal.add(nomeDisciplina,g3);
    botaoCadastrar.setBackground(corFundo);
    conteudoPrincipal.add(new JLabel("Preco"),g4);
    conteudoPrincipal.add(precoDisciplina, g5);
    botaoCadastrar.setForeground(Color.WHITE);
    conteudoPrincipal.add(botaoCadastrar,g6);
    conteudoPrincipal.setBackground(Color.WHITE);
    flow.add(conteudoPrincipal);
    flow.setBackground(Color.WHITE);
    return flow;
  }

  


}
