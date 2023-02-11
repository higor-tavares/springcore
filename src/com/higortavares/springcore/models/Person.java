package com.higortavares.springcore.models;

public class Person {

  private String name;
  private Person marriedWith;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person getMarriedWith() {
    return marriedWith;
  }

  public void setMarriedWith(Person marriedWith) {
    this.marriedWith = marriedWith;
  }
}
