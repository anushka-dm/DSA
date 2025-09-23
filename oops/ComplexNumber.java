// Problem statement A ComplexNumber
// class contains
// two data members:
// one is
// the real

// part (R) and the other is imaginary (I) (both integers).

// Implement the Complex numbers class that contains following functions -

// 1. constructor
// You need to create the appropriate constructor.

// 2. plus -
// This function adds two given complex numbers and updates the first complex number.

// e.g.

// if C1 = 4 + i5 and C2 = 3 +i1
// C1.plus(C2) results in: 
// C1 = 7 + i6 and C2 = 3 + i1
// 3. multiply -
// This function multiplies two given complex numbers and updates the first complex number.

// e.g.

// if C1 = 4 + i5 and C2 = 1 + i2
// C1.multiply(C2) results in: 
// C1 = -6 + i13 and C2 = 1 + i2
// 4. print -
// This function prints the given complex number in the following format :

// a + ib
// Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

public class ComplexNumber {
	int real, imaginary;

	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;

	}

	public void print() {
		System.out.println(this.real + " " + "+" + " " + "i" + this.imaginary);
	}

	public void plus(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}

	public void multiply(ComplexNumber c2) {
		int newReal = this.real * c2.real - this.imaginary * c2.imaginary;
		int newImaginary = this.real * c2.imaginary + this.imaginary * c2.real;

		this.real = newReal;
		this.imaginary = newImaginary;
	}

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(1, 4);
		c1.print();

		ComplexNumber c2 = new ComplexNumber(2, 3);
		c2.print();

		c1.multiply(c2);
		c1.print();
	}
}
