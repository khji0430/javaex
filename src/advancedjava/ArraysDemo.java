package advancedjava;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    Integer[] intArray = {2,4,6,8,10};
    String[] strArray = {"사과", "도넛", "바나나"};
    int[] iArray = new int[5];


    System.out.println(intArray);
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.binarySearch(intArray,10)); // 10번째 값이 몇번째 인지 확인
    System.out.println(strArray);
    System.out.println(Arrays.toString(strArray));
    System.out.println(iArray);
    System.out.println(Arrays.toString(iArray));
  }
}
