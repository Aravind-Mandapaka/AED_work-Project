/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.AirLiner;
import Business.AirPlane;
import Business.FlightSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pruth
 */
public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBestFlightDealsJPanel
     */
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;

    ViewBestFlightDealsJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.travelAgency = travelAgency;
        this.userProcessContainer = userProcessContainer;
        PopulateDestinationDropdown();
        PopulateSourceDropdown();
    }

    public void PopulateSourceDropdown() {
        sourceComboBox.removeAllItems();
        DefaultComboBoxModel DLM = new DefaultComboBoxModel();
        for (int i = 0; i < travelAgency.getMasterTravelSchedule().getFlightScheduleList().size(); i++) {
            DLM.addElement(travelAgency.getMasterTravelSchedule().getFlightScheduleList().get(i).getSource());
        }
        sourceComboBox.setModel(DLM);
    }

    public void PopulateDestinationDropdown() {
        destinationComboBox.removeAllItems();
        DefaultComboBoxModel DLM = new DefaultComboBoxModel();
        for (int i = 0; i < travelAgency.getMasterTravelSchedule().getFlightScheduleList().size(); i++) {;
            DLM.addElement(travelAgency.getMasterTravelSchedule().getFlightScheduleList().get(i).getDestination());
        }
        destinationComboBox.setModel(DLM);
    }

    public void PopulateTable() {
        DefaultTableModel dtm = (DefaultTableModel) agencyTable.getModel();
        dtm.setRowCount(0);
        String source = (String) sourceComboBox.getSelectedItem();
        String destination = (String) destinationComboBox.getSelectedItem();

        for (AirLiner airLiner : travelAgency.getAirLinersList()) {
            for (AirPlane airPlane : airLiner.getFleet().getAirPlanesList()) {
                if (airPlane.getFlight().getFlightSchedule().getSource().equals(source) && airPlane.getFlight().getFlightSchedule().getDestination().equals(destination)) {
                    Object[] row = new Object[5];
                    row[0] = airLiner;
                    row[1] = airPlane;
                    row[2] = airPlane.getManufacturer();
                    row[3] = airPlane.getFlight().getFlightSchedule().getSource();
                    row[4] = airPlane.getFlight().getFlightSchedule().getDestination();
                    dtm.addRow(row);
                }
            }
        }

        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No Planes Found :<");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sourceComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        destinationComboBox = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        agencyTable = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Best Deals");

        jLabel2.setText("Source");

        sourceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Destination");

        destinationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        agencyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirLiner", "Airplane ModelNo", "Manfacturer Name", "Source", "Destination"
            }
        ));
        jScrollPane1.setViewportView(agencyTable);

        btnBook.setText("Select airplane and Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(507, 507, 507)
                            .addComponent(btnBook)
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(sourceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnSearch)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sourceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBook)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        PopulateTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int selectedRow = agencyTable.getSelectedRow();

        if (selectedRow >= 0) {
            AirLiner airLiner = (AirLiner) agencyTable.getValueAt(selectedRow, 0);
            AirPlane airPlane=(AirPlane) agencyTable.getValueAt(selectedRow, 1);
            BookCustomersJPanel panel = new BookCustomersJPanel(userProcessContainer, travelAgency, airLiner, airPlane);
            userProcessContainer.add("BookCustomersJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agencyTable;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> destinationComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sourceComboBox;
    // End of variables declaration//GEN-END:variables
}
