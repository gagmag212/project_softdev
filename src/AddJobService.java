
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class AddJobService {
    Company company  = new Company();
    Database database = new Database();
    
    public boolean checkTypeJobName(String jobName) {
        int num = 0;
         for (char c : jobName.toCharArray())
        {
            if (Character.isDigit(c)) num++;
        }
         if(num == 0){
            return  true;
        }
         return false;
    }
      //JobDAO jobDAO = new JobDAO();
    public boolean checkTypeJobAmount(String jobAmount) {
         for (char c : jobAmount.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
     public boolean checkTypeJobSalary(String jobSalary) {
         for (char c : jobSalary.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    public boolean checkJobBlank(String jobName, String jobType, String jobAmount, 
                                 String jobSalary, String jobDetail, String employeeProperty, String jobAddress,  
                                 String jobProvince, String jobWelfare )  {
        if(jobName.equals("") || jobType.equals("เลือกประเภทงาน") || jobAmount.equals("") || jobSalary.equals("") || 
           jobDetail.equals("") || employeeProperty.equals("") || jobAddress.equals("") || jobProvince.equals("เลือกจังหวัด") || 
           jobWelfare.equals("") ){
            return false;
        }
        return  true;
    }
     
    public void insertJob(String jobName, String jopType, String jobAmount, String  jobSalary,String jobDetail, 
                          String employeeProperty, String jobAddress,  String jobProvince, String jobWelfare) {
        String jobOwnerID = company.username;
        String jobOwnerName = company.companyName;
        
        database.insertJob(jobName, jopType, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, 
                           jobProvince, jobWelfare, jobOwnerName, jobOwnerID);
    }
    
    public String getUsername(){
        return company.username;
    }
}
