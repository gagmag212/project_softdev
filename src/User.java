/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class User {
    static String username;
    static String email;
    static String Fname;
    static String Lname;
    static String gender;
    static String dateOfBirth;
    static String status;
    static String nationality;
    static String race;
    static String religion;
    static String address;
    static String province;
    static String zipcode;
    static String tellnumber;
    static String education;
    static String experience;
    static String userType;
    
    public User() {
        
    }
    
    public String getExperience() {
        return experience;
    }
    
    public String getEducation() {
        return education;
    }
    
    public String getTellnumber() {
        return tellnumber;
    }
    
    public String getZipcode() {
        return zipcode;
    }
    
    public String getProvince() {
        return province;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getReligion() {
        return religion;
    }
    
    public String getRace() {
        return race;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getLastname() {
        return Lname;
    }
    
    public String getFirstname() {
        return Fname;
    }
    
//    public String getUsername() {
//        return username;
//    }
    
    public User(String username, String email, String Fname, String Lname, String gender, String dateOfBirth,
            String status, String nationality, String race, String religion, String address, String province,
            String zipcode, String tellnumber, String education, String experience, String userType) {
        this.username = username;
        this.email = email;
        this.Fname = Fname;
        this.Lname = Lname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.nationality = nationality;
        this.race = race;
        this.religion = religion;
        this.address = address;
        this.province = province;
        this.zipcode = zipcode;
        this.tellnumber = tellnumber;
        this.education = education;
        this.experience = experience;
    }
}
