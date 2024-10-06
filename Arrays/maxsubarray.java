package Arrays;
import java.util.*;

public class maxsubarray {
	public static void main(String[] args) {
		int[] ar = {-5,1,-2,3,-1,2,-2};
		System.out.print(maxsubarray(ar));
	}
	//kadane's algorithm
	static int maxsubarray(int[] ar) {
		int ans=Integer.MIN_VALUE;
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			max=Math.max(ar[i], max+ar[i]);
			ans=Math.max(max, ans);
		}
		return ans;
	}
	
}
