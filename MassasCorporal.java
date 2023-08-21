import java.util.Scanner;

public class MassasCorporal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa (em kg): ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        scanner.close();

        double imc = massa / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25.0) {
            classificacao = "Saud�vel";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (m�rbida)";
        }

        System.out.println("Seu IMC �: " + imc);
        System.out.println("Classifica��o: " + classificacao);
    }

	}


