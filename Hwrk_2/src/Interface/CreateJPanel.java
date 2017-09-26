/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Aeroplane;
import Business.Aeroplanelist;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author aravind
 */

public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Aeroplanelist al;
   // public CreateJPanel() {
     //   initComponents();
    //}

    CreateJPanel(Aeroplanelist al) {
       initComponents();
       this.al = al;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AvailableSeatsTxtBox = new javax.swing.JTextField();
        MaintanenceCertificateTxtbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AirportNameTxtBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MfgNameTxtbox = new javax.swing.JTextField();
        ModelNoTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MfgYearTxtBox = new javax.swing.JTextField();
        AirlineNameTxtBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SerialNoTxtBox = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        AvailableStatustextbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setText("Maintanence Certificate :");

        jLabel3.setText("Available Seats :");

        AvailableSeatsTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AvailableSeatsTxtBoxKeyTyped(evt);
            }
        });

        jLabel4.setText("Serial No :");

        jLabel1.setText("Manufacturer :");

        jLabel5.setText("Airline :");

        MfgNameTxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfgNameTxtboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Model No");

        jLabel6.setText("Airport :");

        MfgYearTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MfgYearTxtBoxKeyTyped(evt);
            }
        });

        jLabel7.setText("Manufacture Year :");

        SerialNoTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SerialNoTxtBoxKeyTyped(evt);
            }
        });

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Avaiable Status");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel11.setText("Create Your own Aeroplane");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92)
                                .addComponent(MfgNameTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AirportNameTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(AvailableStatustextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MaintanenceCertificateTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AvailableSeatsTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SerialNoTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AirlineNameTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addComponent(MfgYearTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ModelNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(createBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel11)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(MfgNameTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AvailableSeatsTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SerialNoTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AirlineNameTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AirportNameTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MfgYearTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ModelNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaintanenceCertificateTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(AvailableStatustextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MfgNameTxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfgNameTxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MfgNameTxtboxActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
    
    Aeroplane aa = al.addAeroplanes();
    aa.setAirlinename(AirlineNameTxtBox.getText());
    aa.setAirportName(AirportNameTxtBox.getText());
    aa.setAvailableStatus(AvailableStatustextbox.getText());
    aa.setMaintanenceStatus(MaintanenceCertificateTxtbox.getText());
    aa.setManufacturerName(MfgNameTxtbox.getText());
    aa.setSerialNumber(Integer.parseInt(SerialNoTxtBox.getText()));
    aa.setNoofseats(Integer.parseInt(AvailableSeatsTxtBox.getText()));
    aa.setYearofManufacture(Integer.parseInt(MfgYearTxtBox.getText()));
    aa.setModelno(ModelNoTextBox.getText());
    
    JOptionPane.showMessageDialog(null,"Aeroplane created successfully");
    
    AirlineNameTxtBox.setText("");
    AirportNameTxtBox.setText("");
    AvailableSeatsTxtBox.setText("");
    AvailableStatustextbox.setText("");
    MaintanenceCertificateTxtbox.setText("");
    MfgNameTxtbox.setText("");
    SerialNoTxtBox.setText("");
    MfgYearTxtBox.setText("");
    ModelNoTextBox.setText("");
    
    
    
    
    
    
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_createBtnActionPerformed

    private void AvailableSeatsTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AvailableSeatsTxtBoxKeyTyped

 char ch = evt.getKeyChar();
    if(!(Character.isDigit(ch)||(ch == KeyEvent.VK_DELETE)|| ch== KeyEvent.VK_BACKSPACE))
    {
      evt.consume();
        JOptionPane.showMessageDialog(null,"Please enter data of type integer");
        // TODO add your handling code here:
    }           
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailableSeatsTxtBoxKeyTyped

    private void SerialNoTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SerialNoTxtBoxKeyTyped
 char ch = evt.getKeyChar();
    if(!(Character.isDigit(ch)||(ch == KeyEvent.VK_DELETE)|| ch== KeyEvent.VK_BACKSPACE))
    {
      evt.consume();
        JOptionPane.showMessageDialog(null,"Please enter data of type integer");
        // TODO add your handling code here:
    }           

        // TODO add your handling code here:
    }//GEN-LAST:event_SerialNoTxtBoxKeyTyped

    private void MfgYearTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MfgYearTxtBoxKeyTyped

 char ch = evt.getKeyChar();
    if(!(Character.isDigit(ch)||(ch == KeyEvent.VK_DELETE)|| ch== KeyEvent.VK_BACKSPACE))
    {
      evt.consume();
        JOptionPane.showMessageDialog(null,"Please enter data of type integer");
        // TODO add your handling code here:
    }           
        // TODO add your handling code here:
    }//GEN-LAST:event_MfgYearTxtBoxKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirlineNameTxtBox;
    private javax.swing.JTextField AirportNameTxtBox;
    private javax.swing.JTextField AvailableSeatsTxtBox;
    private javax.swing.JTextField AvailableStatustextbox;
    private javax.swing.JTextField MaintanenceCertificateTxtbox;
    private javax.swing.JTextField MfgNameTxtbox;
    private javax.swing.JTextField MfgYearTxtBox;
    private javax.swing.JTextField ModelNoTextBox;
    private javax.swing.JTextField SerialNoTxtBox;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}