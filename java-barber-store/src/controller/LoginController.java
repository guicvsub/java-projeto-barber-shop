/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAO.UsuarioDAO;
import View.Login;
import View.menu_principal;
import controller.Helper.LoginHelper;
import model.DAO.Banco;
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
          Banco.inicia();

        
    }
        public void entrarNoSistema(){
          
    
       Usuario usuario =helper.obterModelo();
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario user_at = usuarioDAO.selectPorNomeESenha(usuario);
       if( user_at != null){
           menu_principal menu= new menu_principal();
           menu.setVisible(true);
           this.view.dispose();
           
           
       }
       else{
           view.exibeMensagem("usuario ou senhas invalidos");
           
       } 
    
    }
  
}
