package Exercicio1;

public class Retangulo {
	public double largura;
	public double altura;

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return 2 * (altura + largura);
	}

	public double diagonal() {
		return Math.pow(altura, 2) + Math.pow(largura, 2);
	}

	@Override
	public String toString() {
		return "valores de entrada de altura e largura: \n"+
				altura + "\n"+
				largura + "\n"+
				"AREA = " + area() + "\n"+
				"PERIMETRO = " + perimetro() + "\n" +
				"DIAGONAL = " + diagonal();
	}
}
