import java.util.Scanner;

public class CasalTresFilhos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do Marquinhos: ");
        int idadeMarquinhos = scanner.nextInt();

        System.out.print("Digite a idade do Zezinho: ");
        int idadeZezinho = scanner.nextInt();

        System.out.print("Digite a idade da Luluzinha: ");
        int idadeLuluzinha = scanner.nextInt();

        scanner.close();

        int maisVelho, irmaoDoMeio, caçula;

        // Determinando o mais velho
        if (idadeMarquinhos > idadeZezinho && idadeMarquinhos > idadeLuluzinha) {
            maisVelho = idadeMarquinhos;
        } else if (idadeZezinho > idadeLuluzinha) {
            maisVelho = idadeZezinho;
        } else {
            maisVelho = idadeLuluzinha;
        }

        // Determinando o irmão do meio
        if ((idadeMarquinhos > idadeZezinho && idadeMarquinhos < idadeLuluzinha) ||
            (idadeMarquinhos < idadeZezinho && idadeMarquinhos > idadeLuluzinha)) {
            irmaoDoMeio = idadeMarquinhos;
        } else if ((idadeZezinho > idadeMarquinhos && idadeZezinho < idadeLuluzinha) ||
                   (idadeZezinho < idadeMarquinhos && idadeZezinho > idadeLuluzinha)) {
            irmaoDoMeio = idadeZezinho;
        } else {
            irmaoDoMeio = idadeLuluzinha;
        }

        // Determinando o caçula
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            caçula = idadeMarquinhos;
        } else if (idadeZezinho < idadeLuluzinha) {
            caçula = idadeZezinho;
        } else {
            caçula = idadeLuluzinha;
        }

        System.out.println("Mais velho: " + maisVelho + " anos");
        System.out.println("Irmão do meio: " + irmaoDoMeio + " anos");
        System.out.println("Caçula: " + caçula + " anos");
    }

	}


