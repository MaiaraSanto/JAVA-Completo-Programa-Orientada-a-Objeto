import java.util.Scanner;

public class Aula26 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int senha= 0;
		
		System.out.println("Digite um número");
		senha = input.nextInt();
		
		while (senha !=2002) {
			System.out.println("Senha Inválida");
			
			senha = input.nextInt();
		}
		
		System.out.println("Senha válida");
		
		input.close();

	}

}
