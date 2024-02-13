/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.agenda;
import View.menu_principal;

/**
 *
 * @author Pichau
 */
public class menu_principal_controller {
    private final  menu_principal view;

    public menu_principal_controller(menu_principal view) {
        this.view = view;
    }
     public void NevegarParaAgenda(){
         agenda Agenda = new agenda();
         Agenda.setVisible(true);
     }
    
}
