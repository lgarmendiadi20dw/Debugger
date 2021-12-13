
public class Factorial {

	public void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("El factorial de " + n + " es " + fact);
	}

	public static void main(String[] args) {
		Factorial f1 = new Factorial();
		f1.factorial(6);

	}

}
