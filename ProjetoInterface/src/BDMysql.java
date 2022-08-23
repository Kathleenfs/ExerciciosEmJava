
public class BDMysql implements InterfaceBD {

	@Override
	public void conectar() {

		System.out.println("Connecting on Mysql....");

	}

	@Override
	public void desconectar() {
		System.out.println("Mysql disconnected....");

	}

	@Override
	public void executar(String comando) {
		System.out.println("Mysql"+comando);

	}

}
