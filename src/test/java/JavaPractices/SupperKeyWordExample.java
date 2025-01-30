package JavaPractices;
class ColorOld {

	String color = "Black";
	
	ColorOld(String str) {
		System.out.println("This is ColorOld class Constructer: " + str);
	}
	
	void show() {
		
		System.out.println("Parent class method");
	}
}

class ColorNew extends ColorOld {
	
	String color = "Red";
	
	ColorNew() {
		super("Black");
		System.out.println("This is ColorNew class Constructer");
	}
	
	void print() {
		System.out.println("New class Color : " + color); // Red
		System.out.println("Old class Color : " + super.color); // Black
		super.show();
	}
}
public class SupperKeyWordExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorNew cn = new ColorNew();
		cn.print();
		
	}

}
