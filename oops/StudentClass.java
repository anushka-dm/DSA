public class StudentClass {
	String name;
	int age;
	private int rollNumber;

	// Private varibles cant be accessed outside the class

	// we can use getter and setter to modified them, instead of settind it public coz we have control how its handelled 

	// getter fun

	public int getRollNumber() {
		return rollNumber;
	}

	// setter func
public int setRollNumber(int num){
	return rollNumber = num;
}
}
