package Search;

public class checkifsumexistsinsortedarray {
	public static void main(String[] args) {
		int[] ar = {2,7,11,15};
		int[] k =twoSum(ar,9);
		for(int e:k) {
			System.out.print(e+" ");
		}
	}
	   public static int[] twoSum(int[] numbers, int target) {
	        int[] ar = new int[2];
	        int low=0;
	        int high=numbers.length-1;
	        while(low<high){
	            if(numbers[low]+numbers[high]==target){
	                ar[0]=low+1;
	                ar[1]=high+1;
	                return ar;
	            }
	            else if(numbers[low]+numbers[high]>target){
	                high--;
	            }
	            else{
	                low++;
	            }
	        }
	        return ar;
	    }
	static boolean checksum(int[] ar,int sum) {
		int low=0;
		int high=ar.length-1;
		while(low<high) {
			if(ar[low]+ar[high]==sum) {
				return true;
			}
			else if(ar[low]+ar[high]>sum) {
				high--;
			}
			else {
				low++;
			}
		}
		return false;
	}
}
