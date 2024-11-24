package HashSet;
import java.util.*;

public class Subarraywithsumk {
	public static void main(String[] args) {
		int[] ar= {15,2,4,8,9,5,10,23};
		System.out.print(check(ar,23));
		
	}
	public static boolean check(int[] ar,int k) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(0);
		int curr_sum=0;
		for(int i=0;i<ar.length;i++) {
			curr_sum=ar[i];
			if(hs.contains(curr_sum-k))
				return true;
			else
				hs.add(curr_sum);
		}
		return false;
	}
}
