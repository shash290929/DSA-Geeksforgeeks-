package Arrays;

public class longestevenodd {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 7, 9};
		System.out.print(maxoddeven(ar));
	}
	static int maxoddeven(int[] ar) {
		int ans=1;
		int res=1;
		for(int i=1;i<ar.length;i++) {
			if((ar[i]%2!=0 && ar[i-1]%2==0)||(ar[i-1]%2!=0 && ar[i]%2==0)) {
				res++;
			}
			else {
				res=1;
			}
			ans=Math.max(ans, res);
		}
		return ans;
	}
}
