/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.agenda;
import controller.Helper.AgendaHrlper;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;

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
}
