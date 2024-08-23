package interface_package;

public class TakeableTest {
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }

  public static void speak(Takeable talkable){
    talkable.take();
  }
}
