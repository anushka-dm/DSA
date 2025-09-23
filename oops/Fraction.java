
public class Fraction {

	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {

		if (denominator <= 0) {
			return;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simpliyfy();
	}

	public void simpliyfy() {
		int gdc = 1;
		int smaller = Math.min(numerator, denominator);

		for (int i = 2; i <= smaller; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gdc = i;
			}
		}

		numerator = numerator / gdc;
		denominator = denominator / gdc;
	}

	public void increment() {
		numerator = numerator + denominator;
		simpliyfy();
	}

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumberator(int num) {
		this.numerator = num;
		simpliyfy();
	}

	public void setDenominatior(int num) {
		if (num <= 0) {
			return;
			// need to thow error
		}
		this.denominator = num;
		simpliyfy();
	}

	// add 2 franctions

	public void add(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simpliyfy();
	}

	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDen = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum, newDen);
		return f3;
	}

}
