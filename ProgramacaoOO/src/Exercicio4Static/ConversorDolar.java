package Exercicio4Static;

public class ConversorDolar {

	public static double conversão(double dolar, double valor) {
		double preco = valor * dolar;
		double taxa = (preco * 6) / 100;  
		return preco + taxa;
	}
}
