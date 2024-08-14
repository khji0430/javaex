package basic;

public class MethodDemo3 {
  public static void main(String[] args) {

//    int result = 2 + 3;
//    System.out.println(result);
//
//    result = 10 + 20;
//    System.out.println(result);
//
//    result = 100 + 200;
//    System.out.println(result);

    System.out.println(add(2, 3));
    System.out.println(add(10, 20));
    System.out.println(add(100, 200));

    System.out.println(minus(2, 3));
    System.out.println(minus(10, 20));
    System.out.println(minus(100, 200));

    System.out.println(mul(2, 3));
    System.out.println(mul(10, 20));
    System.out.println(mul(100, 200));

    System.out.println(div(2, 3));
    System.out.println(div(10, 20));
    System.out.println(div(100, 200));
  }
    public static int add (int num1, int num2) {

        return num1 + num2;
      }

  // method의 이름은 minus, 매개변수는 2개이고 데이터타입은 int
  //  첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메소드를 만들
  // 메서드의 반환타입은 int
  // minus(2,3) 출력 ; minus(20,10)  minus(100,200)

    public  static  int minus(int num1, int num2){

        return num1 - num2;
    }

    public  static  int mul(int num1, int num2){

      return num1 * num2;
    }

    public  static  int div(int num1, int num2){

      return num1 / num2;
  }


}
