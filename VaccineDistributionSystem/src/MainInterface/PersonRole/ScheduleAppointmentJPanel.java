/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.PersonRole;
import Model.Validation;
import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.Organization.OrgDirectory;
import Model.Organization.PersonOrg;
import Model.Organization.OrderOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.appointment;
import Model.WorkQueue.vaccinate;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import MainInterface.ManufactureRole.VaccineJPanel;

/**
 *
 * @author anushkadarade
 */
public class ScheduleAppointmentJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private PersonOrg organization;
    private Enterprise enterprise;
    private EcoSys business;
    private UserAccount userAccount;
    private Validation validation;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public ScheduleAppointmentJPanel(JPanel userProcessContainer, PersonOrg organization, Enterprise enterprise, EcoSys business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.organization = organization;
        this.enterprise = enterprise;
        populateOrganizationComboBox();
    }

    public void populateOrganizationComboBox(){
        cmbHospital.removeAllItems();
        
        Network currnet = enterprise.getNetwork();
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
        if(e.getEnterpriseType() == Enterprise.EnterpriseType.Hospital){
            cmbHospital.addItem(e.getName());
//            currEP = e;
            }
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

        jComboBox1 = new javax.swing.JComboBox<>();
        lblHospital = new javax.swing.JLabel();
        cmbHospital = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        separatorLine = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        iconBack = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(11, 49, 48));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHospital.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblHospital.setForeground(new java.awt.Color(255, 255, 255));
        lblHospital.setText("Select Hospital:");
        add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        cmbHospital.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        btnRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        lblEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Enter your Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        txtEmail.setBackground(new java.awt.Color(11, 49, 48));
        txtEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 290, 30));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 280, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PERSONWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 120, 850));

        iconBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        iconBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackMousePressed(evt);
            }
        });
        add(iconBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        if(!validation.emailValidator(txtEmail.getText())){
            JOptionPane.showMessageDialog(this, "Please enter a valid email");
            return;
        }
        appointment v = new appointment();
        UserAccount receiver = new UserAccount();
        if(jComboBox1.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Please select a hospital to request vaccination");
            return;
        }
        v.setHospitalName(jComboBox1.getSelectedItem().toString());
        v.setPerson(userAccount);
        v.setSender(userAccount);
        v.setStatus("Requested");
        v.setEmail(txtEmail.getText());
        v.setMessage(userAccount.getUsername());
       
        Network currNet = enterprise.getNetwork();
        
        for(Enterprise e : currNet.getEnterpriseDirectory().getEnterpriseList()){
            //System.out.print("1");
            //System.out.println(e.getEnterpriseType());
            if(e.getEnterpriseType().toString().equals("Hospital")){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        //System.out.println("2");
                        //System.out.println(u.getRole().toString());
                        //System.out.println(u.getUsername());
                        if(u.getRole().toString().equals("Business.Role.DoctorRole")){
                            v.setReceiver(u);
                            receiver = u;
                        }
                    }
                }
            }
        }

        receiver.getWorkQueue().getWorkRequestList().add(v);
        userAccount.getWorkQueue().getWorkRequestList().add(v);
        JOptionPane.showMessageDialog(this, "Request sent");
        //userProcessContainer.removeAll();
            
        dB4OUtil.storeSystem(business);
        txtEmail.setText("");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void iconBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMousePressed
        // TODO add your handling code here:
        System.out.println("icon 1");
        userProcessContainer.removeAll();
        System.out.println("icon 2");
        PersonAreaJPanel personWorkAreaJPanel = new PersonAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        System.out.println("icon 3");
        userProcessContainer.add("PersonWorkAreaJPanel", personWorkAreaJPanel);
        System.out.println("icon 4");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        System.out.println("icon 5");
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_iconBackMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cmbHospital;
    private javax.swing.JLabel iconBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
