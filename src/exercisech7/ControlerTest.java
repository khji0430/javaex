package exercisech7;

public class ControlerTest {
  public static void main(String[] args) {
    Controller[] c = {new TV(false), new Radio(true)};
    for (Controller controller : c) {
      controller.show();
    }
  }

}
