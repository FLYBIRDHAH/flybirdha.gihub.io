package USER.dao;

import USER.bean.user;
import utils.utils;

import java.sql.Connection;

public class UserDao extends BaseDao{
    public int addUser(user user){
        try{
            Connection con = utils.getConnection();
            String sql = "insert into users("+" username,"+"password) " +
                    "values(?,?)";
            return update(con,sql,user.getUsername(),user.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
