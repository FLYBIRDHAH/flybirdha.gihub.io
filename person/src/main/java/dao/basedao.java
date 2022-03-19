package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class basedao {
    private static QueryRunner queryRunner = new QueryRunner();
    public int update(Connection con, String sql,Object...args){
        try{
            return queryRunner.update(con,sql,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
        }
    public <T> T queryForOne(Connection con, Class<T> type, String sql, Object...args){
        try{
            return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
