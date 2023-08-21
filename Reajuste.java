import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de meses desde a admissão: ");
        int mesesAdmissao = scanner.nextInt();
        
        double reajuste = 0.0;
        
        if (mesesAdmissao < 12) {
            reajuste = salario * 0.05;
        } else if (mesesAdmissao >= 12 && mesesAdmissao <= 48) {
            reajuste = salario * 0.07;
        }
        
        if (reajuste > 0) {
            double novoSalario = salario + reajuste;
            System.out.printf("O funcionário receberá um reajuste de R$%.2f no salário.%n", reajuste);
            System.out.printf("O novo salário será R$%.2f.%n", novoSalario);
        } else {
            System.out.println("Não há reajuste para essa quantidade de meses de admissão.");
        }
        
        scanner.close();
    }
}
	


