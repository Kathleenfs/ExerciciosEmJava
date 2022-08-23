package model;

public class Chefe extends Funcionario{
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficoTerno;
	

	public Chefe(int numRegistro, String nome, double salarioBase, double adicionalFuncao, double beneficoTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficoTerno = beneficoTerno;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficoTerno() {
		return beneficoTerno;
	}

	public void setBeneficoTerno(double beneficoTerno) {
		this.beneficoTerno = beneficoTerno;
	}

	@Override
	public double calcularSalario() {
		
		return salarioBase + salarioBase*adicionalFuncao/100+beneficoTerno;
	}
	
	
	
}
