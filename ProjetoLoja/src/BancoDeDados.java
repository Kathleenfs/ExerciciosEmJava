import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null;
	
		public void conectar() {
			String servidor = "jdbc:mysql://localhost/ProjetoIBM";
			String usuario = "root";
			String senha = "@k95#t94";
			
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
			
			
	//********************************METODOS CLIENTES**********************************************
		
			
			//*******************************METODOS PRODUTOS********************************************/
			public void listarProduto() {
				try {
					String query = "select * from produto";
					this.resultset = this.statement.executeQuery(query);
					this.statement = this.connection.createStatement();
					
					while(this.resultset.next()) {
						
						String meuId = resultset.getString("id_produto");
						String meuNome = resultset.getString("nome_produto");
						String meuPreco = resultset.getString("preco_produto");
						String mGenerico = resultset.getString("generico");
						String mDescricao = resultset.getString("desc_produto");
		
						
						System.out.println("id: "+meuId);
						System.out.println("Nome:"+meuNome);
						System.out.println("Preco:"+meuPreco);
						System.out.println("Generico: "+mGenerico);
						System.out.println("Descricao:"+mDescricao);
					
					}
				}catch(Exception e) {
					System.out.println("ERROR"+e.getMessage());
				}
			}

			public void inserirProduto(String nome, String preco,String qtd,String generico,String descricao) {

				try {
					String query="insert into produto(nome_produto ,preco_produto, qtd_produto ,generico, desc_produto) values('"+nome+"','"+preco+"','"+qtd+"','"+generico+"','"+descricao+"')";
					System.out.println(query);
					this.statement.executeUpdate(query);
				}catch(Exception e) {
					System.out.println("Error"+e.getMessage());
				}
			}

			public void editarProduto(String nome, String preco,String qtd,String generico,String descricao,String id) {
				try {
					String query = "update produto set nome_produto='"+nome+"', preco_produto='"+preco+"',qtd_produto='"+qtd+"',generico='"+generico+"',desc_produto='"+descricao+"' where id_produto="+id+";";
					System.out.println(query);
					this.statement.executeUpdate(query);
				}catch(Exception e) {
					System.out.println("Error"+e.getMessage());
				}
			}
			
			public void excluirProduto(String id) {

				try {
					String query = "delete from produto where id_produto="+id+";";
		
					System.out.println(query);
					this.statement.executeUpdate(query);
				}catch(Exception e) {
					System.out.println("Error"+e.getMessage());
				}
	
			}
	}