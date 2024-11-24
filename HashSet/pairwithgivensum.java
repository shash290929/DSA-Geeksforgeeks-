package HashSet;
import java.util.*;

public class pairwithgivensum {
	public static void main(String[] args) {
		int[] ar = {3,2,8,15,-8};
		System.out.print(search(ar,0));
	}
	public static boolean search(int[] ar,int sum) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<ar.length;i++) {
			if(hs.contains(sum-ar[i])) {
				return true;
			}
			hs.add(ar[i]);
		}
		return false;
	}
}
