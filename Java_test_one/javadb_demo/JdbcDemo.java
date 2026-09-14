package javadb_demo;
import java.sql.*;

public class JdbcDemo {
    public static void main(String args[]) {
        // 1. 定义数据库连接信息
        String url = "jdbc:mysql://localhost:3306/javastudy?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // 2. 加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. 连接数据库
            System.out.println("-----正在连接数据库-----");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("-----数据库连接成功!-----");

            // 4. 获取执行者
            stmt = conn.createStatement();

            // 5. 执行SQL
            // 向 student 表里插入一条数据
            System.out.println("-----执行插入操作-----");
            String insertSql = "INSERT INTO student (name, age) VALUES ('张三',22)";
            int insertRows = stmt.executeUpdate(insertSql); // executeUpdate() 用于增删改,返回受影响的行数
            System.out.println("插入操作成功, 受影响行数: " + insertRows);

            // 6. 查询数据
            System.out.println("-----执行查询操作-----");
            String querySql = "SELECT * FROM student";

            rs = stmt.executeQuery(querySql);

            // 遍历结果集, rs.next()
            while (rs.next()) {
                int id = rs.getInt("id"); // 获取 id 列的值
                String name = rs.getString("name"); // 获取 name 列的值
                int age = rs.getInt("age"); // 获取 age 列的值

                System.out.println("ID: " + id + ", 姓名: " + name + ", 年龄: " + age);
            }

        } catch (Exception e) {
            e.printStackTrace(); // 打印异常信息
        } finally {
            // 6. 释放资源 (后创建的先关闭，顺序：rs -> stmt -> conn, 必须放在 finally 里保证一定执行)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
