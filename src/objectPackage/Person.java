package objectPackage;

public class Person {
  private String name;
  private int age;
  private String nation;
  private String address;

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getNation() {
    return nation;
  }
  public String getAddress() {
    return address;
  }


  public Person setName(String name) {
    this.name = name;
    return this;
  }
  public Person setAge(int age) {
    this.age = age;
    return this;
  }
  public Person setNation(String nation) {
    if(address == null || address.equals("") || address.equals(" ")){
      this.nation = "한국";
    }else{
      this.nation = nation;
    }
    return this;
  }
  public Person setAddress(String address) {
    if(address == null || address.equals("") || address.equals(" ")){
      this.address = "서울";
    }else {
      this.address = address;
    }
    return this;
  }


  public void sayHellow(){
    System.out.println("제 이름은 " + name + " 이고, " + "나이는 " + age + "이고 국적은 " + nation + " 주소는 " + address + " 입니다.");
  }
}
