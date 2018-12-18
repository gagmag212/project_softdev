import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class JobListService {
    JobDAO jobDAO = new JobDAO();
    
    public ArrayList<Job> getJobByKeyword(String searchValue, String searchType) {
        
        ArrayList<Job> jobListArr = new ArrayList<>();
        jobListArr = jobDAO.getJobsByKeyword(searchValue, searchType);
        
        return jobListArr;
    }
}
