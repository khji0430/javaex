package objectPackage;

import java.util.Arrays;

// 가변 개수 인자
public class VarArgsDemo {
  public static void main(String[] args) {

    printSum(1);
    printSum(1, 10);
    printSum(1, 10, 20);

  }

  private static void printSum(int n, int... numbers) { //
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println(Arrays.toString(numbers));
    System.out.printf("%d\n", sum);
  }

//  private static void printSum(int i, int j) {
//
//  }
//  private static void printSum(int i, int j, int k) {
//
//  }


}
