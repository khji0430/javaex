package basic;

public class OverLoadDemo {
    public static void main(String[] args) {

      // method의 이름은 minus, 매개변수는 2개이고 데이터타입은 int
      // 첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메소드를 만들어라
      // 메서드의 반환타입은 int
      // minus(2,3) 출력 ; minus(20,10)  minus(100,200)

      // method의 이름은 doubleDivide, 매개변수는 2개이고 데이터타입은 int
      // 첫번째 매개변수에서 두번째 매개변수를 나눈 몫을 구해서 그 결과를 반환하는 메소드를 만들어라
      // 메서드의 반환타입은 double (출력시에 소수점 4째자리까지 해달라)
      // divide(2,3) 출력 ; ==. 0.6666
      // 단, 주의사항 !!!!!, 0 으로 나누어지지 않도록 주의
      //-------------------------------------------------------------------------------
      // method의 이름은 minus, 매개변수는 2개이고 데이터타입은 int
      // 첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 메소드를 만들어라
      // 메서드의 반환타입은 int
      // minus(2,3) 출력 ; minus(20,10)  minus(100,200)

      int a = 1, b = 2;  // 코드에 재사용성이 높아진다.
      long long1 = 1L, long2 = 2L;
      double da = 1.0, db = 2.0;

      System.out.println(add(long1, long2));
      System.out.println(minus(long1, long2));

      System.out.println(add(a, b));
      System.out.println(minus(a, b));
      System.out.println(mul(a, b));
      System.out.println(mul(a,b));
      System.out.println(div(a, b));
      System.out.printf("%.4f \n", div(da,db));

    }

  public static int add (int num1, int num2) {return num1 + num2;}
  public static long add (long num1, long num2) {return num1 + num2;}

  public  static  int minus(int num1, int num2){return num1 - num2;}
  public  static  long minus(long num1, long num2){return num1 - num2;}

  public  static  int mul(int num1, int num2){return num1 * num2;}
  public  static  long mul(long num1, long num2){return num1 * num2;}

  public  static  int div(int num1, int num2){
    if(num2 == 0) return 0;
    return num1 / num2;
  }
  public  static  double div(double num1, double num2){
    if(num2 == 0) return 0;
    return (double)num1 / num2;
     }

  }

