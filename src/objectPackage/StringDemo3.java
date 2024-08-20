package objectPackage;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = ", java";

    s1 = "hello";

    System.out.println("s1의 길이는 " + s1.length());  // 몇글자 인지

    System.out.println(s1.concat(s2));  // 합해진다.  새로운 객체가 만들어진다.

    System.out.println(s1.toUpperCase());
    System.out.println(s1);

    System.out.println(s2.substring(2));
    System.out.println(s2.substring(2,4));

    System.out.println(String.valueOf(10).equals("10"));


    String s4 = """
        hello
        java
        12345
        
        """;
    System.out.println(s4);

    """
        hello
        java
        12345
        
        """.length();

    """
        """.length();
  }
}
