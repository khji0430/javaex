package objectPackage;

public class Misson2 {
  public static void main(String[] args) {


    System.out.println(Sum(1, 2, 3, 4 ));
    int arr [] = {2,3};
    System.out.println(Sum(1, arr));
    System.out.println(Sum(1, 2, 3, 4, 5));
  }


  private static int Sum(int n, int... numbers){

    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;

  }





}
