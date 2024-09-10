package project;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/cafe?serverTimezone=Asia/Seoul";
    java.sql.Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중 ...");
      conn = DriverManager.getConnection(url, "root", "0000");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류");
    }  catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
  }
}
