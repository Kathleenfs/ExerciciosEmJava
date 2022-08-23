
public class MeuSitema {
	public static void main(String[] args){
		InterfaceBD ibd;// declarando uma interface
		
		//ibd = new BDAccess(); //instanciando um objeto
		
		ibd = new BDMysql();
		
		//vou conectar ao banco
		ibd.conectar();
		//vou recuperar dados
		ibd.executar("Select * FROM tb_cliente");;
		//vou desconectar
		ibd.desconectar();
		}
}
