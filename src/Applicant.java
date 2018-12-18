/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Applicant {
    String jobName;
    String name;
    String email;
    String gender;
    String dateOfBirth;
    String status;
    String nationality;
    String race;
    String religion;
    String address;
    String province;
    String zipcode;
    String education;
    String experience;
    
    Applicant (String jobName, String name, String email, String gender, String dateOfBirth, String status,
            String nationality, String race, String religion, String address, String province, 
            String zipcode, String education, String experience){
   
    this.jobName = jobName;
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.status = status;
    this.nationality = nationality;
    this.race = race;
    this.religion = religion;
    this.address = address;
    this.province = province;
    this.zipcode = zipcode;
    this.education = education;
    this.experience = experience;
    }
}
