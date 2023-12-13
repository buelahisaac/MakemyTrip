package constructor;

public class Constructor_Concepts {
	
	 Constructor_Concepts() {
		// this("parameterized constructor");
		 System.out.println("Default constructor");
		 
		}
	 
	 Constructor_Concepts(String name) {
		 System.out.println(name);
		
	 
	 private void normal() {
		System.out.println("normal method");

	}
	 

	public static void main(String[] args) {
		Constructor_Concepts b= new Constructor_Concepts();
		b.normal();
		

	}

}
