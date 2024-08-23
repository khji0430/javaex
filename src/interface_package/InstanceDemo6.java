package interface_package;

public class InstanceDemo6 {
  public static void main(String[] args) {
    Movable m = new Vehicle();  //업캐스팅
    Vehicle v = new Car();      //업캐스팅
    Movable c = new Car();

    m.move(3);
    c.move(2);
    c.move(1);

    Car car1 = (Car) c;  // 다운캐스팅 자식한데만 있는 것이라 부모는 보이지 않아서 사용한다.
    Car car2 = (Car) v;

    car1.show();

  }
}
