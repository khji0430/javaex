package basic;

public class SumDemo {
  public static void main(String[] args) {
    // for 문
    // 1부터 10까지의 합을 구하라



    int sum = 0;

    for(int i = 1; i < 10; i++){
      sum += i;

      //sum = sum + i;     //반복되는 부분은 그래로 두고, 변하는 부분만 변수로 치환
    }

    System.out.println("1부터 10까지의 합은 : " + sum);

    sum = 0;    // sum에 데이터가 쌓이기 때문에 0으로 초기화 한다.

    for(int i = 10; i < 101; i++){
      sum += i;

      //sum = sum + i;     //반복되는 부분은 그래로 두고, 변하는 부분만 변수로 치환
    }

    System.out.println("10부터 100까지의 합은 : " + sum);



  }
}
