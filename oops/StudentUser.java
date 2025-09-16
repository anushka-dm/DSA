import java.util.Scanner;

public class StudentUser {

	// Object is instance of a class

	// Example
	// Scanner sc = new Scanner()

	// There scanner is a class and we are creating an object of that class, Same is
	// followed to create object of StudentClass

	public static void main(String[] args) {

		StudentClass s1 = new StudentClass();
		// S1 is the reference to the object created
		// S1 has the properties of StudentClass, since the value is not mentioned it
		// gets assigned to the default value
		// Default values are:
		// String - null
		// int - 0
		// float - 0.0
		// char - '\u0000'
		// boolean - false

		System.out.println(s1);
		// StudentClass@251a69d7

		// Values can be set here

		s1.name = "Anushka";

		s1.setRollNumber(123);
		System.out.println(s1.name + s1.getRollNumber());
	}

}
