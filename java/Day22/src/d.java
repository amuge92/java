import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class d{
 public static void main(String [] args) throws IOException {
	 Scanner s=new Scanner(System.in);
  BufferedWriter out=null;
  BufferedReader in=null;
  ServerSocket ser=null;
  Socket so=null; //서버쪽에서 필요한 객체들
  try {
   ser=new ServerSocket(9999);
  }catch(Exception e) {}
  System.out.println("연결 기다리고있다");
  //클라이언트가 연결요청이 올때까지 기다린다.
  try {
   so=ser.accept(); //연결 수락
  }catch(Exception e) {}
 
  System.out.println("기다린다..");
  //서버쪽에서 클라이언트한테 메시지 보낸다.
  try {
   out=new BufferedWriter
     (new OutputStreamWriter
       (so.getOutputStream()));
   in=new BufferedReader
     (new InputStreamReader
       (so.getInputStream()));
 
  while(true) {
   String msg=in.readLine();
   if(msg.equals("stop")) {
    System.out.println("종료");
    break;
   }
   System.out.println("보내기: ");
   String outmsg=s.nextLine();
   out.write(outmsg +"\n");
   out.flush();
   //현재 버퍼에 저장되어있는 내용을
   //클라이언트한테 전송하고
   //버퍼를 비운다.
  }
  }catch(Exception e) {
  
  }finally {
   try {
    s.close();
    so.close();
    ser.close();
   }catch(Exception e) {
    System.out.println("오류 발생");
   }
  }
 }
}