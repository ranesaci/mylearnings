package interviews;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import org.junit.Test;

/**
* @author sachin
* @date 09-Sep-2021
*/

public class RandomUniqueNumberGenerator {
	
	public static Set<Integer> getRandomUniqueIntegers(int offset, int highest) {
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		while (set.size() < (highest - offset)) {
			while (set.add(random.nextInt(highest - offset) + offset) == true) ;
		}
		return set;
	}
	//overloaded
	public static Set<Integer> getRandomUniqueIntegers(int highest) {
		return getRandomUniqueIntegers(1, highest);
	}
	
	public static Set<Integer> getRandomUniqueIntegersUsingMath(int offset, int highest) {
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < (highest - offset)) {
			while(set.add((int) (Math.random() * (highest - offset) + offset)) == true);
		}
		
		return set;
	}
 	
	@Test
	public void testUniqueRandomNumbersUsingMath() {
		System.out.println("using Math class:");
		getRandomUniqueIntegersUsingMath(4, 9).forEach(System.out::println);
	}
	
	@Test
	public void testGetRandomUniqueNumber() {
		getRandomUniqueIntegers(15).forEach(a -> System.out.println(a));
		System.out.println("Random unique numbers from 5 to 15");
		getRandomUniqueIntegers(5,15).forEach(a -> System.out.println(a));
		System.out.println("using ThreadLocal:");
		/*
		 * ThreadLocalRandom.current().ints(3, 6)
		 * .distinct().limit(5).forEach(System.out::println);
		 */
		
		//System.out.println("using random ints");
		
		//new Random().ints(2,7).forEach(System.out::println);
		assertTrue(true);
	}
	
	@Test
	public void testM1() {
		assertTrue(true);
	}
}


