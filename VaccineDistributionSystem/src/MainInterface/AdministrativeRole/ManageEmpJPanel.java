/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.AdministrativeRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Employee.Employee;
import Model.Organization.Organization;
import Model.Organization.OrgDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naisargi Thakkar
 */
public class ManageEmpJPanel extends javax.swing.JPanel {

    private OrgDirectory organizationDir;
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSys system;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmpJPanel(JPanel userProcessContainer,OrgDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        cmbOrganization.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmbOrganization.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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
        tblOrganization = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        cmbOrganization = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        lblSelectOrg = new javax.swing.JLabel();
        separatorLine2 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 49, 48));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrganization.setBackground(new java.awt.Color(124, 169, 130));
        tblOrganization.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblOrganization.setForeground(new java.awt.Color(36, 47, 65));
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganization.setGridColor(new java.awt.Color(4, 182, 145));
        jScrollPane1.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
            tblOrganization.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 480, 180));

        btnCreate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCreate.setText("Create Employee");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        cmbOrganization.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });
        add(cmbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 240, -1));

        lblOrganization.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        lblName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        txtName.setBackground(new java.awt.Color(11, 49, 48));
        txtName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 210, -1));

        organizationEmpJComboBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 260, -1));

        lblSelectOrg.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblSelectOrg.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectOrg.setText("Select organization to add new employee in:");
        add(lblSelectOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 220, 10));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EMPLOYEES.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 100, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = txtName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a name", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        //store data in database
        dB4OUtil.storeSystem(system);
        txtName.setText("");
         JOptionPane.showMessageDialog(null, "Employee created");
           
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblSelectOrg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
