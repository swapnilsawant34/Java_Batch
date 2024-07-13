package com.oop_tasks;


public class Company {
    public static void main(String[] args) {
        Associate as = new Associate();
        
        
        as.setAssociateId(1111);  //set the id

        
        as.trackAssociateStatus(15);  //set no of days---> for to check first condition
        as.trackAssociateStatus(25);   //set no of days--> for to check Second condition
        as.trackAssociateStatus(47);     //set no of days--> for to check 3rd condition
        as.trackAssociateStatus(62);      //set no of days--> check last  condition
    }
}

class Associate {
    int associateId;
    String associateName;
    String workStatus;

    public Associate() {
    }

    public Associate(int associateId, String associateName, String workStatus) {
        this.associateId = associateId;
        this.associateName = associateName;
        this.workStatus = workStatus;
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    void trackAssociateStatus(int no_of_days) {
        if (no_of_days <= 20) {
            setWorkStatus("Core Skills");
            
            System.out.println(workStatus);
        } else if (no_of_days>20 && no_of_days<=40) {
            setWorkStatus("Advanced Modules");
            
            System.out.println(workStatus);
        } else if (no_of_days>40 && no_of_days<=60) {
            setWorkStatus("Project Phase");
            
            System.out.println(workStatus);
        }else {
            setWorkStatus("Deployed in project");
            
            System.out.println(workStatus);
        }
    }
}