package view.PaginaInicial;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Tela_Pagina_Inicia extends JFrame {
    private JButton paginaInicial,estudantes,disciplinas,formacao,financas, bCadastrarEst;
    private JLabel labelLogo;
    private JButton botaoComTi;
    private ImageIcon logo;
    private Color corFundo;
    private GridBagConstraints  g1,g2, g3, g4, g5;

    JLabel labTarefas_Admin;
    JCheckBox radTerminar, radFazerTelas, radImplementar;
    JButton bRemov1, bAdicionarTarefa, bRemov2, bRemov3;


    public Tela_Pagina_Inicia(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Pagina Inicial");
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

        labelLogo = new JLabel();
        corFundo = new Color(30, 30, 30);
        g1 = new GridBagConstraints();
        g2 = new GridBagConstraints();
        g3 = new GridBagConstraints();
        g4 = new GridBagConstraints();
        g5 = new GridBagConstraints();

        labTarefas_Admin = new JLabel("Tarefas do Administrador");
        radTerminar = new JCheckBox("Terminar");
        radFazerTelas = new JCheckBox("Fazer Telas");
        radImplementar = new JCheckBox("Implementar");


        bRemov1 = new JButton("Remover");bRemov1.setBackground(Color.WHITE);
        bRemov2 = new JButton("Remover");bRemov2.setBackground(Color.WHITE);
        bRemov3 = new JButton("Remover");bRemov3.setBackground(Color.WHITE);
        bAdicionarTarefa = new JButton("Adicionar Tarefa");bAdicionarTarefa.setBackground(Color.BLACK);bAdicionarTarefa.setForeground(Color.WHITE);

    }

    public JPanel Logo() {
        inicializarComponents();
        logo = new ImageIcon("C:\\Users\\Clemont\\Desktop\\Elihud, Cl\\POO II\\Grupo2\\Prrojecto_Grupo2\\src\\view\\logo.png");
        JPanel aux = new JPanel(new FlowLayout(FlowLayout.LEFT));
        aux.add(labelLogo = new JLabel(logo));
        aux.setPreferredSize(new Dimension(1500, 130));
        aux.setBackground(corFundo);

        return aux;
    }

    public ChartPanel criargrafico(){
        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("Nao-Regular",10);
        pizza.setValue("Regular", 4);

        JFreeChart grafico = ChartFactory.createPieChart("Situacao dos Estudantes",pizza, true,true,false);
        //PARAMETROS >>>> (titulo, o grafico, legendas-visiveis ou nao, tipo de cada fatia,  url)
        ChartPanel painel = new ChartPanel(grafico);

        return painel;

    }


    public JPanel painelSuperior(){
        JPanel painSuperior = new JPanel(new GridLayout(1,2));
        JPanel painDireito=new JPanel();
        painDireito.setBackground(Color.white);

        painSuperior.add(criargrafico());
        painSuperior.add(painDireito);

        return painSuperior;
    }

    public JPanel painInferior(){
        JPanel painInferior = new JPanel(new GridBagLayout());
        painInferior.setBounds(50,50,600,450);
        painInferior.setBackground(Color.LIGHT_GRAY);

        g1.weightx=1;
        g1.weighty=1;

        g1.anchor=GridBagConstraints.WEST;
        g1.gridx=0;
        g1.gridy=0;painInferior.add(radTerminar,g1);

        g1.gridy=1;painInferior.add(radFazerTelas,g1);

        g1.gridy = 2;painInferior.add(radImplementar,g1);

        g1.anchor=GridBagConstraints.EAST;
        g1.gridy=0;
        g1.gridx=4;painInferior.add(bRemov1,g1);

        g1.gridy=1;painInferior.add(bRemov2,g1);
        g1.gridy=2;painInferior.add(bRemov3,g1);

        return painInferior;
    }

    private JPanel conteuddo() {
        inicializarComponents();
        JPanel painConteudo = new JPanel();
        painConteudo.setBorder(new EmptyBorder(20,20,20,20));
        
        painConteudo.setLayout(new BoxLayout(painConteudo, BoxLayout.Y_AXIS));

        painConteudo.add(painelSuperior());
        painConteudo.add(labTarefas_Admin);
        painConteudo.add(painInferior());

        JPanel painAuxInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painAuxInferior.add(bAdicionarTarefa);
        painConteudo.add(painAuxInferior);

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

    public static void main(String[] args) {
        new Tela_Pagina_Inicia();
    }
}
