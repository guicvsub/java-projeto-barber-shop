package controller.Helper;

import View.agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;

/**
 *
 * @author Pichau
 */
public class AgendaHrlper {
   private final agenda view;

    public AgendaHrlper(agenda view) {
        this.view = view;
    }

   public void preencherTabela(ArrayList<Agendamento> agendamentos) {
    DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
    tableModel.setNumRows(0);
    
    // Percorrer lista preenchendo tabela
    for (Agendamento agendamento : agendamentos) {
        tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getdataformatada(), // Data do agendamento
                agendamento.Gethoraformatada(), // Hora do agendamento
                agendamento.getObservacao()
        });
    }
}   
}
