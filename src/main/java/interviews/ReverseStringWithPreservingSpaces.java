package interviews;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
* @author sachin
* @date 07-Sep-2021
*/

public class ReverseStringWithPreservingSpaces {
	
	@Test
	public void testReverseStringWithSameSpaces() {
		assertEquals("544431 enaR aniN n ih caS", 
				reverseStringWithSameSpaces("Sachin Nina Rane 1 34 445"));
	}

	public String reverseStringWithSameSpaces(String string) {
		
		char[] resultArray = new char[string.length()];
		
		//add spaces
		for (int i = 0; i < resultArray.length; i++) {
			if (string.charAt(i) == ' ') {
				resultArray[i] = ' ';
			}
		}
		
		//add string in reverse order
		int j = string.length() - 1;
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i) != ' ') {
				
				if (resultArray[j] == ' ') {
					j--; //already added 
				}
				
				resultArray[j--] = string.charAt(i);
				
			}
			
		}
		
		return new String(resultArray);
	}

}


