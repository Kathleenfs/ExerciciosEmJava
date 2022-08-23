import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		
		double n1, n2;
		int op;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		n1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número:");
		n2 = teclado.nextDouble();
		
		ProcessaCalculos executar = new ProcessaCalculos();
		
		do {
			System.out.println("+++++++++++Menu+++++++++++");
			System.out.println("1 - adição");
			System.out.println("2 - subtração");
			System.out.println("3 - divisão:");
			System.out.println("4 - multiplicação");
			op = teclado.nextInt();
			
			switch(op){
			case 1:
				executar.soma(n1,n2);
				break;
			case 2:
				executar.sub(n1,n2);
				break;
			case 3:
				executar.div(n1,n2);
				break;
			case 4:
				executar.mult(n1,n2);
				break;
				default:
				System.out.println("invalido");
			}
			}while(op!=0);
		
		teclado.close();
	}

}
