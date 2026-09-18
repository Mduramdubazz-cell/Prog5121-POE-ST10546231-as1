/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register;

/**
 *
 * @author Student Mduduzi Mashia
 * 
 * 
 */
public class Login {
    
    //checks the username if is 5 or less characters
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    //checks if password has all the required infomation
  public boolean checkPasswordComplexity(String password){  
    String Capital = ".* [A-Z].*";
    String small = ".* [a-z].*";
    String Special = ".* [!@#$%^&*(),.?\":{}|<>].*";
    String digit = ".* \\d.*";
    
    return password.length()>=8
     && password.matches(Capital)
     && password.matches(small)
     && password.matches(Special)
     && password.matches(digit);
    
}

//checks if phone validation is correct

public boolean checkCellPhoneNumber (String phone) {

if (phone. length () == 12 && phone.startsWith ("+27")) { 

int fourthDigit= Character. getNumericValue (phone.charAt (3)) ; 

return fourthDigit >=6 && fourthDigit <= 8; 
}

  return false;
  
}
  


 public String  returnLoginstatus (boolean LoginStatus, String firstname, String lastName ){
  if (LoginStatus) {
   return "welcome" + firstname + "" + "it is great to see you again";
  } 
  else {
      return "Username or password failed";
  }
 }
}
 

  

 

