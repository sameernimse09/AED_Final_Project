/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.DoctorRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Enterprise.EnterpriseType;
import Model.Network.Network;
import Model.Organization.DocOrg;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.prescribeMeds;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sameer Nimse
 */
public class AddPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPrescriptionJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSys system;
    private DocOrg organization;
    private Enterprise enterprise;
    private UserAccount person;//userProcessContainer, enterprise, organization, system
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddPrescriptionJPanel(JPanel userProcessContainer, Enterprise enterprise, DocOrg organization, EcoSys system, UserAccount account, UserAccount person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMedList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMedList = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        iconBack = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 49, 48));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMedList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblMedList.setForeground(new java.awt.Color(255, 255, 255));
        lblMedList.setText("Medicine List:");
        add(lblMedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtareaMedList.setBackground(new java.awt.Color(11, 49, 48));
        txtareaMedList.setColumns(20);
        txtareaMedList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtareaMedList.setForeground(new java.awt.Color(255, 255, 255));
        txtareaMedList.setRows(5);
        txtareaMedList.setBorder(null);
        jScrollPane1.setViewportView(txtareaMedList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        iconBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        iconBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackMousePressed(evt);
            }
        });
        add(iconBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, -1));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOCTOR AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(txtareaMedList.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        
        if(validate(txtareaMedList.getText())){
            UserAccount pharma = new UserAccount();
            prescribeMeds pm = new prescribeMeds();
            pm.setPerson(person);
            pm.setSender(account);
            Network cn = enterprise.getNetwork();
            System.out.println("Outside for");
            for(Enterprise e : cn.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("inside for");
                if(e.getEnterpriseType() == EnterpriseType.Hospital){
                    System.out.println("inside enterprise");
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        System.out.println("inside for org");
                        for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                            System.out.println("inside for user");
                            if(u.getRole().toString().equals("Business.Role.PharmaRole")){
                                System.out.println("user found");
                                pm.setReceiver(u);
                                System.out.println(u.getUsername());
                                pharma = u;
                                break;
                            }
                        }
                    }
                }
            }
            pm.setMessage(person.getUsername());
            pm.setMedList(txtareaMedList.getText());
            pm.setStatus("Request");
            person.getWorkQueue().getWorkRequestList().add(pm);
            account.getWorkQueue().getWorkRequestList().add(pm);
            pharma.getWorkQueue().getWorkRequestList().add(pm);
        }
        dB4OUtil.storeSystem(system);
        txtareaMedList.setText("");
         JOptionPane.showMessageDialog(null, "Request Submited");
           
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void iconBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMousePressed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        DocAreaJPanel doctorWorkAreaJPanel = new DocAreaJPanel(userProcessContainer, account, organization, enterprise, system);
        userProcessContainer.add("DoctorWorkAreaJPanel", doctorWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_iconBackMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel iconBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtareaMedList;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String text) {
        return true;
    }
}
