package com.higortavares.springcore.services;

import com.higortavares.springcore.dao.UserDao;
import java.util.List;

public class UserService {

  private UserDao userDao;

  public UserService(){}
  public UserService(UserDao userDao){
    this.userDao = userDao;
  }

  public void saveUser(){
    this.userDao.saveUser();
  }
  public boolean deleteUser(){
    return this.userDao.deleteUser();
  }
  public List<String> getAll(){
    return this.userDao.getAll();
  }

  public UserDao getUserDao(){
    return this.userDao;
  }
  public void setUserDao(UserDao userDao){
    this.userDao = userDao;
  }
}
