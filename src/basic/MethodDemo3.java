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


    // method의 이름은 minus, 매개변수는 2개이고 데이터타입은 int
    //  첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메소드를 만들
    // 메서드의 반환타입은 int
    // minus(2,3) 출력 ; minus(20,10)  minus(100,200)

    int a = 3, b = 2;  // 코드에 재사용성이 높아진다.
    System.out.println(add(a, b));
    System.out.println(minus(a, b));
    System.out.println(mul(a, b));
    System.out.println(div(a, b));

  }
    public static int add (int num1, int num2) {

        return num1 + num2;
      }

    public  static  int minus(int num1, int num2){

        return num1 - num2;
    }

    public  static  int mul(int num1, int num2){

      return num1 * num2;
    }

    public  static  int div(int num1, int num2){
      if(num2 == 0) return 0;
      return num1 / num2;
  }


}
