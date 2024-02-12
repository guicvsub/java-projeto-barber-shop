/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Paula e Weden
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonEntrar = new java.awt.Button();
        TextUser = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        JlabelSenha = new javax.swing.JLabel();
        JlabelUsuario = new javax.swing.JLabel();
        JlabelLogin = new javax.swing.JLabel();
        JlabelPainelLogin = new javax.swing.JLabel();
        JlabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonEntrar.setBackground(java.awt.Color.darkGray);
        buttonEntrar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        buttonEntrar.setForeground(java.awt.Color.white);
        buttonEntrar.setLabel("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 230, 40));

        TextUser.setBackground(java.awt.Color.darkGray);
        TextUser.setForeground(java.awt.Color.lightGray);
        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        getContentPane().add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 230, 40));

        TextSenha.setBackground(java.awt.Color.darkGray);
        TextSenha.setForeground(java.awt.Color.lightGray);
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 230, 40));

        JlabelSenha.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        JlabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        JlabelSenha.setText("Senha");
        getContentPane().add(JlabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 100, -1));

        JlabelUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        JlabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JlabelUsuario.setText("Usuário");
        getContentPane().add(JlabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 70, -1));

        JlabelLogin.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        JlabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        JlabelLogin.setText("LOGIN");
        getContentPane().add(JlabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 100, -1));

        JlabelPainelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(JlabelPainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 570, 530));

        JlabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(JlabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 821, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

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
    private javax.swing.JLabel JlabelFundo;
    private javax.swing.JLabel JlabelLogin;
    private javax.swing.JLabel JlabelPainelLogin;
    private javax.swing.JLabel JlabelSenha;
    private javax.swing.JLabel JlabelUsuario;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUser;
    private java.awt.Button buttonEntrar;
    // End of variables declaration//GEN-END:variables
}
