import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numero = sc.nextDouble();
		
		if( numero % 2 == 0 ) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}

}
