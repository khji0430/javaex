package mineproject_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
  static Map<String, Integer> map = new HashMap<>();  // 메서드 안에서 사용하기 위해 static으로 선언
  private static Account[] accountArray = new Account[100];  // 100개의 계좌를 저장할 수 있는 배열
  private static Scanner scanner = new Scanner(System.in);
  static int num = 0;  // 계좌 수를 추적한다.

  public static void main(String[] args) {
    boolean run = true;   // 변수 선언
    while(run){   // 무한루프
      System.out.println("---------------------------------------------");
      System.out.println("1. 계좌개설 | 2. 계좌조회 | 3. 입금 | 4. 출금 | 5.종료");
      System.out.println("---------------------------------------------");
      System.out.print("항목을 입력하세요 : ");

      int selectNo = scanner.nextInt();

      if(selectNo == 1){
        createAccount();  // 입력한 숫자와 같으면 실행 시켜라!  메소드 호출
      } else if (selectNo == 2) {
        accountList();
      } else if (selectNo == 3) {
        deposit();
      } else if (selectNo == 4) {
        withdraw();
      } else if (selectNo == 5) {
        System.exit(0);
      } else{
        System.out.println("잘못된 값을 입력 하였습니다.");
      }
    }
  }

  // 계좌 생성 하기
  private static void createAccount(){
    String seqno = null;
    String customerName = null;
    int balance = 0;
    String day = null;
    String bankCode = null;

    accountArray[num] = new Account(seqno, customerName, balance, day, bankCode);
    System.out.println("------");
    System.out.println("계좌 생성");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    seqno = scanner.next();
    accountArray[num].setSeqno(seqno);
    System.out.print("계좌주 : ");
    customerName = scanner.next();
    accountArray[num].setCustomerName(customerName);
    System.out.println("1. 국민은행 | 2. 우리은행 | 3. IBK국민은행 | 4. 농협은행 | 5. 신한은행 | 6. 카카오은행 | 7. 부산은행 | 8. 하나은행 | 9. 제주은행 | 10. KEB은행");
    bankCode = scanner.next();
    accountArray[num].setBankCode(bankCode);
    bankName();
    System.out.print("초기입금액 : ");
    balance = scanner.nextInt();
    accountArray[num].setBalance(balance);
    System.out.print("날짜 입력 : ");
    day = scanner.next();
    accountArray[num].setDay(day);
    System.out.println("결과 : 계좌가 생성되었습니다.");

    num++;  //설정이 완료되면 num을 증가시켜 다음 계좌를 생성할 준비를 한다.
  }

  // 계좌 목록 보기
  private static void accountList(){
    for (int i = 0; i < num; i++) {
      System.out.println("계좌번호: " + accountArray[i].getSeqno() + "\n"+
          "이름: " + accountArray[i].getCustomerName()+"\n"+
          "은행명: " + accountArray[i].getBankCode()  + "\n" +
          "금액: "+accountArray[i].getBalance() + "\n" +
          "날짜: "+accountArray[i].getDay());
    }
  }

  private static void bankName(){
    map.put("국민은행", 1);
    map.put("우리은행", 2);
    map.put("IBK국민은행", 3);
    map.put("농협은행", 4);
    map.put("신한은행", 5);
    map.put("카카오뱅크", 6);
    map.put("부산은행", 7);
    map.put("하나은행", 8);
    map.put("제주은행", 9);
    map.put("KEB은행", 10);

    if(map.get("국민은행").equals(1)){
      System.out.println("국민은행");
    } else if (map.get("우리은행").equals(2)) {
      System.out.println("우리은행");
    }else if (map.get("IBK국민은행").equals(3)) {
      System.out.println("IBK국민은행");
    }else if (map.get("농협은행").equals(4)) {
      System.out.println("농협은행");
    }else if (map.get("신한은행").equals(5)) {
      System.out.println("신한은행");
    }else if (map.get("카카오뱅크").equals(6)) {
      System.out.println("카카오뱅크");
    }else if (map.get("부산은행").equals(7)) {
      System.out.println("부산은행");
    }else if (map.get("하나은행").equals(8)) {
      System.out.println("하나은행");
    }else if (map.get("제주은행").equals(9)) {
      System.out.println("제주은행");
    }else if (map.get("KEB은행").equals(10)) {
      System.out.println("KEB은행");
    }else{
      System.out.println("잘못 입력 하였습니다.");
    }

  }

  // 예금하기
  private static void deposit(){
    System.out.println("------");
    System.out.println("예금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String ano = scanner.next();
    System.out.print("예금액 : ");
    findAccount(ano).setBalance(findAccount(ano).getBalance() + scanner.nextInt());
    System.out.println("결과 : 예금이 성공되었습니다.");
  }

  // 출금하기
  private static void withdraw(){
    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");
    System.out.print("계좌번호 : ");
    String ano = scanner.next();
    System.out.print("출금액 : ");
    int remain = findAccount(ano).getBalance() - scanner.nextInt();
    if(remain<0){
      System.out.println("결과 : 출금 가능액을 초과하였습니다.");
    }else {
      findAccount(ano).setBalance(remain);
      System.out.println("결과 : 출금이 성공되었습니다.");
    }
  }



  // Account 배열에서 계좌번호와 동일한 Account 객체 찾기
  private static Account findAccount(String ano) {
    for (int i = 0 ; i < num; i++) {
      if (accountArray[i].getSeqno().equals(ano)) {
        return accountArray[i];
      }
    }
    System.out.println("해당 계좌번호를 찾을 수 없습니다.");
    return null;
  }

  private static void day(){

  }


}

