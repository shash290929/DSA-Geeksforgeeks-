package Arrays;
import java.util.*;
public class maximumsizeofkconselement {
	public static void main(String[] args) {
		int[] ar = {1,8,30,-5,20,7};
		System.out.print(maxsum(ar,3));
	}
	static int maxsum(int[] ar,int k) {
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=ar[i];
		}
		int max=sum;
		for(int i=k;i<ar.length;i++) {
			sum=sum-ar[i-k]+ar[i];
			max=Math.max(sum, max);
		}
		return max;
	}
}

