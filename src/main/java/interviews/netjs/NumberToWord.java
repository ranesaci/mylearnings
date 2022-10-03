package interviews.netjs;

public class NumberToWord {
	 public static String[] OneToNine = {
			 "",
			 "One",
			 "Two",
			 "Three",
			 "Four",
			 "Five",
			 "Six",
			 "Seven",
			 "Eight",
			 "Nine",
	 };
	 public static String[] TenTONineteen = {
			 "Ten",
			 "Eleven",
			 "Twelve",
			 "Thirteen",
			 "Fourteen",
			 "Fifteen",
			 "Sixteen",
			 "Seventeen",
			 "Eighteen",
			 "Nineteen",
	 };
	 public static String[] TenMultiples = {
			 "",
			 "Ten",
			 "Twenty",
			 "Thirty",
			 "Fourty",
			 "Fifty",
			 "Sixty",
			 "Seventy",
			 "Eighty",
			 "Ninety",
	 };
	 public static String[] ThousandRanges = {
			 "",
			 "Thousand",
			 "Lakhs",
			
	 };

	public static void main(String[] args) {
		int number = 1234567;
		int index = 0;
		
		String word = "";
			while(number > 0) {
				int num = number%1000;
				if (num != 0) {
					System.out.println(num);
					String data = getWord(num);
					word = data +" "+ ThousandRanges[index] + " "+ word;
				}
				
				index++;
				number /=1000;
			}
			
		
		System.out.println(word);
		
		
		

	}

	
	
	public static String getWord(int num) {
		String word = "";
		int number = num %100;
		if (number < 10) {
			word = OneToNine[number];
		} else if (number < 20) {
			word = TenTONineteen[number%10];
		} else {
			word = TenMultiples[number/10]+ " " + OneToNine[number%10];
		}
		if (num/100 > 0) {
			word = OneToNine[num/100] + " Hundred " + word;
		} 
		
		
		
		return word;
	}

}
