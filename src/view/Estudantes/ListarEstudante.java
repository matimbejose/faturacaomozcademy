package Estudantes;

import model.DataAccessObject.EstudanteDAO;
import model.ValueObject.Estudante_Da_Tabela;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListarEstudante extends JPanel   {

    private JButton  bCadastrarEst;
    private JButton bGerarRelatorio,  bRefresh;
    private JTable tblEstudantes;
    private JScrollPane scrEstudantes;
    private ImageIcon  imgAddEst;
    JButton getbRefresh;

    private void listarValore(){

    }




    public ListarEstudante(){
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER , conteuddo());
        setVisible(true);
        listarValore();
    }



    public void inicializarComponents() {
        bRefresh = new JButton("Refresh");
        bRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    EstudanteDAO objEstudanteDAO = new EstudanteDAO();
                    DefaultTableModel model = (DefaultTableModel) tblEstudantes.getModel();
                    model.setNumRows(0);

                    ArrayList<Estudante_Da_Tabela> listaEst = objEstudanteDAO.listarEstudante();
                    for(int num =0; num<listaEst.size();num++){
                        model.addRow(new Object[]{
                                listaEst.get(num).getIdEst(),
                                listaEst.get(num).getNome(),
                                listaEst.get(num).getNivel(),
                                listaEst.get(num).getTipo(),
                                listaEst.get(num).getStatus(),
                                listaEst.get(num).getDtInscricao()
                        });

                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Listar Estudantes View"+ex);
                }
            }
        });


        imgAddEst = new ImageIcon("Img/addpeople.png");
        bCadastrarEst= new JButton("Cadastrar Estudante",imgAddEst);
        bCadastrarEst.setBackground(Color.WHITE);
                bCadastrarEst.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CadastrarEstudante cd = new CadastrarEstudante();
                        System.out.print("ele entrou ");
                    }
                });


        tblEstudantes = new JTable();
        Object [] columns ={"idEstudante","nome","nivel","tipo","status","dt_inscricao"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        tblEstudantes.setModel(model);
        tblEstudantes.setAutoCreateRowSorter(true);

        scrEstudantes = new JScrollPane(tblEstudantes);
        bGerarRelatorio = new JButton("Gerar Relatorio");bGerarRelatorio.setForeground(Color.WHITE);bGerarRelatorio.setBackground(Color.BLACK);

        bRefresh = new JButton("Show From DB");

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
        painButInferior.add(bRefresh);
        painButInferior.add(bGerarRelatorio);


        return painButInferior;

    }


    private JPanel painSup() {
        JPanel painSup = new JPanel(new FlowLayout(FlowLayout.LEFT));
            painSup.add(bCadastrarEst);
        return painSup;
    }


//    public void lista() {
//        EstudanteDAO objEstudanteDao = new EstudanteDAO();
//        try {
//            while (objEstudanteDao.listarEstudantes().next()) {
//                String idEstudante = String.valueOf(objEstudanteDao.listarEstudantes().getInt("idEstudante"));
//                String nome = objEstudanteDao.listarEstudantes().getString("nome");
//                String nivel = objEstudanteDao.listarEstudantes().getString("nivel");
//                String tipo = objEstudanteDao.listarEstudantes().getString("tipo");
//                String status = objEstudanteDao.listarEstudantes().getString("status");
//                String dt_inscricao = String.valueOf(objEstudanteDao.listarEstudantes().getDate("dt_inscricao"));
//
//
//                String tbData[] = {idEstudante, nome, nivel, tipo, status, dt_inscricao};
//                DefaultTableModel tblModel = (DefaultTableModel) tblEstudantes.getModel();
//
//                tblModel.addRow(tbData);
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ListarEstudantes" + ex);
//
//        }
//}


}

