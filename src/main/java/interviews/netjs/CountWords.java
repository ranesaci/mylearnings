package interviews.netjs;

public class CountWords {

	public static void main(String[] args) {
		String str = "Sachin Nina Rane Pune india 123	mh";
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (((i> 0) && (str.charAt(i-1) == ' ' || str.charAt(i-1) == '\t') && (str.charAt(i) != ' ' || str.charAt(i) != '\t')) ||
					((i==0) && (str.charAt(i) != ' ' || str.charAt(i) != '\t'))) {
				count++;
				
			}
		}
		System.out.println(count);
		System.out.println("using library:" + str.split("\\s+").length);

	}

}
