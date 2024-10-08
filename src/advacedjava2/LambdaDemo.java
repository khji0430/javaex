package advacedjava2;

public class LambdaDemo {
  public static void main(String[] args) {

    Object obj = new Object() {
      int max(int a, int b){
        return a > b ? a: b ;
      }
    };
   // int max = obj.max(3,5);
  MyFunction f = new MyFunction() {
    @Override
    public int max(int a, int b) {
      return a > b ? a: b ;
    }
  };

    int max = f.max(3,5);
    System.out.println(max);
  }
}
//함수형 인터페이스 필요한 이유
// 주석 처리된 max 오류

@FunctionalInterface
interface MyFunction{
  public abstract int max(int a, int b);
}
@FunctionalInterface
interface NewFunction{
  int min(int a, int b);
}