package motorizzazione;

public class Persona {
	private String nome;
	private String CF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	
	public Persona(String nome, String cF) {
		super();
		this.nome = nome;
		CF = cF;
	}
	
	@Override
	public String toString() {
		return "Auto [nome=" + nome + ", CF=" + CF + "]";
	}
}
