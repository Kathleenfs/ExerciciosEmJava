package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta("kath","34737473",654,1200.00);
		System.out.println(c1);
		Conta c2 = new ContaEspecial("kth","34737473",654,1200.00,3000);
		System.out.println(c2);

	}

}
