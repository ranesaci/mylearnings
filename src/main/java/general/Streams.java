package general;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.rangeClosed(1, 1000).parallel().mapToObj(Employee::new)
		.forEach(e -> System.out.println("Employee created:" + e.toString()));
		//empList.forEach(e -> System.out.println("Employee created:" + e.toString()));;
		
	}

}

class Employee {
	int i;
	public Employee(int i) {
		this.i = i;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
	
	
}
