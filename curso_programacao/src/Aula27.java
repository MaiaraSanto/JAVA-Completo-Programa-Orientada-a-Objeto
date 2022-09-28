import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Escreva o primeiro valor");
		x= input.nextInt();
		System.out.println("Escreva o segundo valor");
		y= input.nextInt();
		
		while (x!=0 && y!=0) {
			if (x ==2 && y ==2) {
				System.out.println("primeiro");
				
				x= input.nextInt();
				y = input.nextInt();
			}
			
			else if (x < 2 && y < 2) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			
			else {
				System.out.println("Quarto");
			}
			
			x= input.nextInt();
			y = input.nextInt();
			
			System.out.println("FIM DO PROGRAMA");
			
		}
		
		input.close();

	}

}
