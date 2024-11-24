package HashSet;
import java.util.*;
import java.lang.*;

public class longestsubarraywithsumk {
	public static void main(String[] args) {
		int[] ar = {-8,8,4,4,9,-2,2};
		System.out.print(longest(ar,4));
	}
	public static int longest(int[] ar,int k) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,-1);
		int sum=0;
		int max_len =-1;
		int res=-1;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			if(hm.containsKey(sum-k)) {
				res = i-(hm.get(sum-k));
				max_len=Math.max(max_len,res);
			}
			if(hm.containsKey(sum)==false) {
				hm.put(sum,i);
			}
		}
		return max_len;
	}
}
