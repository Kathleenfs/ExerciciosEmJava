
public class AplicacaoQueUsaCalculo {

	public static void main(String[] args) {
		//situacao 1 - preciso chamar o metodo do objeto do jeto que ele é
		
		ObjetoQueCalcula o = new ObjetoQueCalcula();
		o.realizaAlgumCalculo();
		
		//situacao 2 - o modulo so calcula pelo metodo calcularValores()
		
		InterfaceModulo1 i1 = o;
		i1.calcularValores();
		//situacao 3 - o modulo y so consegue chamar  via metodo efetivarContas
		InterfaceModulo2 i2 = o;
		i2.efetivarContas();
	}

}
