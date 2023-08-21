import java.util.Scanner;

public class Truco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da primeira carta: ");
        int carta1 = scanner.nextInt();

        System.out.print("Digite o valor da segunda carta: ");
        int carta2 = scanner.nextInt();

        System.out.print("Digite o valor da terceira carta: ");
        int carta3 = scanner.nextInt();

        int contadorAS23 = 0;

        if (carta1 >= 1 && carta1 <= 3) {
            contadorAS23++;
        }
        if (carta2 >= 1 && carta2 <= 3) {
            contadorAS23++;
        }
        if (carta3 >= 1 && carta3 <= 3) {
            contadorAS23++;
        }

        if (contadorAS23 == 1) {
            System.out.println("TRUCO");
        } else if (contadorAS23 == 2) {
            System.out.println("SEIS");
        } else if (contadorAS23 == 3) {
            System.out.println("NOVE");
        }
    }

	}


