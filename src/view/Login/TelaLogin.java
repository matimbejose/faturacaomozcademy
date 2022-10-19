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

    private void inicializaJanela(){
        this.setSize(500,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Login");
    }

    private void inicializarComponentes(){
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
        painButaoLogin.setBounds(100,575,600,50);
        painButaoLogin.add(bLogin);
    }

    private TelaLogin(){
        inicializaJanela();
        inicializarComponentes();
        this.add(painelPrincipal());
        this.add(painButaoLogin);
    }

    private JPanel painelPrincipal() {
        JPanel painelPrincipal = new JPanel(new GridLayout(1,2));
        //painelPrincipal.setLayout(new BoxLayout(painelPrincipal,BoxLayout.X_AXIS));
        painelPrincipal.setBounds(100, 180, 600,390);
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

        g1.gridy++;painelDireito.add(txtEmail, g1);

        g1.gridy+=3;painelDireito.add(labSenha,g1);

        g1.fill=GridBagConstraints.BOTH;
        g1.gridy++;painelDireito.add(pwSenha,g1);

        return painelDireito;
    }

    private JPanel painelEsquerdo() {
        JPanel painelEsquerdo = new JPanel(new BorderLayout());
        painelEsquerdo.add(labImagem,BorderLayout.CENTER);
        painelEsquerdo.setBackground(Color.BLACK);

        return painelEsquerdo;
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}
