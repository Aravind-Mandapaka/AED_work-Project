/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.ProviderRole;

import Business.EcoSystem;
import Business.EnterPrice.EnterPrise;
import Business.NetWork.NetWork;
import Business.Organization.AdvisoryCommiteeOrganisation;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.VaccineRequest;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */

public class RequestVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestVaccineJPanel
     */
    private JPanel userProcessContainer;
    private ProviderOrganization organization;
    private EnterPrise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    public RequestVaccineJPanel(JPanel userProcessContainer, ProviderOrganization organization , EnterPrise enterprise, UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system =system;
        valueLabel.setText(enterprise.getName());
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        vaccineCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();

        setLayout(null);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(380, 170, 106, 22);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(510, 170, 90, 20);

        jLabel1.setText("Quantity");
        add(jLabel1);
        jLabel1.setBounds(330, 280, 70, 30);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(300, 360, 140, 30);

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(470, 360, 150, 30);

        add(vaccineCombo);
        vaccineCombo.setBounds(410, 240, 130, 30);

        jLabel2.setText("Vaccine :");
        add(jLabel2);
        jLabel2.setBounds(330, 230, 70, 30);
        add(quantityTxt);
        quantityTxt.setBounds(410, 290, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
//        dwjp.populateRequestTable();
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        int message = Integer.parseInt(quantityTxt.getText());
        String vaccine = (String) vaccineCombo.getSelectedItem();
        VaccineRequest request = new VaccineRequest();
        request.setQuantity(message);
        request.setVaccineName(vaccine);
        request.setRequestType("vaccine");
        request.setSender(userAccount);
        request.setStatus("Sent");
        

        Organization org = null;
       for(NetWork network : system.getNetworkList() )
            {
                for(EnterPrise enterPrise : network.getEnterpriseDirectory().getEnterpriseList() )
                { 
                    for (Organization organization : enterPrise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof AdvisoryCommiteeOrganisation){
                            org = organization;
                            break;
                        }
                    }
                }
            }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> vaccineCombo;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        
       DefaultComboBoxModel vaccineModel = (DefaultComboBoxModel)vaccineCombo.getModel();
       for(Vaccine v:system.getVaccineCatalog().getVaccineList())
       {
          if(vaccineModel.getIndexOf(v.getVaccineName()) == -1)
            {
                 vaccineModel.addElement(v.getVaccineName());
            } 
       }
    }
}