/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Login;
import model.Usuario;

/**
 *
 * @author Pichau
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void fizTarefa(){
        System.out.println("busquei algo no banco de dados");
        this.view.exibeMensagem("execultei a tarefa");
    }
    public void entrarNosisema(){

    
    }
}
