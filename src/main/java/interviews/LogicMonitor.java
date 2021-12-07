package interviews;
import java.util.HashMap;
import java.util.Map;


/**
 * @author sachin
 * @date 28-Nov-2021
 */

public class LogicMonitor {

	public static void main(String[] args) {
		System.out.println("IV:"+convert("IV"));
		System.out.println("IX:"+convert("IX"));
		System.out.println("DCCXCIX:"+ convert("DCCXCIX"));
		int a =260;
		byte b =(byte) a;
		System.out.println(b);
		System.out.println();
		
		if (1+2 ==+ 3 + + + 5) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static int convert(String roman) {
		{
		    Map<Character,Integer> numbersMap = new HashMap<>();
		    numbersMap.put('I',1);
		    numbersMap.put('V',5);
		    numbersMap.put('X',10);
		    numbersMap.put('L',50);
		    numbersMap.put('C',100);   
		    numbersMap.put('D',500);   
		    numbersMap.put('M',1000);  
		        
		    int result=0;
		        
		    for(int i=0;i<roman.length();i++)
		    {
		      char ch = roman.charAt(i);      // Current Roman Character
		      
		      //Case 1
		      if(i>0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i-1)))
		      {
		        result += numbersMap.get(ch) - 2*numbersMap.get(roman.charAt(i-1));
		      }
		      
		      // Case 2: just add the corresponding number to result.
		      else
		        result += numbersMap.get(ch);
		    }
		        
		    return result;
		 }
	}

}
