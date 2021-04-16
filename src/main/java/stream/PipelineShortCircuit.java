/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * @author Sachin.Rane
 * Nov 14, 2019
 */
public class PipelineShortCircuit {

	public static void main(String[] args) {

		List<Employee1> emps = Arrays.asList(new Employee1("Sachin", "Pune"),
				new Employee1("Sachin1", "Mumbai1"),
				new Employee1("Sachin2", "Pune1"),
				new Employee1("Sachin3", "MalkaPur"),
				new Employee1("Sachin4", "Jalgaon"));
		
		emps.forEach(e -> {System.out.println(e.getName());});//iterate using foreach
		
		List<String> cities =  emps.stream()
					.filter(e -> { System.out.println("Filter Processing :"+e.getName());
						return e.getCity().contains("Pu"); })
					.limit(2) //this value shortcircuit and stop procesing furher records if value mtches
					.map(Employee1::getCity)
					.collect(toList());
		cities.forEach(System.out::println);//iterate using foreach
		
		
	}

}

class Employee1{
	String name, city;
	
	public Employee1(String name, String city) {
		this.name=name;
		this.city=city;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
}
