package Search;

public class medianof2sortedarray {
	public static void main(String[] args) {
		int[] ar1 = {10,20,30,40,50};
		int[] ar2 = {5,15,25,35,45,65,75};
		System.out.println(median(ar1,ar2));
		System.out.println(median2(ar1,ar2));
	}
	static double median(int[] ar1, int[] ar2) { //O(logn1)
		int n1=ar1.length;
		int n2=ar2.length;
		if(n1>n2) {
			median(ar2,ar1);
		}
		int left = 0;
		int right = ar1.length;
		while(left<=right) {
			int i1 = ((right-left)/2)+left;
			int i2 = ((n1+n2+1)/2)-i1;
			int min1 = (i1>=n1)?Integer.MAX_VALUE:ar1[i1];
			int min2 = (i2>=n2)?Integer.MAX_VALUE:ar2[i2];
			int max1 = (i1<=0)?Integer.MIN_VALUE:ar1[i1-1];
			int max2 = (i2<=0)?Integer.MIN_VALUE:ar2[i2-1];
			if(min2>=max1 && min1>=max2) {
				if((n1+n2)%2==0) {
					return ((double)Math.max(max1, max2)+(double)Math.min(min1, min2))/2;
				}
				else {
					return Math.max(max1, max2);
				}
			}
			else if(min1>max2) {
				right=i1-1;
			}
			else {
				left=i1+1;
			}
		}
		return -1;
	}
	static double median2(int[] ar1, int[] ar2) {
		int n1=ar1.length;
		int n2=ar2.length;
		int i=0;
		int j=0;
		int m1=0;
		int m2=0;
		for(int k=0;k<=(n1+n2)/2;k++) {
			m2=m1;
			if(i!=n1 && j!=n2) {
				if(ar1[i]<ar2[j]) {
					m1=ar1[i++];
				}
				else {
					m1=ar2[j++];
				}
			}
			else if(i<n1) {
				m1=ar1[i++];
			}
			else {
				m1=ar2[j++];
			}
		}
		if((n1+n2)%2==0) {
			return (double)(m2+m1)/2;
		}
		else {
			return (double)m1;
		}
	}
}
