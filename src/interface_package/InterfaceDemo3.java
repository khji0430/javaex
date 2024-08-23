package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    Tv tv = new Tv();
    tv.turnOn();
    tv.turnOff();
    Controllable.reset();
    tv.repair();
    System.out.println();

    Computer computer = new Computer();
    computer.turnOn();    // 컴퓨터를 켠다.
    computer.turnOff();   // 컴퓨터를 끈다.
    Controllable.reset(); // 장비를 공장초기화한다.
    computer.repair();    // 컴퓨터를 수리한다.
    System.out.println();

    Notebook notebook = new Notebook();
    notebook.turnOn();
    notebook.turnOff();
    notebook.repair();
    notebook.inMyBag();
  }
}
