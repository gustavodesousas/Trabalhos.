import java.util.Scanner;

public class JornadaDeTrabalhador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        scanner.close();

        double horasRegulares = Math.min(horasTrabalhadas, 40); // Limita as horas regulares a 40
        double horasExtras = Math.max(horasTrabalhadas - 40, 0); // Horas acima de 40 são consideradas extras

        double salarioRegular = horasRegulares * valorPorHora;
        double salarioHoraExtra = horasExtras * valorPorHora * 1.5;
        double salarioTotal = salarioRegular + salarioHoraExtra;

        System.out.println("Salário total do funcionário: R$" + salarioTotal);
    }

	}


