
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class CompanyDAO {
    public static MongoClientURI uri = new MongoClientURI("mongodb://tang:tang1234@ds147233.mlab.com:47233/project");
    public static MongoClient client = new MongoClient(uri);
    public static DB db = client.getDB(uri.getDatabase());
    public static DBCollection Collection;
    Company company = new Company();
    
    public boolean checkCompanyLoginByUsernameAndPassword(String username, String password, String UserType){
        Collection = db.getCollection(UserType);
        BasicDBObject documents = new BasicDBObject();
        documents.put("username", username);
        documents.put("password", password);
        int find = Collection.find(documents).count();
        
        if (find == 0) {
            return false;
        } else {
            getCompanyDataByUsername(username);
            return true;
        }
    }
    
    public void getCompanyDataByUsername(String Username) {
        for( DBObject dock : Collection.find() ) {
            
            String username = (String) dock.get("username").toString();
            String password = (String) dock.get("password").toString();
            String email = (String) dock.get("email").toString();
            String tellnumber = (String) dock.get("tellnumber").toString();
            String businessType = (String) dock.get("businessType").toString();
            String contactName = (String) dock.get("contactName").toString();
            String companyName = (String) dock.get("companyName").toString();
            String companyDetail = (String) dock.get("companyDetail").toString();
            String address = (String) dock.get("address").toString();
            String province = (String) dock.get("province").toString();
            String zipcode = (String) dock.get("zipcode").toString();
            String userType = (String) dock.get("userType").toString();
            
            if (Username.equals(username)) {
                Company company = new Company(username, email, tellnumber, businessType, contactName, companyName, 
                                              companyDetail, address, province, zipcode, userType);
                break;
            }
        }
    }
     public boolean checkCompanyRegisterByUsername(String username){
        Collection = db.getCollection("Company");
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
