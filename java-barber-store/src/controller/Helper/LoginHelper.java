/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Helper;

import View.Login;
import model.Usuario;

/**
 *
 * @author Pichau
 */
public class LoginHelper implements Ihelper   {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario obterModelo(){
        String nome = view.getUser_tx().getText();
        String senha = view.getPassword_tx().getText();
        Usuario modelo= new Usuario(0, nome, senha);
        return modelo;
    
    } 
    public void setarModelo(Usuario modelo){
     String nome = modelo.getNome();
     String senha = modelo.getSenha();
     view.getUser_tx().setText(nome);
     view.getPassword_tx().setText(senha);
    }
    public void limparTela(){
    view.getUser_tx().setText("");
    view.getPassword_tx().setText("");
    }
    
   }

