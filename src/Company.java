/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class Company {
    static String username;
    static String email;
    static String tellnumber;
    static String businessType;
    static String contactName;
    static String companyName;
    static String companyDetail;
    static String address;
    static String province;
    static String zipcode;
    static String userType;
    
    public Company() {
        
    }
    
    public Company(String username, String email, String tellnumber, String businessType, String contactName,
                   String companyName, String companyDetail, String address, String province, String zipcode, 
                   String userType) {
        this.username = username;
        this.email = email;
        this.tellnumber = tellnumber;
        this.businessType = businessType;
        this.contactName = contactName;
        this.companyName = companyName;
        this.companyDetail = companyDetail;
        this.address = address;
        this.province= province;
        this.zipcode = zipcode;
        this.userType= userType;
    }
    
//    public String getUsername() {
//        return username;
//    }
    
//    public String getcompanyName() {
//        return companyName;
//    }
}
