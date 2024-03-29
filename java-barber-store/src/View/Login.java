/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.DAO.Banco;
import controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Pichau
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;
   

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
    controller= new LoginController(this);
    Banco.inicia();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrar_bt = new javax.swing.JButton();
        password_tx = new javax.swing.JPasswordField();
        user_tx = new javax.swing.JTextField();
        senha_lab = new javax.swing.JLabel();
        usuario_lab = new javax.swing.JLabel();
        log_lab = new javax.swing.JLabel();
        painel_black = new javax.swing.JLabel();
        bghome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrar_bt.setText("Entrar");
        entrar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_btActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 690, -1, -1));
        getContentPane().add(password_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 240, -1));

        user_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txActionPerformed(evt);
            }
        });
        getContentPane().add(user_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 230, -1));

        senha_lab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha_lab.setForeground(new java.awt.Color(255, 255, 255));
        senha_lab.setText("senha");
        getContentPane().add(senha_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 160, -1));

        usuario_lab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario_lab.setForeground(new java.awt.Color(255, 255, 255));
        usuario_lab.setText("usuario");
        getContentPane().add(usuario_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 160, -1));

        log_lab.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        log_lab.setForeground(new java.awt.Color(255, 255, 255));
        log_lab.setText("login");
        getContentPane().add(log_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, -1));

        painel_black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(painel_black, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        bghome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(bghome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txActionPerformed

    private void entrar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_btActionPerformed
     this.controller.entrarNoSistema();
        
        
    }//GEN-LAST:event_entrar_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bghome;
    private javax.swing.JButton entrar_bt;
    private javax.swing.JLabel log_lab;
    private javax.swing.JLabel painel_black;
    private javax.swing.JPasswordField password_tx;
    private javax.swing.JLabel senha_lab;
    private javax.swing.JTextField user_tx;
    private javax.swing.JLabel usuario_lab;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getPassword_tx() {
        return password_tx;
    }

    public void setPassword_tx(JPasswordField password_tx) {
        this.password_tx = password_tx;
    }

    public JTextField getUser_tx() {
        return user_tx;
    }

    public void setUser_tx(JTextField user_tx) {
        this.user_tx = user_tx;
    }
    
}
