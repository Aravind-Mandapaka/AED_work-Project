/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdvisoryComiteeRole;

import Business.WorkQueue.VaccineRequest;
import Userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class ProcessOrderRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessOrderRequestJPanel
     */
    JPanel userProcessContainer;
    VaccineRequest request;
    public ProcessOrderRequestJPanel(JPanel userProcessContainer,
    VaccineRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
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

        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        submitJButton1 = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setText("Coment :");
        add(jLabel1);
        jLabel1.setBounds(78, 47, 70, 14);
        add(resultJTextField);
        resultJTextField.setBounds(154, 44, 140, 30);

        submitJButton.setText("Reject");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(210, 110, 110, 40);

        submitJButton1.setText("Approve");
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        add(submitJButton1);
        submitJButton1.setBounds(80, 110, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
       // request.setApprovalStatement(resultJTextField.getText());
         request.setComment1(resultJTextField.getText());
        request.setStatus("Rejected by Commitee");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed
           //request.setApprovalStatement(resultJTextField.getText());
           request.setComment1(resultJTextField.getText());
        request.setStatus("Approved by Commitee");
    }//GEN-LAST:event_submitJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton submitJButton1;
    // End of variables declaration//GEN-END:variables
}
