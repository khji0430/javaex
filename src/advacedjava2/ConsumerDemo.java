package advacedjava2;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> printX = System.out::println;
    // 매개변수 생략

    // 2. s -> System.out.println(s);

//  1.  new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        System.out.println(s);
//      }
//    };
    printX.accept("t");
//     수정 필요
//    ObjIntConsumer<String> printITimes = (s, x) ->
//    for (int i = 0; i < x; i++) {
//          System.out.println(s);
//        }
//        new ObjIntConsumer<String>() {
//      @Override
//      public void accept(String s, int value) {
//        for (int i = 0; i < value; i++) {
//          System.out.println(s);
//        }
//      }
//    };

//    printITimes.accept("Hello", 3);
    ObjIntConsumer<String> printITimes = (s, x) -> {
      for (int i = 0; i < x ; i++) {
        System.out.println(s);
      };
    };

//        new ObjIntConsumer<String>() {
//      @Override
//      public void accept(String s, int value) {
//        for (int i = 0; i < value ; i++) {
//          System.out.println(s);
//        }
//      }
//    };
    printITimes.accept("hello",3);
  }
}
