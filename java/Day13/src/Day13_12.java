
public class Day13_12 {
	public static void main(String[] args) {

		Integer i = new Integer(10);
		Double d = new Double(3.14);
		System.out.println(i);
		System.out.println(d);
//기본자료형을 객체로 변경(박싱)
		// 객체를 기본자료형으로 변경(언박싱)
		i = new Integer(i.intValue());
		d = new Double(d.doubleValue());
//언박싱
		
		Integer dd = 100;
		dd = dd.intValue();
		dd.intValue();
	}
}
