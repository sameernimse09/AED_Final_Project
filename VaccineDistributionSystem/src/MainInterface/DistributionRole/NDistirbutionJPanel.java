/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.DistributionRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Enterprise.EnterpriseType;
import Model.Enterprise.DistributorEnterprise;
import Model.Network.Network;
import Model.Organization.DistributorOrg;
import Model.Organization.Organization;
import Model.Organization.OrderInventory;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.WorkReq;
import Model.WorkQueue.requestVaccine;
import Model.WorkQueue.vaccinate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naisargi Thakkar
 */
public class NDistirbutionJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private DistributorOrg organization;
    private Enterprise enterprise;
    private EcoSys system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public int currEP;
    private boolean bool = false;
    private boolean bool2 = false;
    /**
     * Creates new form NDistirbutionWorkAreaJPanel
     */
    public NDistirbutionJPanel(JPanel userProcessContainer, UserAccount account, DistributorOrg organization, Enterprise enterprise, EcoSys system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        
        currEP = ((DistributorEnterprise) enterprise).getVaccineCount();
        txtvaccineCount.setEnabled(false);
        txtvaccineCount.setEditable(false);
        System.out.println(currEP);
        txtvaccineCount.setText(Integer.toString(currEP));
        lblValue.setText(account.getEmployee().getName());
        populateTable();
        populateCount();
        populateVaccineTable();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVaccineCount = new javax.swing.JLabel();
        btnSchedule = new javax.swing.JButton();
        txtvaccineCount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccine = new javax.swing.JTable();
        separatorLine1 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        VaccinejDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVaccineCount.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblVaccineCount.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccineCount.setText("Vaccine Count:");
        add(lblVaccineCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        btnSchedule.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });
        add(btnSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        txtvaccineCount.setBackground(new java.awt.Color(36, 47, 65));
        txtvaccineCount.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtvaccineCount.setForeground(new java.awt.Color(255, 255, 255));
        txtvaccineCount.setBorder(null);
        add(txtvaccineCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 240, -1));

        tblRequests.setBackground(new java.awt.Color(97, 212, 195));
        tblRequests.setForeground(new java.awt.Color(36, 47, 65));
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
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
                "Sender", "Receiver", "Status", "Date"
            }
        ));
        tblRequests.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 485, 180));

        tblVaccine.setBackground(new java.awt.Color(97, 212, 195));
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
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        tblVaccine.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane2.setViewportView(tblVaccine);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 520, 180));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 220, 10));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DISTRIBUTORWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        lblText.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 30));

        lblValue.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblValue.setForeground(new java.awt.Color(97, 212, 195));
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 230, 30));
        add(VaccinejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        Date d = new Date();
        System.out.println(d);
        if(VaccinejDateChooser.getDate().before(d)){
            JOptionPane.showMessageDialog(this, "Please select a future date");
            return;
        }
        vaccinate req = (vaccinate)tblRequests.getModel().getValueAt(selectedRow, 0);
        
        if(req.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Person is already scheduled a vaccination slot2");
            System.out.println("Person is already scheduled a vaccination slot");
            return;
        }
        try{
        if(VaccinejDateChooser.getDate().toString().length()<1){
            JOptionPane.showMessageDialog(this, "Please choose a date to schedule vaccination");
            return;
        }
        }
        catch(NullPointerException e){
            System.out.println("Null exception caught");
            JOptionPane.showMessageDialog(this, "Please select a date");
            return;
        }
        
        
        if(!bool){
            JOptionPane.showMessageDialog(this, "You don't have any vaccine in stock please check with manufacturer to approve your order");
            return;
        }
        if(bool){
            JOptionPane.showMessageDialog(this, "Please order vaccines as your stock is getting over..");
            
        }
        
        req.setDate(VaccinejDateChooser.getDate().toString());
        req.setDt(VaccinejDateChooser.getDate());
        System.out.print(VaccinejDateChooser.getDate().toString());
        req.setStatus("Approved");
        currEP-=1;
        ((DistributorEnterprise) enterprise).setVaccineCount(currEP);
        
        System.out.println(enterprise.getName());
        JOptionPane.showMessageDialog(this, "Vaccination Scheduled");
        Network cn = enterprise.getNetwork();
        for(WorkReq wr : userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof requestVaccine){
                System.out.println("Reducing vaccine count");
                int p = ((requestVaccine) wr).getCount();
                p-=1;
                ((requestVaccine) wr).setCount(p);
                break;
            }
        }
//        for(Enterprise e : cn.getEnterpriseDirectory().getEnterpriseList()){
//            if(e.getEnterpriseType() == EnterpriseType.Service){
//                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
//                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
//                        if(u.getRole().toString().equals("Business.Role.PurchaseRole")){
//                            for(WorkRequest wr : u.getWorkQueue().getWorkRequestList()){
//                                int p = ((requestVaccine) wr).getQty();
//                                p -=1;
//                                ((requestVaccine) wr).setQty(p);
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        populateTable();
        try{
            populateVaccineTable();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
        
//        populateCount();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser VaccinejDateChooser;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaccineCount;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JTable tblRequests;
    private javax.swing.JTable tblVaccine;
    private javax.swing.JTextField txtvaccineCount;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        model.setRowCount(0);
        
        for(WorkReq wr : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            if(wr instanceof vaccinate){
            row[0] = wr;
            row[1] = wr.getReceiver();
            row[2] = wr.getStatus();
            String Date = ((vaccinate) wr).getDate();
            row[3] = Date;
            model.addRow(row);
        }
        }
    }

    private void populateCount() {
        for(WorkReq wr : userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof requestVaccine){
                int i = ((requestVaccine) wr).getCount();
                txtvaccineCount.setText(Integer.toString(i));
            }
        }
    }

    private void populateVaccineTable() {
        DefaultTableModel model = (DefaultTableModel) tblVaccine.getModel();
        model.setRowCount(0);
        UserAccount distributor = new UserAccount();
        try{
        for(WorkReq rv:userAccount.getWorkQueue().getWorkRequestList()){
            System.out.println(enterprise.getName());
            Object row[] = new Object[4];
            if(rv instanceof requestVaccine){
                ArrayList<OrderInventory> inv = ((requestVaccine) rv).getInventoryPurchase();
        
            row[0] = rv;
            row[1] = rv.getReceiver().getUsername();
            row[2] = ((requestVaccine) rv).getCount();
            if(((requestVaccine) rv).getCount()<10){
                bool2 = true;
            }
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
//                int c = ((requestVaccine) rv).getCount();
//                row[2] = p.getQty();
//                
//                if(rv.getStatus().equals("Approved")){
//                System.out.println(enterprise.getName());
//                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
//                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
//                        System.out.println(u.getRole().toString());
//                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
//                            ((requestVaccine) rv).setDistribution(u);
//                            distributor = u;
////                            System.out.println(o.getName());
////                            VaccineCount vc = new VaccineCount();
////                            vc.setVaccineName(rv.getReceiver().toString());
////                            vc.setCount(p.getQty());
////                            currEP += p.getQty();
//                            System.out.println(p.getQty());
//                            c+=p.getQty();
//                            System.out.println(c);
//                            
////                            DistributionOrganization org = ((DistributionOrganization) o).getVaccineDirectory().add(vc);
//                        }
//                    }
//                }
//            }
//                ((requestVaccine) rv).setCount(c);
//                distributor.getWorkQueue().getWorkRequestList().add(rv);
                
            
            
            row[3] = rv.getStatus();
            if(rv.getStatus().equals("Approved")){
                bool = true;
            }
            System.out.println(rv.getStatus());
            
//            row[2] = 
            model.addRow(row);
        }
        }
        }
        catch(NullPointerException e){
            System.out.println("No records found");
        }
    }
}
