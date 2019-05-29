import java.util.Random;

public class BubbleSort {
	
//	public long start = System.currentTimeMillis();
//	public long end = 0;
//	public long total = 0;

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a new random class element
		Random randomNumbers = new Random();
		
		//create a multitude of integer arrays and populate them with random numbers
		int[] oneHundred = new int[101];
		int[] oneThousand = new int[1001];
		int[] tenThousand = new int[10001];
		int[] twentyFiveThousand = new int[25001];
		int[] fiftyThousand = new int[50001];
		int[] oneHundredThousand = new int[100_001];
		int[] twoHundredFiftyThousand = new int[200_001];
		int[] fiveHundredThousand = new int[500_001];
		int[] sevenHundredFiftyThousand = new int[750_001];
		int[] oneMillion = new int[1_000_001];
		
		
		//One hundred elements
		for(int i = 0; i < oneHundred.length; i++) {
			oneHundred[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p = new Procedures();	
		System.out.println("One Hundred Elements Sorted with Custom Sort\n");
		p.troubleSort(oneHundred);
		System.out.println("One Hundred Elements Sorted with Built-in Sort\n");
		p.SortMe(oneHundred);
		//end One Hundred Elements
		
		
		
		
		//oneThousand elements
		for(int i = 0; i < oneThousand.length; i++) {
			oneThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p1 = new Procedures();	
		System.out.println("One Thousand Elements Sorted with Custom Sort\n");
		p1.troubleSort(oneThousand);
		System.out.println("One Thousand Elements Sorted with Built-in Sort\n");
		p1.SortMe(oneThousand);
		//end oneThousand Elements
		
		
		
		//tenThousand elements
		for(int i = 0; i < tenThousand.length; i++) {
			tenThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p2 = new Procedures();	
		System.out.println("tenThousand Elements Sorted with Custom Sort\n");
		p2.troubleSort(tenThousand);
		System.out.println("tenThousand Elements Sorted with Built-in Sort\n");
		p2.SortMe(tenThousand);
		//end tenThousand Elements
		
		
		//twentyFiveThousand elements
		for(int i = 0; i < twentyFiveThousand.length; i++) {
			twentyFiveThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p3 = new Procedures();	
		System.out.println("twentyFiveThousand Elements Sorted with Custom Sort\n");
		p3.troubleSort(twentyFiveThousand);
		System.out.println("twentyFiveThousand Elements Sorted with Built-in Sort\n");
		p3.SortMe(twentyFiveThousand);
		//end twentyFiveThousand Elements
		
		
		
		//fiftyThousand elements
		for(int i = 0; i < fiftyThousand.length; i++) {
			fiftyThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p4 = new Procedures();	
		System.out.println("fiftyThousand Elements Sorted with Custom Sort\n");
		p4.troubleSort(fiftyThousand);
		System.out.println("fiftyThousand Elements Sorted with Built-in Sort\n");
		p4.SortMe(fiftyThousand);
		//end fiftyThousand Elements
		
		
		
		//oneHundredThousand elements
		for(int i = 0; i < oneHundredThousand.length; i++) {
			oneHundredThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p5 = new Procedures();	
		System.out.println("oneHundredThousand Elements Sorted with Custom Sort\n");
		p5.troubleSort(oneHundredThousand);
		System.out.println("oneHundredThousand Elements Sorted with Built-in Sort\n");
		p5.SortMe(oneHundredThousand);
		//end oneHundredThousand Elements
		
		
		
		//twoHundredFiftyThousand elements
		for(int i = 0; i < twoHundredFiftyThousand.length; i++) {
			twoHundredFiftyThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p6 = new Procedures();	
		System.out.println("twoHundredFiftyThousand Elements Sorted with Custom Sort\n");
		p6.troubleSort(twoHundredFiftyThousand);
		System.out.println("twoHundredFiftyThousand Elements Sorted with Built-in Sort\n");
		p6.SortMe(twoHundredFiftyThousand);
		//end twoHundredFiftyThousand Elements
		
		
		//fiveHundredThousand elements
		for(int i = 0; i < fiveHundredThousand.length; i++) {
			fiveHundredThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p7 = new Procedures();	
		System.out.println("fiveHundredThousand Elements Sorted with Custom Sort\n");
		p7.troubleSort(fiveHundredThousand);
		System.out.println("fiveHundredThousand Elements Sorted with Built-in Sort\n");
		p7.SortMe(fiveHundredThousand);
		//end fiveHundredThousand Elements
		
		
		//sevenHundredFiftyThousand elements
		for(int i = 0; i < sevenHundredFiftyThousand.length; i++) {
			sevenHundredFiftyThousand[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p8 = new Procedures();	
		System.out.println("sevenHundredFiftyThousand Elements Sorted with Custom Sort\n");
		p8.troubleSort(sevenHundredFiftyThousand);
		System.out.println("sevenHundredFiftyThousandElements Sorted with Built-in Sort\n");
		p8.SortMe(sevenHundredFiftyThousand);
		//end sevenHundredFiftyThousand Elements
		
		
		
		//oneMillion elements
		for(int i = 0; i < oneMillion.length; i++) {
			oneMillion[i] = randomNumbers.nextInt(1000000);
		}
		Procedures p9 = new Procedures();	
		System.out.println("oneMillion Elements Sorted with Custom Sort\n");
		p9.troubleSort(oneMillion);
		System.out.println("oneMillion Elements Sorted with Built-in Sort\n");
		p9.SortMe(oneMillion);
		//end oneMillion Elements
		
		
//		System.out.println(p.ToString());
		

	}//end main method

}//end Bubblesort class
