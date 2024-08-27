package advancedjava;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c1 = new Cup<>();
    c1.setBeverage(new Beer());
    Beer beer = c1.getBeverage();
   // System.out.println(beer.name);

    Cup<Boricha> c2;

  }
}

class Cup<T extends Beverage> {   // 상속 받은 것만 올 수 있다.
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }

}