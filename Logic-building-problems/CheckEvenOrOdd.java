public class CheckEvenOrOdd {

// By Finding the Remainder - O(1) Time and O(1) Space

	public static boolean checkEvenOrOdd(int num){
		if(num%2 == 0){
			return true;
		}
		return false;
	}

	
//  Using Bitwise AND Operator - O(1) Time and O(1) Space

// Bitwise operators are extremely fast and efficient because they operate directly at the binary level, making them significantly faster than arithmetic or logical operations

	public static boolean checkEvenOptimized(int num2){
		if((num2 & 1) == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Remainder method => " + " " + checkEvenOrOdd(121 ));
		System.out.println("Using bitwise operator => " + " " +  checkEvenOptimized(51));
	}
}