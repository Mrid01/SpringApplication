package com.niit.dao;

import java.util.List;

 

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

 

import com.niit.models.User;

 

 

@Repository

public class UserDaoImpl implements UserDao {

@SuppressWarnings("unused")

private SessionFactory sessionFactory;

               

                public void setSessionFactory(SessionFactory sf){

                                this.sessionFactory = sf;

                }

                //@Override

                public User getUser(String email) {

                                Session session = this.sessionFactory.getCurrentSession();

                                User user = session.load(User.class,email);

                                return user ;

                }

 

                //@Override

                public void updateUser(User u) {

                                Session session = this.sessionFactory.getCurrentSession();

                                session.update(u);

                               

                }

 

                //@Override

                public List<User> getAllUsers() {

                                Session session = this.sessionFactory.getCurrentSession();

                                List<User> list = session.createQuery("from User").list();

                                return list;

                }

 

               // @Override

                public void removeUser(String email) {

                                Session session = this.sessionFactory.getCurrentSession();

                                User user = session.load(User.class,email);

                                if(user!=null)

                                {

                                                session.delete(user);

                                }

                }

               // @Override

                public void addUser(User u) {

                                Session session = this.sessionFactory.getCurrentSession();

                                session.save(u);

                               

                               

                               

                }

 

               

 

}