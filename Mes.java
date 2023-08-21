import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar 10");
        System.out.println("2 - Subtrair 10");
        System.out.println("3 - Multiplicar por 10");
        System.out.println("4 - Dividir por 10");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                numero += 25;
                break;
            case 2:
                numero -= 25;
                break;
            case 3:
                numero *= 25;
                break;
            case 4:
                numero /= 25;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + numero);
    }
	{
	}

}
