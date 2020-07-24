import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class Student extends JFrame implements Serializable {
	String a;
	int b;

	Student(String a, int d) {
		this.a = a;
		this.b = d;

	}

	void show(){
		System.out.println(a+" "+b);
	}
}

public class Day24_3 {
	public static void main(String[] args) throws IOException {


	
	ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("dd.dat"));
	Student s=  new Student("컴퓨터 공학", 20);
	s.show();
	o.writeObject(s);
	
	o.close();
	
	}
}
