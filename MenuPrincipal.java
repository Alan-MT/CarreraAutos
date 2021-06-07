import java.util.Scanner;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);
    private int opcion; // para el Scanner
    private Jugador jugador; // Creo el objeto para podes hacer los llamados
    private Garage garage;
    private Auto auto;
    public static final String ANSI_RESET = "\u001B[0m";
    // Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GRAY = "\u001B[38m";
    // Colores de fondo
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public MenuPrincipal() {
        jugador = new Jugador(); // es un constructor sin parametros para enviarlo
        auto = new Auto();
        garage = new Garage();
        garage.carros();
        this.Menu(); // enviarlo al metodo que esta abajo
    }

    public void Menu() {

        while (opcion != 6) {

            jugador.informacionDelJuego(); // llamo al metodo que esta en jugador cuando se
            // se ingreso lo datos

            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "-------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|  Bienvenido a este juegos de carreras    |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "-------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|            Menu Principal                |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|------------------------------------------|" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|          Seleccione una opcion           |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|------------------------------------------|" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       1.  Competir                       |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       2.  Ruleta                         |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       3.  Garage                         |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       4.  Pistas                         |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       5.  Estadisticas y Reportes        |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "|       6.  Salir                          |" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "--------------------------------------------" + ANSI_RESET);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    new Rival(jugador, garage, auto);

                    break;
                case 2:
                    Ruleta ingreso = new Ruleta();
                    ingreso.suerte(jugador); // le ingrese el objeto dentro del jugador
                    // para que las opciones y variables de la clase jugador vayan

                    break;

                case 3:
                    garage.opciones(jugador);

                    break;

                case 4:

                    new Pistas();

                    break;

                case 5:

                    break;
            }
        }

    }

}
