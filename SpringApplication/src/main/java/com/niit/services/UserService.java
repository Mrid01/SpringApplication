package com.niit.services;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

 

import com.niit.dao.UserDao;

import com.niit.models.User;

 

@Service

public class UserService {

 

private UserDao userDao;

 

public void setUserDao(UserDao userDao) {

                this.userDao = userDao;

}

@Transactional

public void addUser(User u)

{

                userDao.addUser(u);

}

@Transactional

public void deleteUser(String email)

{

                userDao.removeUser(email);

}

@Transactional

public void updateUser(User u)

{

                userDao.updateUser(u);             

}

@Transactional

public List<User> getAllUsers()

{

                return userDao.getAllUsers();

}

@Transactional

public User getUser(String email)

{

                return userDao.getUser(email);

}

}