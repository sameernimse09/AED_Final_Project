/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Business.Enterprise.Enterprise;
//import Business.Network.Network;
//import Business.Organization.Organization;
//import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anushkadarade
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private EcoSys ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        ecosystem = dB4OUtil.retrieveSystem();
        signinPanel.setVisible(true);
        signoutPanel.setVisible(false);
        cardPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signinPanel = new javax.swing.JPanel();
        signinFormPanel = new javax.swing.JPanel();
        lblSignin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        chkTerms = new javax.swing.JCheckBox();
        buttonSign = new javax.swing.JButton();
        iconLogo = new javax.swing.JLabel();
        iconExit = new javax.swing.JLabel();
        lblRights = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signoutPanel = new javax.swing.JPanel();
        separatorLine3 = new javax.swing.JSeparator();
        lblText = new javax.swing.JLabel();
        iconLogoSmall = new javax.swing.JLabel();
        iconSignout = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1600, 900));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinPanel.setBackground(new java.awt.Color(36, 47, 65));
        signinPanel.setPreferredSize(new java.awt.Dimension(1440, 900));
        signinPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinFormPanel.setBackground(new java.awt.Color(36, 47, 65));
        signinFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignin.setFont(new java.awt.Font("Optima", 1, 20)); // NOI18N
        lblSignin.setForeground(new java.awt.Color(204, 0, 51));
        lblSignin.setText("Welcome to NUCC- We are Happy to Serve You!");
        signinFormPanel.add(lblSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 50));

        lblUsername.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(204, 204, 204));
        lblUsername.setText("USERNAME");
        signinFormPanel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 94, -1, -1));

        lblPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("PASSWORD");
        signinFormPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 160, -1, -1));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        signinFormPanel.add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 150, 270, 10));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        signinFormPanel.add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 216, 270, 10));

        txtPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("password");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        signinFormPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 186, 270, 30));

        txtUsername.setBackground(new java.awt.Color(36, 47, 65));
        txtUsername.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Enter Username");
        txtUsername.setBorder(null);
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        signinFormPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 120, 270, 30));

        chkTerms.setBackground(new java.awt.Color(36, 47, 65));
        chkTerms.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        chkTerms.setForeground(new java.awt.Color(204, 204, 204));
        chkTerms.setText("I agree to all terms of service");
        signinFormPanel.add(chkTerms, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 254, -1, -1));

        buttonSign.setBackground(new java.awt.Color(204, 204, 204));
        buttonSign.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        buttonSign.setText("Sign In");
        buttonSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSignMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSignMouseExited(evt);
            }
        });
        buttonSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignActionPerformed(evt);
            }
        });
        signinFormPanel.add(buttonSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 361, 170, 40));

        signinPanel.add(signinFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        iconLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo-signin.png"))); // NOI18N
        signinPanel.add(iconLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 38, 603, 277));

        iconExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        iconExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconExitMousePressed(evt);
            }
        });
        signinPanel.add(iconExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1376, 14, -1, -1));

        lblRights.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblRights.setForeground(new java.awt.Color(204, 204, 204));
        lblRights.setText("All rights reserved NUCC 2021");
        signinPanel.add(lblRights, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 880, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/copyright.png"))); // NOI18N
        signinPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 880, 30, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trademark.png"))); // NOI18N
        signinPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 880, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradient_img.png"))); // NOI18N
        signinPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 410, 900));

        getContentPane().add(signinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        signoutPanel.setBackground(new java.awt.Color(97, 212, 195));
        signoutPanel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        signoutPanel.setPreferredSize(new java.awt.Dimension(1440, 52));

        separatorLine3.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorLine3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        lblText.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("From Prevention To Cure, We Do It All");

        iconLogoSmall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo-top.png"))); // NOI18N

        iconSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signout.png"))); // NOI18N
        iconSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconSignoutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout signoutPanelLayout = new javax.swing.GroupLayout(signoutPanel);
        signoutPanel.setLayout(signoutPanelLayout);
        signoutPanelLayout.setHorizontalGroup(
            signoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signoutPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(iconLogoSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(separatorLine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(lblText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 583, Short.MAX_VALUE)
                .addComponent(iconSignout)
                .addGap(26, 26, 26))
        );
        signoutPanelLayout.setVerticalGroup(
            signoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signoutPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblText)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(separatorLine3))
                .addContainerGap())
            .addComponent(iconSignout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(iconLogoSmall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(signoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardPanel.setBackground(new java.awt.Color(36, 47, 65));
        cardPanel.setMinimumSize(new java.awt.Dimension(1440, 848));
        cardPanel.setPreferredSize(new java.awt.Dimension(1440, 848));
        cardPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1440, 848));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        txtUsername.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void buttonSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUsername.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        UserAccount userAccount=ecosystem.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:ecosystem.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               break;
                           }
                       }  
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        } 
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!chkTerms.isSelected()){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //set visibility for panels
            signinPanel.setVisible(false);
            signoutPanel.setVisible(true);
            cardPanel.setVisible(true);
            //set visibility for icons
            iconExit.setVisible(false);
            iconSignout.setVisible(true);
            //set cardlayout panel to display necessary
            CardLayout layout=(CardLayout) cardPanel.getLayout();
            cardPanel.add("workArea", userAccount.getRole().createWorkArea(cardPanel, userAccount, inOrganization, inEnterprise, ecosystem));
            layout.next(cardPanel);
        }
    }//GEN-LAST:event_buttonSignActionPerformed

    private void iconSignoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSignoutMousePressed
        // TODO add your handling code here:
        //remove all layouts from the cardlayout panel
        cardPanel.removeAll();
        //set visibility for panels
        signinPanel.setVisible(true);
        signoutPanel.setVisible(false);
        cardPanel.setVisible(false);
        //set visibility for icons
        iconExit.setVisible(true);
        iconSignout.setVisible(false);
        //reset the text fields to default values
        txtUsername.setText("Enter Username");
        txtPassword.setText("password");
        chkTerms.setSelected(false);
        //save database
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_iconSignoutMousePressed

    private void iconExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_iconExitMousePressed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void buttonSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignMouseEntered
        // TODO add your handling code here:
        buttonSign.setForeground(Color.RED);
        
    }//GEN-LAST:event_buttonSignMouseEntered

    private void buttonSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignMouseExited
        // TODO add your handling code here:
        buttonSign.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonSignMouseExited

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSign;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JCheckBox chkTerms;
    private javax.swing.JLabel iconExit;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel iconLogoSmall;
    private javax.swing.JLabel iconSignout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRights;
    private javax.swing.JLabel lblSignin;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JSeparator separatorLine3;
    private javax.swing.JPanel signinFormPanel;
    private javax.swing.JPanel signinPanel;
    private javax.swing.JPanel signoutPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
