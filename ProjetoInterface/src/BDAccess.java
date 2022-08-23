
public class BDAccess implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Connecting on Access....");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Access disconnected....");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Access"+comando);
		
	}

}
