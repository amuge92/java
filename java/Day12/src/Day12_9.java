import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable {
	int x, y;// ��ü�� ���Ͽ� ���� : ����ȭ ����
				// ���Ͽ� ������ ��ü�� �о��: ������ȭ ����

	Rec(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void show() {
		System.out.println(x + " " + y);
	}

}

public class Day12_9 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		oo.writeObject(new Rec(4, 7));
		oo.writeObject(new Rec(2, 9));
		oo.writeObject(new String("�����ٶ󸶹�"));
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("obj.dat"));
		Rec r1 = (Rec) oi.readObject();
		Rec r2 = (Rec) oi.readObject();

		String str = (String) oi.readObject();
		//object(�θ�)�� Rec,String (�ڽ�)��ü�� �ٿ� ĳ����
		System.out.println(str);
		
		oo.close();
		oi.close();
	}
}
