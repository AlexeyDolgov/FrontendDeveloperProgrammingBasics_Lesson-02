package task2;

public class QuadraticEquation {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		double x1;
		double x2;

		a = 1;
		b = 0;
		c = -9;

		if (a == 0) {
			System.out.println("Это не квадратное уравнение!");
		}

		else {
			System.out.println(a + "x^2+" + b + "x+" + c + "=0");

			d = b * b - 4 * a * c;

			System.out.println("D=" + d);

			if (d > 0) {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.println("Корни уравнения:");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			} else if (d == 0) {
				x1 = -b / (2 * a);
				System.out.println("Корни уравнения:");
				System.out.println("x1=x2=" + x1);
			} else {
				System.out.println("Дискриминант меньше нуля, корней нет!");
			}
		}
	}
}