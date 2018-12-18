
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
public class ApplicantListService {
    ApplicantDAO applicantDAO = new ApplicantDAO();
    
    public ArrayList<Applicant> getApplicantListByJobName(String jobName) {
        ArrayList<Applicant> applicantArr = new ArrayList<>();
        applicantArr = applicantDAO.getApplicantByJobName(jobName);
        return applicantArr;
    }
}
