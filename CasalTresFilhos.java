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

        int maisVelho, irmaoDoMeio, ca�ula;

        // Determinando o mais velho
        if (idadeMarquinhos > idadeZezinho && idadeMarquinhos > idadeLuluzinha) {
            maisVelho = idadeMarquinhos;
        } else if (idadeZezinho > idadeLuluzinha) {
            maisVelho = idadeZezinho;
        } else {
            maisVelho = idadeLuluzinha;
        }

        // Determinando o irm�o do meio
        if ((idadeMarquinhos > idadeZezinho && idadeMarquinhos < idadeLuluzinha) ||
            (idadeMarquinhos < idadeZezinho && idadeMarquinhos > idadeLuluzinha)) {
            irmaoDoMeio = idadeMarquinhos;
        } else if ((idadeZezinho > idadeMarquinhos && idadeZezinho < idadeLuluzinha) ||
                   (idadeZezinho < idadeMarquinhos && idadeZezinho > idadeLuluzinha)) {
            irmaoDoMeio = idadeZezinho;
        } else {
            irmaoDoMeio = idadeLuluzinha;
        }

        // Determinando o ca�ula
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            ca�ula = idadeMarquinhos;
        } else if (idadeZezinho < idadeLuluzinha) {
            ca�ula = idadeZezinho;
        } else {
            ca�ula = idadeLuluzinha;
        }

        System.out.println("Mais velho: " + maisVelho + " anos");
        System.out.println("Irm�o do meio: " + irmaoDoMeio + " anos");
        System.out.println("Ca�ula: " + ca�ula + " anos");
    }

	}


