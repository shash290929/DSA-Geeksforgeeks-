package HashSet;

import java.util.*;
public class Frequencyofelement {
	public static void main(String[] args) {
		int[] ar = {10,12,10,15,12,10,12,10,15,15,17};
		frequency(ar);
	}
	public static void frequency(int[] ar) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<ar.length;i++) {
//			if(hm.containsKey(ar[i])) {
//				hm.put(ar[i],hm.get(ar[i])+1);
//			}
//			else {
//				hm.put(ar[i],1);
//			}
			hm.put(ar[i],hm.getOrDefault(ar[i],0)+1);
		}
		System.out.print(hm);
		for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
