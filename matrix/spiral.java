package matrix;

public class spiral {
	public static void main(String[] args) {
		int[][] ar = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiral(ar);
	}
	public static void spiral(int[][] ar) {
		int top = 0;
		int down = ar.length-1;
		int left=0;
		int right=ar[0].length-1;
		while(top<=down && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(ar[top][i]+" ");
			}
			top++;
			for(int i=top;i<=down;i++) {
				System.out.print(ar[i][right]+" ");
			}
			right--;
			if(top<=down) {
				for(int i=right;i>=left;i--) {
					System.out.print(ar[down][i]+" ");
				}
				down--;
			}
			if(left<=right) {
				for(int i=down;i>=top;i--) {
					System.out.print(ar[i][left]+" ");
				}
				left++;
			}
		}
	}
}
