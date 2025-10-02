
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */

public class Polynomial {

	int arr[] = new int[10];


	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		while(degree >= arr.length){
			doubleCapacity();
		}
		this.arr[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0; i<arr.length; i++){
			if(arr[i] != 0){
				System.out.print(arr[i]+"x"+i +" ");
			}
		}
		System.out.println();
	}

	public void doubleCapacity(){
		int temp[] = this.arr;
		arr = new int[2*temp.length];
		for(int i=0; i<temp.length; i++){
			arr[i] = temp[i];
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial result = new Polynomial();
		int maxLen = Math.max(this.arr.length, p.arr.length);
while(result.arr.length < maxLen) {
result.doubleCapacity();
}
		if(p.arr.length > arr.length){
			doubleCapacity();
		}
       for(int i=0; i<arr.length; i++) {
			result.arr[i]= arr[i] + p.arr[i];
		}
		return  result;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial result = new Polynomial();
		int maxLen = Math.max(this.arr.length, p.arr.length);
while(result.arr.length < maxLen) {
result.doubleCapacity();
}
		if(p.arr.length > arr.length){
			doubleCapacity();
		}
for(int i=0; i<arr.length; i++) {
			result.arr[i]= arr[i] - p.arr[i];
		}
		return result;
			
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();
	 
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<p.arr.length; j++){
		while(i+j >= result.arr.length){
			result.doubleCapacity();
		}
result.arr[i+j]+= arr[i] * p.arr[j];
	}
			
		}
		return result;
	}

}