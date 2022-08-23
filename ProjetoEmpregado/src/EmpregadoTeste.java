import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Empregados e1, e2; 
		
		String nome1, nome2;
		double salario1, salario2;
		
		System.out.println("Digite o nome do funcionário:");
		nome1 = teclado.nextLine();
		System.out.println("Digite o salario:");
		salario1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o nome do funcionário:");
		nome2 = teclado.nextLine();
		System.out.println("Digite o salario:");
		salario2 = Double.parseDouble(teclado.nextLine());
		
		
		e1 = new Empregados(nome1, salario1);
		e2 = new Empregados(nome2, salario2);
		
		
		System.out.println("Informações originais:");
		
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		e1.aumentarSalario(6.0);
		e2.aumentarSalario(10.0);
		
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		teclado.close();
		
	}

}
