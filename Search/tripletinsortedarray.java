package Search;

public class tripletinsortedarray {
	public static void main(String[] args) {
		int[] ar = {2,3,4,8,9,20,40};
		int sum=303;
		System.out.print(checkcheck(ar,sum));
	}
	static boolean checkcheck(int[] ar,int sum) {
		for(int i=0;i<ar.length-1;i++) {
			int res_sum=sum-ar[i];
			if(check(ar,res_sum,i+1,ar.length-1)) {
				return true;
			}
		}
		return false;
	}
	static boolean check(int[] ar,int sum,int start,int end) {
		while(start<end) {
			if(ar[start]+ar[end]==sum) {
				return true;
			}
			else if(ar[start]+ar[end]>sum) {
				end--;
			}
			start++;
		}
		return false;
	}
}
