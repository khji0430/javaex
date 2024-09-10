package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CafeDB {
  public static void main(String[] args) throws SQLException {
    Connection conn = null;
    try {
      conn = makeConnection();
      createNewOrder(conn);
    } catch (SQLException e) {
      System.out.println("SQL 오류: " + e.getMessage());
    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
          System.out.println("데이터베이스 연결 종료 오류: " + e.getMessage());
        }
      }
    }
  }

  private static void createNewOrder(Connection conn) throws SQLException {
    String sql = "INSERT INTO orders (coffee_name, price) VALUES (?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, "Latte"); // 커피명
      ps.setBigDecimal(2, new java.math.BigDecimal("50000")); // 가격

      int res = ps.executeUpdate();
      if (res == 0) {
        System.out.println("데이터 추가가 정상적으로 진행되지 않았습니다.");
      } else {
        System.out.println(res + "개의 데이터가 추가되었습니다.");
      }
    }
  }

  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/cafe?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중 ...");
      conn = DriverManager.getConnection(url, "root", "0000");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류: " + e.getMessage());
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패: " + e.getMessage());
    }
    return conn;
  }
}
