class St<T> {

	int i;
	Object[] ary;

	St() {
		i = 0;
		ary = new Object[10];
	}

	void push(T t) {
		if (i == 10) {
			return;
		}
		ary[i] = t;
		i++;
	}

	T pop() {
		if (i == 0) {
			return null;
		}
		--i;
		return (T) ary[i];

	}
}

public class Day18_7 {
	public static void main(String[] args) {

		
		
		St<String> st = new St();
		
		st.push("가나다");
		st.push("라마바");
		st.push("사아자");
		st.push("차카타");
		st.push("파하");
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
		
		
		
		
		
		
	}
}
