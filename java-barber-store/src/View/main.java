/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author Pichau
 */
public class main {

    public static void main(String[] args) {
        String nome = "gui";
        System.out.println(nome);
        Servico barba = new Servico(1, "barba", 30);
        System.out.println(barba.getDescricao());
        Cliente cliernte = new Cliente (1, "gui", "salvador", "0008");
        System.out.println(cliernte.getId());
        Usuario usuario= new Usuario(1, "huicvsub", "senha");
        Agendamento agendamento = new Agendamento(1,cliernte,barba,30,"13/02/2024 09:15");
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
}
