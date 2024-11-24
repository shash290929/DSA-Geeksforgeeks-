package sorting;

public class cyclesort {
	public static void main(String[] args) {
		int[] ar = {20,40,50,20,40};
		cyclesortwithdistinct(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void cyclesortwithdistinct(int[] ar) {
		int write =0;
		for(int cs=0;cs<ar.length-1;cs++) {
			int pos=cs;
			int item = ar[cs];
			for(int i=cs+1;i<ar.length;i++) {
				if(ar[i]<item) {
					pos++;
				}
			}
			if(pos==cs) {
				continue;
			}
			while(ar[pos]==item) {
				pos++;
			}
			int temp = item;
			item = ar[pos];
			ar[pos] = temp;
			write++;
			while(cs!=pos) {
				pos=cs;
				for(int i=cs+1;i<ar.length;i++) {
					if(ar[i]<item) {
						pos++;
					}
				}
				while(ar[pos]==item) {
					pos++;
				}
				temp = item;
				item = ar[pos];
				ar[pos] = temp;
				write++;
			}
		}
	}
}
