import java.util.Scanner;

public class IniciarJuego {

	static Scanner scanner = new Scanner(System.in);
	static int opcion = 0;

	public static void main(String args[]) {

		do {

			System.out.println("    \n           Carreras ");
			System.out.println("Terminos y condiciones del juego");
			System.out.println("Politicas de seguridad, te1rminos y contrato del juego\n");
			System.out.println("Aceptas lo terminos ");
			System.out.println("1) Si");
			System.out.println("2) No");
			System.out.print("Seleciona una opcion y luego presione Enter:  ");
			opcion = scanner.nextInt();

			if (opcion == 1) {
				new MenuPrincipal(); //
				break; //

			} else {
				System.out.println("Hasta pronto  (Y) ");
			}

		} while (opcion != 2); // un sistema repititivo con la condicion
		// de que no se precione el numero 2
	}

}
