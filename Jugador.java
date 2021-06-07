import java.util.Scanner;

public class Jugador {

    private String nombre;
    private String nickname;
    private int edad;
    private double oro = 50.0;
    private int Gemas = 30;
    Scanner Sc = new Scanner(System.in);
    int opcion = 0;
    private int almacenarAuto;

    public Jugador(String nombre, String nickname, int edad, Double oro, int Gemas) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.oro = 50.0;
        this.Gemas = 30;
    }

    public int getAlmacenarAuto() {
        return almacenarAuto;
    }

    public void setAlmacenarAuto(int almacenarAuto) {
        this.almacenarAuto = almacenarAuto;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNickname() {
        return nickname;
    }

    public void setOro(Double oro) {
        this.oro = oro;

    }

    public double getOro() {
        return oro;
    }

    public void setGemas(int Gemas) {
        this.Gemas = Gemas;
    }

    public int getGemas() {
        return Gemas;
    }

    public void regalo() {
        System.out.println("\n");
        System.out.println(this.nombre + " Te hemos regalodo " + oro + " monedas de oro y " + Gemas + " Gemas");
        System.out.println("        Por haber iniciado el juego");
        System.out.println("ahora presiona enter para la siguiente informacion");

    }

    public void Ganar(double oro, int Gemas) { // metodo para agregar las gemas ganas y oro
        this.Gemas += Gemas;
        this.oro += oro;

    }

    public void informacionDelJuego() { // metodo para que salga el nombre de las gemas
        System.out.println("                                         " + this.nombre);
        System.out.println("                                         " + this.oro + " Monedas de Oro");
        System.out.println("                                         " + this.Gemas + " Gemas");
    }

    public Jugador() {
        System.out.println("\nEs hora de ingresar tus datos y luego presionas enter");
        System.out.print("\ningrese su nombre:   ");
        nombre = Sc.nextLine();
        System.out.print("\ningrese su nickname o apodo:   ");
        nickname = Sc.nextLine();
        System.out.print("\nCuantos años tienes?:   ");
        edad = Sc.nextInt();
        this.regalo();

    }

    public void quitarMonedasYGemas(double oro, int Gemas) {
        this.Gemas -= Gemas;
        this.oro -= oro;

    }

}
