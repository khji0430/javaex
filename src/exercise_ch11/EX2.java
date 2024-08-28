//package exercise_ch11;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Objects;
//import java.util.Set;
//
//public class EX2 {
//  public static void main(String[] args) {
//    Set<Person> set = new HashSet<>();
//    set.add((new Person("김열공", 20)));
//    set.add((new Person("최고봉", 56)));
//    set.add((new Person("우등생", 16)));
//    set.add((new Person("나자바", 35)));
//    set.add((new Person("나자바", 35)));
//    Iterator<Person> it = set.iterator();
//    Person p;
//
//    while(it.hasNext()){
//      p = it.next();
//      System.out.println();
//    }
//
//
//
//  }
//}
//
//class Person{
//
//  String name;
//  int age;
//
//  public Person(String name, int age) {
//    this.name = name;
//    this.age = age;
//  }
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof Person person)) return false;
//    return age == person.age && Objects.equals(name, person.name);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(name, age);
//  }

//  @Override
//  public boolean equals(Object o) {
//    if(o != null instanceof Person){
//      Person p = (Person) o;
//      return (this.age == p.age) && (this.hashCode() == p.hashCode());
//    }
//    return false;
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Person person = (Person) o;
//    return age == person.age && Objects.equals(name, person.name);
// }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(name);
//  }


//
//  @Override
//  public String toString() {
//    return "Person[" + name + " : " + age +
//        ']';
//  }
//}
