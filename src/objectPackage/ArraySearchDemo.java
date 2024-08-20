package objectPackage;

public class ArraySearchDemo {
  public static void main(String[] args) {

    int[] numbers = {77, 88, 66, 99, 11, 22, 33};  // 11을 찾아라
    int findNumber = 33;
    int findIndex = -1;

    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] == findNumber){
        findIndex = i;
        break;
      }
    }

    System.out.println(numbers.length + "개의 요소가 있음");
    if(findIndex < 0){
      System.out.println("찾지 못함");
    } else{
      System.out.println(findIndex + " 번째 요소를 찾음");
    }
  }
}
