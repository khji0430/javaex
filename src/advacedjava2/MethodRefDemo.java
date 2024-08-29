package advacedjava2;

public class MethodRefDemo {
  public static void main(String[] args) {
   Mathmatical m;
    int abs = Math.abs(-10);
//    m = new Mathmatical() {
//      @Override
//      public double calculate(double d) {
//        return 0;
//      }
//    };

    //m = (d) -> Math.abs(d);
  m = Math::abs;
    System.out.println(m.calculate(-3.2));
  }
}

interface Mathmatical {
  double calculate(double d);
}
