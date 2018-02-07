/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.InventoryCdcManager;

import Business.EcoSystem;
import Business.EnterPrice.EnterPrise;
import Business.NetWork.NetWork;
import Business.Organization.AdvisoryCommiteeOrganisation;
import Business.Organization.DistributionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineRequest;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class ProcessOrderFromCdcJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessOrderFromCdcJPanel
     */
            JPanel userProcessContainer;
    VaccineRequest request;
    private EcoSystem system;
    private UserAccount userAccount;
    public ProcessOrderFromCdcJPanel(JPanel userProcessContainer,
    VaccineRequest request,EcoSystem system,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request=request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        submitJButton1 = new javax.swing.JButton();

        setLayout(null);

        submitJButton.setText("Reject");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(410, 220, 110, 40);

        jLabel1.setText("Comment :");
        add(jLabel1);
        jLabel1.setBounds(290, 160, 80, 20);
        add(resultJTextField);
        resultJTextField.setBounds(360, 160, 140, 30);

        submitJButton1.setText("Approve");
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        add(submitJButton1);
        submitJButton1.setBounds(280, 220, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
       // request.setApprovalStatement(resultJTextField.getText());
        request.setComment3(resultJTextField.getText());
        request.setStatus("Rejected by CDC");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed
       // request.setApprovalStatement(resultJTextField.getText());
        request.setComment3(resultJTextField.getText());
        request.setStatus("Approved by CDC");
         Organization org = null;
        for(NetWork network : system.getNetworkList() )
            {
                for(EnterPrise enterPrise : network.getEnterpriseDirectory().getEnterpriseList() )
                { 
                    for (Organization organization : enterPrise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof DistributionOrganization){
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

    }//GEN-LAST:event_submitJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton submitJButton1;
    // End of variables declaration//GEN-END:variables
}
