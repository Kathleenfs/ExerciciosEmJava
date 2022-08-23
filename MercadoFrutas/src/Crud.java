import java.util.ArrayList;
import java.util.Scanner;

public class Crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		String nomeDaFruta;
		int id, op2;
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		
		do {
		System.out.println("+++++++++++Menu+++++++++++");
		System.out.println("1 - Adicione uma fruta");
		System.out.println("2 - Mostrar Frutas cadastradas:");
		System.out.println("3 - Alterar nome da fruta selecionando o Id:");
		System.out.println("4 - sair");
		op = teclado.nextInt();
		
		switch(op){
		case 1:
			System.out.println("Quantas frutas deseja adicionar");
			op2 = teclado.nextInt();
			for(int contador = 0; contador < op2 ; contador++){
				System.out.println("Digite o nome da fruta que quer adicionar");
				nomeDaFruta = teclado.next();
				frutas.add(nomeDaFruta);
			};
			break;
		case 2:
			System.out.println("Essas são as frutas cadastradas"+frutas);
			break;
		case 3:
			System.out.println("Digite o id da fruta quer alterar o nome:");
			id = teclado.nextInt();
			System.out.println("Digite o novo nome da fruta:");
			nomeDaFruta = teclado.next();
			frutas.set(id, nomeDaFruta);
			System.out.println("Novo noem da fruta:"+frutas);
			break;
		case 4:
			System.out.println("Processo Finalizado");
			break;
			default:
			System.out.println("invalido");
		}
		}while(op!=0);
		}
	}
	


