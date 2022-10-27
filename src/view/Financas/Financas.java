package view.Financas;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYZDataset;

public class Financas extends JFrame {
private JButton paginaInicial,estudantes,disciplinas,formacao,financas,botaoEstudanteRegular,botaoEstudanteNaoRegular,botaoDisciplina, botaoFormacacao,botaoComTi;
private JLabel labelLogo;
private ImageIcon logo;
private Color corFundo;
private GridBagConstraints  g1,g2, g3, g4, g5,g6;
private JTextField nomeDisciplina,precoDisciplina;


public Financas() {
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
    financas =   new JButton("     Finanças   ");
    botaoComTi = new JButton("Finanças           ");
    corFundo = new Color(30, 30, 30);
    g1 = new GridBagConstraints();
    g2 = new GridBagConstraints();
    g3 = new GridBagConstraints();
    g4 = new GridBagConstraints();
    g5 = new GridBagConstraints();
    g6 = new GridBagConstraints();
    // botaoCadastrar = new JButton("Cadastra");  botaoCadastrar.setPreferredSize(new Dimension(100,50));
    logo = new ImageIcon("Img/logo.png");
    labelLogo = new JLabel(logo);
    nomeDisciplina = new  JTextField(); nomeDisciplina.setPreferredSize(new Dimension(700,50));
    precoDisciplina =  new JTextField(); precoDisciplina.setPreferredSize(new Dimension(700,50  ));
    botaoEstudanteRegular = new JButton("Estudantes Regular Total : $20000");botaoEstudanteRegular.setEnabled(false);botaoEstudanteRegular.setPreferredSize(new Dimension(100,120));
    botaoEstudanteNaoRegular = new JButton("Estudantes NRegular Total : $20000");botaoEstudanteNaoRegular.setEnabled(false);
    botaoDisciplina = new JButton("Disciplinas : $20000");botaoDisciplina.setEnabled(false);
    botaoFormacacao = new JButton("Formação : $20000");botaoFormacacao.setEnabled(false);
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

  public JPanel  criargrafico(){
    JPanel painel = new JPanel();
    DefaultCategoryDataset  barChartData = new DefaultCategoryDataset();
    barChartData.setValue(2000, "matimbe", "Novembro");
    barChartData.setValue(3000, "jose", "Novembro");
    barChartData.setValue(6000, "justino", "Novembro");
    barChartData.setValue(16000, "justino", "Novembro");


    JFreeChart barChart = ChartFactory.createBarChart("Retabilidade","Mês", "Valores Pagos",barChartData, PlotOrientation.VERTICAL, false, true, false);
    CategoryPlot  barchrt  = barChart.getCategoryPlot();
    barchrt.setRangeGridlinePaint(Color.ORANGE);



    ChartPanel barPanel = new  ChartPanel(barChart);
    painel.setBackground(Color.white);
    painel.add(barPanel);

    return painel;
}
  
  private JPanel conteuddo() {
    inicializarComponents();
    JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JPanel conteudoPrincipal = new JPanel(new GridBagLayout());
    conteudoPrincipal.setBorder(new EmptyBorder(30,3, 4, 5));

    
    JPanel painCard = new JPanel(new GridLayout(1, 4, 10,10));
    painCard.add(botaoEstudanteRegular);
    painCard.add(botaoEstudanteNaoRegular);
    painCard.add(botaoDisciplina);
    painCard.add(botaoFormacacao);

    painCard.setBackground(Color.white);
                                                      
    g1.gridx = 0;
    g1.ipadx = 1050;

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
    conteudoPrincipal.add(painCard,g2);
    conteudoPrincipal.add(criargrafico(),g2 );



    conteudoPrincipal.setBackground(Color.WHITE);
    flow.add(conteudoPrincipal);
    flow.setBackground(Color.WHITE);
    return flow;
  }


  public static void main(String[] args) {
    new Financas();
  }

  


}
