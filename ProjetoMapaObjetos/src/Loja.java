import java.util.HashMap;

public class Loja {

	public static void main(String[] args) {
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		 mapa.put(1,new Produto(1,"Computador",1500.00));
		 mapa.put(2,new Produto(2,"Computador",1500.00));
		 mapa.put(3,new Produto(3,"Computador",1500.00));
		 mapa.put(4,new Produto(4,"Computador",1500.00));
		 
		 int codigoAbuscar = 2;
		 
		 Produto p = mapa.get(codigoAbuscar);
		 if(p!= null) {
			 System.out.println("Encotrei"+p);
			 
		 }else {
			 System.out.println("Não existe");
		 }
	}

}
