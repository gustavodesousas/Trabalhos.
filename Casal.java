import java.util.Scanner;

public class Casal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        
        String categoria;

        if (idade >= 5 && idade <= 7) {
            categoria = "pré-mirim";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "mirim";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "infantil";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "infanto-juvenil";
        } else if (idade >= 18 && idade <= 20) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }

        System.out.println("O nadador pertence à categoria: " + categoria);

        scanner.close();
    }
}

