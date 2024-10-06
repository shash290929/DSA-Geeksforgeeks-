package Arrays;

public class largestelement {
	public static void main(String[] args) {
		int[] ar = {1,3,4,53,23,100,329};
		System.out.print(largestelement(ar));
	}
	static int largestelement(int[] ar) {
		int largest=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
			}
		}
		return largest;
	}
}
