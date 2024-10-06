package Arrays;

public class checkifsorted {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,4,7};
		System.out.print(checkifsorted(ar));
	}
	public static boolean checkifsorted(int[] ar) {
		int res = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(res>ar[i]) {
				return false;
			}
			res=ar[i];
		}
		return true;
	}
}
