
import sun.security.util.Password;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class RegisterUserService {
     
    
    UserDAO userDAO = new UserDAO();
    Database data = new Database();
    public boolean checkNull(String username, String password,String rePassword, String email, String Fname, String Lname, 
                                  String gender, String dateOfBirth,String status, String nationality,String race, String religion,
                                  String address, String province, String zipcode, String tellnumber, String education,String experience )  {
        if(username.equals("") || password.equals("") || rePassword.equals("") || email.equals("") || Fname.equals("") || Lname.equals("") || gender.equals("") ||
            dateOfBirth.equals("วัน/เดือน/ปี") || status.equals("สถานภาพ") || nationality.equals("") || race.equals("") || religion.equals("") ||
            address.equals("") || province.equals("เลือกจังหวัด") || zipcode.equals("") || tellnumber.equals("") || education.equals("") || experience.equals("") ){
            return false;
        }
        return  true;
    }
    public boolean checkPassword(String password, String rePassword) {
        if(password.equals(rePassword)){
            return true;
        }else{
            return false;
        }  
    }
    public boolean checkUsernameLength(String username) {
        if(username.length() > 5){
            return true;
        }else{
            return false;
        }  
    }
    
    public boolean checkUserRegisterByUsername(String username) {
        return userDAO.checkUserRegisterByUsername(username);  
    }
    
     public boolean checkPasswordLength(String password) {
        if(password.length() > 7){
            return true;
        }else{
            return false;
        }  
    }
      public boolean checkPasswordForm(String password) {
        int numChar = 0;
        int numInt = 0;
        for (char c : password.toCharArray())
        {
            if (Character.isDigit(c)){ numChar++; }
            else{ numInt++; }
        }
         if(numChar != 0 && numInt != 0){
            return  true;
        }
         return false;
    }
       public void insertUser(String username, String password, String email, String Fname, String Lname, String gender, 
                                String dateOfBirth, String status, String nationality, String religion, String race,
                                String address, String province, String zipcode, String tellnumber, String education, 
                                String experience, String userType, String userStatus ) {
           data.insertUser(username, password, email, Fname, Lname, gender, dateOfBirth, status, nationality, religion, race, address, province, zipcode, tellnumber, education, experience, userType, userStatus);
       }
    
}
