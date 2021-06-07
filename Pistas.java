public class Pistas {

    private int Tamanio;
    private int coeficientePista;
    private String nombre;
    private int contadorGasolina;
    int elemento[][] = new int[5][5];
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_COFFE = "\u001b[48;5;94m";
    public static final String ANSI_GRAY = "\u001B[38m";

    public Pistas(int coeficientePista, int tamanio, String nombre) {
        this.coeficientePista = coeficientePista;
        this.Tamanio = tamanio;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContadorGasolina() {
        return contadorGasolina;
    }

    public void setContadorGasolina(int contadorGasolina) {
        this.contadorGasolina = contadorGasolina;
    }

    public int getCoeficientePista() {
        return coeficientePista;
    }

    public void setCoeficientePista(int coeficientePista) {
        this.coeficientePista = coeficientePista;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int tamanio) {
        this.Tamanio = tamanio;
    }

    public Pistas() {
        System.out.println("Las pistas son las siguientes;\n");

        System.out.println("Tierra");
        System.out.println("Tamaño de 80 Casillas");
        this.elementoTierra();

        System.out.println("Arena");
        System.out.println("Tamaño de 90 Casillas");
        this.elementoArena();

        System.out.println("Concreto");
        System.out.println("Tamaño de 100 casiilas");
        this.elementoConcreto();
    }

    public void elementoArena() {
        int cantidad = 5;
        int[][] arreglo = new int[cantidad][cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                int x = i + 1;
                if ((i == j) || (j == (cantidad - x))) {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_YELLOW_BACKGROUND + " " + arreglo[i][j] + "" + ANSI_RESET);
                } else {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_YELLOW_BACKGROUND + " " + arreglo[i][j] + "" + ANSI_RESET);
                }
            }
            System.out.println();
        }

    }

    public void elementoTierra() {
        int cantidad = 5;
        int[][] arreglo = new int[cantidad][cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                int x = i + 1;
                if ((i == j) || (j == (cantidad - x))) {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_COFFE + " " + arreglo[i][j] + "" + ANSI_RESET);
                } else {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_COFFE + " " + arreglo[i][j] + "" + ANSI_RESET);
                }
            }
            System.out.println();
        }

    }

    public void elementoConcreto() {
        int cantidad = 5;
        int[][] arreglo = new int[cantidad][cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                int x = i + 1;
                if ((i == j) || (j == (cantidad - x))) {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_GRAY + " " + arreglo[i][j] + "" + ANSI_RESET);
                } else {
                    arreglo[i][j] = 0;
                    System.out.print(ANSI_GRAY + " " + arreglo[i][j] + "" + ANSI_RESET);
                }
            }
            System.out.println();
        }

    }

}
