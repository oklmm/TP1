/**
 * 
 */
/**
 * @author adinhrelja
 *
 */
package Racine;

public class Racine {
	private double precision;

	Racine(double precision) {
		this.precision = precision;
	}

	double racine(double operande) throws NegativeException {
		if (operande < 0) {
			throw new NegativeException("The number is negative");
		}

		double solution, carre, a, b;
		a = 0;
		b = operande;
		solution = (a + b) / 2;
		while (b - a > precision) {
			carre = solution * solution;
			if (carre > operande)
				b = solution;
			else
				a = solution;
			solution = (a + b) / 2;
		}
		return solution;
	}

	double getPrecision() {
		return precision;
	}

	void setPrecision(double precision) {
		this.precision = precision;
	}
}
