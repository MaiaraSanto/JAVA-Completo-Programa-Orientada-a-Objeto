import java.util.Scanner;

public class Aula37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n =  input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int p = i;
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		input.close();
			
		}

	}


