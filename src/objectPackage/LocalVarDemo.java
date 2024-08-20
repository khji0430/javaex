package objectPackage;

public class LocalVarDemo {
  public static void main(String[] args) {
    int a = 1;  //지역변수  main블럭 안에서는 다 사용 가능하다.
    System.out.println(a);

    for (int i = 0; i < 10; i++) { // i 지역변수  불럭에서만 사용 밖에서 사용 X
      int b = 10;
      System.out.print(i);
    }



  }
}
