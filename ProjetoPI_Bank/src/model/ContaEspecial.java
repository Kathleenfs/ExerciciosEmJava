package model;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
		
	}
	
	public double getLimite() {
		return limite;
	}
	@Override
	public boolean debitar(double valor) {
		if(super.saldo + this.limite>= valor) {
			super.saldo-= valor;
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		return super.toString()+"ContaEspecial [limite=" + limite + "]";
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	private double limite;



}
