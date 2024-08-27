package exercise_ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {
  public static void main(String[] args) {
    Collection<String> a = new ArrayList<>();
    a = new LinkedList<>();
    a.add("갈매기");
    a.add("다람쥐");
    a.add("라마");
    a.add("나비");
    System.out.println(a);

    for (String s : a) {
      if(s.length() == 2){
        System.out.println(s);
      }
    }
  }
}

