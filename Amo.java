import java.util.Scanner;

public class Amo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double notaProva3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double notaExercicios = scanner.nextDouble();

        // Cálculo da média de aproveitamento:
        double mediaAproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        // Determinação do conceito:
        String conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Verificação e exibição do resultado:
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}
