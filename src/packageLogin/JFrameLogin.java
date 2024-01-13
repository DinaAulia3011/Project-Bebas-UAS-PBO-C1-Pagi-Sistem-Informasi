/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLogin;

/**
 *
 * @author ASUS
 */
import packageKoneksi.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import packageRegist.JFrameRegist;
import packagedokter.JFramehomeDokter;
import packagehome.JFramehome;
import packageapoteker.JFramehomeapoteker;
import packagedokter.JFrameclinicdataDokter;

public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
    }
    private static String loggedInNama;
    private static String loggedInStatus;
    
    public static void setLoggedInUser(String nama, String status) {
        loggedInNama = nama;
        loggedInStatus = status;
    }
    public static String getLoggedInNama() {
        return loggedInNama;
    }
    public static String getLoggedInStatus() {
        return loggedInStatus;
    }

    public Statement st;
    public ResultSet rs;
     Connection cn = packageKoneksi.config.BukaKoneksi();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLuar = new javax.swing.JPanel();
        panelDalam = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        t_password = new javax.swing.JPasswordField();
        btnlogin = new rojerusan.RSMaterialButtonRectangle();
        img_login = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLuar.setBackground(new java.awt.Color(0, 102, 102));
        panelLuar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDalam.setBackground(new java.awt.Color(214, 220, 234));
        panelDalam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setText("Get Started");
        panelDalam.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel6.setBackground(new java.awt.Color(173, 226, 206));
        jLabel6.setText("Don't have an account? ");
        panelDalam.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(173, 226, 206));
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Sign In");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 204)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panelDalam.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel1.setText("Username");
        panelDalam.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel3.setText("Password");
        panelDalam.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        t_username.setBackground(new java.awt.Color(173, 226, 206));
        t_username.setText("Enter an Username ...");
        t_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 102, 102)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        panelDalam.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 330, 40));

        t_password.setBackground(new java.awt.Color(173, 226, 206));
        t_password.setText("enterpassword");
        t_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 102, 102)));
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        panelDalam.add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 330, 40));

        btnlogin.setBackground(new java.awt.Color(0, 102, 102));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        panelDalam.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 140, 50));

        img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img_login.jpg"))); // NOI18N
        panelDalam.add(img_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 1020, 440));

        panelLuar.add(panelDalam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 740, 440));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLogin/close.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panelLuar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 40, -1));

        jLabel4.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome to Healthy-Connect");
        panelLuar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 320, -1));

        getContentPane().add(panelLuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
     String username = t_username.getText();
    String password = new String(t_password.getPassword());

    if (cekLogin(username, password)) {
        
    } else {
         JOptionPane.showMessageDialog(null, "Incorrect username or password ");
    }
    }//GEN-LAST:event_btnloginActionPerformed
private boolean cekLogin(String username, String password) {
    Connection koneksi = config.BukaKoneksi();
    boolean berhasil = false;

    String query = "SELECT * FROM klinik_user WHERE username=? AND password=?";
    try (PreparedStatement preparedStatement = koneksi.prepareStatement(query)) {
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Login sukses, dapatkan informasi dari hasil query
            String nama = resultSet.getString("nama");
            String status = resultSet.getString("status");

            // Tampilkan pesan selamat datang berdasarkan status
            JOptionPane.showMessageDialog(null, "LOGIN SUCCESS, Welcome " + status);
            JFrameLogin.setLoggedInUser(nama, status);

            // Tentukan aksi berdasarkan status
            if (status.equals("Dokter")) {
                JFramehomeDokter homedokter = new JFramehomeDokter();
                homedokter.show();
                this.dispose();
            } else if (status.equals("Apoteker")) {
                JFramehomeapoteker homeapo = new JFramehomeapoteker();
                homeapo.show();
                this.dispose();
            } else if (status.equals("Admin")) {
                JFramehome homeadmin = new JFramehome();
                homeadmin.show();
                this.dispose();
            } else {
                System.out.println("Status tidak valid.");
            }

            // Set the boolean variable to true, indicating successful login
            berhasil = true;
        } else {
            // Username atau password tidak valid
            JOptionPane.showMessageDialog(null, "Incorrect username or password");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (koneksi != null) {
                koneksi.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Return the result of the login attempt
    return berhasil;
}

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    JFrameRegist regist = new JFrameRegist();
        regist.show();
        
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
        String user = t_password.getText();
        if(user.equals("enterpassword")){
            t_password.setText("");
        }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
        String user = t_password.getText();
        if(user.equals("") ||user.equals("enterpassword")) {
            t_password.setText("enterpassword");
        }
    }//GEN-LAST:event_t_passwordFocusLost

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String user = t_username.getText();
        if(user.equals("Enter an Username ...")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String user = t_username.getText();
        if(user.equals("") ||user.equals("Enter an Username ...")) {
            t_username.setText("Enter an Username ...");
        }
    }//GEN-LAST:event_t_usernameFocusLost

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnlogin;
    private javax.swing.JLabel img_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelDalam;
    private javax.swing.JPanel panelLuar;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
