package general;

/**
sachin
17-Aug-2021
*/

public class ConstructorChaining {

	public static void main(String[] args) {
		
			Cc c = new Cc();
			System.out.println("***************************************");
			Bb b = new Cc();
			System.out.println("***************************************");
			Aa a = new Cc();
			System.out.println("***************************************");
			Bb bb = new Bb();
	}
	
	

}

class Aa {
	Aa(){
		System.out.println("Aa's constructor");
	}
}

class Bb extends Aa {
	Bb(){
		System.out.println("Bb's constructor");
	}
}


class Cc extends Bb {
	Cc(){
		System.out.println("Cc's constructor");
	}
}


interface Interface1 {
	public static final int a = 0;
	String getData();
}

class myClass implements Interface1{

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "hellow";
	}
	
}


