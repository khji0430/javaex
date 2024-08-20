package objectPackage;

import java.util.Arrays;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};
    System.out.println(num);
    System.out.println(Arrays.toString(num));


    for (int i = 0; i < num.length; i++) {
      if (i != num.length - 1) {
        System.out.print(num[i] + ",");
      } else {
        System.out.println(num[i]);
      }

      // num 배열의 크기를 5로 변경해달라는 요청

      int[] newNum = new int[5];
      System.out.println(newNum);
      System.out.println(Arrays.toString(newNum));


    }
  }
}
