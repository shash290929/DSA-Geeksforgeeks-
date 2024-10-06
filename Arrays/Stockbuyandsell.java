package Arrays;

public class Stockbuyandsell {
	public static void main(String[] args) {
		//int[] ar = {1,2,3,0,2};
		int[] ar= {100, 180, 260, 310, 40, 535, 695};
		System.out.println(maxprofit(ar));
		System.out.print(maxprofit1(ar));
	}
	static int maxprofit(int[] ar) {
		int min=Integer.MAX_VALUE;
		int profit=0;
		for(int i=0;i<ar.length-1;i++) {
			min=Math.min(min,ar[i]);
			if(ar[i+1]<ar[i] && ar[i]-min>=0){
				profit=profit+(ar[i]-min);
				min=Integer.MAX_VALUE;
			}
		}
		if(min!=Integer.MAX_VALUE && ar[ar.length-1]-min>=0) {
			profit+=(ar[ar.length-1]-min);
		}
		return profit;
	}
	//best solution as we dont have handle multiple scenarios
	static int maxprofit1(int[] ar) {
		int profit=0;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>ar[i-1]) {
				profit+=(ar[i]-ar[i-1]);
			}
		}
		return profit;
	}
}
