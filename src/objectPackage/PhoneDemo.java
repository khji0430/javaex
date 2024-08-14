package objectPackage;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone();  //인스턴스 생성
    p1.setModel("Galaxy Z 폴드6");
    p1.setPrice(2_586_000);
    p1.print();

    Phone p2 = new Phone();
    p2.setModel("Iphone15");
    p2.setPrice(2_320_000);
    p2.print();

  }
}
