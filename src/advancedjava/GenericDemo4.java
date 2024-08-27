package advancedjava;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
  public static void main(String[] args) {
    List<Beverage> list = new ArrayList<>();
    ArrayList<Beverage> b = new ArrayList<>();
    b.add(new Beer());
    b.add(new Boricha());
    bevTest(b);
    listTest(b);


    Beverage beverage = new Beverage();
    Beer beer = new Beer();
    beverage = beer;


    ArrayList<Beer> b1 = new ArrayList<>();
    b1.add(new Beer());
    //b1.add(new Boricha());
    //b = b1;
    //bevTest(b1);
    //listTest(b1);
    // b = b1; b1에 b를 넣을 수 없다.
    // bevTest(b1);

  }
  public static void bevTest(ArrayList<Beverage> b1) {

  }

  public static void listTest(List<Beverage> l1) {

  }


}
