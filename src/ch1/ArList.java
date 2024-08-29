package ch1;

import java.util.ArrayList;
import java.util.List;

public class ArList {
  public static void main(String[] args) {
    List<Board> list = new ArrayList<>();

    list.add(new Board("제목1", "내용1", "글쓴이1"));
    list.add(new Board("제목2", "내용2", "글쓴이2"));
    list.add(new Board("제목3", "내용3", "글쓴이3"));
    list.add(new Board("제목4", "내용4", "글쓴이4"));
    list.add(new Board("제목5", "내용5", "글쓴이5"));
    // 객체 수 확인하기
  int size = list.size();
    System.out.println("총 객체 수: " + size);
    System.out.println();

    // 특정 인스턴스 가져오기
    Board board = list.get(2);
    System.out.println("주제 : " + board.getSubject() + " 내용 : " + board.getContent() + " 글쓴이 : " + board.getWriter());
    System.out.println();

    //객체를 하나씩 가져오기
    for (int i = 0; i < list.size(); i++) {

    }


  }


}

class Board{
  private String subject;
  private String content;
  private String writer;

  public Board(String subject, String content, String writer) {
    this.subject = subject;
    this.content = content;
    this.writer = writer;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }
}
