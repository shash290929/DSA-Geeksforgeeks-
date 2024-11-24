package matrix;

public class searchinsortedmatrix {
	public static void main(String[] args) {
		int[][] ar = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		System.out.print(search(ar,2));
		
	}
	public static boolean search(int[][] ar,int x) {
		int top=0;
		int right=ar[0].length-1;
		while(top<ar.length && right>=0) {
			if(ar[top][right]==x)
				return true;
			else if(ar[top][right]>x)
				right--;
			else
				top++;
		}
		return false;
	}
}
