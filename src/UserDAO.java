
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
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
public class UserDAO {
    public static MongoClientURI uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
    public static MongoClient client = new MongoClient(uri);
    public static DB db = client.getDB(uri.getDatabase());
    public static DBCollection Collection;
    User user = new User();
    
    public boolean checkUserLoginByUsernameAndPassword(String username, String password, String UserType){
        Collection = db.getCollection(UserType);
        BasicDBObject documents = new BasicDBObject();
        documents.put("username", username);
        documents.put("password", password);
        int find = Collection.find(documents).count();
        
        if (find == 0) {
            return false;
        } else {
            getUserDataByUsername(username);
            return true;
        }
    }
    
    public void getUserDataByUsername(String Username) {
        for( DBObject dock : Collection.find() ) {
            
            String username = (String) dock.get("username").toString();
            String password = (String) dock.get("password").toString();
            String email = (String) dock.get("email").toString();
            String Fname = (String) dock.get("Fname").toString();
            String Lname = (String) dock.get("Lname").toString();
            String gender = (String) dock.get("gender").toString();
            String dateOfBirth = (String) dock.get("dateOfBirth").toString();
            String status = (String) dock.get("status").toString();
            String nationality = (String) dock.get("nationality").toString();
            String religion = (String) dock.get("religion").toString();
            String race = (String) dock.get("race").toString();
            String address = (String) dock.get("address").toString();
            String province = (String) dock.get("province").toString();
            String zipcode = (String) dock.get("zipcode").toString();
            String tellnumber = (String) dock.get("tellnumber");
            String education = (String) dock.get("education").toString();
            String experience = (String) dock.get("experience").toString();
            String userType = (String) dock.get("userType").toString();
            
            if (Username.equals(username)) {
                User user = new User(username, email, Fname, Lname, gender, dateOfBirth, status, nationality,
                                        race, religion, address, province, zipcode, tellnumber, education, 
                                        experience, userType);
                break;
            }
        }
    }
    public boolean checkUserRegisterByUsername(String username){
        Collection = db.getCollection("User");
        BasicDBObject documents = new BasicDBObject();
        documents.put("username", username);
       
        int find = Collection.find(documents).count();
        
        if (find == 0) {
            return true;
        } else {
            return false;
        }
    }
}
