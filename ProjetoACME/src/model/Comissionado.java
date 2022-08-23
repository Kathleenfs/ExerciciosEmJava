package model;

public class Comissionado extends Funcionario {
	private double salarioBase;
	private float comissao;
	
	
	public Comissionado(int numRegistro, String nome, double salarioBase, float comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
