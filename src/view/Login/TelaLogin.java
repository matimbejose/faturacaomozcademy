package view.Login;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    JLabel labEmail, labSenha;
    JTextField txtEmail;
    JPasswordField pwSenha;
    JLabel labImagem, labelImgUser;
    ImageIcon img;
    GridBagConstraints g1;

    JPanel painButaoLogin;

    JButton bLogin;

    public void inicializaJanela(){
        setSize(1000,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setTitle("Login");
    }

    public void inicializarComponentes(){
        //The labels
        labEmail = new JLabel("Email:");labEmail.setForeground(Color.WHITE);
        labSenha = new JLabel("Senha:");labSenha.setForeground(Color.WHITE);
        labelImgUser = new JLabel();
        ImageIcon imgUser = new ImageIcon("Img/user_short.png");
            labelImgUser.setIcon(imgUser);

        //The textField
        txtEmail = new JTextField(10);

        //the passwordField
        pwSenha = new JPasswordField();

        //the logo
        img = new ImageIcon("Img/logo.png");
        labImagem = new JLabel();
        labImagem.setIcon(img);

        bLogin = new JButton("Login");bLogin.setBackground(Color.BLACK);bLogin.setForeground(Color.WHITE);

        g1 = new GridBagConstraints();

        painButaoLogin = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painButaoLogin.setBounds(100,600,750,80);
        painButaoLogin.add(bLogin);
    }

    public TelaLogin(){

        inicializaJanela();
        inicializarComponentes();
        add(painelPrincipal());
        add(painButaoLogin);

        pack();

        setVisible(true);
    }

    private JPanel painelPrincipal() {
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(1,2));
        painelPrincipal.setBounds(150, 150, 700,400);
        painelPrincipal.add(painelEsquerdo());
        painelPrincipal.add(painelDireito());

        return painelPrincipal;
    }

    private JPanel painelDireito() {
        JPanel painelDireito = new JPanel(new GridBagLayout());
        painelDireito.setBackground(Color.BLACK);
        g1.gridheight=1;
        g1.gridwidth=1;
        g1.gridx=0;
        g1.gridy=0;
        g1.fill=GridBagConstraints.HORIZONTAL;
        g1.anchor=GridBagConstraints.WEST;painelDireito.add(labelImgUser,g1);

        g1.gridy++;painelDireito.add(labEmail,g1);

        g1.gridy++;
        g1.fill=GridBagConstraints.VERTICAL;painelDireito.add(txtEmail, g1);

        g1.gridy+=3;painelDireito.add(labSenha,g1);

        g1.fill=GridBagConstraints.BOTH;
        g1.gridy++;painelDireito.add(pwSenha,g1);

        return painelDireito;
    }

    private JPanel painelEsquerdo() {
        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setLayout(new BorderLayout());
        painelEsquerdo.add(labImagem,BorderLayout.CENTER);
        painelEsquerdo.setBackground(Color.BLACK);

        return painelEsquerdo;
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}
