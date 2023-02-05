package com.higortavares.springcore.utils;

import java.sql.SQLOutput;

public class PatternUtil {

  private static final String PHONE_REGEX = "\\(?(\\d){2}?\\)?\\s?(\\d){4,5}\\s?\\-?(\\d){4}";

  public boolean isValidPhoneNumber(String number){
    if(number.isEmpty()){
      return false;
    }
    boolean isValid = number.matches(PHONE_REGEX);
    System.out.println(String.format("The phone number %s is %s", number, isValid ? "valid" : "invalid"));
    return isValid;
  }

}
