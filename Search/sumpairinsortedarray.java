package Search;

public class sumpairinsortedarray {
	public static void main(String[] args) {
		int[] ar = {2,5,8,12,30};
		int sum=13;
		pair(ar,13);
	}
	static void pair(int[] ar,int sum) {
		int start=0;
		int end=ar.length-1;
		while(start<end) {
			if(ar[start]+ar[end]==sum) {
				System.out.print(start+" "+end);
				return;
			}
			else if(ar[start]+ar[end]>sum) {
				end--;
			}
			else {
				start++;
			}
		}
	}
}
