package basic;

public class WhileDemo {
  public static void main(String[] args) {
//    int count = 0;
//    while(count < 3){   //무한 루프
//      count++;
//      System.out.println(count);
//    }
//
//    //
//    for (int i = 0; i < 3; i++) {
//      System.out.println(i+1);
//    }

    int count = 0;
    while(true){
      count++;
      System.out.println(count);
      if(count >=3){
        break;
      }
   }



  }
}
