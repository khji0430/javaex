package basic;

public class MethodDemo2 {
  public static void main(String[] args) {

    oddOrEven(2);
    oddOrEven(5);
    oddOrEven(10);

//    int num = 2;
//    String result = "";

//    if(num % 2 == 0){
//      result = "짝수";
//    }else {
//      result = "홀수";
//    }
//    result = (num % 2 == 0) ? "짝수" : "홀수" ;
//    System.out.printf("%d 은 %s 입니다. \n", num, result);
//
//
//    num = 5;
//    result = "";
//
//
//    result = (num % 2 == 0) ? "짝수" : "홀수" ;
//    System.out.printf("%d 은 %s 입니다.\n", num, result);
//
//
//
//    num = 10;
//    result = "";
//
//
//    result = (num % 2 == 0) ? "짝수" : "홀수" ;
//    System.out.printf("%d 은 %s 입니다.", num, result);

  }

  /**
   * 메소드 연습 문제
   *
   *
   * @param num
   */

    public static void oddOrEven(int num){

      String result = "";
      result = (num % 2 == 0) ? "짝수" : "홀수" ;
      System.out.printf("%d 은 %s 입니다.\n", num, result);
    }


  }

