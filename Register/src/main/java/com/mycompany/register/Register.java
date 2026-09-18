/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register;
import java.util.Scanner;
/**
 *
 * @author Student Mduduzi Mashia
 */
public class Register {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //variables that must be declared
    String Username; 
    String Password; 
    String firstName; 
    String lastName;
    String cellphone;
    
    //Details that must be entered by user
    System.out.print("Enter your firstname:");
   String firstname = input.nextLine();
   System.out.print("Enter your lastname:");
   String lastname = input.nextLine();
    System.out.print("Enter your Username:");
    Username = input.nextLine();
     System.out.print("Enter your password:");
   String password = input.nextLine();
   System.out.print("Enter your Cellphone <+27>:");
    cellphone = input.nextLine();
   
   
   
   
   
   //validation method
  Login login = new Login();
    //validation method is used     
   if (login.checkUserName(Username)){
       System.out.println("password successfully captured");
   }
   else {
     System.out.println("password is not correctly formatted,please ensure that the password contains at least 8 characters,a capital letter,a number and a special character.");  
   }
  if (login.checkCellPhoneNumber(cellphone)){
  System.out.println("cell phone number successfully added");
  }
  else {
   System.out.println ("cell phone number incorrectly formtted or does not contain international code.");
  }
  
 boolean isUsernameValid = login.checkUserName(Username); 

boolean isPasswordValid = login.checkPasswordComplexity(password); 

boolean isCellValid = login.checkCellPhoneNumber(cellphone); 

  

if (isUsernameValid && isPasswordValid && isCellValid) { 

    System.out.println("Registration Successfully"); 
     System.out.println("");
     System.out.println("__Login__");
     System.out.println("Enter Username");
     System.out.print("Enter password: ");
} else { 

    System.out.println("Registration Unsuccessfull");
}
    }
}   
    

 
 
 
 
 
 
 
 
 
 
  
  
  
  
  
  

  
    

