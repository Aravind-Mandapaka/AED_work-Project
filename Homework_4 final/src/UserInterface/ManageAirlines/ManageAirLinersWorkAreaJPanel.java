/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.AirLiner;
import Business.AirPlane;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravind
 */
public class ManageAirLinersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirLinersWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;

    public ManageAirLinersWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travelAgency = travelAgency;
        PopulateAirLineTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        airLinerTable = new javax.swing.JTable();
        btnselectAirliner = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        airPlanesTable = new javax.swing.JTable();
        btnCreateAirLiner = new javax.swing.JButton();
        btnCreateFlight = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage AirLiners");

        airLinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name"
            }
        ));
        jScrollPane1.setViewportView(airLinerTable);

        btnselectAirliner.setText("See Details of Above  Airliner");
        btnselectAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectAirlinerActionPerformed(evt);
            }
        });

        airPlanesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ModelNumber", "Manufacturer", "Manufactured Year"
            }
        ));
        jScrollPane2.setViewportView(airPlanesTable);

        btnCreateAirLiner.setText("Create  New AirLiner");
        btnCreateAirLiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAirLinerActionPerformed(evt);
            }
        });

        btnCreateFlight.setText("Select and manage Flights for Above selected Airliner");
        btnCreateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFlightActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnselectAirliner)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreateAirLiner))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreateFlight)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateAirLiner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateFlight))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnselectAirliner)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void PopulateAirLineTable() {
        DefaultTableModel dtm = (DefaultTableModel) airLinerTable.getModel();
        dtm.setRowCount(0);
        for (AirLiner airLiner : travelAgency.getAirLinersList()) {
            Object[] row = new Object[1];
            row[0] = airLiner;
            dtm.addRow(row);
        }
    }

    public void PopulateAirPlaneTable() {

        int selectedRow = airLinerTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) airPlanesTable.getModel();
        dtm.setRowCount(0);
        if (selectedRow >= 0) {

            AirLiner airLiner = (AirLiner) airLinerTable.getValueAt(selectedRow, 0);
            for (AirPlane airplane : airLiner.getFleet().getAirPlanesList()) {
                Object[] row1 = new Object[3];
                row1[0] = airplane;
                row1[1] = airplane.getManufacturer();
                row1[2] = airplane.getManufacturedYear();
                dtm.addRow(row1);
            }

        }
    }
    private void btnCreateAirLinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAirLinerActionPerformed
        // TODO add your handling code here:
        CreateNewAirlineJPanel panel = new CreateNewAirlineJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("CreateNewAirlineJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAirLinerActionPerformed

    private void btnCreateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFlightActionPerformed
        // TODO add your handling code here:
        int selectedRow = airLinerTable.getSelectedRow();

        if (selectedRow >= 0) {
            AirLiner airLiner = (AirLiner) airLinerTable.getValueAt(selectedRow, 0);

            ManageFlightWorkAreaJPanel panel = new ManageFlightWorkAreaJPanel(userProcessContainer, travelAgency, airLiner);
            userProcessContainer.add("ManageFlightWorkAreaJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select an Airliner");
        }
    }//GEN-LAST:event_btnCreateFlightActionPerformed

    private void btnselectAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectAirlinerActionPerformed
        // TODO add your handling code here:
        PopulateAirPlaneTable();
    }//GEN-LAST:event_btnselectAirlinerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airLinerTable;
    private javax.swing.JTable airPlanesTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAirLiner;
    private javax.swing.JButton btnCreateFlight;
    private javax.swing.JButton btnselectAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
