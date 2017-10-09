/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.TravelAgency;
import UserInterface.ManageAirliners.ManageAirlinerMain;
import UserInterface.ManageCustomers.ManageCustomerMain;
import UserInterface.ManageTravelAgency.ManageTravel;
import java.awt.CardLayout;

/**
 *
 * @author aravind
 */
public class MainHomePage extends javax.swing.JFrame {

    
    private TravelAgency travelagency;
    /**
     * Creates new form MainHomePage
     */
    public MainHomePage() {
        initComponents();
        this.travelagency= new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MainpageRight = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        manageAirlinerBtn = new javax.swing.JButton();
        manageCustomerBtn = new javax.swing.JButton();
        travelAgencyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainpageRight.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(MainpageRight);

        manageAirlinerBtn.setText("Manage Airliner ");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });

        manageCustomerBtn.setText("Manage Customer");
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });

        travelAgencyBtn.setText("Travel Agency");
        travelAgencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelAgencyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(travelAgencyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(manageAirlinerBtn)
                .addGap(68, 68, 68)
                .addComponent(manageCustomerBtn)
                .addGap(56, 56, 56)
                .addComponent(travelAgencyBtn)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        
        ManageAirlinerMain mngairliner = new ManageAirlinerMain(MainpageRight, travelagency);
        MainpageRight.add("ManageAirlinerMain", mngairliner);
        CardLayout layout = (CardLayout)MainpageRight.getLayout();
        layout.next(MainpageRight);
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
     
        ManageCustomerMain mngcustomer = new ManageCustomerMain(MainpageRight, travelagency);
        MainpageRight.add("ManageCustomerMain",mngcustomer);
        CardLayout layout = (CardLayout)MainpageRight.getLayout();
        layout.next(MainpageRight);
    }//GEN-LAST:event_manageCustomerBtnActionPerformed

    private void travelAgencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelAgencyBtnActionPerformed

        ManageTravel mngtravel = new ManageTravel(MainpageRight, travelagency);
        MainpageRight.add("ManageTravel", mngtravel);
        CardLayout layout = (CardLayout)MainpageRight.getLayout();
        layout.next(MainpageRight);
        // TODO add your handling code here:
    }//GEN-LAST:event_travelAgencyBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainpageRight;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JButton manageCustomerBtn;
    private javax.swing.JButton travelAgencyBtn;
    // End of variables declaration//GEN-END:variables
}
