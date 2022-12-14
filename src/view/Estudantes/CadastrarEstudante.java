package Estudantes;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import controller.EstudanteController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastrarEstudante extends JFrame {
    private JButton bCadastrarEst;
    private JTextField txtNome, txtContato, txtValorPago, txtNivel, txtItem1, txtItem2, txtItem3,txtHora;    
    private GridBagConstraints g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g91, g92, g11, g93, g94, g20, g21;

    public CadastrarEstudante() {
        setLayout(new BorderLayout());
        setIconImage((new ImageIcon("Img/logo.png")).getImage());
        add(BorderLayout.CENTER, conteuddo());
        pack();
        setVisible(true);
    }

    public void inicializarComponents() {
        g1 = new GridBagConstraints();
        g2 = new GridBagConstraints();
        g3 = new GridBagConstraints();
        g4 = new GridBagConstraints();
        g5 = new GridBagConstraints();
        g6 = new GridBagConstraints();
        g7 = new GridBagConstraints();
        g8 = new GridBagConstraints();
        g9 = new GridBagConstraints();
        g91 = new GridBagConstraints();
        g92 = new GridBagConstraints();
        g10 = new GridBagConstraints();
        g93 = new GridBagConstraints();
        g94 = new GridBagConstraints();
        g11 = new GridBagConstraints();
        g20 = new GridBagConstraints();
        g21 = new GridBagConstraints();
        txtNome = new JTextField();
        txtNome.setPreferredSize(new Dimension(150, 30));
        txtContato = new JTextField();
        txtContato.setPreferredSize(new Dimension(150, 30));
        txtItem1 = new JTextField();
        txtItem1.setPreferredSize(new Dimension(150, 30));
        txtItem2 = new JTextField();
        txtItem2.setPreferredSize(new Dimension(150, 30));
        txtItem3 = new JTextField();
        txtItem3.setPreferredSize(new Dimension(150, 30));
        txtValorPago = new JTextField();
        txtValorPago.setPreferredSize(new Dimension(150, 30));
        txtNivel = new JTextField();
        txtNivel.setPreferredSize(new Dimension(50, 30));
        txtHora = new JTextField();
        txtHora.setPreferredSize(new Dimension(50, 30));
        bCadastrarEst = new JButton("Cadastrar Estudante", new ImageIcon("Img/salvar.png"));
        bCadastrarEst.setBackground(Color.WHITE);

    }


    private JPanel conteuddo() {
        inicializarComponents();
        JPanel flow = new JPanel(new GridBagLayout());
        flow.setBackground(Color.WHITE);
        flow.setBorder(new EmptyBorder(30, 3, 4, 5));

        g1.gridx = 0;
        g1.gridy = 0;
        g1.anchor = GridBagConstraints.WEST;

        g2.gridx = 0;
        g2.gridy = 1;
        g2.anchor = GridBagConstraints.WEST;
        g2.insets = new Insets(1, 1, 10, 1);

        g3.gridx = 1;
        g3.gridy = 0;
        g3.anchor = GridBagConstraints.CENTER;
        g3.insets = new Insets(1, 1, 10, 1);

        g4.gridx = 1;
        g4.gridy = 1;
        g4.anchor = GridBagConstraints.CENTER;
        g4.insets = new Insets(1, 1, 10, 1);

        g5.gridx = 0;
        g5.gridy = 2;
        g5.anchor = GridBagConstraints.WEST;
        g5.insets = new Insets(1, 1, 10, 1);

        g6.gridx = 0;
        g6.gridy = 3;
        g6.anchor = GridBagConstraints.WEST;
        g6.insets = new Insets(1, 1, 10, 1);

        g7.gridx = 0;
        g7.gridy = 4;
        g7.anchor = GridBagConstraints.WEST;
        g7.insets = new Insets(1, 1, 10, 1);

        g8.gridx = 0;
        g8.gridy = 5;
        g8.anchor = GridBagConstraints.WEST;
        g8.insets = new Insets(1, 1, 10, 1);

        g9.gridx = 0;
        g9.gridy = 6;
        g9.anchor = GridBagConstraints.WEST;
        g9.insets = new Insets(1, 1, 10, 1);

        g10.gridx = 0;
        g10.gridy = 7;
        g10.anchor = GridBagConstraints.WEST;
        g10.insets = new Insets(1, 1, 1, 1);

        g91.gridx = 0;
        g91.gridy = 9;
        g91.anchor = GridBagConstraints.WEST;
        g91.insets = new Insets(1, 1, 10, 1);

        g92.gridx = 0;
        g92.gridy = 10;
        g92.anchor = GridBagConstraints.WEST;
        g92.insets = new Insets(1, 1, 10, 1);

        g93.gridx = 0;
        g93.gridy = 11;
        g93.anchor = GridBagConstraints.WEST;
        g93.insets = new Insets(1, 1, 10, 1);

        g94.gridx = 0;
        g94.gridy = 12;
        g94.anchor = GridBagConstraints.WEST;
        g94.insets = new Insets(1, 1, 10, 1);

        g20.gridx = 1;
        g20.gridy = 2;
        g20.anchor = GridBagConstraints.CENTER;
        g20.insets = new Insets(10, 1, 1, 1);

        g21.gridx = 1;
        g21.gridy = 3;
        g21.anchor = GridBagConstraints.CENTER;
        g21.insets = new Insets(1, 1, 10, 1);

        g11.gridx = 0;
        g11.gridy = 15;
        g11.anchor = GridBagConstraints.WEST;
        g11.insets = new Insets(10, 1, 10, 1);

        flow.add(new JLabel("Nome do Estudante "), g1);
        flow.add(txtNome, g2);
        flow.add(new JLabel("contacto "), g3);
        flow.add(txtContato, g4);
        flow.add(new JLabel("Valor Pago"), g5);
        flow.add(txtValorPago, g6);
        flow.add(new JLabel("Nivel"), g7);
        flow.add(txtNivel, g8);
        flow.add(new JLabel("Intem 1"), g9);
        flow.add(txtItem1, g10);
        flow.add(new JLabel("Intem 2"), g91);
        flow.add(txtItem2, g92);
        flow.add(new JLabel("Intem 3"), g93);
        flow.add(txtItem3, g94);
        flow.add(new JLabel("Hora"), g20);
        flow.add(txtHora, g21);
        flow.add(bCadastrarEst, g11);

        bCadastrarEst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valorPg = Float.parseFloat(txtValorPago.getText());
                Boolean resposta;


               resposta = new EstudanteController().cadastrarEstudante(txtNome.getText(), valorPg, txtContato.getText(), txtNivel.getText(), txtItem1.getText(), txtItem2.getText(), txtItem3.getText(), txtHora.getText());


               if(resposta) {
                dispose();
                JOptionPane.showMessageDialog(null, "cadastrado com sucesso");
               } else {
                JOptionPane.showMessageDialog(null, "erro no cadastro");
               }


            }
        });

        return flow;
    }
}
