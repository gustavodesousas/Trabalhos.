import java.util.Scanner;

public class Ana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do primeiro irm�o: ");
        int anoNascimento1 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do segundo irm�o: ");
        int anoNascimento2 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do terceiro irm�o: ");
        int anoNascimento3 = scanner.nextInt();

        if (anoNascimento1 == anoNascimento2 && anoNascimento2 == anoNascimento3) {
            System.out.println("Os irm�os s�o trig�meos.");
        } else if (anoNascimento1 == anoNascimento2 || anoNascimento1 == anoNascimento3 || anoNascimento2 == anoNascimento3) {
            System.out.println("Os irm�os s�o g�meos.");
        } else {
            System.out.println("Os irm�os s�o apenas irm�os.");
        }

        scanner.close();
    }
}
	


