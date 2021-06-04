package com.poisedmanager;

public class Project{
   
   // Attributes
   int projectNum;
   String projectName;
   String buildType;
   String physicalAddress;
   String erfNumber;
   double totalFee;
   double amountPaid;
   String deadline;
   
   // Constructor
   public Project(int projectNum, String projectName, String buildType, 
           String physicalAddress, String erfNumber, double totalFee, 
           double amountPaid, String deadline){
       
       this.projectNum = projectNum;
       this.projectName = projectName;
       this.buildType = buildType;
       this.physicalAddress = physicalAddress;
       this.erfNumber = erfNumber;
       this.totalFee = totalFee;
       this.amountPaid = amountPaid;
       this.deadline = deadline;
   }
   
   // Display method
   public String viewProject(){
        String output = "";
        output = "Project Number     : " + projectNum;
        output += "\nProject Name       : " + projectName;
        output += "\nBuilding Type      : " + buildType;
	output += "\nPhysical Address   : " + physicalAddress;
	output += "\nERF Number         : " + erfNumber;
	output += "\nProject Fee Total  : R" + totalFee;
	output += "\nAmount Paid to Date: R" + amountPaid;
	output += "\nProject Deadline   : " + deadline;
			
	return output;
   }
   
}
