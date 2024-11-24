package HashSet;
import java.util.*;

public class longestconsecutivesubsequence {
	public static void main(String[] args) {
		int[] ar = {};
		
	}
	public static int longest(int[] ar) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<ar.length;i++) {
			hs.add(ar[i]);
		}
		int max_count=0;
		for(int i=0;i<ar.length;i++) {
			if(hs.contains(ar[i]-1)==false) {
				int count=1;
				int k=ar[i];
				while(hs.contains(k+1)) {
					count++;
					k++;
				}
				max_count=Math.max(count,max_count);
			}
		}
		return max_count;
	}
}
