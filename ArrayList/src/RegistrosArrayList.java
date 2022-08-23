import java.util.ArrayList;
public class RegistrosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("Pretolina");
		System.out.println(pessoas);
		
		// localizando um registro dentro do arrayList
		
		System.out.println(pessoas.get(1));
		
		// modificando um registro 
		
		pessoas.set(0, "raimunda");
		System.out.println(pessoas);
		
		// para excluir um registro dentro da estrutura
		
		pessoas.remove(3);
		System.out.println(pessoas);
	// contando a quantidade
		
		System.out.println(pessoas.size());
		
		for(int contador = 0; contador<pessoas.size(); contador++) {
			System.out.println(pessoas.get(contador));
		
		}
		
		for(String contador:pessoas) {
			System.out.println(contador);
		}
	}

}
