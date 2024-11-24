package sorting;

public class merge2sortedarray {
	public static void main(String[] args) {
		int[] ar1 = {1,4,5,6};
		int[] ar2 = {10,15,20,25,40};
		merge(ar1,ar2);
	}
	public static void merge(int[] ar1,int[] ar2) {
		int i=0;
		int j=0;
		for(int k=0;k<ar1.length+ar2.length;k++) {
			if(i!=ar1.length && j!=ar2.length) {
				if(ar1[i]<=ar2[j]) {
					System.out.print(ar1[i]+" ");
					i++;
				}
				else {
					System.out.print(ar2[j]+" ");
					j++;
				}
			}
			else if(i<ar1.length) {
				System.out.print(ar1[i]+" ");
				i++;
			}
			else {
				System.out.print(ar2[j]+" ");
				j++;
			}
		}
	}
}
