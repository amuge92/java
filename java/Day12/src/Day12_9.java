import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable {
	int x, y;// 객체를 파일에 저장 : 직렬화 과정
				// 파일에 저장한 객체를 읽어옴: 역직렬화 과정

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
		oo.writeObject(new String("가나다라마바"));
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("obj.dat"));
		Rec r1 = (Rec) oi.readObject();
		Rec r2 = (Rec) oi.readObject();

		String str = (String) oi.readObject();
		//object(부모)를 Rec,String (자식)객체로 다운 캐스팅
		System.out.println(str);
		
		oo.close();
		oi.close();
	}
}
