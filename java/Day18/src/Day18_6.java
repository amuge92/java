
public class Day18_6 {
	public static void main(String[] args) {
		String[] str = new String[] { "JAVA", "DB", "C++" };
		show(str);
	}

	static <T> void show(String[] str) {
		for (String a : str) {
			System.out.println(a);
		}

		Con3<String> c1 = new Con3<String>();
		c1.set("¼öÁ¤");
		String s1 = c1.get();
		System.out.println(s1);

		Con3<Integer> c2 = new Con3<Integer>();
		c2.set(5);
		int s2 = c2.get();
		System.out.println(s2);
	}
}

class Con3<T> {
	T t;
	void set(T t){
		this.t=t;
	}
	 T get(){
		return t;
	}
	 public String toString (){
		 return t+"";
	 }

}