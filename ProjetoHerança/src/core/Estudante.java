package core;

public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	public Estudante(String nome, String email, String telefone, int numMat, String curso) {
		super(nome,email,telefone);
		this.numeroMatricula = numMat;
		this.curso = curso;
		
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String exibirinfor() {
		return super.nome+"/"+super.email+"/"+super.telefone+"/"+numeroMatricula+"/"+curso;
	}
}
