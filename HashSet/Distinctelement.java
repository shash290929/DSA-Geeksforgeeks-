package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class Distinctelement {
	public static void main(String[] args) {
		Integer[] ar = {10,2,3,1,23,2,2,3};
		System.out.print(count(ar));
	}
	public static int count(Integer[] ar) {
//		HashSet<Integer> hs = new HashSet<>();
//		for(int i=0;i<ar.length;i++) 
//			hs.add(ar[i]);
//		Iterator<Integer> i = hs.iterator();
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		System.out.println();
//		return hs.size();
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(ar));
		return hs.size();
		
	}
}
