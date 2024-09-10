package miniproject;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//class Product{
//  private int id;
//  private String name;
//  private double price;
//  private String info;
//  private int serving;
//  private String allergy;
//
//
//  public Product(int id, String name, double price, String info, int serving, String allergy) {
//    this.id = id;
//    this.name = name;
//    this.price = price;
//    this.info = info;
//    this.serving = serving;
//    this.allergy = allergy;
//  }
//
//  public int getServing() {return serving;}
//
//  public void setServing(int serving) {this.serving = serving;}
//
//  public String getAllergy() {return allergy;}
//
//  public void setAllergy(String allergy) {this.allergy = allergy;}
//
//  public String getInfo() {return info;}
//
//  public void setInfo(String info) {this.info = info;}
//
//  public int getId() {return id;}
//
//  public void setId(int id) {this.id = id;}
//
//  public String getName() {return name;}
//
//  public void setName(String name) {this.name = name;}
//
//  public double getPrice() {return price;}
//
//  public void setPrice(double price) {this.price = price;}
//}


public class DBDemo {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    //List<Product> products = createNewProduct(conn);

  }




  private static void createNewProduct(Connection conn) throws SQLException {
    Statement stmt = conn.createStatement();
    String sql = "select * from Product";

    // insert 시 executeUpdate(sql) 사용 지금은 select 사용
    ResultSet rs = stmt.executeQuery(sql);

    // 결과 출력
    System.out.println("-----------Product 테이블의 데이터-----------");
    List<Product1> productList = new ArrayList<>();

    while (rs.next()) {
      // 컬럼
      int id = rs.getInt("product_Id");
      String name = rs.getString("product_Name");
      double price = rs.getDouble("product_Price");
      String info = rs.getString("product_info");
      int serving = rs.getInt("product_Serving");
      String allergy = rs.getString("product_Allergy");

      Product1 product = new Product1(id, name, price, info, serving, allergy);
      productList.add(product);
      // 데이터 출력
      System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", info " + info);
    }
    System.out.println("------------------------------------------");
  }




  public static Connection makeConnection(){
    String url = "jdbc:mysql://localhost/cafe?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중 ...");
      conn = DriverManager.getConnection(url, "root", "1234");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류");
    }  catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;
  }
}
