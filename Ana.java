import java.util.Scanner;

public class Ana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do primeiro irmão: ");
        int anoNascimento1 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do segundo irmão: ");
        int anoNascimento2 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do terceiro irmão: ");
        int anoNascimento3 = scanner.nextInt();

        if (anoNascimento1 == anoNascimento2 && anoNascimento2 == anoNascimento3) {
            System.out.println("Os irmãos são trigêmeos.");
        } else if (anoNascimento1 == anoNascimento2 || anoNascimento1 == anoNascimento3 || anoNascimento2 == anoNascimento3) {
            System.out.println("Os irmãos são gêmeos.");
        } else {
            System.out.println("Os irmãos são apenas irmãos.");
        }

        scanner.close();
    }
}
	


