
public class Agenda {

	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			
			sintaxeBanco.editarContatos("adroaldo","1");
			sintaxeBanco.excluirContatos("5");
			
			//chamando a classe e ometodo para inserir os registro
			
			sintaxeBanco.inserirContatos("Kathleen ferreira","0876446");
			
			//chamando a classe e o meto para listar os registros select com crud
			sintaxeBanco.listaContatos();
			System.out.println("Conexão realizada");
		}
		else
			System.out.println("Conexao não realizado");

	}

}
