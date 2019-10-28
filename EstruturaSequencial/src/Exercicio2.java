import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		System.out.println("digite o raio do circulo");
		double raio = sc.nextDouble();
		double area = pi * (Math.pow(raio, 2));
		System.out.printf("%.4f", area);

	}

}
