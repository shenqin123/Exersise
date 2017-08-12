package four;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FourDemo {
	public static void main(String[] args) {
	List<Integer> ls=new ArrayList<Integer>();
	Map<Integer, Integer> jcMap = new HashMap<Integer, Integer>();
	for(int i=1;i<=50;i++){
		int num=(int) (Math.random() * 100) + 1;
		ls.add(num);
	}
	Iterator<Integer> it=ls.iterator();
	while(it.hasNext()){
		int m=it.next();
		int s=m/10;
		jcMap.put(s, m);
	}
	System.out.println(ls);
	System.out.println(jcMap);
	Set<Integer> set = jcMap.keySet();
	for (Integer key : set) {
		Set<Integer> temp=jcMap.keySet();
		System.out.println(temp);
	}
//	System.out.println("----------------------");
 	Collection<Integer> con = jcMap.values();
	for (Integer value : con) {
		System.out.println(value);
	}
	}
}
