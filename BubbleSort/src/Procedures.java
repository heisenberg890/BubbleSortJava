import java.util.Arrays;

public class Procedures {
	private String finale = "";
	private int[] sortedArray;
	
	
	
	
	public Procedures() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void troubleSort(int[] A) {
		
		long start = System.currentTimeMillis();
		long end = 0;
		long total = 0;
		
		
		int temp = 0;
		
		int n = A.length;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for(int i = 1; i <= n-1; i++) {
				if (A[i-1] > A[i]) {


					temp = A[i-1];
		             A[i-1] = A[i];
		             A[i] = temp;
					
					
					swapped = true;
				}//endif
			}//endfor
			
			n = n - 1;
			
			
			
		}//endWhile
		sortedArray = A;
		
		for(int i = 0; i < sortedArray.length; i++) {
			finale += sortedArray[i] + "\n";
//			System.out.println(sortedArray[i]);
		}
		
		//find the final count
		end = System.currentTimeMillis();
		total = end - start;
		String s = String.format("Duration = %d ms", total);
		System.out.println(s + "\n");
		
	}//end Method
	
	public void SortMe(int[] list) {
		
		long start = System.currentTimeMillis();
		long end = 0;
		long total = 0;
		
		Arrays.sort(list);
		
		
		end = System.currentTimeMillis();
		total = end - start;
		String s = String.format("Duration = %d ms", total);
		System.out.println(s + "\n");
		
		
		
	}

	
	public String ToString() {
		return finale;
	}

}
