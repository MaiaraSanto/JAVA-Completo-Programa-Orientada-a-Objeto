import java.util.Scanner;

public class Aula35 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
int n = input.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		input.close();

	}

}
