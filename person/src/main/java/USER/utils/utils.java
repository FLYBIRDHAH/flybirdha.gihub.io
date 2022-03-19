package USER.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class utils {
    private static DataSource dataSource;
    static {
        try{
            Properties props = new Properties();
            InputStream tree  = ClassLoader.getSystemClassLoader().getResourceAsStream("db-config.properties");
            props.load(tree);
            dataSource = DruidDataSourceFactory.createDataSource(props);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception{
        Connection con = dataSource.getConnection();
        return con;
    }
    public static void closeConnection (Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
