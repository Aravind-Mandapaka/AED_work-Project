/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Aeroplane;
import Business.Aeroplanelist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aravind
 */
public class ImportPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImportPanel
     */
    public Aeroplanelist al;
    public ImportPanel(Aeroplanelist al) {
        initComponents();
        this.al = al;
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
        importBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("load the data from CSV file");

        importBtn.setText("click to import");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(importBtn)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(importBtn)
                .addContainerGap(320, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed

        String[] s = null;
        String inputline = " ";
        Scanner ScanIn = null;
        String filedestination = "/Users/aravind/Desktop/assgn2.csv";
        
                //Users//aravind//Desktop//assgn2.csv
        Aeroplane ap = new Aeroplane();
        try
          {
            ScanIn = new Scanner(new BufferedReader(new FileReader(filedestination)));
            while(ScanIn.hasNextLine())
            {
                //Aeroplane ap = new Aeroplane();
                inputline = ScanIn.nextLine();
                s = inputline.split(",");
                ap = al.addAeroplanes();
                ap.setSerialNumber(Integer.parseInt(s[0]));
               // System.out.println(ap.getSerialNumber());
                ap.setAirlinename(s[1]);
                ap.setAirportName(s[2]);
                ap.setAvailableStatus(s[3]);
                ap.setManufacturerName(s[4]);
                ap.setModelno(s[5]);
                ap.setNoofseats(Integer.parseInt(s[6]));
                ap.setYearofManufacture(Integer.parseInt(s[7]));
                ap.setMaintanenceStatus(s[8]);
                
                
            }
             JOptionPane.showMessageDialog(null,"Data imported Successfully");
          }
        
        catch(Exception e)
        {
            
        }    

        // TODO add your handling code here:
    }//GEN-LAST:event_importBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton importBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
