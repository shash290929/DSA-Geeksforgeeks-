package Arrays;

public class leaderinarray {
	public static void main(String[] args) {
		int[] ar = {10,20,30};
		leader(ar);
	}
	static void leader(int[] ar) {
		int leader=ar[ar.length-1];
		System.out.print(leader+" ");
		for(int i=ar.length-2;i>=0;i--) {
			if(ar[i]>leader) {
				System.out.print(ar[i]+" ");
				leader=ar[i];
			}
		}
	}
}
