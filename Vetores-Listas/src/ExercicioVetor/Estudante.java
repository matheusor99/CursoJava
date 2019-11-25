package ExercicioVetor;

public class Estudante {
	private String nome;
	private String email;
	private int numeroQuarto;
	
	public Estudante(String nome, String email, int numeroQuarto) {
		this.nome = nome;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return nome + ", " + email;
	}
}
