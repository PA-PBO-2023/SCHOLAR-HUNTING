/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import pa_scholarhunt.Database;
import static pa_scholarhunt.Login.validateLogin;
import pa_scholarhunt.Regist;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

 // Fungsi untuk memvalidasi login dengan mengecek username, password, dan role

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Database.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        BodyPanel = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelUsernameLogin = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabelPassLogin = new javax.swing.JLabel();
        jPasswordFieldPassLogin = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButtonToRegist = new javax.swing.JButton();
        RegisterPanel = new javax.swing.JPanel();
        jLabelRegister = new javax.swing.JLabel();
        jLabelUsernameRegist = new javax.swing.JLabel();
        jTextFieldUsernameRegist = new javax.swing.JTextField();
        jLabelPasswordRegist = new javax.swing.JLabel();
        jPasswordFieldPassRegist = new javax.swing.JPasswordField();
        jComboBoxKategoriRegist = new javax.swing.JComboBox<>();
        jButtonRegist = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonToLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PanelKiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa ", "Siswa ", "Admin" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        jLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 0, 144));
        jLabelLogin.setText("LOGIN");

        jLabelUsernameLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUsernameLogin.setForeground(new java.awt.Color(0, 0, 144));
        jLabelUsernameLogin.setText("Username ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabelPassLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPassLogin.setForeground(new java.awt.Color(0, 0, 144));
        jLabelPassLogin.setText("Password");

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 144));
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Siswa", "Admin" }));
        jComboBoxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKategoriActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 144));
        jLabel13.setText("Don't have an account?");

        jButtonToRegist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonToRegist.setForeground(new java.awt.Color(0, 0, 144));
        jButtonToRegist.setText("Sign Up");
        jButtonToRegist.setBorder(null);
        jButtonToRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToRegistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogin)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonToRegist)
                .addGap(101, 101, 101))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsernameLogin)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassLogin))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogin)
                .addGap(143, 143, 143))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabelLogin)
                .addGap(46, 46, 46)
                .addComponent(jLabelUsernameLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabelPassLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButtonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jButtonToRegist))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        MainPanel.add(LoginPanel, "card2");

        RegisterPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterPanel.setPreferredSize(new java.awt.Dimension(400, 600));
        RegisterPanel.setLayout(null);

        jLabelRegister.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(0, 0, 144));
        jLabelRegister.setText("REGISTER");
        RegisterPanel.add(jLabelRegister);
        jLabelRegister.setBounds(105, 86, 163, 48);

        jLabelUsernameRegist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUsernameRegist.setForeground(new java.awt.Color(0, 0, 144));
        jLabelUsernameRegist.setText("Username ");
        RegisterPanel.add(jLabelUsernameRegist);
        jLabelUsernameRegist.setBounds(68, 180, 60, 16);

        jTextFieldUsernameRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameRegistActionPerformed(evt);
            }
        });
        RegisterPanel.add(jTextFieldUsernameRegist);
        jTextFieldUsernameRegist.setBounds(68, 201, 265, 22);

        jLabelPasswordRegist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPasswordRegist.setForeground(new java.awt.Color(0, 0, 144));
        jLabelPasswordRegist.setText("Password");
        RegisterPanel.add(jLabelPasswordRegist);
        jLabelPasswordRegist.setBounds(68, 249, 53, 16);
        RegisterPanel.add(jPasswordFieldPassRegist);
        jPasswordFieldPassRegist.setBounds(68, 270, 265, 22);

        jComboBoxKategoriRegist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Siswa" }));
        RegisterPanel.add(jComboBoxKategoriRegist);
        jComboBoxKategoriRegist.setBounds(68, 321, 91, 22);

        jButtonRegist.setBackground(new java.awt.Color(0, 0, 144));
        jButtonRegist.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegist.setText("Register");
        jButtonRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistActionPerformed(evt);
            }
        });
        RegisterPanel.add(jButtonRegist);
        jButtonRegist.setBounds(169, 403, 73, 23);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 144));
        jLabel17.setText("Already have an account?");
        RegisterPanel.add(jLabel17);
        jLabel17.setBounds(101, 432, 146, 16);

        jButtonToLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonToLogin.setForeground(new java.awt.Color(0, 0, 144));
        jButtonToLogin.setText("Login");
        jButtonToLogin.setBorder(null);
        jButtonToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonToLoginMouseClicked(evt);
            }
        });
        jButtonToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToLoginActionPerformed(evt);
            }
        });
        RegisterPanel.add(jButtonToLogin);
        jButtonToLogin.setBounds(264, 432, 31, 16);
        RegisterPanel.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 600);

        MainPanel.add(RegisterPanel, "card2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Purple And White Modern Scholarship Program Instagram Post (397 x 562 piksel) (400 x 600 piksel).png"))); // NOI18N

        javax.swing.GroupLayout PanelKiriLayout = new javax.swing.GroupLayout(PanelKiri);
        PanelKiri.setLayout(PanelKiriLayout);
        PanelKiriLayout.setHorizontalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKiriLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        PanelKiriLayout.setVerticalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(PanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(PanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
                                                                                  
    String username = jTextField3.getText();
    String password = new String(jPasswordFieldPassLogin.getPassword());
    String role = jComboBoxKategori.getSelectedItem().toString().trim();

    if (validateLogin(username, password, role)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Login berhasil!");
        if (role.equalsIgnoreCase("Admin")) {
            DashboardAdmin dashboardAdmin = new DashboardAdmin();
            dashboardAdmin.setVisible(true);
            this.setVisible(false);
        } else if (role.equalsIgnoreCase("Mahasiswa") || role.equalsIgnoreCase("Siswa")) {
            DashboardUser dashboardUser = new DashboardUser();
            dashboardUser.setVisible(true);
            this.setVisible(false);
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Username atau password salah!", "Login Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
        
   
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBoxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKategoriActionPerformed

    private void jButtonRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistActionPerformed
        // TODO add your handling code here:
        String username = jTextFieldUsernameRegist.getText();
        String password = new String(jPasswordFieldPassRegist.getPassword());
        String role = jComboBoxKategoriRegist.getSelectedItem().toString();

        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!role.equalsIgnoreCase("Mahasiswa") && !role.equalsIgnoreCase("Siswa")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Role tidak valid!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Regist.registerUser(username, password, role)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Registrasi berhasil!");
            Login login = new Login();
            login.setVisible(true);
            this.setVisible(false);
            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Registrasi gagal!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistActionPerformed

    private void jTextFieldUsernameRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameRegistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameRegistActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButtonToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToLoginActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();
        
        MainPanel.add(LoginPanel);
        MainPanel.repaint();
        MainPanel.revalidate();

    }//GEN-LAST:event_jButtonToLoginActionPerformed

    private void jButtonToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonToLoginMouseClicked

    }//GEN-LAST:event_jButtonToLoginMouseClicked

    private void jButtonToRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToRegistActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();
        
        MainPanel.add(RegisterPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_jButtonToRegistActionPerformed

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
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelKiri;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegist;
    private javax.swing.JButton jButtonToLogin;
    private javax.swing.JButton jButtonToRegist;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JComboBox<String> jComboBoxKategoriRegist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPassLogin;
    private javax.swing.JLabel jLabelPasswordRegist;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelUsernameLogin;
    private javax.swing.JLabel jLabelUsernameRegist;
    private javax.swing.JPasswordField jPasswordFieldPassLogin;
    private javax.swing.JPasswordField jPasswordFieldPassRegist;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldUsernameRegist;
    // End of variables declaration//GEN-END:variables

}
