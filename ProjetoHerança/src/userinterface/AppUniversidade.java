package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("kath","kath","45435");
		System.out.println(p.exibirInfo());
		System.out.println(p.exibirInfo());
		Estudante e = new Estudante("kath","kath","45435",4,"computação");
	
		System.out.println(e.exibirinfor());
		
		
		

	}

}
