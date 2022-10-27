package view.Estudantes;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CadastrarEstudante extends JFrame {

    private JButton paginaInicial,estudantes,disciplinas,formacao,financas, bCadastrarEst,botaoComTi;
    private JLabel labelLogo;
    private JTextField txtNome, txtDtInscricao;
    JRadioButton radFormacao, radDisciplina, radNiv5,radNiv6,radNiv7,radNiv8,radNiv9,radNiv10,radNiv11,radNiv12;
    ButtonGroup grpForamacao_Disciplina;
    ButtonGroup grpNiveis;
    JLabel labNome, labDtInscricao, labFormacao_Preco, labNivel, labSuperior;
    JButton bCadastrar;
    JCheckBox chExcel,chWord, chPPoint;
    private ImageIcon logo;
    private Color corFundo;
    private GridBagConstraints  g1,g2, g3, g4, g5,gbc1,gbc2,gbc3,gbc4, gbc5,gbc6;

    public CadastrarEstudante(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Estudantes");
        add(BorderLayout.NORTH, Logo());
        add(BorderLayout.CENTER , conteuddo());
        add(BorderLayout.WEST, Menu());
        pack();
        setVisible(true);
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



    public void inicializarComponents() {
        paginaInicial = new JButton("Pagina Inicial");paginaInicial.setBackground(Color.WHITE);paginaInicial.setForeground(Color.BLACK);
        estudantes = new   JButton("Estudantes    ");estudantes.setBackground(Color.WHITE);estudantes.setForeground(Color.BLACK);
        disciplinas =  new JButton("Disciplinas     ");disciplinas.setBackground(Color.WHITE);disciplinas.setForeground(Color.BLACK);
        formacao =  new JButton("   Formacao    ");formacao.setBackground(Color.WHITE);formacao.setForeground(Color.BLACK);
        financas =   new JButton("  Finanacas    ");financas.setBackground(Color.WHITE);financas.setForeground(Color.BLACK);
        botaoComTi = new JButton("Formulario Para Cadastro de Estudante  ");
        logo = new ImageIcon();
        corFundo = new Color(30, 30, 30);
        g1 = new GridBagConstraints();
        g2 = new GridBagConstraints();
        g3 = new GridBagConstraints();
        g4 = new GridBagConstraints();
        gbc1 = new GridBagConstraints();
        gbc2 = new GridBagConstraints();
        gbc3 = new GridBagConstraints();
        gbc4 = new GridBagConstraints();
        gbc6 = new GridBagConstraints();
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
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JPanel conteudoPrincipal = new JPanel(new GridBagLayout());
        conteudoPrincipal.setBorder(new EmptyBorder(30,3, 4, 5));        
        botaoComTi.setHorizontalAlignment(SwingConstants.LEFT);
        botaoComTi.setEnabled(false);

        g1.gridx = 0;
        g1.ipadx = 700;

        g1.gridx = 0;
        g1.gridx = 0;
        g1.anchor = GridBagConstraints.WEST;
        g1.insets = new Insets(20, 1, 1, 1);




        
        
        
        conteudoPrincipal.add(botaoComTi,g1); 
        conteudoPrincipal.add(new JLabel("Nome"), g1);
        conteudoPrincipal.setBackground(Color.white);
        flow.add(conteudoPrincipal);
        flow.setBackground(Color.WHITE);
        return flow;
    }

 

    public static void main(String[] args) {
        new CadastrarEstudante();
    }


}
