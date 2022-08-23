
public class Loja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p;
		p = new Produto(123,"Computador",2500.00);  // reserva(aloca)espaço na memória
		
		
		p.mostrarAnuncio();
		
		p.setPreco(99.0);
		p.mostrarAnuncio();
		p.aplicarDesconto(50);
		p.mostrarAnuncio();
		
		System.out.println("Simulando");
	
		System.out.println("O preço do"+p.getDescricao()+"com 15% de desconto fica"+p.simularDesconto(15));
		p.mostrarAnuncio();
	}

}
