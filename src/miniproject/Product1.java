package miniproject;

import java.math.BigDecimal;

public class Product1{
  private int id;
  private String name;
  private BigDecimal price;
  private String info;
  private int serving;
  private String allergy;

  // Constructor
  public Product1(int id, String name, double price, String info, int serving, String allergy) {
    this.id = id;
    this.name = name;
    this.price = BigDecimal.valueOf(price);
    this.info = info;
    this.serving = serving;
    this.allergy = allergy;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getInfo() {
    return info;
  }

  public int getServing() {
    return serving;
  }

  public String getAllergy() {
    return allergy;
  }
}

