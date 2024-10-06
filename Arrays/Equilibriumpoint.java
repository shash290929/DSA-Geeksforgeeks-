package Arrays;

public class Equilibriumpoint {
	public static void main(String[] args) {
//		int[] ar = {3,4,8,-9,20,6};
		int[] ar = {4,2,2};
		System.out.print(equilibriumpoint(ar));
	}
	//best solution
	static int equilibriumpoint(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		int currsum=0;
		for(int i=0;i<ar.length;i++) {
			sum-=ar[i];
			if(sum==currsum) {
				return i;
			}
			currsum+=ar[i];
		}
		return -1;
	}
	//prefix sum approach
//	static int equilibrium1() {
//		
//	}
}
