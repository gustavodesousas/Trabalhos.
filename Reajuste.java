import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de meses desde a admiss�o: ");
        int mesesAdmissao = scanner.nextInt();
        
        double reajuste = 0.0;
        
        if (mesesAdmissao < 12) {
            reajuste = salario * 0.05;
        } else if (mesesAdmissao >= 12 && mesesAdmissao <= 48) {
            reajuste = salario * 0.07;
        }
        
        if (reajuste > 0) {
            double novoSalario = salario + reajuste;
            System.out.printf("O funcion�rio receber� um reajuste de R$%.2f no sal�rio.%n", reajuste);
            System.out.printf("O novo sal�rio ser� R$%.2f.%n", novoSalario);
        } else {
            System.out.println("N�o h� reajuste para essa quantidade de meses de admiss�o.");
        }
        
        scanner.close();
    }
}
	


