package dao;

import bean.person;
import utils.utils;

import java.sql.Connection;

public class persondao extends basedao {
    public int addperson(person person) {
        Connection con = null;
        try {
            con = utils.getConnection();
            String sql = "insert into person(" +
                    "username, " +
                    "name, " +
                    "age, " +
                    "teleno) " +
                    "values(?,?,?,?)";
            return update(con, sql, person.getUsername(), person.getName(),
                    person.getAge(), person.getTeleno());
//                String sql = "delete from person where name = ?";
//                    return update(con,sql,person.getName());
//                String sql = "update person set age = 100,teleno = 18756512375 where username = ?";
//                return  update(con,sql,person.getUsername());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public person queryByusername(String username) {
        try {
            Connection con = utils.getConnection();
            String sql = "select" + " username " + "from " + "person"+" where" +
                    " username = ?";
            return queryForOne(con, person.class, sql, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public int queryUsername1(person person){
        try {
            Connection con = utils.getConnection();
            String sql = "insert into person" +
                    "(username," +
                    "name," +
                    "age," +
                    "teleno)" +
                    "values(?,?,?,?)";
            return update(con, sql, person.getUsername(), person.getName(), person.getAge(), person.getTeleno());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public  void queryUsername(String name, person person) {
        if (queryByusername(name) == null) {
            try {
                Connection con = utils.getConnection();
                String sql = "insert into users" +
                        "(username)" +
                        "values(?)";
                 update(con, sql, name);
                queryUsername1(person);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                Connection con = utils.getConnection();
                String sql = " update person set " +
                        " name=?, " +
                        "age = ?, " +
                        " teleno = ? " +
                        " where "+" username = ?";
                 update(con, sql, person.getName(), person.getAge(),
                        person.getTeleno(), name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
