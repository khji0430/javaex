package interface_package;

public interface Animal {
  void sound();
}

class Dog implements Animal{
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}

class Cuckoo implements Animal{
  @Override
  public void sound() {
    System.out.println("뻐꾹");
  }
}
