/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class JobDetailService {
    User user = new User();
    ApplicantDAO applicantDAO = new ApplicantDAO();
    Database database = new Database();
    
    public String getName() {
        return user.Fname + " " + user.Lname;
    }
    
    public boolean checkApplicantByKeyword(String name, String jobName) {
        return applicantDAO.checkApplicantByKeyword(name, jobName);
    }
    
    public void insertApplicant(String name, String jobName) {
        String email = user.email;
        String gender = user.gender;
        String dateOfBirth = user.dateOfBirth;
        String status = user.status;
        String nationality = user.nationality;
        String race = user.race;
        String religion = user.religion;
        String address = user.address;
        String province = user.province;
        String zipcode = user.zipcode;
        String tellnumber = user.tellnumber;
        String education = user.education;
        String experience = user.experience;
        database.insertApplicant(jobName, name, email, gender, dateOfBirth, status, nationality, race, religion, address, 
                                 province, zipcode, tellnumber, education, experience);
    }
}
