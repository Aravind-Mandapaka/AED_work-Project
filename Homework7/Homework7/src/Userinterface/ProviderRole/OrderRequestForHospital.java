/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.ProviderRole;

import Business.EcoSystem;
import Business.EnterPrice.EnterPrise;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravind
 */
public class OrderRequestForHospital extends javax.swing.JPanel {

    /**
     * Creates new form OrderRequestForHospital
     */
    private JPanel userProcessContainer;
    private ProviderOrganization organization;
    private EnterPrise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    public OrderRequestForHospital(JPanel userProcessContainer, ProviderOrganization organization , EnterPrise enterprise, UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system=system;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
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
        workRequestJTable = new javax.swing.JTable();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        requestVaccineBtn = new javax.swing.JButton();

        setLayout(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Quantity", "Sender", "Receiver", "Comment by commitee", "Comment by director", "Comment by CDC", "Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 160, 680, 130);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(240, 40, 150, 30);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(80, 40, 120, 30);

        requestVaccineBtn.setText("Request for Vaccine");
        requestVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVaccineBtnActionPerformed(evt);
            }
        });
        add(requestVaccineBtn);
        requestVaccineBtn.setBounds(680, 330, 140, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void requestVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVaccineBtnActionPerformed
        RequestVaccineJPanel  requestVaccineJPanel = new RequestVaccineJPanel(userProcessContainer,organization,enterprise,userAccount,system);
        userProcessContainer.add("processWorkRequestJPanel", requestVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestVaccineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestVaccineBtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof VaccineRequest)
            {
                Object[] row = new Object[8];
                row[0] = ((VaccineRequest) request).getVaccineName();
                row[1] =  ((VaccineRequest) request).getQuantity();
                String result = ((VaccineRequest) request).getMessage();
                 row[2] =  ((VaccineRequest) request).getSender();
                  row[3] =  ((VaccineRequest) request).getReceiver();
                   row[4] =  ((VaccineRequest) request).getComment1();
                    row[5] =  ((VaccineRequest) request).getComment2();
                     row[6] =  ((VaccineRequest) request).getComment3();
                row[7] = ((VaccineRequest) request).getStatus();

                model.addRow(row);
            }
            
        }
    }
}