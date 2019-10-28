import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero");
		int A = sc.nextInt();
		
		System.out.println("digite o segundo numero");
		int B = sc.nextInt();
		
		System.out.println("digite o terceiro numero");
		int C = sc.nextInt();
		
		System.out.println("digite o quarto numero");
		int D = sc.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.println("DIFERENÇA = "+ diferenca);
	}
}
