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
  Socket so=null; //�����ʿ��� �ʿ��� ��ü��
  try {
   ser=new ServerSocket(9999);
  }catch(Exception e) {}
  System.out.println("���� ��ٸ����ִ�");
  //Ŭ���̾�Ʈ�� �����û�� �ö����� ��ٸ���.
  try {
   so=ser.accept(); //���� ����
  }catch(Exception e) {}
 
  System.out.println("��ٸ���..");
  //�����ʿ��� Ŭ���̾�Ʈ���� �޽��� ������.
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
    System.out.println("����");
    break;
   }
   System.out.println("������: ");
   String outmsg=s.nextLine();
   out.write(outmsg +"\n");
   out.flush();
   //���� ���ۿ� ����Ǿ��ִ� ������
   //Ŭ���̾�Ʈ���� �����ϰ�
   //���۸� ����.
  }
  }catch(Exception e) {
  
  }finally {
   try {
    s.close();
    so.close();
    ser.close();
   }catch(Exception e) {
    System.out.println("���� �߻�");
   }
  }
 }
}