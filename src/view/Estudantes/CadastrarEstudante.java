package view.Estudantes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CadastrarEstudante extends JFrame {

    private JButton paginaInicial,estudantes,disciplinas,formacao,financas, bCadastrarEst;
    private JLabel labelLogo;
    private JButton botaoComTi;

    JTextField txtNome, txtDtInscricao;
    JRadioButton radFormacao, radDisciplina, radNiv5,radNiv6,radNiv7,radNiv8,radNiv9,radNiv10,radNiv11,radNiv12;
    ButtonGroup grpForamacao_Disciplina;
    ButtonGroup grpNiveis;
    JLabel labNome, labDtInscricao, labFormacao_Preco, labNivel, labSuperior;
    JButton bCadastrar;

    JCheckBox chExcel,chWord, chPPoint;


    private ImageIcon logo;
    private Color corFundo;
    private GridBagConstraints  g1,g2, g3, g4, g5;

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



    public void inicializarComponents() {
        paginaInicial = new JButton("Pagina Inicial");paginaInicial.setBackground(Color.WHITE);paginaInicial.setForeground(Color.BLACK);
        estudantes = new   JButton("Estudantes    ");estudantes.setBackground(Color.WHITE);estudantes.setForeground(Color.BLACK);
        disciplinas =  new JButton("Disciplinas     ");disciplinas.setBackground(Color.WHITE);disciplinas.setForeground(Color.BLACK);
        formacao =  new JButton("   Formacao    ");formacao.setBackground(Color.WHITE);formacao.setForeground(Color.BLACK);
        financas =   new JButton("  Finanacas    ");financas.setBackground(Color.WHITE);financas.setForeground(Color.BLACK);
        botaoComTi = new JButton();
        logo = new ImageIcon();


        corFundo = new Color(30, 30, 30);
        g1 = new GridBagConstraints();
        g2 = new GridBagConstraints();
        g3 = new GridBagConstraints();
        g4 = new GridBagConstraints();
        g5 = new GridBagConstraints();

        txtNome = new JTextField();txtNome.setBackground(Color.BLACK);
        txtNome.setForeground(Color.WHITE);
        txtDtInscricao = new JTextField();txtDtInscricao.setBackground(Color.BLACK);
        txtDtInscricao.setForeground(Color.WHITE);

        labNome = new JLabel("Nome");
        labDtInscricao = new JLabel("Data de Inscricao");
        labFormacao_Preco = new JLabel("Formacao // Preco");labFormacao_Preco.setBackground(Color.GRAY);
        labFormacao_Preco.setBorder(new LineBorder(Color.BLACK));
        labNivel = new JLabel("Nivel");labNivel.setBackground(Color.GRAY);
        labNivel.setBorder(new LineBorder(Color.BLACK));
        labSuperior = new JLabel("Formulario Para Cadastro de Estudante");labSuperior.setBorder(new LineBorder(Color.BLACK));
        labSuperior.setBackground(Color.GRAY);

        chExcel = new JCheckBox("Excel - 500MZN");
        chPPoint = new JCheckBox("Power Point - 750MZN");
        chWord = new JCheckBox("Word 500MZN");

        radFormacao = new JRadioButton("Formacao");
        radDisciplina = new JRadioButton("Disciplina");
        grpForamacao_Disciplina = new ButtonGroup();grpForamacao_Disciplina.add(radFormacao);
        grpForamacao_Disciplina.add(radDisciplina);

        radNiv5 = new JRadioButton("5* Nivel");
        radNiv6 = new JRadioButton("6* Nivel");
        radNiv7 = new JRadioButton("7* Nivel");
        radNiv8 = new JRadioButton("8* Nivel");
        radNiv9 = new JRadioButton("9* Nivel");
        radNiv10 = new JRadioButton("10* Nivel");
        radNiv11 = new JRadioButton("11* Nivel");
        radNiv12 = new JRadioButton("12* Nivel");
        grpNiveis = new ButtonGroup(); grpNiveis.add(radNiv5);
        grpNiveis.add(radNiv6);
        grpNiveis.add(radNiv7);
        grpNiveis.add(radNiv8);
        grpNiveis.add(radNiv9);
        grpNiveis.add(radNiv10);
        grpNiveis.add(radNiv11);
        grpNiveis.add(radNiv12);

        g1 = new GridBagConstraints();

        bCadastrar = new JButton("Cadastrar");bCadastrar.setBackground(Color.BLACK);
                                                    bCadastrar.setForeground(Color.WHITE);

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

    public JPanel painBaixo(){
        JPanel paineSupDireito = new JPanel();
        paineSupDireito.setLayout(new BoxLayout(paineSupDireito,BoxLayout.Y_AXIS));
        paineSupDireito.add(labDtInscricao);
        paineSupDireito.add(txtDtInscricao);

        JPanel painSupEsquero = new JPanel();
        painSupEsquero.setLayout(new BoxLayout(painSupEsquero, BoxLayout.Y_AXIS));
        painSupEsquero.add(labNome);
        painSupEsquero.add(txtNome);

        JPanel painAuxSuperior = new JPanel(new GridLayout(1,2));
        painAuxSuperior.add(painSupEsquero);
        painAuxSuperior.add(paineSupDireito);


        JPanel painBaixo = new JPanel(new GridBagLayout());
        //painBaixo.setBorder(new EmptyBorder(10,10,10,10));
        painBaixo.setBackground(Color.WHITE);

        g1.weighty=1;
        g1.weightx=1;
        g1.gridx=0;
        g1.gridy=0;
        g1.anchor = GridBagConstraints.BASELINE_LEADING;
        g1.fill=GridBagConstraints.BOTH;painBaixo.add(painSupEsquero,g1);

        g1.gridy=1;
        //g1.gridwidth=2;painBaixo.add(txtNome,g1);


        g1.anchor=GridBagConstraints.EAST;
        g1.gridy=3;painBaixo.add(radFormacao,g1);

        g1.gridy=4;painBaixo.add(labFormacao_Preco,g1);
        g1.gridy=5;painBaixo.add(chExcel,g1);
        g1.gridy=6;painBaixo.add(chWord,g1);
        g1.gridy=7;painBaixo.add(chPPoint,g1);

        g1.gridx=2;
        g1.gridy=3;painBaixo.add(radDisciplina,g1);

        g1.gridy=4;painBaixo.add(labNivel,g1);

        g1.gridy=5;painBaixo.add(radNiv5,g1);
        g1.gridy=6;painBaixo.add(radNiv6,g1);
        g1.gridy=7;painBaixo.add(radNiv7,g1);
        g1.gridy=8;painBaixo.add(radNiv8,g1);
        g1.gridy=9;painBaixo.add(radNiv9,g1);
        g1.gridy=10;painBaixo.add(radNiv10,g1);
        g1.gridy=11;painBaixo.add(radNiv11,g1);
        g1.gridy=12;painBaixo.add(radNiv12,g1);

        g1.gridx=4;
        g1.gridy=0;painBaixo.add(paineSupDireito,g1);
        //g1.gridy=1;painBaixo.add(txtDtInscricao,g1);

        g1.gridy=14;painBaixo.add(bCadastrar, g1);


        return painBaixo;

    }

    private JPanel conteuddo() {
        inicializarComponents();
        JPanel painConteudo = new JPanel(new BorderLayout());
        painConteudo.add(labSuperior, BorderLayout.NORTH);
        painConteudo.add(painBaixo(), BorderLayout.CENTER);


        return painConteudo;
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


}
