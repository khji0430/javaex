package advacedjava2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(5000);
      Socket conn = server.accept();
      InputStream is = conn.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(is);
      Object msg = ois.readObject();
      System.out.println("반은 문자열은 " + msg);
    } catch (Exception e) {
    }

  }
}
