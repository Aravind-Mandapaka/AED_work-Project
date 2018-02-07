/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author aravind
 */
public class VaccineRequest extends WorkRequest {
    private String vaccineName;
    private int quantity;
    private String comment1;
    private String comment2;
    private String comment3;
    private String approvalStatement;
    private UserAccount senderFirstLevel;
    private UserAccount senderSecondLevel;
    private UserAccount receiverFirstLevel;
    private UserAccount receiverSecondLevel;

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public UserAccount getSenderFirstLevel() {
        return senderFirstLevel;
    }

    public void setSenderFirstLevel(UserAccount senderFirstLevel) {
        this.senderFirstLevel = senderFirstLevel;
    }

    public UserAccount getSenderSecondLevel() {
        return senderSecondLevel;
    }

    public void setSenderSecondLevel(UserAccount senderSecondLevel) {
        this.senderSecondLevel = senderSecondLevel;
    }

    public UserAccount getReceiverFirstLevel() {
        return receiverFirstLevel;
    }

    public void setReceiverFirstLevel(UserAccount receiverFirstLevel) {
        this.receiverFirstLevel = receiverFirstLevel;
    }

    public UserAccount getReceiverSecondLevel() {
        return receiverSecondLevel;
    }

    public void setReceiverSecondLevel(UserAccount receiverSecondLevel) {
        this.receiverSecondLevel = receiverSecondLevel;
    }

    
    public String getApprovalStatement() {
        return approvalStatement;
    }

    public void setApprovalStatement(String approvalStatement) {
        this.approvalStatement = approvalStatement;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
