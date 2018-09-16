package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {

    private final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String URL= "jdbc:sqlserver://localhost:1435;databaseName=test";
    private final String USERNAME = "sa";
    private final String PWD = "sql2016";

    private Connection connection;
    private PreparedStatement ps;
    protected ResultSet rs;
    
    public List convertList(ResultSet rs) {
		List list = new ArrayList();
		try {
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			while (rs.next()) {
				Map rowData = new HashMap();
				for (int i = 1; i <= columnCount; i++) {
					rowData.put(md.getColumnName(i), rs.getObject(i));
				}
				list.add(rowData);
			}	
		}catch (SQLException e) {
			System.out.println("结果集转换失败！");
		}
		return list;
	}
    
    public void getConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                    URL, USERNAME,PWD);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("成功连接数据库！");
    }

    public void closeAll(){
        try {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("成功断开连接！");
    }

    /**
     * 查询
     */
    public void executeQuery(String sql , Object... params){
        try {
            ps = connection.prepareStatement(sql);
            if(params!= null){
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i+1, params[i]);
                }
            }

            rs = ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 增、删、改
     */
    public int executeUpdate(String sql , Object... params){
        int result = -1;
        try {
            ps = connection.prepareStatement(sql);
            if(params!= null){
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i+1, params[i]);
                }
            }

            result= ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

}