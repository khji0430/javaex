package basic;

public class MethodDemo {
  public static void main(String[] args) {

    System.out.println(sum(1, 10));   //  55
    System.out.println(sum(10, 100));  // 5005
    System.out.println(sum(100, 1000)); // 49555
  }

  /**
   *  두개의 숫자를 입력받아서 start 로부터 end까지의 합을 구하는 method
   * @param start
   * @param end
   * @return
   * 재사용성과 반복을 줄이기 위해 사용한다.
   */




  public static int sum(int start, int end) {     //start에서 end값에 합을 구하라

    int sum = 0;

    for (int i = start; i < end; i++) {
      sum += i;
    }
    return sum;


  }
}
