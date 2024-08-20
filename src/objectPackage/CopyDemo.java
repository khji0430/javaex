package objectPackage;

public class CopyDemo {
  public static void main(String[] args) {
    int ten = 10;
    System.out.println(ten);
    copyByValue(ten);
    System.out.println(ten);


    Circle c1 = new Circle(1);  // 주소 0x100
    System.out.println(c1.getRadius());
    copyByReference(c1);
    System.out.println(c1.getRadius());
  }


  public static void copyByValue(int val) { // call by value : read-only
//    int copyTen = val;

//    System.out.println("ten값: " + val);
//    System.out.println("copyTen값: " + copyTen);

    val = 20;

    System.out.println("메소드 안에서 ten 변경: " + val);
//    System.out.println("copyTen값: " + copyTen);
  }

  public  static  void copyByReference(Circle c1){ //call reference : read-write
//    Circle c2 = new Circle(); // 주소 0x200
//
//    System.out.println("인스턴스 생성 후");
//    System.out.println(c1.getRadius());
//    System.out.println(c2.getRadius());
//
//    c2 = c1;
//    System.out.println("주소 복사 후");
//    System.out.println(c1.getRadius());
//    System.out.println(c2.getRadius());

    c1.setRadius(10);
    System.out.println("c1의 반지름을 메소드 안에서 변경 후");
    System.out.println(c1.getRadius());
//    System.out.println(c2.getRadius());
  }


}
