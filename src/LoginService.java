
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class LoginService {
    UserDAO userDAO = new UserDAO();
    CompanyDAO companyDAO = new CompanyDAO();
    
    public boolean checkLogin(String username, String password, String UserType) {
        if (UserType.equals("User")) {
            return userDAO.checkUserLoginByUsernameAndPassword(username, password, UserType);
        } else {
            return companyDAO.checkCompanyLoginByUsernameAndPassword(username, password, UserType);
        }
    }
    
    public boolean checkNull(String username, String password) {
        if (username.equals("") || password.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
