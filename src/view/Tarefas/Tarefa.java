package view.Tarefas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class Tarefa extends JFrame {
  
private JButton paginaInicial,estudantes,disciplinas,formacao,financas;
private JLabel labelLogo;
private JButton botaoComTi;
private ImageIcon logo;
private Color corFundo;
private GridBagConstraints  g1,g2, g3, g4, g5;


public Tarefa() {
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
    estudantes = new   JButton("Estudantes    ");
    disciplinas =  new JButton("Disciplinas     ");
    formacao =  new JButton("   Formacao    ");
    financas =   new JButton("  Finanacas    ");
    botaoComTi = new JButton();
    logo = new ImageIcon();
    labelLogo = new JLabel();
    corFundo = new Color(30, 30, 30);
    g1 = new GridBagConstraints();
    g2 = new GridBagConstraints();
    g3 = new GridBagConstraints();
    g4 = new GridBagConstraints();
    g5 = new GridBagConstraints();
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
    aux.setPreferredSize(new Dimension(130,750));
    aux.setBackground(corFundo);
    return aux;
  }

  
  private JPanel conteuddo() {
    inicializarComponents();

    JPanel auxiliar = new JPanel(new FlowLayout(FlowLayout.LEADING));
    JPanel aux = new JPanel(new GridBagLayout());
    aux.setBorder(new EmptyBorder(50, 5, 5, 5));
    botaoComTi = new JButton("Formulario Para Cadastro de Tarefas      ");
    botaoComTi.setEnabled(false);

    



    aux.add(botaoComTi,g1);

    aux.add(new JLabel("Nome da Tarefa"));

    aux.add(new JTextArea(20, 110));



    auxiliar.add(aux);
    return auxiliar;
  }

  

  public static void main(String[] args) {
    new Tarefa();
  }

}
