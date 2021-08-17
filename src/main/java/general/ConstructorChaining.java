package general;

/**
sachin
17-Aug-2021
*/

public class ConstructorChaining {

	public static void main(String[] args) {
		
			Cc c = new Cc();
			System.out.println("***************************************8");
			Bb b = new Cc();
			System.out.println("***************************************8");
			Aa a = new Cc();
			System.out.println("***************************************8");
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



