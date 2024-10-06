package Arrays;
import java.util.*;

//frequency in sorted array
public class frequency {
	public static void main(String[] args) {
		int[] ar = {40,50,50,60};
//		HashMap<Integer,Integer> hm = frequency(ar);
//		for(HashMap.Entry<Integer, Integer> set:hm.entrySet()) {
//			System.out.println(set.getKey()+" "+set.getValue());
//		}
		frquency1(ar);
	}
	static void frquency1(int[] ar) {
		int i=1;
		int freq=1;
		while(i<ar.length) {
			while(i<ar.length && ar[i]==ar[i-1]) {
				freq++;
				i++;
			}
			System.out.println(ar[i-1]+" "+freq);
			freq=1;
			i++;
		}
		if(ar.length==1 || ar[ar.length-1]!=ar[ar.length-2]) {
			System.out.println(ar[ar.length-1]+" "+1);
		}
	}
	static HashMap<Integer,Integer> frequency(int[] ar) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			if(hm.containsKey(ar[i])) {
				hm.put(ar[i], hm.get(ar[i])+1);
			}
			else{
				hm.put(ar[i], 1);
			}
		}
		return hm;
	}
}
