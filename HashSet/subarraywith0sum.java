package HashSet;
import java.util.*;

public class subarraywith0sum {
	public static void main(String[] args) {
		int[] ar = {1,4,1,-3,-1,-1};
		System.out.print(check(ar));
	}
	public static boolean check(int[] ar) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(0);
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			if(hs.contains(sum))
				return true;
			hs.add(sum);
		}
		return false;
	}
}
