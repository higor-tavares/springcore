package com.higortavares.springcore.utils;

public class PatternFactory {

  private static final PatternUtil patternUtil = new PatternUtil();

  public static PatternUtil getInstance(){
    return patternUtil;
  }
}
