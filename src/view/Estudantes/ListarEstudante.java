package view.Estudantes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ListarEstudante extends JFrame {

    private JButton paginaInicial,estudantes,disciplinas,formacao,financas, bCadastrarEst;
    private JLabel labelLogo, labelPesquisarEst;
    private JButton botaoComTi, bGerarRelatorio, bCadastNovo;
    private JTable tblEstudantes;
    private JScrollPane scrEstudantes;
    private JTextField txtPesqEstudante;
    private ImageIcon logo, imgAddEst;
    private Color corFundo;
    private GridBagConstraints  g1,g2,g3,g4,g5;

    public ListarEstudante(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Estudantes");
        add(BorderLayout.NORTH, Logo());
        add(BorderLayout.CENTER , conteuddo());
        add(BorderLayout.WEST, Menu());

        pack();
        setVisible(true);
    }



    public void inicializarComponents() {
        paginaInicial = new JButton("Pagina Inicial");paginaInicial.setBackground(Color.WHITE);paginaInicial.setForeground(Color.BLACK);
        estudantes = new   JButton("Estudantes    ");estudantes.setBackground(Color.WHITE);estudantes.setForeground(Color.BLACK);
        disciplinas =  new JButton("Disciplinas     ");disciplinas.setBackground(Color.WHITE);disciplinas.setForeground(Color.BLACK);
        formacao =  new JButton("   Formacao    ");formacao.setBackground(Color.WHITE);formacao.setForeground(Color.BLACK);
        financas =   new JButton("  Finanacas    ");financas.setBackground(Color.WHITE);financas.setForeground(Color.BLACK);
        botaoComTi = new JButton();
        bCadastrarEst= new JButton("Cadastrar Estudante",imgAddEst);bCadastrarEst.setBackground(Color.WHITE);
        logo = new ImageIcon();
        imgAddEst = new ImageIcon("Img/addpeople.png");
        labelLogo = new JLabel();
        corFundo = new Color(30, 30, 30);
        String[] colunasEstudantes = {"idEstudante", "Nome","Nivel","Formacao/disciplina","Status","Data De Inscricao"};
        String[][] conteudoEstudantes = {{"01","Clementina","12 classe","Matematica","Regular","17-03-2022"},{"02","Jose","2 ano","Power Point","Nao-Regular","9-10-2022"}};
        tblEstudantes = new JTable(conteudoEstudantes, colunasEstudantes);
        scrEstudantes = new JScrollPane(tblEstudantes);
        scrEstudantes.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrEstudantes.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        labelPesquisarEst = new JLabel("Imforme o nome do Estudante a Pesquisar");
        txtPesqEstudante = new JTextField(200);
        bCadastNovo = new JButton("cadastrar Novo");bCadastNovo.setBackground(Color.BLACK);bCadastNovo.setForeground(Color.WHITE);
        bGerarRelatorio = new JButton("Gerar Relatorio");bGerarRelatorio.setForeground(Color.WHITE);bGerarRelatorio.setBackground(Color.BLACK);
        g1= new GridBagConstraints();
        g2= new GridBagConstraints();
        g3= new GridBagConstraints();
        g4= new GridBagConstraints();

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


    private JPanel conteuddo() {
        inicializarComponents();
        JPanel painConteudo = new JPanel();
        painConteudo.setBorder(new EmptyBorder(20,20,20,20));
        painConteudo.setLayout(new BoxLayout(painConteudo, BoxLayout.Y_AXIS));
        painConteudo.add(painSup());
        painConteudo.add(new JPanel());
        painConteudo.add(new JPanel());
        painConteudo.add(new JPanel());
        painConteudo.add(painMedio1());
        painConteudo.add(new JPanel());
        painConteudo.add(new JPanel());
        painConteudo.add(peinMedio2());
        painConteudo.add(painButInferior());
        return painConteudo;
    }

    private JPanel peinMedio2() {
        JPanel painMed2 = new JPanel();
        painMed2.setLayout(new BoxLayout(painMed2, BoxLayout.Y_AXIS));
        painMed2.add(scrEstudantes);
        return painMed2;
    }

    private JPanel painButInferior() {
        JPanel painButInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painButInferior.setBorder(new EmptyBorder(30,3, 4, 5));
        painButInferior.add(bGerarRelatorio);
        painButInferior.add(bCadastNovo);
        return painButInferior;

    }

    private JPanel painMedio1() {
        g1.gridx = 0; g2.gridx = 1;

        JPanel painelPesquisar = new JPanel(new GridBagLayout());
        painelPesquisar.add(txtPesqEstudante, g1);
        painelPesquisar.add(new JButton("b"),g2);

        JPanel painMedio = new JPanel();
        painMedio.setLayout(new BoxLayout(painMedio,BoxLayout.Y_AXIS));
        painMedio.add(labelPesquisarEst);
        painMedio.add(painelPesquisar);

        return painMedio;
    }

    private JPanel painSup() {
        JPanel painSup = new JPanel(new FlowLayout(FlowLayout.LEFT));
            painSup.add(bCadastrarEst);

        return painSup;
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
        aux.add(Box.createRigidArea(new Dimension(10,10)));
        aux.add(formacao);
        aux.add(Box.createRigidArea(new Dimension(10,10)));
        aux.add(financas);
        aux.setPreferredSize(new Dimension(150,600));
        aux.setBackground(corFundo);
        return aux;
    }
    public static void main(String[] args) {
        new ListarEstudante();
    }
}