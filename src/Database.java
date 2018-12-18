
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Database {
    public static MongoClientURI uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
    public static MongoClient client = new MongoClient(uri);
    public static DB db = client.getDB(uri.getDatabase());
    public static DBCollection Collection;
    
    public void insertJob(String jobName, String jobType, String jobAmount, String  jobSalary, String jobDetail, 
                          String employeeProperty, String jobAddress,  String jobProvince, String jobWelfare, 
                          String jobOwnerName, String jobOwnerID){
        Collection = db.getCollection("Job");
        BasicDBObject jobData = new BasicDBObject();
        jobData.put("jobOwnerID", jobOwnerID);
        jobData.put("jobOwnerName", jobOwnerName);
        jobData.put("jobName", jobName);
        jobData.put("jobType", jobType);
        jobData.put("jobAmount", jobAmount);
        jobData.put("jobSalary", jobSalary);
        jobData.put("jobDetail", jobDetail);
        jobData.put("employeeProperty", employeeProperty);
        jobData.put("jobAddress", jobAddress);
        jobData.put("jobProvince", jobProvince);
        jobData.put("jobWelfare", jobWelfare);
        Collection.insert(jobData);
    }
    
    public void insertApplicant(String jobName, String name, String email, String gender, String dateOfBirth, String status, 
                                String nationality, String race, String religion, String address, String province,
                                String zipcode, String tellnumber, String education, String experience) {
        Collection = db.getCollection("Applicant");
        BasicDBObject applicantData = new BasicDBObject();
        applicantData.put("jobName", jobName);
        applicantData.put("name", name);
        applicantData.put("email", email);
        applicantData.put("gender", gender);
        applicantData.put("dateOfBirth", dateOfBirth);
        applicantData.put("status", status);
        applicantData.put("nationality", nationality);
        applicantData.put("race", race);
        applicantData.put("religion", religion);
        applicantData.put("address", address);
        applicantData.put("province", province);
        applicantData.put("zipcode", zipcode);
        applicantData.put("tellnumber", tellnumber);
        applicantData.put("education", education);
        applicantData.put("experience", experience);
        Collection.insert(applicantData);
    }
    public void insertCompany(String username, String password, String email, String tellnumber, String businessType, String contactName, 
                                String companyName, String companyDetail, String address, String province, String zipcode,
                                String userType, String userStatus) {
        Collection = db.getCollection("Company");
        BasicDBObject companyData = new BasicDBObject();
        companyData.put("username", username);
        companyData.put("password", password);
        companyData.put("email", email);
        companyData.put("tellnumber", tellnumber);
        companyData.put("businessType", businessType);
        companyData.put("contactName", contactName);
        companyData.put("companyName", companyName);
        companyData.put("companyDetail", companyDetail);
        companyData.put("address", address);
        companyData.put("province", province);
        companyData.put("zipcode", zipcode);
        companyData.put("userType", userType);
        companyData.put("userStatus", userStatus);
        Collection.insert(companyData);
   
    }
    public void insertUser(String username, String password, String email, String Fname, String Lname, String gender, 
                                String dateOfBirth, String status, String nationality, String religion, String race,
                                String address, String province, String zipcode, String tellnumber, String education, 
                                String experience, String userType, String userStatus ) {
        Collection = db.getCollection("User");
        BasicDBObject userData = new BasicDBObject();
        userData.put("username", username);
        userData.put("password", password);
        userData.put("email", email);
        userData.put("Fname", Fname);
        userData.put("Lname", Lname);
        userData.put("gender", gender);
        userData.put("dateOfBirth", dateOfBirth);
        userData.put("status", status);
        userData.put("nationality", nationality);
        userData.put("religion", religion);
        userData.put("race", race);
        userData.put("address", address);
        userData.put("province", province);
        userData.put("zipcode", zipcode);
        userData.put("tellnumber", tellnumber);
        userData.put("education", education);
        userData.put("experience", experience);
        userData.put("userType", userType);
        userData.put("userStatus", userStatus);
        Collection.insert(userData);      
  
    }
    
    public void updateStatus(String username, int statusNumber, String userType) {
        try {
            Collection = db.getCollection(userType);
            BasicDBObject newValue = new BasicDBObject();
            BasicDBObject searchQuery = new BasicDBObject();
                    
            if (statusNumber == 1) {
                newValue.append("$set", new BasicDBObject().append("status", "online"));
                searchQuery.append("username", username);
                Collection.update(searchQuery, newValue);
            } else {
                newValue.append("$set", new BasicDBObject().append("status", "offline"));
                searchQuery.append("username", username);
                Collection.update(searchQuery, newValue);
            }
            
            System.out.println("UpdateStatus Complete");
        } catch (Exception e) {
            System.out.println("UpdateStatus Fail");
        }
    }
}
