
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class CompanyMainService {
    JobDAO jobDAO = new JobDAO();
    Company company = new Company();
    Database data = new Database();
    
    public ArrayList<Job> getJobByUsername(String username) {
        ArrayList<Job> jobArr = new ArrayList<>();
        jobArr = jobDAO.getJobByUsername(username);
        return jobArr;
    }
    
    public String getUsername() {
        return company.username;
    }
    
    public void logout(){
        data.updateStatus(getUsername(), 0,"Company");
    }
}
