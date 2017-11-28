/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DirectorOrganisation;

import Business.EcoSystem;
import Business.EnterPrise.EnterPrise;
import Business.NetWork.NetWork;
import Business.Organization.DirectorOrganization;
import Business.Organization.InventoryCdcManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pruth
 */
public class DirectorOrganisationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DirectorOrganisationJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private DirectorOrganization directorOrganization;

    ;
    public DirectorOrganisationWorkAreaJPanel(JPanel userProcessContainer,
            EcoSystem system,
            UserAccount userAccount,
            Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.directorOrganization = (DirectorOrganization) organization;
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

        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton);
        refreshJButton.setBounds(50, 100, 100, 50);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 200, 452, 100);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton);
        assignJButton.setBounds(130, 350, 170, 40);

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton);
        processJButton.setBounds(330, 350, 120, 40);

        jButton1.setText("Send request to CDC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(480, 350, 280, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        ((VaccineRequest) request).setReceiverFirstLevel(userAccount);
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        VaccineRequest request = (VaccineRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing in Second level");

        ProcessOrderFromComiteeJPanel processOrderRequestJPanel = new ProcessOrderFromComiteeJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processOrderRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        VaccineRequest request = (VaccineRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Rejected by Director")) {
            JOptionPane.showMessageDialog(null, "Cannot send the request to CDC");
            return;
        }
        request.setSenderSecondLevel(userAccount);
        request.setStatus("Sent to CDC");

        populateTable();

        Organization org = null;
        for (NetWork network : system.getNetworkList()) {
            for (EnterPrise enterPrise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterPrise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof InventoryCdcManagerOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Request Sent");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : directorOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = ((VaccineRequest) request).getSenderFirstLevel().getEmployee().getName();
            row[2] = ((VaccineRequest) request).getReceiverFirstLevel() == null ? null : ((VaccineRequest) request).getReceiverFirstLevel().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

}