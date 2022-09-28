import java.util.Scanner;

public class Aula34 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 int  n = input.nextInt();
		 
		 for (int i = 0; i < n; i++) {
			 int y = input.nextInt();
			 int x = input.nextInt();
			 if (y == 0) {
				System.out.println("Impossível dividir");
			}
			 
			 else {
				 double div = (double) y/x;
				 System.out.println(div);
			}
			
			}
		}

	}


