import java.util.Scanner;
// import java.io.*;

public class Ti_Exercicio1 {

	public static void main(String[] args) {
		new soma();
	}
}

class soma {
	public soma() {
		try (Scanner input = new Scanner(System.in)) {
			int a, b;
			System.out.print("1 numero inteiro: ");
			a = input.nextInt();
			System.out.print("2 numero inteiro: ");
			b = input.nextInt();
			System.out.println(a + " + " + b + " = " + (a + b));
		}
	}
}