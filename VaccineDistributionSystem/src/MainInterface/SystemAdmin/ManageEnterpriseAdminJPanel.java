/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.SystemAdmin;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Role.AdminR;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naisargi Thakkar
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSys system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSys system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        cmbNetwork.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            cmbNetwork.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        cmbEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cmbEnterprise.addItem(enterprise);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEnterprise = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        separatorLine = new javax.swing.JSeparator();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 49, 48));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterprise.setBackground(new java.awt.Color(124, 169, 130));
        tblEnterprise.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblEnterprise.setForeground(new java.awt.Color(36, 47, 65));
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterprise.setGridColor(new java.awt.Color(4, 182, 145));
        jScrollPane1.setViewportView(tblEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 560, 180));

        lblNetwork.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        cmbNetwork.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });
        add(cmbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 136, -1));

        lblUsername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        txtUsername.setBackground(new java.awt.Color(11, 49, 48));
        txtUsername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 210, 20));

        lblEnterprise.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise:");
        lblEnterprise.setToolTipText("");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        cmbEnterprise.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });
        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 136, -1));

        btnSubmit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, -1, -1));

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, -1, -1));

        txtName.setBackground(new java.awt.Color(11, 49, 48));
        txtName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 180, 20));

        lblName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, -1, -1));

        txtPassword.setBackground(new java.awt.Color(11, 49, 48));
        txtPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 210, 20));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 180, -1));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 180, -1));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 180, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ENTERPRISEADMIN.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, 850));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ENTERPRISEADMIN.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 100, 850));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTERPRISE ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

        Network network = (Network) cmbNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        Enterprise enterprise = (Enterprise) cmbEnterprise.getSelectedItem();
        System.out.println(enterprise.getNetwork().getName());
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if(username.equals("") || password.equals("")||name.equals("")){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminR());
        populateTable();
        
        dB4OUtil.storeSystem(system);
        txtPassword.setText("");
        txtName.setText("");
        txtUsername.setText("");
      
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        try{
            ManageSystemAdminJPanel sysAdminwjp = (ManageSystemAdminJPanel) component;
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        
        //JTree removed --> sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
