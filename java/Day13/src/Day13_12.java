
public class Day13_12 {
	public static void main(String[] args) {

		Integer i = new Integer(10);
		Double d = new Double(3.14);
		System.out.println(i);
		System.out.println(d);
//�⺻�ڷ����� ��ü�� ����(�ڽ�)
		// ��ü�� �⺻�ڷ������� ����(��ڽ�)
		i = new Integer(i.intValue());
		d = new Double(d.doubleValue());
//��ڽ�
		
		Integer dd = 100;
		dd = dd.intValue();
		dd.intValue();
	}
}
