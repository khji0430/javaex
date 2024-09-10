package miniproject;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

class Product{
    private int id;
    private String name;
    private double price;
    private String info;
    private int serving;
    private String allergy;


    public Product(int id, String name, double price, String info, int serving, String allergy) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.info = info;
      this.serving = serving;
      this.allergy = allergy;
    }

    public int getServing() {return serving;}

    public void setServing(int serving) {this.serving = serving;}

    public String getAllergy() {return allergy;}

    public void setAllergy(String allergy) {this.allergy = allergy;}

    public String getInfo() {return info;}

    public void setInfo(String info) {this.info = info;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}
  }



public class DBCafe {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/cafe?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중 ...");
      conn = DriverManager.getConnection(url, "root", "0000");
      System.out.println("데이터베이스 연결 성공");

      // 데이터를 조회하는 메서드를 호출합니다.
      fetchProducts(conn);

    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류: " + e.getMessage());
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패: " + e.getMessage());
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

  // Product 테이블의 데이터를 조회하는 메서드
  private static void fetchProducts(Connection conn) throws SQLException {


    String sql = "SELECT product_Id, product_Name, product_Price, product_Info, product_Serving, product_Allergy FROM Product"; // 컬럼 이름에 맞게 수정
    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

      // 결과를 처리합니다.
      while (rs.next()) {
        int id = rs.getInt("product_Id");
        String name = rs.getString("product_Name"); // 컬럼 이름 수정
        BigDecimal price = rs.getBigDecimal("product_Price"); // 컬럼 이름 수정
        String info = rs.getString("product_Info");
        int serving = rs.getInt("product_Serving");
        String allergy = rs.getString("product_Allergy");
        System.out.printf("ID: %d, 제품명: %s, 가격: %s, 정보: %s, 서빙: %s, 알레르기: %s%n", id, name, price, info, serving, allergy);

      }
    }
  }
}