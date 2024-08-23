package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    Tv tv = new Tv();
    tv.turnOn();
    tv.turnOff();
    Controllable.reset();
  }
}
