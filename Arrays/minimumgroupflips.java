package Arrays;

public interface minimumgroupflips {
	public static void main(String[] args) {
		int[] ar = {0,0,0,1,1,1,0,0,1,0,0};
		group1(ar);
		System.out.println("new");
		group2(ar);
	}
	static void group2(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			if(ar[i-1]!=ar[i]) {
				if(ar[i]!=ar[0]) {
					System.out.print(i+" to ");
				}
				else {
					System.out.println(i-1);
				}
			}
		}
		if(ar[0]!=ar[ar.length-1]) {
			System.out.print(ar.length-1);
		}
	}
	static void group1(int[] ar) {
		int[] arr= new int[2];
		int res=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]!=ar[res]) {
				arr[ar[res]]++;
				res=i;
			}
		}
		arr[ar[ar.length-1]]++;
		int min;
		if(arr[0]>arr[1]) {
			min=1;
		}
		else {
			min=0;
		}
		int start=-1;
		int end=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==min && start==-1) {
				start=i;
				end=i;
			}
			else if(ar[i]==min) {
				end=i;
			}
			else if(start!=-1 && end !=-1){
				System.out.println(start+" to "+end);
				start=-1;
				end=-1;
			}
		}
	}
}
