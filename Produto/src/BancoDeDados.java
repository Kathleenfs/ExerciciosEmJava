import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null;
	
		public void conectar() {
			String servidor = "jdbc:mysql://localhost/ibm";
			String usuario = "root";
			String senha = "@k95#t94";
			//vinculando o drive de conexao
			
			String driver="com.mysql.cj.jdbc.Driver";
			
			try {
				Class.forName(driver);
				this.connection=DriverManager.getConnection(servidor,usuario,senha);
				this.statement=this.connection.createStatement();
				
			}catch (Exception e) {
				System.out.println("Erro:"+e.getMessage());
			}
		}
			public boolean estaConectado() {
				if(this.connection !=null) {
					return true;
				}else {
					return false;
				}
			}
			
			//criando um metodo pra vizualiar os registros do banco de dados 
			
			public void listaProdutos() {
				//criando o processo de tratamento
				
				try {
					//criando uma variavel para a sintaxe em sql
					
					String query = "select * from produtos";
					this.resultset = this.statement.executeQuery(query);
					this.statement = this.connection.createStatement();
					//criando um laço de repetição
					
					while(this.resultset.next()) {
						//criando as variaveis para receber os registros do banco de dados
						String meuId = resultset.getString("id__produto");
						String meuNome = resultset.getString("nome_produto");
						// mostrando os registro encontrados
						
						System.out.println("id: "+meuId);
						System.out.println("Nome:"+meuNome);
					}
				}catch(Exception e) {
					System.out.println("ERROR"+e.getMessage());
				}
			}
}