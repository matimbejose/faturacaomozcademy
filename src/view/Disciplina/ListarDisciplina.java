package Disciplina;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import controller.ItemController;
import model.ValueObject.Item;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListarDisciplina extends JPanel {
  private JButton  botaoCadastrar, botaoMaisProcurado, botaoMenosProcurado;
  private ImageIcon  ImagemFormacao;
  private JScrollPane scrTblDisciplinas;
  private JTable tabelaDisciplinas;

  

  public ListarDisciplina() {
    setLayout(new BorderLayout());
    add(BorderLayout.CENTER, conteuddo());
    ItemController ic = new ItemController();
    DefaultTableModel modelo = (DefaultTableModel) tabelaDisciplinas.getModel();

    for(Item est : ic.readD()){
        modelo.addRow(new Object[]{
            est.getIdItem(),
            est.getNome(),
            est.getPreco()
        });

    }
    setVisible(true);
  }

  public void inicializarComponents() {
    botaoCadastrar = new JButton("Cadastra Disciplina", new ImageIcon("Img/bookadd.png"));botaoCadastrar.setPreferredSize(new Dimension(300,150));botaoCadastrar.setBackground(Color.white);
    
    botaoMaisProcurado = new JButton("Mais Procuradas");botaoMaisProcurado.setBackground(Color.BLACK);botaoMaisProcurado.setForeground(Color.WHITE);
    botaoMenosProcurado = new JButton("Menos Procuradas");botaoMenosProcurado.setBackground(Color.BLACK);botaoMenosProcurado.setForeground(Color.WHITE);

    tabelaDisciplinas = new JTable();
    DefaultTableModel model = new DefaultTableModel();
    Object[] colunas = {"idDisciplina", "Nome", "Preco" };
    model.setColumnIdentifiers(colunas);
    tabelaDisciplinas.setModel(model);
    tabelaDisciplinas.setAutoCreateRowSorter(true);

    scrTblDisciplinas = new JScrollPane(tabelaDisciplinas);

    botaoMaisProcurado.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ItemController ic = new ItemController();
        String nomeMaisProc = ic.discMaisProc()[0];
        String valPago = ic.discMaisProc()[1];
    JOptionPane.showMessageDialog(null, nomeMaisProc+"\n"+valPago);
      }
    });

    botaoMenosProcurado.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ItemController ic = new ItemController();
        String nomeMaisProc = ic.discMenosProc()[0];
        String valPago = ic.discMenosProc()[1];
    JOptionPane.showMessageDialog(null, nomeMaisProc+"\n"+valPago);
      }
    });

    botaoCadastrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        CadastrarDisciplina cd = new CadastrarDisciplina();
      }
    });
  }

    
private JPanel painMedio1() {
  JPanel painMedio1 = new JPanel();
  painMedio1.setLayout(new FlowLayout(FlowLayout.LEFT));
  painMedio1.add(botaoMaisProcurado);
  painMedio1.add(botaoMenosProcurado);
  return painMedio1;
}

private JPanel peinMedio2() {
  JPanel painMed2 = new JPanel();
  painMed2.setLayout(new BoxLayout(painMed2, BoxLayout.Y_AXIS));
  painMed2.add(scrTblDisciplinas);
  return painMed2;
}



private JPanel painSup() {
  JPanel painSup = new JPanel(new FlowLayout(FlowLayout.LEFT));
      painSup.add(botaoCadastrar);
  return painSup;
}

private JPanel conteuddo() {
inicializarComponents();
JPanel painConteudo = new JPanel();
painConteudo.setBorder(new EmptyBorder(20,20,20,20));
painConteudo.setLayout(new BoxLayout(painConteudo, BoxLayout.Y_AXIS));
painConteudo.add(painSup());
painConteudo.add(painMedio1());

painConteudo.add(peinMedio2());

return painConteudo;
}

  

}


