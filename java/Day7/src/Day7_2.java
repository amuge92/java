import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

public class Day7_2 extends JFrame {
	Button button = new Button("ㅋㅋㅋ");

	public void createFrame() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임에 컴포넌트 추가
		add(button);

		// 프레임 크기 지정
		setSize(300, 600);

		// 프레임 보이기
		setVisible(true);
	}

	public static void main(String[] args) {
		// 프레임 열기
		Day7_2 frameExam = new Day7_2();
		frameExam.createFrame();
	}
}