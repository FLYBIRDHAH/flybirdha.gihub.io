package org.example;

import USER.bean.user;
import USER.dao.UserDao;
import bean.person;
import dao.persondao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        person person = new person();
//        persondao persondao = new persondao();
//        person.setUsername("test");
//        persondao.addperson(person);

//        user user = new user();
//        UserDao userDao = new UserDao();
//        user.setUsername("ly");
//        user.setPassword("123456");
//        userDao.addUser(user);
        person person = new person();
        persondao persondao = new persondao();
        person.setName("zzh");
        person.setUsername("zzh");
        person.setAge(22);
        person.setTeleno("18756512375");
        persondao.queryUsername("zzh",person);
    }

    }

