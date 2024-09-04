package mineproject;

public class Account {
  private String seqno;   // 계좌 번호
  private String customerName; // 예금자
  private String bankCode;  // 은행 코드
  private int balance;  // 잔고
  private String day;   // 계좌 open 일자

  public Account(String seqno, String customerName, int balance, String day, String bankCode) {
    this.seqno = seqno;
    this.customerName = customerName;
    this.balance = balance;
    this.day = day;
    this.bankCode = bankCode;
  }


  public String getSeqno() {
    return seqno;
  }

  public void setSeqno(String ano) {
    this.seqno = seqno;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }
}
