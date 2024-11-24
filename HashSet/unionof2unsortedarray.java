package HashSet;
import java.util.*;

public class unionof2unsortedarray {
	public static void main(String[] args) {
		int[] ar1 = {15,20,5,15};
		int[] ar2 = {15,15,15,20,10};
		System.out.print(union(ar1,ar2));
	}
	public static int union(int[] ar1,int[] ar2) {
		HashSet<Integer> hs = new HashSet<>(); 
		for(int i=0;i<ar1.length;i++) {
			hs.add(ar1[i]);
		}
		for(int i=0;i<ar2.length;i++) {
			hs.add(ar2[i]);
		}
		return hs.size();
	}
}
