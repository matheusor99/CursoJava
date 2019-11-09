import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CODIGO   ESPECIFICAÇÃO    PREÇO");
		System.out.println("  1      Cachorro Quente  R$ 4.00");
		System.out.println("  2      X-Salada         R$ 4.50");
		System.out.println("  3      X-Bacon          R$ 5.00");
		System.out.println("  4      Torrada Simples  R$ 2.00");
		System.out.println("  5      Refrigerante     R$ 1.50");
		
		double valor;
		
		System.out.println("Digite o codigo do produto");
		int codigo = sc.nextInt();
		
		System.out.println("Digite a quantos voce quer");
		int quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1:
			valor = 4.00 * quantidade;
			break;
		case 2:
			valor = 4.50 * quantidade;
			break;
		case 3:
			valor = 5.00 * quantidade;
			break;
		case 4:
			valor = 2.00 * quantidade;
			break;
		default:
			valor = 1.50 * quantidade;
			break;
		}
		
		System.out.println("Total: R$ "+ valor+"0");
	}
}
