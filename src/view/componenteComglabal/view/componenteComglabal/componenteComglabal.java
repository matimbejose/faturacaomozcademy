package view.componenteComglabal;

import java.awt.*;
import javax.swing.*;



public class componenteComglabal extends JPanel {
  
private JButton paginaInicial,estudantes,disciplinas,formacao,financas;
private JLabel labelLogo;
private ImageIcon logo;
private Color corFundo;


public componenteComglabal(JPanel content) {
    setLayout(new BorderLayout());
    add(BorderLayout.NORTH, Logo());
    add(BorderLayout.CENTER , conteuddo(content));
    add(BorderLayout.WEST, Menu());
  }

  public void inicializarComponents() {
    paginaInicial = new JButton();
    estudantes = new JButton();
    disciplinas = new JButton();
    formacao = new JButton();
    financas = new JButton();
    logo = new ImageIcon();
    labelLogo = new JLabel();
    corFundo = new Color(30, 30, 30);
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
    aux.add(paginaInicial = new JButton("Pagina Inicial"));
    aux.add(Box.createRigidArea(new Dimension(10,10)));
    aux.add(estudantes = new JButton("Estudantes    "), new ImageIcon("Img/money.png"));
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


  public JPanel conteuddo(JPanel content) {
    JPanel aux = new JPanel(new BorderLayout());
    aux.add(BorderLayout.CENTER, content);
    return aux;
  }


}
