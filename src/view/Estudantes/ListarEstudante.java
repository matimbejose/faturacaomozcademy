package Estudantes;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.EstudanteController;
import model.ValueObject.Estudante;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListarEstudante extends JPanel   {

    private JButton  bCadastrarEst;
    private JButton bGerarRelatorio;
    private JTable tblEstudantes;
    private JScrollPane scrEstudantes;
    private ImageIcon  imgAddEst;
    JButton getbRefresh;

    private void listarValore() {

    }




    public ListarEstudante(){
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER , conteuddo());

        EstudanteController ec = new EstudanteController();
        DefaultTableModel modelo = (DefaultTableModel) tblEstudantes.getModel();

        for(Estudante est : ec.read()){
            modelo.addRow(new Object[]{
                est.getIdEstudante(),
                est.getNome(),
                est.getNivel(),
                est.getNomeItem(),
                est.getStatus(),
                est.getData_inscriao()
            });

        }

        setVisible(true);
        
    }



    public void inicializarComponents() {
        imgAddEst = new ImageIcon("Img/addpeople.png");
        bCadastrarEst= new JButton("Cadastrar Estudante",imgAddEst);
        bCadastrarEst.setBackground(Color.WHITE);
                bCadastrarEst.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CadastrarEstudante cd = new CadastrarEstudante();
                    }
                });


        tblEstudantes = new JTable();
        Object [] columns ={"idEstudante","nome","nivel","nome_Item","status","data_inscricao"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        tblEstudantes.setModel(model);
        tblEstudantes.setAutoCreateRowSorter(true);


        scrEstudantes = new JScrollPane(tblEstudantes);
        bGerarRelatorio = new JButton("Gerar Relatorio", new ImageIcon("Img/impressao.png"));bGerarRelatorio.setBackground(Color.WHITE);
    }





    private JPanel conteuddo() {
        inicializarComponents();
        JPanel painConteudo = new JPanel();
        painConteudo.setBorder(new EmptyBorder(20,20,20,20));
        painConteudo.setLayout(new BoxLayout(painConteudo, BoxLayout.Y_AXIS));
        painConteudo.add(painSup());

        painConteudo.add(peinMedio2());
        painConteudo.add(painButInferior());

        return painConteudo;
    }

    private JPanel peinMedio2() {
        JPanel painMed2 = new JPanel();
        painMed2.setLayout(new BoxLayout(painMed2, BoxLayout.Y_AXIS));
        painMed2.add(scrEstudantes);
        return painMed2;
    }

    private JPanel painButInferior() {
        JPanel painButInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painButInferior.add(bGerarRelatorio);


        return painButInferior;

    }


    private JPanel painSup() {
        JPanel painSup = new JPanel(new FlowLayout(FlowLayout.LEFT));
            painSup.add(bCadastrarEst);
        return painSup;
    }


}

