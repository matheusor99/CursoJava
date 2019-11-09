import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor que está nos intervalos  ([0,25], [26,50], (51,75], (76,100])");
		double valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25) {
			System.out.println("intervalo [0,25]");
		} else if (valor >= 26 && valor <= 50) {
			System.out.println("intervalo [26,50]");
		} else if (valor >= 51 && valor <= 75) {
			System.out.println("intervalo [51,75]");
		} else if (valor >= 76 && valor <= 100) {
			System.out.println("intervalo [76,100]");
		} else {
			System.out.println("Fora de Intervalo");
		}
	}
}
