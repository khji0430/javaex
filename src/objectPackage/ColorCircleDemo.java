//package objectPackage;
//
//public class ColorCircleDemo {
//  public static void main(String[] args) {
//    ColoredCircle cc1 = new ColoredCircle();
//    System.out.printf("1번 원의반지름과 색은 %d. %s 입니다. \n", cc1.r, cc1.color);
//    System.out.println(cc1.numOfCircles);
//    ColoredCircle cc2 = new ColoredCircle("");
//    System.out.printf("2번 원의반지름과 색은 %d. %s 입니다. \n", cc2.r, cc2.color);
//    System.out.println(cc2.numOfCircles);
//    ColoredCircle cc3 = new ColoredCircle(-1);
//    System.out.printf("3번 원의반지름과 색은 %d. %s 입니다. \n", cc3.r, cc3.color);
//    System.out.println(cc3.numOfCircles);
//    ColoredCircle cc4 = new ColoredCircle(-10,"red");
//    System.out.printf("4번 원의반지름과 색은 %d. %s 입니다. \n", cc4.r, cc4.color);
//  }
//}


//class ColoredCircle{
//
//  // 멤버 - 필드
//  static int numOfCircles;
//  int r;
//  String color;
//
//
//  // 생성자 - 4개 (오버로딩)
//  public  ColoredCircle(){
//    this(1, "white");
//  }
//  public  ColoredCircle(String color){
//    this(1, color);
//  }
//
//  public ColoredCircle(int r){
//    this(r, "white");
//
//  }
//  public  ColoredCircle(int r, String color){
//
//    if(r > 0){
//      this.r = r;
//    }else {
//      this.r = 1;
//    }
//    if(color == null || color.equals("") || color.equals(" ")){
//      this.color = "white";
//    }else {
//      this.color = color;
//    }
//
//
//  }
//  // 멤버 - 메소드
//  //정적 메소드에는 this를 사용할 수 없다.
//  public static  void showStatus(){  //정적메소드
//    System.out.println(this.color + "색깔의" + numOfCircles + "번쨰 원이 생성되었습니다.");
//    getNumOfCircles();
//  }
//  public  void setColor(String color){ //인스턴스 메소드
//    this.color = color;
//  }
//
//  public  static  int getNumOfCircles(){
//    return  numOfCircles;
//  }
//}
