import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

public class Day7_2 extends JFrame {
	Button button = new Button("������");

	public void createFrame() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �����ӿ� ������Ʈ �߰�
		add(button);

		// ������ ũ�� ����
		setSize(300, 600);

		// ������ ���̱�
		setVisible(true);
	}

	public static void main(String[] args) {
		// ������ ����
		Day7_2 frameExam = new Day7_2();
		frameExam.createFrame();
	}
}