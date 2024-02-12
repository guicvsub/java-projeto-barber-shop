/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Pichau
 */
public class Usuario extends Pessoa{
   
   protected String NivelAcesso;
    protected String senha;

    public Usuario( int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario( int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg,String NivelAcesso, String senha) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.NivelAcesso = NivelAcesso;
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
 
     
}
