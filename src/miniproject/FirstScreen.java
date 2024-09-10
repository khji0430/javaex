package miniproject;

import advacedjava2.DBDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstScreen{

  // 첫 번째 화면 (인트로 화면)
  public static void createIntroFrame() {
    JFrame introFrame = new JFrame("KOSTA CAFE");

    // 프레임 크기 설정
    introFrame.setSize(800, 1050);
    introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    introFrame.setLocationRelativeTo(null);

    // back 이미지 생성 (이미지 패널)
    JPanel introPanel = new JPanel() {
      private Image bgImage = new ImageIcon(getClass().getResource("/miniproject/back2.png")).getImage();

      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
      }
    };
    introPanel.setLayout(new BorderLayout());

    // 센터 라벨
    JLabel clickLabel = new JLabel("화면을 클릭하세요", SwingConstants.CENTER);
    clickLabel.setFont(new Font("Dialog", Font.BOLD, 50));
    clickLabel.setForeground(Color.WHITE);

    introPanel.add(clickLabel, BorderLayout.CENTER);


    // 인트로화면 클릭 이벤트
    introPanel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        // 첫 번째 프레임을 닫고 두 번째 프레임을 열기
        introFrame.dispose();
        createMainFrame();  // 두 번째 프레임 생성
      }
    });

    introFrame.add(introPanel);
    introFrame.setVisible(true);
  }

  // 두 번째 화면
  public static void createMainFrame() {
    JFrame frm = new JFrame("KOSTA CAFE");
    frm.setSize(800, 1050);
    frm.setLocationRelativeTo(null);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setLayout(new BorderLayout());

    // 메뉴 아이템, 가격 배열 생성 ( sql 로 가져와야함 ) 임시자료

//    Product1 product = new Product1();
//    String[] menuItems = product.getName();
//    int[] prices = product.getPrice();
//    int[] counts = new int[menuItems.length];
//    DBDemo.makeConnection().get


    String[] menuItems = {"Ice Americano", "Ice CafeLatte", "Ice Tea", "Americano", "CafeLatte", "Tea"};
    int[] prices = {3000, 3500, 4000, 2500, 3000, 3500};
    int[] counts = new int[menuItems.length];



    // 이미지 패널 생성
    ImagePanel imagePanel1 = new ImagePanel("/miniproject/cafe1.png");
    ImagePanel imagePanel2 = new ImagePanel("/miniproject/cafe2.png");
    ImagePanel imagePanel3 = new ImagePanel("/miniproject/cafe3.png");
    ImagePanel imagePanel4 = new ImagePanel("/miniproject/cafe4.png");
    ImagePanel imagePanel5 = new ImagePanel("/miniproject/cafe5.png");
    ImagePanel imagePanel6 = new ImagePanel("/miniproject/cafe6.png");

    // 이미지 패널 배치
    imagePanel1.setBounds(50, 40, 200, 200);
    imagePanel2.setBounds(300, 40, 200, 200);
    imagePanel3.setBounds(550, 40, 200, 200);
    imagePanel4.setBounds(50, 340, 200, 200);
    imagePanel5.setBounds(300, 340, 200, 200);
    imagePanel6.setBounds(550, 340, 200, 200);

    // 버튼 생성 및 배치
    // 뭔가 따로따로 버튼을 생성하는 것 보다 데이터를 배열로 만들어서
    // 카운트 편하게, 데이터 삽입 편하게 하려고 수정했는데 맞나? 맞것지 뭐
//    JButton btn1 = new JButton("Ice Americano");
//    JButton btn2 = new JButton("Ice CafeLatte");
//    JButton btn3 = new JButton("Ice Tea");
//    JButton btn4 = new JButton("Americano");
//    JButton btn5 = new JButton("CafeLatte");
//    JButton btn6 = new JButton("Tea");
    // 결제하기 취소하기 버튼
    JButton btn7 = new JButton("결제하기");
    JButton btn8 = new JButton("취소하기");

    // 하단 내역보기 (JTextArea)
    JTextArea orderDetails = new JTextArea(20, 30);
    orderDetails.setEditable(false);
    JScrollPane scroll = new JScrollPane(orderDetails);
    scroll.setBounds(50, 700, 450, 250);

    // total 라벨
    JLabel totalLabel = new JLabel("TOTAL : 0원");
    totalLabel.setBounds(50,650,200,50);
    totalLabel.setFont(new Font("Dialog", Font.BOLD, 20));

    // 오더리스트 업데이트 메서드
    ActionListener orderListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();
        for (int i = 0; i < menuItems.length; i++) {
          if (buttonText.equals(menuItems[i])) {
            counts[i]++;
            updateOrder();
            break;
          }
        }
      }
      // 오더리스트 업데이트
      private void updateOrder(){
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for (int i = 0; i < menuItems.length; i++) {
          if(counts[i] > 0){
            sb.append(menuItems[i]).append(" X ").append(counts[i]).append(" = ")
                .append(counts[i] * prices[i]).append("원\n");
            total += counts[i]*prices[i];
          }
        }
        orderDetails.setText(sb.toString());
        totalLabel.setText("TOTAL : " + total + "원");

      }
    };
    // 버튼 생성 및 액션 리스너 추가
    JButton[] buttons = new JButton[menuItems.length];
    for (int i = 0; i < menuItems.length; i++) {
      buttons[i] = new JButton(menuItems[i]);
      buttons[i].setBounds(50 + (i % 3) * 250, 250 + (i / 3) * 300, 200, 50);
      buttons[i].addActionListener(orderListener);
      frm.getContentPane().add(buttons[i]);
    }


    btn7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "결제 부탁드립니다.");
        // 오더리스트 초기화 코드 와야함
        clearOrder();

      }
      private void clearOrder() {
        for (int i = 0; i < menuItems.length; i++) {
          counts[i] = 0;
        }
        orderDetails.setText("");
        totalLabel.setText("TOTAL : 0 원");
      }
    });

    // 취소하기 버튼 이벤트
    btn8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        clearOrder();
      }
      private void clearOrder() {
        for (int i = 0; i < counts.length; i++) {
          counts[i] = 0;
        }
        orderDetails.setText("");
        totalLabel.setText("TOTAL : 0 원");
      }
    });






//    btn1.setBounds(50, 250, 200, 50);
//    btn2.setBounds(300, 250, 200, 50);
//    btn3.setBounds(550, 250, 200, 50);
//    btn4.setBounds(50, 550, 200, 50);
//    btn5.setBounds(300, 550, 200, 50);
//    btn6.setBounds(550, 550, 200, 50);
    btn7.setBounds(550, 700, 200, 50);
    btn8.setBounds(550, 800, 200, 50);

    // 버튼 패널에 추가
//    frm.getContentPane().add(btn1);
//    frm.getContentPane().add(btn2);
//    frm.getContentPane().add(btn3);
//    frm.getContentPane().add(btn4);
//    frm.getContentPane().add(btn5);
//    frm.getContentPane().add(btn6);
    frm.getContentPane().add(btn7);
    frm.getContentPane().add(btn8);



    // 텍스트 패널에 스크롤 패널 추가
    JPanel textPanel = new JPanel();
    textPanel.setLayout(null);
    textPanel.add(scroll);
    textPanel.add(totalLabel);

    // 이미지 및 텍스트 패널 추가
    frm.add(imagePanel1);
    frm.add(imagePanel2);
    frm.add(imagePanel3);
    frm.add(imagePanel4);
    frm.add(imagePanel5);
    frm.add(imagePanel6);
    frm.add(textPanel);

    frm.setVisible(true);
  }

  // 메인 메서드
  public static void main(String[] args) {
    // 인트로 프레임 생성
    createIntroFrame();


  }

  // 이미지 패널 클래스
  static class ImagePanel extends JPanel {
    private Image image;

    public ImagePanel(String imagePath) {
      image = new ImageIcon(getClass().getResource(imagePath)).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(image, 0, 0, 200, 200, this);
    }
  }
}
