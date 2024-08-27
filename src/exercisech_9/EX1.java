package exercisech_9;

public class EX1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.setBox(Integer.valueOf(100) + 100);  // valueOf는 타입 변환
    System.out.println(i.getBox());

    Box<String> s = new Box<>();
    s.setBox("만능이네!" + "!!");
    System.out.println(s.getBox());
  }
}

class Box<T>{
  private T box;

  public T getBox() {
    return box;
  }

  public void setBox(T box) {
    this.box = box;
  }
}