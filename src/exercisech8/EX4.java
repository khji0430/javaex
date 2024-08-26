package exercisech8;

import java.util.Random;

public class EX4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(new Dice().roll());
    }
  System.out.println(new Dice().roll());
  }
}

class Dice{
//  Random random = new Random();

  int roll(){
     return  ((int) (Math.random() * 6) + 1);
//      return random.nextInt(1, 7);
  }

}
