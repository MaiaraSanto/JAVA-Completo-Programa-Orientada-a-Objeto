import java.util.Scanner;

public class Aula31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N ;
		
		System.out.println(" Digite o valor");
		N  = input.nextInt();
		
		for (int i = 0; i <= N; i++) {
			if (i %2 != 0 ) {
				System.out.println(i);
			}
		}

	}

}
