import java.util.Scanner;

public class Xy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada X do ponto: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a coordenada Y do ponto: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quarto quadrante.");
        } else if (x == 0 && y != 0) {
            System.out.println("O ponto está sobre o eixo Y.");
        } else if (x != 0 && y == 0) {
            System.out.println("O ponto está sobre o eixo X.");
        } else {
            System.out.println("O ponto está na origem.");
        }
    }

	}


