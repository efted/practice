package com.ljj.weather.util;

import java.sql.*;
public class HiveUtils {
    //hive驱动名称
    private static String driver = "org.apache.hive.jdbc.HiveDriver";
    //hive数据库地址（最后那部分为你要连接的数据库的名字，默认为default数据库）
    private static String url = "jdbc:hive2://hadoop101:10000/mydb";
    //数据库用户名
    private static String user = "xja";
    //数据库密码
    private static String password = "";
    //数据库连接
    private static Connection conn;
    //执行SQL语句的对象
    private static PreparedStatement pstmt;
    //结果集对象
    private static ResultSet rs;
    //加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取连接的方法
    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    //查询数据库的方法
    public static ResultSet query(String sql, Object... obj) {
        conn = getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            for(int i = 0; i < obj.length; i++) {
                pstmt.setObject(i + 1, obj[i]);
            }
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
}
