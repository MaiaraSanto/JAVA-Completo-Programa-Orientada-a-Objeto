import java.util.Scanner;

public class Aulaa17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int cod;
		
		System.out.println("Digite um número");
		cod= input.nextInt();
		
		if (cod ==1) {
			
				System.out.println("O cahorro Quente será será 4.00");
		}
		
		else if (cod ==2) {
			System.out.println("O preço do X-salada será 4.50");
		}
		else if (cod ==3) {
			System.out.println("O preço do X-bacon será 5.00");
		}
		else if (cod ==4) {
			System.out.println("O preço da torrada simples 2.00");
		}
		else  {
			System.out.println("O preço do refrigerante será será 1.00");
		}
		
		input.close();
			
	}
	
	}


