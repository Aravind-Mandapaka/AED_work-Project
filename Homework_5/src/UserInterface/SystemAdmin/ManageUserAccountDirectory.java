/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Business;
import Business.HumanResources.Person;
import Business.SystemAdmin.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravind
 */
public class ManageUserAccountDirectory extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountDirectory
     */
   JPanel MainPageRight;
   Business business;
   

   public ManageUserAccountDirectory(JPanel MainPageRight, Business business) {
        initComponents();
        this.MainPageRight=MainPageRight;
        this.business=business;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountsTable = new javax.swing.JTable();
        btnNewUserAccount = new javax.swing.JButton();
        btnUpdateUserAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        userAccountsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Account role"
            }
        ));
        jScrollPane1.setViewportView(userAccountsTable);

        btnNewUserAccount.setText("New User Account>>");
        btnNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserAccountActionPerformed(evt);
            }
        });

        btnUpdateUserAccount.setText("Update User Account>>");
        btnUpdateUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserAccountActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete user account");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User Account Directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUpdateUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewUserAccount)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateUserAccount)
                    .addComponent(btnBack))
                .addContainerGap(247, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserAccountActionPerformed
        // TODO add your handling code here:
        AddUserAccount panel = new AddUserAccount(MainPageRight, business);
        MainPageRight.add("AddUserAccount", panel);
        CardLayout layout = (CardLayout) MainPageRight.getLayout();
        layout.next(MainPageRight);
    }//GEN-LAST:event_btnNewUserAccountActionPerformed

    private void btnUpdateUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserAccountActionPerformed
        // TODO add your handling code here:
        int selectedRow = userAccountsTable.getSelectedRow();

        if (selectedRow >= 0) {
            UserAccount ua = (UserAccount) userAccountsTable.getValueAt(selectedRow, 0);

            UpdateUserAccount panel = new UpdateUserAccount(MainPageRight, business, ua);
            MainPageRight.add("UpdateUserAccount", panel);
            CardLayout layout = (CardLayout) MainPageRight.getLayout();
            layout.next(MainPageRight);
        } else {
            JOptionPane.showMessageDialog(null, "Please select an user account");
        }
    }//GEN-LAST:event_btnUpdateUserAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainPageRight.remove(this);
        CardLayout layout = (CardLayout) MainPageRight.getLayout();
        layout.previous(MainPageRight);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = userAccountsTable.getSelectedRow();

        if (selectedRow >= 0) {
            UserAccount ua = (UserAccount) userAccountsTable.getValueAt(selectedRow, 0);
            business.getUserAccountDirectory().removeUserAcoount(ua);
             JOptionPane.showMessageDialog(null, "user deleted successfully");
             populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Please select an user account");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewUserAccount;
    private javax.swing.JButton btnUpdateUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userAccountsTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        
        int rowCount = userAccountsTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) userAccountsTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
        }
         for (UserAccount ua : business.getUserAccountDirectory().getUserAccountDirectorylist()) {
            Object[] row = new Object[3];
            row[0] = ua;
            row[1] = ua.getPassword();
            row[2] = ua.getRole();
            dtm.addRow(row);
        }
            
        
    }
}
