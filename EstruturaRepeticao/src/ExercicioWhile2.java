import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cordenada x");
		int x = sc.nextInt();
		System.out.println("Digite a cordenada y");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if ( x < 0 && y > 0 ) {
				System.out.println("segundo");
			} else if ( x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 || y < 0) {
				System.out.println("quarto");
			}
			
			System.out.println("digite de novo o valor de x");
			x = sc.nextInt();
			System.out.println("digite de novo o valor de y");
			y = sc.nextInt();
		}
	}
}
