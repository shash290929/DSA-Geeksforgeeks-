package Arrays;

public class leftrotateby1 {
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7,8};
		rotateby1(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	static int[] rotateby1(int[] ar) {
		int res=ar[0];
		int i;
		for(i=1;i<ar.length;i++) {
			ar[i-1]=ar[i];
		}
		ar[i-1]=res;
		return ar;
	}
}
