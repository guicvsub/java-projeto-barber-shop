/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Servico.Correio;
import model.DAO.ServicoDAO;
import model.DAO.ClienteDAO;
import View.agenda;
import controller.Helper.AgendaHrlper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.DAO.AgendamentoDAO;
import model.Servico;

/**
 *
 * @author Pichau
 */
public class AgendaController {
    private final agenda view;
    private final AgendaHrlper helper;
    

    public AgendaController(agenda view) {
        this.view = view;
        this.helper = new AgendaHrlper(view);
    }
    public void atualizaTabela(){
    //busca dados no banco 
    AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //ecibir lista na view
        helper.preencherTabela(agendamentos);
        
    }
    
 public void atualizaCliente() {
    // Buscar cliente do banco de dados
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> clientes = clienteDAO.selectAll();
    
    // Exibir cliente na combobox 
    
    // Aqui você pode usar a lista de clientes para exibir na combobox
  
    // Por exemplo, você pode iterar sobre a lista e adicionar os clientes à combobox
     helper.preencherClientes(clientes);

}
 public void atualizaServico(){
         ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
     
 }
 public void atualizaValor(){
 Servico servico = helper.obterServico();
 helper.srtarValor(servico.getValor());
 }
 public void agendar(){
     
     Agendamento agendamento = helper.obterModelo();//buscar objeto agendamento da tela
     new AgendamentoDAO().insert(agendamento);//inserir no banco
   
     atualizaTabela();
     helper.limparTela();
 
 }
}
