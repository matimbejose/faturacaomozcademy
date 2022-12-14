package Formacao;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.ItemController;
import model.ValueObject.Item;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListarFormacao extends JPanel  {
  private JButton botaoCadastrar, botaoMaisProcurado, botaoMenosProcurado, botaoGerarRelatorio, botaoCadastrarFormacao;
  private ImageIcon ImagemFormacao;
  private JTable tabelaFormaacoes;
  private JScrollPane scrTabFormacoes;

  public ListarFormacao() {
    setLayout(new BorderLayout());
    add(BorderLayout.CENTER, conteuddo());
    ItemController ic = new ItemController();
        DefaultTableModel modelo = (DefaultTableModel) tabelaFormaacoes.getModel();

        for(Item it : ic.readF()){
            modelo.addRow(new Object[]{
                it.getIdItem(),
                it.getNome(),
                it.getPreco()
            });
        }

        setVisible(true);
  }

  public void inicializarComponents() {
    botaoCadastrar = new JButton("Cadastra Novo");botaoCadastrar.setPreferredSize(new Dimension(150,45));
    botaoMaisProcurado = new JButton("Mais Procuradas");botaoMaisProcurado.setBackground(Color.BLACK);botaoMaisProcurado.setForeground(Color.WHITE);
    botaoMenosProcurado = new JButton("Menos Procuradas");botaoMenosProcurado.setBackground(Color.BLACK);botaoMenosProcurado.setForeground(Color.WHITE);
 
    
      tabelaFormaacoes = new JTable();
      DefaultTableModel model = new DefaultTableModel();
      Object[] colunas = {"idFormacao", "Nome", "Preco" };
      model.setColumnIdentifiers(colunas);
      tabelaFormaacoes.setModel(model);
      tabelaFormaacoes.setAutoCreateRowSorter(true);

      scrTabFormacoes = new JScrollPane(tabelaFormaacoes);

    ImagemFormacao = new ImageIcon("Img/certificacao.png");

    botaoCadastrarFormacao = new JButton("Cadastrar Formacao", ImagemFormacao);
      botaoCadastrarFormacao.setBackground(Color.white);

      botaoCadastrarFormacao.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       CadastrarFormacao cf = new CadastrarFormacao();
      }
    });



    botaoMaisProcurado.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ItemController ic = new ItemController();
        String nomeMaisProc = ic.formMaisProc()[0];
        String valPago = ic.formMaisProc()[1];
    JOptionPane.showMessageDialog(null, nomeMaisProc+"\n"+valPago);
      }
    });

    botaoMenosProcurado.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ItemController ic = new ItemController();
        String nomeMaisProc = ic.formMenosProc()[0];
        String valPago = ic.formMenosProc()[1];
    JOptionPane.showMessageDialog(null, nomeMaisProc+"\n"+valPago);
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
    painMed2.add(scrTabFormacoes);
    return painMed2;
}

private JPanel painButInferior() {
    JPanel painButInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    return painButInferior;

}


private JPanel painSup() {
    JPanel painSup = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painSup.add(botaoCadastrarFormacao);
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
  painConteudo.add(painButInferior());

  return painConteudo;
}

}
