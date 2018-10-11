package ox_group;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class RegisterPage extends javax.swing.JFrame {

  
    public RegisterPage() {
        
        initComponents();
        input_Name.setText("Name");
        input_Username.setText("Username");
        input_Pass.setText("Password");
        input_CPass.setText("Password");
    }

    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_edit = new javax.swing.JLabel();
        button_login = new javax.swing.JLabel();
        input_Username = new javax.swing.JTextField();
        input_Name = new javax.swing.JTextField();
        input_CPass = new javax.swing.JPasswordField();
        input_Pass = new javax.swing.JPasswordField();
        button_signup = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(button_edit);
        button_edit.setBounds(257, 530, 23, 23);

        button_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-li2.png"))); // NOI18N
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_loginMouseExited(evt);
            }
        });
        getContentPane().add(button_login);
        button_login.setBounds(641, 508, 250, 40);

        input_Username.setNextFocusableComponent(input_Pass);
        input_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_UsernameFocusLost(evt);
            }
        });
        getContentPane().add(input_Username);
        input_Username.setBounds(680, 261, 210, 30);

        input_Name.setNextFocusableComponent(input_Username);
        input_Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_NameFocusLost(evt);
            }
        });
        getContentPane().add(input_Name);
        input_Name.setBounds(680, 220, 210, 30);

        input_CPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_CPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_CPassFocusLost(evt);
            }
        });
        getContentPane().add(input_CPass);
        input_CPass.setBounds(680, 349, 210, 30);

        input_Pass.setNextFocusableComponent(input_CPass);
        input_Pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_PassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_PassFocusLost(evt);
            }
        });
        getContentPane().add(input_Pass);
        input_Pass.setBounds(680, 303, 210, 30);

        button_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-su.png"))); // NOI18N
        button_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_signupMouseExited(evt);
            }
        });
        getContentPane().add(button_signup);
        button_signup.setBounds(640, 410, 250, 40);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bt-close.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(980, 10, 30, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/BGlogin.png"))); // NOI18N
        BG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(BG);
        BG.setBounds(0, -1, 1030, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void input_NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_NameFocusGained
        input_Name.setText("");
    }//GEN-LAST:event_input_NameFocusGained

    private void input_NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_NameFocusLost
        if(input_Name.getText().equals("")){
             input_Name.setText("Name");
         }
    }//GEN-LAST:event_input_NameFocusLost

    private void input_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_UsernameFocusGained
        
        input_Username.setText("");
    }//GEN-LAST:event_input_UsernameFocusGained

    private void input_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_UsernameFocusLost
         if(input_Username.getText().equals("")){
             input_Username.setText("Username");
         }
        
    }//GEN-LAST:event_input_UsernameFocusLost

    private void input_PassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_PassFocusGained
        input_Pass.setText("");
    }//GEN-LAST:event_input_PassFocusGained

    private void input_PassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_PassFocusLost
         if(input_Pass.getText().equals("")){
             input_Pass.setText("Password");
         }
        
    }//GEN-LAST:event_input_PassFocusLost

    private void input_CPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_CPassFocusGained
         input_CPass.setText("");
    }//GEN-LAST:event_input_CPassFocusGained

    private void input_CPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_CPassFocusLost
        if(input_CPass.getText().equals("")){
             input_CPass.setText("Password");
         }
    }//GEN-LAST:event_input_CPassFocusLost

    private void button_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_signupMouseClicked
            String name  = input_Name.getText();
            String id    = input_Username.getText();
            String pass  = String.valueOf(input_Pass.getPassword());
            String Cpass = String.valueOf(input_CPass.getPassword());
            
            if(pass.equals(Cpass)){
                try {
                 JSONObject check = Register.sendToServer(id, pass, name, "Mock", "Test@mail.com");
                
                    if(check.getInt("status") == 0){
                        JOptionPane.showMessageDialog(null, "Success");
                    
                        input_Name.setText("");
                        input_Username.setText("");
                        input_Pass.setText("");
                        input_CPass.setText("");
                   
                     
                    }else if(check.getInt("status")== 1){
                        String Alart = check.getString("message");
                        JOptionPane.showMessageDialog(null,Alart );
                    
                        if(Alart.equals("Username is already in use")){
                            input_Username.setText("");
                            input_Pass.setText("");
                            input_CPass.setText("");
                        }
                        else if(Alart.equals("E-Mail is already in use")){
                        
                        }
                    }
                } catch (Exception e) {
            
                }
            }else{
                String mis = "A password mismatch (pls, try again)";
                JOptionPane.showMessageDialog(null, mis);
                input_Pass.setText("");
                input_CPass.setText("");
            }
            
            
    }//GEN-LAST:event_button_signupMouseClicked

    private void button_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_signupMouseEntered
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su2.png"));
          button_signup.setIcon(img);
    }//GEN-LAST:event_button_signupMouseEntered

    private void button_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_signupMouseExited
        ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-su.png"));
          button_signup.setIcon(img);
    }//GEN-LAST:event_button_signupMouseExited

    private void button_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseEntered
       ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li.png"));
          button_login.setIcon(img);
        
    }//GEN-LAST:event_button_loginMouseEntered

    private void button_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseExited
         ImageIcon img = new ImageIcon(this.getClass().getResource("../imgs/bt-li2.png"));
          button_login.setIcon(img);
        
    }//GEN-LAST:event_button_loginMouseExited

    private void button_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseClicked
        LoginPage LP = new LoginPage();
        LP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_loginMouseClicked

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
              
         
         
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RegisterPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel button_edit;
    private javax.swing.JLabel button_login;
    private javax.swing.JLabel button_signup;
    private javax.swing.JPasswordField input_CPass;
    private javax.swing.JTextField input_Name;
    private javax.swing.JPasswordField input_Pass;
    private javax.swing.JTextField input_Username;
    // End of variables declaration//GEN-END:variables
}
