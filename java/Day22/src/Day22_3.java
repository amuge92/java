import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day22_3 {
	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("eng", 80);
		hs.put("kor", 70);
		hs.put("math", 98);
        Set<Map.Entry<String, Integer>>s = hs.entrySet();
        
        int max = 0;String a="";int hap=0;
        for(Map.Entry<String, Integer> m1:s) {
        		hap+=m1.getValue();
        	if(max<m1.getValue()) {
        		max=m1.getValue();
        		a=m1.getKey();
        	}
        	Set set = hs.entrySet();
        }hap=hap/s.size();
        System.out.println(hap);
        System.out.println(max);
        System.out.println(a);
		Double b[] = { 3.14, 94.215 };
		for (Double d : b) {
			System.out.println(d);
		}

	}
}
