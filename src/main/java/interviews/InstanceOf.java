package interviews;

import java.util.Objects;

/**
* @author sachin
* @date 02-Sep-2021
*/

public class InstanceOf {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassA c = new ClassB();
		
		System.out.println("a instanceof ClassA : "+ (a instanceof ClassA));
		System.out.println("a instanceof ClassA : "+ (b instanceof ClassA));
		System.out.println("a instanceof ClassA : "+ (c instanceof ClassA));
		System.out.println("b instanceof ClassB : "+ (b instanceof ClassB));
		System.out.println("c instanceof ClassB : "+ (c instanceof ClassB));
		System.out.println("c instanceof Object : "+ (c instanceof Object));
		
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
		
		
		
	}

}

class ClassA {
	
}

class ClassB extends ClassA {
	
	int id;
	String name;
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassB other = (ClassB) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	

}

