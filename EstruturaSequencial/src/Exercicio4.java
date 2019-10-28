import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o numero do funcionario");
		int numero = sc.nextInt();
		System.out.println("insira a quantidade de horas trabalhadas");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("insira o valor que ele recebe por hora");
		double salarioPorHora = sc.nextDouble();
		
		double salario = salarioPorHora * horasTrabalhadas;
		System.out.printf("NUMERO = "+ numero + ", SALARIO = %.2f", salario);
	}

}
