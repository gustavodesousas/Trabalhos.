import java.util.Scanner;

public class JornadaDeTrabalhador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o n�mero de horas trabalhadas em um m�s: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        scanner.close();

        double horasRegulares = Math.min(horasTrabalhadas, 40); // Limita as horas regulares a 40
        double horasExtras = Math.max(horasTrabalhadas - 40, 0); // Horas acima de 40 s�o consideradas extras

        double salarioRegular = horasRegulares * valorPorHora;
        double salarioHoraExtra = horasExtras * valorPorHora * 1.5;
        double salarioTotal = salarioRegular + salarioHoraExtra;

        System.out.println("Sal�rio total do funcion�rio: R$" + salarioTotal);
    }

	}


