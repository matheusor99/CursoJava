import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 1 e 1000");
		int numero = sc.nextInt();
		
		while (numero < 1 || numero > 1000) {
			System.out.println("Digite um numero entre 1 e 1000");
			numero = sc.nextInt();
		}
		
		System.out.println("Numeros impares até o "+ numero);
		for (int i = 1; i <= numero; i++) {
			if( i % 2 != 0 ) {
				System.out.println(i);
			}
		}
	}
}
