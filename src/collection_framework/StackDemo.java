package collection_framework;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();
    System.out.println(list.isEmpty());
    System.out.println(st.empty());
    st.push("a");   // addLast
    st.push("b");
    st.push("c");
    st.push("d");
    st.peek(); //getLast랑 똑같다
    System.out.println(st);
    System.out.println(st.peek()); // 마지막 꺼내온다.
    System.out.println(st.search("a") + " 번째에서 찾음");
    System.out.println(st.search("b") + " 번째에서 찾음");
    System.out.println(st.search("c") + " 번째에서 찾음");
    System.out.println(st.search("d") + " 번째에서 찾음");
    while(!st.empty()) {
      st.pop();  // removeLast
      System.out.println(st);
    }
  }
}
