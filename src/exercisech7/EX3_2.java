package exercisech7;

public class EX3_2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(5, 10);
    int result = t2.compareTo(t1);
    switch (result){
      case 0:
        System.out.println("동일하다.");
        break;
      case -1:
        System.out.println(t1);
        System.out.println("이 더 큽니다.");
        break;
      case 1:
        System.out.println(t2);
        System.out.println("이 더 큽니다.");
        break;
      default:
        
    }

  }
}


