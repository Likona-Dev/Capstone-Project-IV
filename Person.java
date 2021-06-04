package com.poisedmanager;

public class Person{

    // Attributes
    String personRole;
    String name;
    String telNumber;
    String email;
    String address;
    
    // Constructor
    public Person(String personRole, String name, String telNumber, String email, 
            String address){
        this.personRole = personRole;
        this.name = name;
        this.telNumber = telNumber;
        this.email = email;
        this.address = address;
    }
    
    // Display method
    public String viewPerson(){
        String output = "";
       output +="\nRole in project: " + personRole;
       output += "\nName            : " + name;
       output += "\nTelephone Number: " + telNumber;
       output += "\nEmail Address   : " + email;
       output += "\nPhysical Address: " + address;
       
       return output;
    }
    
}