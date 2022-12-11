/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.SalesRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.ManufacturingOrg;
import Model.Organization.Organization;
import Model.Organization.OrgDirectory;
import Model.Organization.OrderInventory;
import Model.Organization.SaleOrg;
import Model.Organization.VaccineDetails;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.WorkReq;
import Model.WorkQueue.approvedVaccine;
import Model.WorkQueue.requestVaccine;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naisargi Thakkar
 */
public class SalesJPanel extends javax.swing.JPanel {
        
    
    private EcoSys system;
    private OrgDirectory directory;
    private JPanel userProcessContainer;
    private SaleOrg organization;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public SalesJPanel(JPanel userProcessContainer, UserAccount account, SaleOrg organization, Enterprise enterprise, EcoSys system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblValue.setText(account.getEmployee().getName());
        populateApproveTable();
        populateTable();
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
        tblVaccine = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        txtComments = new javax.swing.JTextField();
        lblComment = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        separatorLine = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 49, 48));
        setMaximumSize(new java.awt.Dimension(1440, 848));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVaccine.setBackground(new java.awt.Color(124, 169, 130));
        tblVaccine.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblVaccine.setForeground(new java.awt.Color(36, 47, 65));
        tblVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity per dose", "Status"
            }
        ));
        tblVaccine.setGridColor(new java.awt.Color(4, 182, 145));
        jScrollPane1.setViewportView(tblVaccine);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 480, 180));

        btnReject.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        txtComments.setBackground(new java.awt.Color(11, 49, 48));
        txtComments.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtComments.setForeground(new java.awt.Color(255, 255, 255));
        txtComments.setBorder(null);
        add(txtComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 190, 20));

        lblComment.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblComment.setForeground(new java.awt.Color(255, 255, 255));
        lblComment.setText("Comments:");
        add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        btnApprove.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        tblOrders.setBackground(new java.awt.Color(124, 169, 130));
        tblOrders.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblOrders.setForeground(new java.awt.Color(36, 47, 65));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        tblOrders.setGridColor(new java.awt.Color(4, 182, 145));
        jScrollPane2.setViewportView(tblOrders);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 480, 180));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 180, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SALESWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        lblText.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 30));

        lblValue.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblValue.setForeground(new java.awt.Color(124, 169, 130));
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        ManufacturingOrg org = null;
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                if(u.getRole().toString().equals("Business.Role.ManufacturingRole")){
                    org = ((ManufacturingOrg)o);
                }
            }
            
        }
        for(VaccineDetails v : org.getVaccineDirectory()){
            System.out.println("Inside for");
            if(v.getStatus().equals("Approved")){
                System.out.println("Vaccine record approved");
                int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select an order to approve");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrders.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtComments.getText())){
        request.setStatus("Approved");
        request.setTestResult("Approved");
        ArrayList<OrderInventory> inv = ((requestVaccine) request).getInventoryPurchase();
        if(inv!=null){
            for(OrderInventory p : inv){
                ((requestVaccine) request).setQty(p.getQty());
                
            }
            }
        
        
        populateTable();
        populateApproveTable();
        dB4OUtil.storeSystem(system);
        txtComments.setText("");
        }
        break;
            }
            else{
                JOptionPane.showMessageDialog(this, "You must have an approved vaccine in the inventory to manage orders");
                return;
            }
        }
        //dB4OUtil.storeSystem(system);
        //txtComments.setText("");
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        ManufacturingOrg org = null;
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                if(u.getRole().toString().equals("Business.Role.ManufacturingRole")){
                    org = ((ManufacturingOrg)o);
                }
            }
            
        }
        for(VaccineDetails v : org.getVaccineDirectory()){
            System.out.println("Inside for");
            if(v.getStatus().equals("Approved")){
                System.out.println("Vaccine record approved");
                int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select an order to approve");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrders.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtComments.getText())){
        request.setStatus("Rejected");
        request.setTestResult("Rejected");
        ArrayList<OrderInventory> inv = ((requestVaccine) request).getInventoryPurchase();
        if(inv!=null){
            for(OrderInventory p : inv){
                ((requestVaccine) request).setQty(p.getQty());
                
            }
            }
        
        
        populateTable();
        populateApproveTable();
        dB4OUtil.storeSystem(system);
        txtComments.setText("");
        }
        break;
            }
            else{
                JOptionPane.showMessageDialog(this, "You must have an approved vaccine in the inventory to manage orders");
                return;
            }
        }
        //dB4OUtil.storeSystem(system);
        //txtComments.setText("");
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblVaccine;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVaccine.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getName());
        try{
        for(WorkReq wr : userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof approvedVaccine){
            UserAccount inv = ((approvedVaccine) wr).getSales();
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = inv.getUsername();
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
//                row[2] = p.getQty();
//            }
            row[2] = "20";
            row[3] = wr.getStatus();
            
            model.addRow(row);
            }
        }
        }
    
        catch(NullPointerException e){
            System.out.println("Null exception caught");
    }
    }

    private void populateApproveTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getName());
        try{
        for(WorkReq wr : userAccount.getWorkQueue().getWorkRequestList()){
//            UserAccount inv = ((approveVaccine) wr).getSales();
            if(wr instanceof requestVaccine){
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = wr.getReceiver().getUsername();
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
//                row[2] = p.getQty();
//            }
            row[2] = ((requestVaccine) wr).getQty();
            row[3] = wr.getStatus();
            
            model.addRow(row);
            }
        }
        }
    
        catch(NullPointerException e){
            System.out.println("Null exception caught");
    }
    }
    
    private boolean validate(String comment) {
       if(comment.length()<1){
           JOptionPane.showMessageDialog(this, "Please enter comments");
           return false;
       }
           return true;
    }
    
}
