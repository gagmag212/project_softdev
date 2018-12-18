/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class RegisterCompanyService {
    CompanyDAO companyDAO = new CompanyDAO();
    Database data = new Database();
    public boolean checkNull(String username, String password,String rePassword, String email, String tellnumber, String businessType,
                                    String contactName, String companyName, String companyDetail, String address, String province,String zipcode)  {
        if(username.equals("") || password.equals("") || rePassword.equals("") || email.equals("") || tellnumber.equals("") || businessType.equals("เลือกประเภทธุรกิจ") ||
            contactName.equals("") || companyName.equals("") || companyDetail.equals("") || address.equals("") || province.equals("เลือกจังหวัด") || zipcode.equals("")){
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
    public boolean checkCompanyRegisterByUsername(String username) {
        return companyDAO.checkCompanyRegisterByUsername(username);  
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
        for (char index : password.toCharArray())
        {
            if (Character.isDigit(index)){ numChar++; }
            else{ numInt++; }
        }
         if(numChar != 0 && numInt != 0){
            return  true;
        }
         return false;
    }
    public void insertCompany(String username, String password, String email, String tellnumber, String businessType, String contactName, 
                                String companyName, String companyDetail, String address, String province, String zipcode,
                                String userType, String userStatus) {
         data.insertCompany(username, password, email, tellnumber, businessType, contactName, companyName, companyDetail, address, province, zipcode, userType, userStatus);
    }
    
}
