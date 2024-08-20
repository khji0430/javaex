package objectPackage;

public class PersonDemo {
  public static void main(String[] args) {
    Person pr = new Person();
    //메소드 체인(연속 호출 방식)
    pr.setNation("유럽").setAddress("경기도").setName("홍길도").setAge(20).sayHellow();
//    pr.setName("jj");
//    pr.setAge(20);
//    pr.setNation("미국");
//    pr.setAddress("뉴욕");
//    pr.sayHellow();

    Person pr2 = new Person() ;
    pr2.setNation("").setAddress("").setName("김민국").setAge(19).sayHellow();
//    pr2.setName("홍길동");
//    pr2.setAge(10);
//    pr2.setNation("");
//    pr2.setAddress("");
//    pr2.sayHellow();
  }
}
