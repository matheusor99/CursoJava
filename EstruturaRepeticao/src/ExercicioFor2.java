import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas vezes quer inserir um numero");
		int x = sc.nextInt();
		int input = 0;
		int output = 0;
		
		for(int i = 0; i < x; i ++) {
			System.out.println("digite o " + (i+1) + "° numero");
			int numero = sc.nextInt();
			if ( numero >= 10 && numero <=20 ) { 
				input++;
			} else {
				output++;
			}
		}
		
		System.out.println("dentro do intervalo de [10, 20], existem: \n"
				+ input + " numeros digitados dentro e "+ output + "fora");
	}
}
