import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o primeiro numero");
		int n1 = sc.nextInt();
		System.out.println("insira o segundo numero");
		int n2 = sc.nextInt();
		int resultado = n1+n2;
		
		System.out.println(n1 + " + " + n2 +" = "+ resultado);
	}
}
