package Arrays;

public class subarraywithgivensum {
	public static void main(String[] args) {
		int[] ar = {2,4};
		System.out.print(checksum(ar,3));
	}
	static boolean checksum(int[] ar,int sum) {
		int t=0;
		int i=0;
		while(i<ar.length && t<ar.length) {
			System.out.println(sum);
			if(sum>0) {
				sum=sum-ar[i];
				i++;
			}
			else if(sum<0) {
				sum=sum+ar[t];
				t++;
			}
			else {
				return true;
			}
		}
		return false;
	}
}
