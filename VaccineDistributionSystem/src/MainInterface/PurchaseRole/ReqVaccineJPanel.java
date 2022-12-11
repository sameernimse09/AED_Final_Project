/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterface.PurchaseRole;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.Enterprise.EnterpriseType;
import Model.Enterprise.DistributorEnterprise;
import Model.Network.Network;
import Model.Organization.ManufacturingOrg;
import Model.Organization.Organization;
import Model.Organization.OrgDirectory;
import Model.Organization.OrderInventory;
import Model.Organization.OrderOrganization;
import Model.Organization.VaccineDetails;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.requestVaccine;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Sameer Nimse
 */
public class ReqVaccineJPanel extends javax.swing.JPanel {

    private OrgDirectory directory;
    private JPanel userProcessContainer;
    private OrderOrganization organization;
    private Enterprise enterprise;
    private EcoSys business;
    public Enterprise currEP;
        private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

//    private Network network;
    private UserAccount userAccount;
    private ArrayList<OrderInventory> inventory = new ArrayList<>();
    

    
    public ReqVaccineJPanel(OrgDirectory directory, JPanel userProcessContainer, OrderOrganization organization, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.directory = directory;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
//        this.network = network;
        this.userAccount = userAccount;
        populateOrganizationComboBox();
        
    }

    public void populateOrganizationComboBox(){
        cmbManufacturer.removeAllItems();
        
        Network currnet = enterprise.getNetwork();
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
        if(e.getEnterpriseType() == EnterpriseType.Pharmaceutical){
            cmbManufacturer.addItem(e.getName());
            currEP = e;
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

        lblManufacturer = new javax.swing.JLabel();
        cmbManufacturer = new javax.swing.JComboBox<>();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        separatorLine = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(11, 49, 48));
        setMinimumSize(new java.awt.Dimension(670, 848));
        setPreferredSize(new java.awt.Dimension(670, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManufacturer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setText("Select Manufacturer:");
        add(lblManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        cmbManufacturer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManufacturerActionPerformed(evt);
            }
        });
        add(cmbManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        lblQuantity.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Enter Quantity:");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        txtQuantity.setBackground(new java.awt.Color(11, 49, 48));
        txtQuantity.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtQuantity.setBorder(null);
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, -1));

        btnOrder.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        separatorLine.setBackground(new java.awt.Color(255, 255, 255));
        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManufacturerActionPerformed
        // TODO add your handling code here:
//        ManufacturingOrganization org = (ManufacturingOrganization) ManufacturerjComboBox.getSelectedItem();
//        
//        if(org!=null){
//        populateVaccineComboBox(org);
//        }
    }//GEN-LAST:event_cmbManufacturerActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        
        UserAccount receive = new UserAccount();
        UserAccount dist = new UserAccount();
        if(validate(cmbManufacturer.getSelectedItem().toString(),txtQuantity.getText())){
            OrderInventory pi = new OrderInventory();
            pi.setManuEP(currEP);
            pi.setQty(Integer.parseInt(txtQuantity.getText()));
            inventory.add(pi);
//            organization.addPI(pi);
            
        requestVaccine rv = new requestVaccine();
            rv.setPurchaser(userAccount);
            rv.setSender(userAccount);
            rv.setCount(Integer.parseInt(txtQuantity.getText()));
            for(Organization o : currEP.getOrganizationDirectory().getOrganizationList()){
                for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                    if(u.getRole().toString().equals("Business.Role.SalesRole")){
                        rv.setReceiver(u);
                        receive = u;
                    System.out.println(u.getRole().toString());
                    System.out.println(u.getUsername());
                    }
                }
            }
            Network currnet = enterprise.getNetwork();
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType() == EnterpriseType.Service){
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                            rv.setDistribution(u);
                            dist = u;
                        }
                    }
                }
            }
        }
//            for(UserAccount u : currEP.getUserAccountDirectory().getUserAccountList()){
//                System.out.println(ManufacturerjComboBox.getSelectedItem().toString());
//                if(u.getUsername().toString().equals(ManufacturerjComboBox.getSelectedItem().toString())){
//                    System.out.println(u.getUsername());
//                    rv.setReceiver(u);
//                    receive = u;
//                }
//            }
            System.out.println("123");
            rv.setStatus("Ordered");
            rv.setQty(Integer.parseInt(txtQuantity.getText()));
            rv.setInventoryPurchase(inventory);
            receive.getWorkQueue().getWorkRequestList().add(rv);
            dist.getWorkQueue().getWorkRequestList().add(rv);
//            Network currnet = enterprise.getNetwork();
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
        if(e.getEnterpriseType() == EnterpriseType.Pharmaceutical){
            System.out.println("Searching Org");
            for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                System.out.println("Org found");
                
                System.out.println("Searching user");
//            for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
//                
//                System.out.println("user found");
//                System.out.println(u.getRole().toString());
//                if(u.getRole().toString().equals("Business.Role.ManufacturingRole")){
//                    
//                System.out.println("role found");
//                    System.out.println(u.getUsername());
//                    rv.setReceiver(u);
//                    u.getWorkQueue().getWorkRequestList().add(rv);
//                }
//            }
        }
            }
        }
            
            userAccount.getWorkQueue().getWorkRequestList().add(rv);
            //receive.getWorkQueue().getWorkRequestList().add(rv);
//            for(Network n : business.getNetworkList()){
//            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                e.setEnterpriseType(EnterpriseType.Service);
//                if(e instanceof ServiceEnterprise){
//                Organization org = null;
//                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
//                    if(o instanceof PurchaseOrganization){
//                        org = o;
//                        break;
//                    }
//                }
//                if (org != null) {
//
//                        org.getWorkQueue().getWorkRequestList().add(rv);
//                        userAccount.getWorkQueue().getWorkRequestList().add(rv);
//                    }
//            }
//            }
//        }
            JOptionPane.showMessageDialog(this, "Order Created");
        }
        dB4OUtil.storeSystem(business);
        txtQuantity.setText("");
    }//GEN-LAST:event_btnOrderActionPerformed

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantityKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> cmbManufacturer;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String manuName, String Qty) {
        if(manuName.length()<1){
            JOptionPane.showMessageDialog(this,"Please select a manufacturer from the list");
            return false;
        }
        if(Qty.length()<1){
            JOptionPane.showMessageDialog(this, "Please specify the quantity to order");
            return false;
        }
        return true;
    }

}
