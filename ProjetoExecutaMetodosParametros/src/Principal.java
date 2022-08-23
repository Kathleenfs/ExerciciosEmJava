import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, email;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do usuário:");
		nome = teclado.nextLine();
		
		System.out.println("Informe o seu email:");
		email = teclado.nextLine();
		
		System.out.println("Digite a idade do usuário:");
		idade = teclado.nextInt()
;		
		teclado.close();
		
		//chamando a nossa classe e enviando os paramentros ao metodo
		
		ProcessaMensagem executar = new ProcessaMensagem();
		executar.mensagem(nome, email, idade);
		
	}

}
