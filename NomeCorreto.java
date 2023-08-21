import java.util.Scanner;

public class NomeCorreto {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			String str = input.next();
if(str.equals("Java"))	{
System.out.println("Java é demais");	
} else {	
System.out.println("Entrada Invalida");
}
		}
	
	}

}
