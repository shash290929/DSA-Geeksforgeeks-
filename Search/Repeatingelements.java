package Search;

public class Repeatingelements {
	public static void main(String[] args) {
		int[] ar = {0,2,4,3,2,2};
		System.out.println(repeatingelement(ar));
		System.out.println(repeatingelement2(ar));
	}
	static int repeatingelement(int[] ar) {// O(n) -> SC and O(n) -> TC  [0,n]
		boolean[] ar1 = new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(ar1[ar[i]]==false) {
				ar1[ar[i]]=true;
			}
			else {
				return ar[i];
			}
		}
		return -1;
	}
	static int repeatingelement2(int[] ar) { //[0,n]
		int fast =ar[0]+1;
		int slow =ar[0]+1;
		do {
			fast=ar[ar[fast]+1]+1;
			slow=ar[slow]+1;
		}while(fast!=slow);
		slow=ar[0]+1;
		while(slow!=fast) {
			slow=ar[slow]+1;
			fast=ar[fast]+1;
		}
		return slow-1;
	}
	static int repeatingelement1(int[] ar) { //[1,n]
		int fast =ar[0];
		int slow =ar[0];
		do {
			fast=ar[ar[fast]];
			slow=ar[slow];
		}while(fast!=slow);
		slow=ar[0];
		while(slow!=fast) {
			slow=ar[slow];
			fast=ar[fast];
		}
		return slow;
	}
}
