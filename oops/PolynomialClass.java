// Implement a polynomial class,that contains following functions-

// 1. setCoefficient-This function sets coefficient for a particular degree value.If term with given degree is not there in the polynomial,then corresponding term(with specified degree and value)is added.If the term is already present in the polynomial,then previous coefficient value is replaced by given coefficient value.

// 2. add-Adds two polynomials and returns a new polynomial which has the result.

// 3. subtract-Subtracts two polynomials and returns a new polynomial which has the result.

// 4. multiply-Multiplies two polynomials and returns a new polynomial which has the result.

// 5. print-Prints all the terms(only terms with non zero coefficients are to be printed)in increasing order of degree.

// Print pattern for a single term:"x"

// And multiple terms should be printed separated by space.For more clarity,refer sample test cases.

// Note:Only keep those terms which have non-zero coefficients.

public class PolynomialClass {

	private int data[];

	public PolynomialClass() {
		data = new int[5];
		int lastIdx = 0;
	}

	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];

		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public void setCoefficient(int degree, int coefficient) {
		if (degree >= data.length) {
			doubleCapacity();
		}
		data[degree] = coefficient;
	}

	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "X^" + i + " " + "+ ");

		}
		System.out.println();
	}

	public void add(PolynomialClass p2) {
		int maxLen = Math.max(this.data.length, p2.data.length);
		Polynomial result = new Polynomial();
		while (result.arr.length < maxLen) {
			result.doubleCapacity();
		}
	

		for (int i = 0; i < data.length; i++) {
			result.arr[i] = data[i] + p2.data[i];
		}
	}

	public PolynomialClass subtract(PolynomialClass p) {
		PolynomialClass result = new PolynomialClass();
		int maxLen = Math.max(this.data.length, p.data.length);
		while (result.data.length < maxLen) {
			result.doubleCapacity();
		}
		if (p.data.length > data.length) {
			doubleCapacity();
		}
		for (int i = 0; i < data.length; i++) {
			result.data[i] = data[i] - p.data[i];
		}
		return result;

	}	

	// public void multiplies(PolynomialClass p2) {
	// 	int p2Data[] = p2.data;
	// 	// The degree of product = sum of max degrees
	// 	int[] result = new int[this.data.length + p2Data.length - 1];

	// 	for (int i = 0; i < data.length; i++) {
	// 		for (int j = 0; j < p2Data.length; j++) {
	// 			result[i + j] += data[i] * p2Data[j];
	// 		}
	// 	}

	// 	this.data = result;
	public PolynomialClass multiply(PolynomialClass p) {
		PolynomialClass result = new PolynomialClass();

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < p.data.length; j++) {
				while (i + j >= result.data.length) {
					result.doubleCapacity();
				}
				result.data[i + j] += data[i] * p.data[j];
			}

		}
		return result;
	}
	

	public static void main(String[] args) {
		PolynomialClass p1 = new PolynomialClass();
		PolynomialClass p2 = new PolynomialClass();

		p1.setCoefficient(2, 05);
		p1.setCoefficient(0, 1);
		p1.setCoefficient(2, 11);
		p2.setCoefficient(1, 05);
		p1.print();
		p2.print();
		
		p1.add(p2);
		p1.print();
		p1.multiply(p2);
		p1.print();

	}

}
