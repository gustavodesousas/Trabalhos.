import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = false;

        if (ano >= 1 && mes >= 1 && mes <= 12 && dia >= 1) {
            int ultimoDiaMes = obterUltimoDiaDoMes(mes, ano);

            if (dia <= ultimoDiaMes) {
                dataValida = true;
            }
        }

        if (dataValida) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data não é válida.");
        }
    }

    public static int obterUltimoDiaDoMes(int mes, int ano) {
        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return 29; 
            } else {
                return 28; 
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

  
	

}
