import java.util.Scanner;

class Song {
	String singer;
	String title;

	Song(String singer, String title) {
		this.singer = singer;
		this.title = title;
	}

}

public class Day12_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Song so[] = new Song[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("����");
			String singer = s.next();
			System.out.println("����");
			String title = s.next();
			so[i] = new Song(singer, title);
            System.out.println(so[i].singer+" "+so[i].title);
		}

	}
}
