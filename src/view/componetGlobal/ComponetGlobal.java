import java.awt.*;
import javax.swing.*;

public class ComponetGlobal extends JFrame {
private JButton paginaInicial,estudantes,disciplinas,formacao,financas;
private GridBagConstraints   pgIn, pgEst, pgDis,pgFor, pgFin;
private JLabel labelLogo;
private ImageIcon logo;
private Color corFundo;


public ComponetGlobal() {
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(BorderLayout.NORTH, Logo());
    // add(BorderLayout.CENTER , conteuddo());
    add(BorderLayout.WEST, Menu());
    pack();
    setVisible(true);
  }

  public void inicializarComponents() {
    paginaInicial = new JButton();
    estudantes = new JButton();
    disciplinas = new JButton();
    formacao = new JButton();
    financas = new JButton();
    logo = new ImageIcon();
    labelLogo = new JLabel();
    pgIn = new GridBagConstraints();
    pgEst = new GridBagConstraints();
    pgDis = new GridBagConstraints();
    pgFor = new GridBagConstraints();
    pgFin = new GridBagConstraints();
    corFundo = new Color(30, 30, 30);
  }
 
  public JPanel Logo() {
    inicializarComponents();
    logo = new ImageIcon("Img/logo.png");
    JPanel aux = new JPanel(new FlowLayout(FlowLayout.LEADING));
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
    aux.add(paginaInicial = new JButton("Pagina Inicial"));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(estudantes = new JButton("Estudantes    "));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(disciplinas = new JButton("Disciplinas     "));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(formacao = new JButton("   Formacao    "));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(financas = new JButton("  Finanacas    "));
    aux.setPreferredSize(new Dimension(130,750));
    aux.setBackground(corFundo);
    
    return aux;
  }


  public JPanel conteuddo() {
    JPanel aux = new JPanel();
    return aux;
  }

  public static void main(String[] args) {
    new ComponetGlobal();
  }


}
