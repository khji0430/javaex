package objectPackage;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if(args.length == 1) {
      System.out.println("메인 메소드로 전달된 인자는 " + args[0] + "입니다.");
      return;
    }



    int [] x = {0};
    System.out.println("호출 전 ==> " + x[0]);  // 0
    increment(x);
    System.out.println("호출 후 ==> " + x[0]);  // 1
  }


  public static  void increment(int[] n){
    System.out.println("메소드 안에서 증가하기 전 ==> " + n[0]);  // 0
    n[0]++;
    System.out.println("메소드 안에서 증가시킨 후 ==> " + n[0]);
  }
}
