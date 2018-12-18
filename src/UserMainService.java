/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class UserMainService {
    User user = new User();
    Database data = new Database();
    public String getUsername() {
        return user.username;
    }
    public void logout(){
        data.updateStatus(getUsername(), 0,"User");
    }
}
