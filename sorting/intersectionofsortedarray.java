package sorting;

public class intersectionofsortedarray {
	public static void main(String[] args) {
		int[] a = {3,5,10,10,10,15,15,20};
		int[] b = {5,10,10,15};
		intersection(a,b);
	}
	public static void intersection(int[] ar1,int[] ar2) {
		int i=0;int j=0;
		while(i<ar1.length && j<ar2.length) {
			if(i>0 && ar1[i]==ar1[i-1]) {
				i++;
				continue;
			}
			if(ar1[i]==ar2[j]) {
				System.out.println(ar1[i]);
				i++;
				j++;
			}
			else if(ar1[i]<ar2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
	}
}
