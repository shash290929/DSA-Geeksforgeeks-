package Arrays;

public class secondlargestelement {
	public static void main(String[] args) {
		int[] ar = {32,45,65,1,12,34};
		System.out.println(secondlargest(ar));
		System.out.print(secondlargest1(ar));
	}
	//Naive Solution
	static int secondlargest(int[] ar) {
		int largest = largest(ar);
		int secondlargest = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>secondlargest && ar[i]!=largest) {
				secondlargest=ar[i];
			}
		}
		return secondlargest;
	}
	//better solution
	static int secondlargest1(int[] ar) {
		int largest =ar[0];
		int seclargest=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				seclargest=largest;
				largest = ar[i];
			}
			else if(ar[i]!=largest) {
				if(ar[i]>seclargest) {
					seclargest = ar[i];
				}
			}
		}
		return seclargest;
	}
	static int largest(int[] ar) {
		int largest =0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
			}
		}
		return largest;
	}
}
