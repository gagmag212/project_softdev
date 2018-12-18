import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class ApplicantDAO {
    public static MongoClientURI uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
    public static MongoClient client = new MongoClient(uri);
    public static DB db = client.getDB(uri.getDatabase());
    public static DBCollection Collection = db.getCollection("Applicant");
    
    public ArrayList<Applicant> getApplicantByJobName(String jobName) {
        ArrayList<Applicant> ApplicantArr = new ArrayList<>();
        
        for( DBObject dock : Collection.find() ) {
            String JobName = (String) dock.get("jobName").toString();
            String name = (String) dock.get("name").toString();
            String email = (String) dock.get("email").toString();
            String gender = (String) dock.get("gender").toString();
            String dateOfBirth = (String) dock.get("dateOfBirth").toString();
            String status = (String) dock.get("status").toString();
            String nationality = (String) dock.get("nationality").toString();
            String race = (String) dock.get("race").toString();
            String religion = (String) dock.get("religion").toString();
            String address = (String) dock.get("address").toString();
            String province = (String) dock.get("province").toString();
            String zipcode = (String) dock.get("zipcode").toString();
            String education = (String) dock.get("education").toString();
            String experience = (String) dock.get("experience").toString();
            
            if (JobName.equals(jobName)) {
                Applicant applicant = new Applicant(JobName, name, email, gender, dateOfBirth, status, nationality, 
                                                    race, religion, address, province, zipcode, education, experience);
                ApplicantArr.add(applicant);
            }
        } 
        return ApplicantArr;
    }
    
    public boolean checkApplicantByKeyword(String name, String jobName) {
        BasicDBObject keyWord = new BasicDBObject();
        keyWord.put("name", name);
        keyWord.put("jobName", jobName);
        
        int find = Collection.find(keyWord).count();
        
        if (find == 0) {
            return true; 
        } else {
            return false;
        }
    }
}
