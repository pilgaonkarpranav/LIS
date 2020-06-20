
public class LongestIncreasingSubsequence {
	public static void main(String args[]) {
		int max = Integer.MIN_VALUE;
		int arr[] = {50, 3, 10, 7, 40, 80};
		int aux[] = new int[arr.length];
		for(int i=0;i<aux.length;i++) {
			aux[i] = 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					aux[i]=Math.max(aux[i], aux[j]+1);
				}
			}
		}
		
		for(int i=0;i<aux.length;i++) {
			if(aux[i]>max) {
				max = aux[i];
			}
		}
		
		System.out.println(max);
	}
}
