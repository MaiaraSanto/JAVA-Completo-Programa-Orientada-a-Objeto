import java.util.Scanner;

public class Aula24 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite o primeiro valor");
		x =input.nextInt();

		System.out.println("Digite o segundo valor");
		y =input.nextInt();
		
		while (x != y) {
			if (x<y) {
				System.out.println("CRESCENTE");
			}
			
			else {
				System.out.println("DECRESCENTE");
			}
			
			x = input.nextInt();
			y =input.nextInt();
			
			input.close();
		}

	}

}
