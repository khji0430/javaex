package interface_package;

public interface Takeable {
  void take();
}

class Korean implements Takeable{
  @Override
  public void take() {
    System.out.println("안녕하세요");
  }
}

class American implements Takeable{
  @Override
  public void take() {
    System.out.println("Hello");
  }
}



