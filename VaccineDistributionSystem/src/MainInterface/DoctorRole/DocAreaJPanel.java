/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.DoctorRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.DocOrg;
import Model.Organization.EcoOrg;
import Model.Organization.LabOrg;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.LabTestRequest;
import Model.WorkQueue.WorkReq;
import Model.WorkQueue.appointment;
import Model.WorkQueue.vaccinate;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anushkadarade
 */
public class DocAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DocOrg organization;
    private Enterprise enterprise;
    private EcoSys system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DocAreaJPanel(JPanel userProcessContainer, UserAccount account, DocOrg organization, Enterprise enterprise, EcoSys system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        //populateRequestTable();
        populateTable();
//        btnPrescribeMed.setVisible(false);
//        btnTest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnPrescribeMed = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        appointmentjDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTest.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnTest.setText("Send for lab tests");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 740, -1, -1));

        tblRequest.setBackground(new java.awt.Color(97, 212, 195));
        tblRequest.setForeground(new java.awt.Color(36, 47, 65));
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Email", "Receiver", "Status", "Result", "Name"
            }
        ));
        tblRequest.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 680, 180));

        btnApprove.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnApprove.setText("Approve Appointment");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        btnPrescribeMed.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnPrescribeMed.setText("Prescribe Medicine");
        btnPrescribeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeMedActionPerformed(evt);
            }
        });
        add(btnPrescribeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        btnReject.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnReject.setText("Reject Appointment");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        lblText.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 30));

        lblValue.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblValue.setForeground(new java.awt.Color(97, 212, 195));
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 230, 30));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DOCTORWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));
        add(appointmentjDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's record to test");
            return;
        }
        appointment a = (appointment)tblRequest.getValueAt(selectedRow, 0);
        if(!(a.getStatus().equals("Approved"))){
            JOptionPane.showMessageDialog(this, "Please approve appointment first");
            return;
        }
        UserAccount labUser = new UserAccount();
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LabOrg){
                org = organization;
                for(UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                    System.out.println(u.getUsername());
                    System.out.println(u.getRole().toString());
                    if(u.getRole().toString().equals("Business.Role.LabRole")){
                        a.setLab(u);
                        labUser = u;
                        break;
                    }
                }
            break;
            }
            
        }
        populateTable();
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(a);
            labUser.getWorkQueue().getWorkRequestList().add(a);
        }
//        
//         LabTestWorkRequest lr = new LabTestWorkRequest();
//        lr.setMessage("Please approve");
//        lr.setSender(userAccount);
//        lr.setStatus("requested");
//        lr.setReceiver(userAccount);
//        JOptionPane.showMessageDialog(this, "Approval Requested!!");
//        populateTable();
//        
//        
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof LabOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkQueue().getWorkRequestList().add(lr);
//            userAccount.getWorkQueue().getWorkRequestList().add(lr);
//        }
            JOptionPane.showMessageDialog(this, "Request sent to lab!");
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        Date d = new Date();
        System.out.println(d);
        //Date date = appointmentjDateChooser.getDate();
       try{
        if(appointmentjDateChooser.getDate().toString().length()<1){
            JOptionPane.showMessageDialog(this, "Please choose a date to schedule vaccination");
            return;
        }
        }
        catch(NullPointerException e){
            System.out.println("Null exception caught");
            JOptionPane.showMessageDialog(this, "Please select a date");
            return;
        }
        if(appointmentjDateChooser.getDate().before(d)){
            JOptionPane.showMessageDialog(this, "Please select a future date");
            return;
        }
        appointment req = (appointment)tblRequest.getModel().getValueAt(selectedRow, 0);
        
        if(req.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Person is already scheduled an appointment");
            //System.out.println("Person is already scheduled a vaccination slot");
            return;
        }
        
        
        req.setStatus("Approved");
        dB4OUtil.storeSystem(system);
        populateTable();
//        btnPrescribeMed.setVisible(true);
//        btnTest.setVisible(true);
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnPrescribeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeMedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's record to prescribe");
            return;
        } 
        appointment a = (appointment)tblRequest.getValueAt(selectedRow, 0);
        if(!(a.getStatus().equals("Approved"))){
            JOptionPane.showMessageDialog(this, "Please approve appointment first");
            return;
        }
        WorkReq w = (WorkReq) tblRequest.getModel().getValueAt(selectedRow, 0);
        UserAccount p = w.getSender();
        userProcessContainer.removeAll();
        AddPrescriptionJPanel addPresciptionJPanel = new AddPrescriptionJPanel(userProcessContainer, enterprise, organization, system, userAccount, p);
        userProcessContainer.add("addPresciptionJPanel", addPresciptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_btnPrescribeMedActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:int selectedRow = tblRequest.getSelectedRow();
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        appointment a = (appointment)tblRequest.getValueAt(selectedRow, 0);
        a.setDate(appointmentjDateChooser.getDate().toString());
        a.setStatus("Rejected");
        dB4OUtil.storeSystem(system);
        populateTable();
        btnPrescribeMed.setVisible(true);
        btnTest.setVisible(true);
    }//GEN-LAST:event_btnRejectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentjDateChooser;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnPrescribeMed;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblRequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkReq request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            if(request instanceof appointment){
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            String email = ((appointment) request).getEmail();
            row[2] = email;
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            String result = ((appointment) request).getTestResult();
            row[5] = result;
            row[6] = request.getReceiver().getUsername();
            
            model.addRow(row);
        }
        }
    }
}
