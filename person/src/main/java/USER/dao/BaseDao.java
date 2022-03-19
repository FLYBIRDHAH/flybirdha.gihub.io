package USER.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class BaseDao {
    private  static QueryRunner queryRunner = new QueryRunner();
    public int update(Connection con , String sql, Object...args){
        try{
            return queryRunner.update(con,sql,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
