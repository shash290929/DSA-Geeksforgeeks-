package Arrays;

public class maxcircularsubarray {
	public static void main(String[] args) {
//		int[] ar = {5,-2,-10,3,4};
		int[] ar = {-2,-10,-10};
		System.out.println(maxcircsum1(ar));
		System.out.print(maxcircsum2(ar));
	}
	//this method is better as we apply kadane's just on inverting the array rather than creating a minsum method
	static int maxcircsum2(int[] ar) {
		int sum=0;
		int max=maxsum(ar);
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			ar[i]=-ar[i];
		}
		int min=maxsum(ar);
		int maxcirc=sum+min;
		if(maxcirc==0) {
			return max;
		}
		return Math.max(max, maxcirc);
	}
	//this method is slow as we have to apply kadane's algo twice 1st for minsum and then for maxsum
	static int maxcircsum1(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		int maxsum=maxsum(ar);
		int minsum=minsum(ar);
		int maxcirc=sum-minsum;
		if(maxcirc==0) {
			return maxsum;
		}
		return Math.max(maxsum, maxcirc);
		
	}
	static int minsum(int[] ar) {
		int min = ar[0];
		int res=ar[0];
		for(int i=1;i<ar.length;i++) {
			min = Math.min(ar[i],min+ar[i]);
			res=Math.min(min, res);
		}
		return res;
	}
	static int maxsum(int[] ar) {
		int max=ar[0];
		int res=ar[0];
		for(int i=1;i<ar.length;i++) {
			max=Math.max(ar[i],max+ar[i]);
			res=Math.max(max, res);
		}
		return res;
	}
}
