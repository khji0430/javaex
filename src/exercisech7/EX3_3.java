package exercisech7;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

public class EX3_3 {
  public static void main(String[] args) {

    Book[] books = {
        new Book(15000),
        new Book(50000),
        new Book(20000)
    };

    System.out.println("정렬 전");
    for(Book book : books){
      System.out.println(book);
    }
    System.out.println(Arrays.toString(books));

//    Arrays.sort(BooleanSupplier);
    System.out.println("정렬 후");
    for(Book book : books){
      System.out.println(book);
    }
  }
}

//defult
class Book implements Comparable{
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
        "price=" + price +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Book){
      Book b = (Book)  o;
      return this.price - b.price;  // 오름차순을 내림차순으로 변환해 준다.
    }
    return -99999999;
  }
}
