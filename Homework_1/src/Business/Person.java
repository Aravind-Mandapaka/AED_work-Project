/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.LicenseData;
import Business.Address;
import Business.FinancialAccounts;
import Business.CreditCard;
/**
 *
 * @author aravind
 */
public class Person {
    
    private String name;
    private String age;
    private String gender;
    private String contact;
    private String Address;
    private String displaypicture;
    private LicenseData licenseData;
    private FinancialAccounts financialAccounts;
    private CreditCard creditCard;
    private Address homeAdress;

    public String getDisplaypicture() {
        return displaypicture;
    }

    public void setDisplaypicture(String displaypicture) {
        this.displaypicture = displaypicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public LicenseData getLicenseData() {
        return licenseData;
    }

    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }

    public FinancialAccounts getFinancialAccounts() {
        return financialAccounts;
    }

    public void setFinancialAccounts(FinancialAccounts financialAccounts) {
        this.financialAccounts = financialAccounts;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Address homeAdress) {
        this.homeAdress = homeAdress;
    }

    
    

}