package interface_package;

public interface Controllable {
  default void repair(){
    show("장비를 수리한다.");
  }
  static  void reset(){
    System.out.println("장비를 공장초기화 한다.");
  }
  private void show(String s){
    System.out.println(s);
  }
  void turnOn();  // abstract 생략되어 있음
  void turnOff();
}
