import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cliente extends BancoDeDados {
	
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null; 
	
	public void listarClientes() {
		try {
			String query = "select * from cliente";
			this.conectar();
			PreparedStatement pstm = connection.prepareStatement(query);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				String meuId = rs.getString("id_cliente");
				String meuNome = rs.getString("nome_cliente");
				String meuCpf = rs.getString("cpf_cliente");
				String meuTel = rs.getString("tel_cliente");
				String meuEmail = rs.getString("email_cliente");
				String meuEndereco = rs.getString("endereco_cliente");
				
				System.out.println("id: "+meuId);
				System.out.println("Nome:"+meuNome);
				System.out.println("Cpf:"+meuCpf);
				System.out.println("telefone: "+meuTel);
				System.out.println("Email:"+meuEmail);
				System.out.println("Endereco:"+meuEndereco);
				
				
			}
		}catch(Exception e) {
			System.out.println("ERROR"+e.getMessage());
		}
	}

	public void inserirCliente(String nome, String cpf,String telefone,String email,String endereco) {

		try {
			String query="insert into cliente(nome_cliente ,cpf_cliente, tel_cliente,email_cliente, endereco_cliente) values('"+nome+"','"+cpf+"','"+telefone+"','"+email+"','"+endereco+"')";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
		}
	}

	public void editarCliente(String nome, String cpf,String telefone,String email,String endereco,String id) {
		try {
			String query = "update cliente set nome_cliente='"+nome+"', cpf_cliente='"+cpf+"',tel_cliente='"+telefone+"',email_cliente='"+email+"',endereco_cliente='"+endereco+"' where id_cliente="+id+";";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
		}
	}
	
	public void excluirCliente(String id) {

		try {
			String query = "delete from cliente where id_cliente="+id+";";

			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
		}

	}

}
