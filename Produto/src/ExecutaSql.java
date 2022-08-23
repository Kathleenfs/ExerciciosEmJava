
public class ExecutaSql {
	public static void main(String[] args) {
	BancoDeDados sintaxeBanco = new BancoDeDados();
	sintaxeBanco.conectar();
	
	if(sintaxeBanco.estaConectado()) {
		
		sintaxeBanco.listaProdutos();
		System.out.println("Conexão realizada");
	}
	else
		System.out.println("Conexao não realizado");

}
	
}





