package com.poisedmanager;

import java.util.Scanner;

public class PoisedManager{
      
    public static void main(String[] args){
        
        // Declare variables
        int projectNum;
        String projectName;
        String buildType;
        String physicalAddress;
        String erfNumber;
        double totalFee;
        double amountPaid;
        String deadline;
        
        // Welcome message to user
        System.out.println("++Welcome to the Poised Project Manager++"); 
        
        System.out.println("\nEnter project details below:");
        
        // Create scanner for each data type
        Scanner input = new Scanner(System.in);  // String
        Scanner input2 = new Scanner(System.in); // int
        Scanner input3 = new Scanner(System.in); // double
        
        // Project number
        System.out.println("Enter project number: ");
        projectNum = input2.nextInt();
        
        // Project name
        System.out.println("\nEnter project name: ");
        projectName = input.nextLine();
        
        // Building type
        System.out.println("\nEnter building type: ");
        buildType = input.nextLine();
        
        // Project Location
        System.out.println("\nEnter the physical address for the project: ");
        physicalAddress = input.nextLine();
        
        // ERF number
        System.out.println("\nEnter the ERF number: ");
        erfNumber = input.nextLine();
        
        // Total fee for the project
        System.out.println("\nEnter the total fee for the project: ");
        totalFee = input3.nextDouble();
        
        // Current amount paid by customer
        System.out.println("\nEnter the amount paid by the customer: ");
        amountPaid = input3.nextDouble();
        
        // Project deadline
        System.out.println("\nEnter the project deadline: ");
        deadline = input.nextLine();
        
        // Add contractor details
        String personRole = "Contractor";
        System.out.println("\nEnter the name of the contractor: ");
        String name = input.nextLine(); //name
        
        System.out.println("\nEnter contractor's telephone number: ");
        String telNumber = input.nextLine(); //number
        
        System.out.println("\nEnter contractor's email address: ");
        String email = input.nextLine(); //email
        
        System.out.println("\nEnter contractor's physical adress: ");
        String address = input.nextLine(); //address
        
        Person contractor = new Person(personRole, name, telNumber, email,
                address);
        
        // Add architect details
        personRole = "Architect";
        System.out.println("\nEnter the name of the architect: ");
        name = input.nextLine(); //name
        
        System.out.println("\nEnter architect's telephone number: ");
        telNumber = input.nextLine(); //number
        
        System.out.println("\nEnter architect's email address: ");
        email = input.nextLine(); //email
        
        System.out.println("\nEnter architect's physical adress: ");
        address = input.nextLine(); //address
        
        Person architect = new Person(personRole, name, telNumber, email,
                address);
        
        // Add customer details
        personRole = "Customer";
        System.out.println("\nEnter the name of the customer: ");
        name = input.nextLine(); //name
        
        System.out.println("\nEnter customer's telephone number: ");
        telNumber = input.nextLine(); //number
        
        System.out.println("\nEnter customer's email address: ");
        email = input.nextLine(); //email
        
        System.out.println("\nEnter customer's physical adress: ");
        address = input.nextLine(); //address
        
        Person customer = new Person(personRole, name, telNumber, email,
                address);
        
        // Create project object using project deatails entered above
        Project projectObj = new Project(projectNum, projectName, buildType,
                physicalAddress, erfNumber, totalFee, amountPaid, deadline);
        
        // Confirm to user, that the project has been successfully created
        System.out.println("\nProject created!");
        
        /* Display newly created project using the display method(viewProject)
        from the project class*/
        System.out.println(projectObj.viewProject());
        
        // Menu
	System.out.println("\nPlease make a selection from the menu: " + 
                "\n1. Change the due date for the project" +
                "\n2. Change the total amount of the fee paid to date"
                + "\n3. Update contractors contact details" +
                "\n4. Fialize Project");
        
        // Getting user choice/selection from menu
        Scanner scan = new Scanner(System.in);
        int userSel = scan.nextInt();
        
        // Change due date
        if (userSel == 1){
            System.out.println("\nEnter the new due date for the project: ");
            Scanner date = new Scanner(System.in);
            deadline = date.nextLine();
            
            // Update project object by adding the new deadline
            Project editProject = new Project(projectNum, projectName, 
                    buildType, physicalAddress, erfNumber, totalFee, amountPaid, 
                    deadline);
            
            // Display project with changes
            System.out.println(editProject.viewProject());
        }
        // Change the total amount of the fee paid to date
        else if(userSel == 2){
            System.out.println("\nEnter the new total amount of the fee paid to date");
            Scanner amount = new Scanner(System.in);
            amountPaid = amount.nextDouble();
            
            // Update project object by adding the new amount paid
            Project editProject2 = new Project(projectNum, projectName, 
                    buildType, physicalAddress, erfNumber, totalFee, amountPaid, 
                    deadline);
            
            // Display project with changes
            System.out.println(editProject2.viewProject());
        }
        // Update contractor’s contact details
        else if (userSel ==3){
            System.out.println("\nEdit contractor's telephone number: ");
            Scanner number = new Scanner(System.in);
            telNumber = number.nextLine();
            
            System.out.println("\nEdit contractor's email address: ");
            Scanner emailAddress = new Scanner(System.in);
            email = emailAddress.nextLine();
            
            Person editContractor = new Person(personRole, name, telNumber, 
                    email, address);
            
            System.out.println(editContractor.viewPerson());
        }
        // Finalise the project
        else if (userSel == 4){
           if (totalFee == amountPaid){
               System.out.println("\nProject fee has been been paid in full.");
               System.out.println("\nEnter the project completion date: ");
               
               Scanner compDate = new Scanner(System.in);
               String complete = compDate.nextLine();
               String finalise = "Project finalised";
               
               // Display project with it's new status included
               System.out.println(projectObj.viewProject() + "\nDate completed: "
               + complete);
               System.out.println("\nProject status: " + finalise);
            }
            else if (totalFee != amountPaid){
               // Invoice
               System.out.println("\nEnter the project completion date: ");
               
               Scanner compDate = new Scanner(System.in);
               String complete = compDate.nextLine();
               String finalise = "Project finalised";
               
               System.out.println(customer.viewPerson());
               
               System.out.println("\nInvoice: ");
               System.out.println("Outstanding Balance: R" + 
                       (totalFee - amountPaid) + "\n");
               
               // Display project with it's new status included
               System.out.println(projectObj.viewProject() + "\nDate completed: "
               + complete);
               System.out.println("\nProject status: " + finalise);
            }
        }
    }
}

