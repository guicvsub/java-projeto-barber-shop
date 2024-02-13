package controller.Helper;

import View.agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;

/**
 *
 * @author Pichau
 */
public class AgendaHrlper implements Ihelper{
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

    public void preencherClientes(ArrayList<Cliente> clientes) {
      DefaultComboBoxModel ComboBoxModel =(DefaultComboBoxModel) view.getBox_cliente().getModel();
        for (Cliente cliente : clientes) {
            ComboBoxModel.addElement(cliente);
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
    DefaultComboBoxModel ComboBoxModel =(DefaultComboBoxModel) view.getBox_serviço().getModel();
        for (Servico servico : servicos) {
            ComboBoxModel.addElement(servico);
            
        }
       
    }


    
    public Servico obterServico() {
      return(Servico) view.getBox_serviço().getSelectedItem();
    }

         public Cliente obterCliente() {
      return(Cliente) view.getBox_cliente().getSelectedItem();
        }   
       public void srtarValor(float valor) {
    view.getCampovalor().setText(valor+"");

       
       }

    @Override
    public Agendamento obterModelo() {
     String Idstring =view.getId_tx().getText();
     int id =Integer.parseInt(Idstring);
     Cliente cliente = obterCliente();
     Servico servico = obterServico();
     String valorString=view.getId_tx().getText();
     float valor = Float.parseFloat(valorString);
     String data =view.getData_tx().getText();
     String hora = view.getHora_tx().getText();
     String dataHora= data +" " + hora;  
     String observaçao = view.getjTextArea1().getText();
     
     Agendamento agendamento =  new Agendamento(id, cliente, servico, valor, dataHora, observaçao);
     return agendamento;
    }

    @Override
    public void limparTela() {
       view.getId_tx().setText("");
       view.getHora_tx().setText("");
       view.getjTextArea1().setText("");
       view.getData_tx().setText("");
    }

    }

