 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
import com.mongodb.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class JobDAO {
    public static MongoClientURI uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
    public static MongoClient client = new MongoClient(uri);
    public static DB db = client.getDB(uri.getDatabase());
    public static DBCollection Collection = db.getCollection("Job");
    
    public ArrayList<Job> getJobsByKeyword(String searchValue, String searchType) {
        ArrayList<Job> jobArr = new ArrayList<>();
        for( DBObject dock : Collection.find() ) {
            
            String jobName = (String) dock.get("jobName").toString();
            String jobType = (String) dock.get("jobType").toString();
            String jobOwnerID = (String) dock.get("jobOwnerID").toString();
            String jobOwnerName = (String) dock.get("jobOwnerName").toString();
            String jobAmount = (String) dock.get("jobAmount");
            String jobSalary = (String) dock.get("jobSalary");
            String jobDetail = (String) dock.get("jobDetail").toString();
            String employeeProperty = (String) dock.get("employeeProperty").toString();
            String jobAddress = (String) dock.get("jobAddress").toString();
            String jobProvince = (String) dock.get("jobProvince").toString();
            String jobWelfare = (String) dock.get("jobWelfare").toString();
            
            if (searchType.equals("ByJobType")) {
                if (jobType.equals(searchValue)){
                    Job job = new Job(jobName, jobType, jobOwnerID, jobOwnerName, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, jobProvince, jobWelfare);
                    jobArr.add(job);
                } } else if (searchType.equals("ByJobName")) {
                    if (searchValue.isEmpty()){
                        Job job = new Job(jobName, jobType, jobOwnerID, jobOwnerName, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, jobProvince, jobWelfare);
                        jobArr.add(job);
                    } else if (jobName.contains(searchValue)){
                        Job job = new Job(jobName, jobType, jobOwnerID, jobOwnerName, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, jobProvince, jobWelfare);
                        jobArr.add(job);
                    }
                }
        }
        return jobArr;
    }
    
    public ArrayList<Job> getJobByUsername(String username) {
        ArrayList<Job> jobArr = new ArrayList<>();
        
        for( DBObject dock : Collection.find() ) {
            
            String jobName = (String) dock.get("jobName").toString();
            String jobType = (String) dock.get("jobType").toString();
            String jobOwnerID = (String) dock.get("jobOwnerID").toString();
            String jobOwnerName = (String) dock.get("jobOwnerName").toString();
            String jobAmount = (String) dock.get("jobAmount");
            String jobSalary = (String) dock.get("jobSalary");
            String jobDetail = (String) dock.get("jobDetail").toString();
            String employeeProperty = (String) dock.get("employeeProperty").toString();
            String jobAddress = (String) dock.get("jobAddress").toString();
            String jobProvince = (String) dock.get("jobProvince").toString();
            String jobWelfare = (String) dock.get("jobWelfare").toString();
            
            if (jobOwnerID.equals(username)) {
                Job job = new Job(jobName, jobType, jobOwnerID, jobOwnerName, jobAmount, jobSalary, jobDetail, employeeProperty, jobAddress, jobProvince, jobWelfare);
                jobArr.add(job);
            }
        }
        return jobArr;
    }
}
    
    
