import java.util.Scanner;

public class circunferência {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("6 ");
			int A = scanner.nextInt();

			System.out.print("7: ");
			int B = scanner.nextInt();

			System.out.print("8: ");
			int C = scanner.nextInt();

			System.out.print("8 ");
			int D = scanner.nextInt();

			int diferenca = (A * B) - (C * D);

			System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
		}

        
		
		
	}

}
