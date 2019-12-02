package ExercicioList;

public class Funcionario {
	private Long id;
	private String nome;
	private double salario;
	
	public Funcionario(Long id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += (salario*porcentagem) / 100;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "id = " + id + ", nome = " + nome + ", salario = " + salario;
	}
	
	
}
