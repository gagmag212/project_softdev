/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class Job {
    String jobName;
    String jobType;
    String jobOwnerID;
    String jobOwnerName;
    String jobAmount;
    String jobSalary;
    String jobDetail;
    String employeeProperty;
    String jobAddress;
    String jobProvince;
    String jobWelfare;
    
    Job (String jobName, String jobType, String jobOwnerID, String jobOwnerName, String jobAmount, String jobSalary, 
                         String jobDetail, String employeeProperty, String jobAddress, String jobProvince, String jobWelfare) {
        this.jobName = jobName;
        this.jobType =  jobType;
        this.jobOwnerID = jobOwnerID;
        this.jobOwnerName = jobOwnerName;
        this.jobAmount = jobAmount;
        this.jobSalary = jobSalary;
        this.jobDetail = jobDetail;
        this.employeeProperty = employeeProperty;
        this.jobAddress = jobAddress;
        this.jobProvince = jobProvince;
        this.jobWelfare = jobWelfare;
    }
}
