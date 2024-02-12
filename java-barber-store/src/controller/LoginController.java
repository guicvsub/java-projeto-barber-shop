/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Login;
import controller.Helper.LoginHelper;
import model.Usuario;

/**
 *
 * @author Pichau
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper= new LoginHelper(view);
    }
    
    public void fizTarefa(){
        System.out.println("busquei algo no banco de dados");
        this.view.exibeMensagem("execultei a tarefa");
    }
    public void entrarNosisema(){
        Usuario usuario = helper.obterModelo();
    
    }
}
