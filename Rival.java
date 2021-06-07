import java.util.Scanner;

public class Rival {

    private int numeroRivales = 0;
    private int autosseleccionados = 0;
    Scanner Sc = new Scanner(System.in);
    private int cambioLlantas;
    private int cambioMotor;
    Garage garage;
    Jugador jugador;
    Auto auto;

    public Rival(int numeroRivales, Jugador jugador) {
        this.numeroRivales = numeroRivales;
        this.jugador = jugador;

    }

    public int getNumeroRivales() {
        return numeroRivales;
    }

    public void setNumeroRivales(int numeroRivales) {
        this.numeroRivales = numeroRivales;
    }

    AutoRival carros[] = { new AutoRival("Rayo", "Rojo", "Mitsubishi", 1, 2, 100),
            new AutoRival("Gates", "Verde", "Lamborgini", 1, 2, 100), new AutoRival("Jobs", "Azul", "Mazda", 1, 2, 100),
            new AutoRival("Sheldon", "Rojo", "Cooper", 1, 2, 100), new AutoRival("Mate", "cafe", "Toyota", 1, 2, 100) };

    public Rival(Jugador jugador, Garage garage, Auto auto){
        System.out.println("es hora de retar a un rival para poder competir");
        System.out.println("puedes elgir de 1 a 5 rivales");
        System.out.println("pero sera aleatorio y nosotros lo escogeremos");
        System.out.println("\nahora ingresa el numero de rivales que quieres que compita");
        this.eleccionDeRivales(carros);

    }

    public void eleccionDeRivales(AutoRival carros[]) {

        autosseleccionados = Sc.nextInt();
        int contador = 0;
        if (autosseleccionados >= 6) {
            System.out.println("\nRecuerda que el maximo son de 5 rivales");
            System.out.println("ingresa de nuevo los rivales que quires que compitas");
            this.eleccionDeRivales(carros);

        } else {
            while (contador < autosseleccionados) {
                System.out.println("\nTUS RIVALES SON:");
                System.out.println("Carros # " + (contador + 1));
                this.cambioAleatorio(carros);
                carros[numeroRivales].informacionRival();
                numeroRivales++;
                contador++;
            }
        }
        this.Competir(jugador, garage);
    }

    public void cambioAleatorio(AutoRival carros[]) {

        int rinLlantas[] = { 2, 3, 5 };
        // (numAleatorio >= 36 && numAleatorio <= 65);
        int gen = (int) (Math.random() * 2 + 1);
        cambioLlantas = rinLlantas[gen];
        carros[numeroRivales].setLlantas(cambioLlantas);
        int potencia[] = { 4, 5, 7 };
        cambioMotor = potencia[gen];
        carros[numeroRivales].setMotor(cambioMotor);

    }
    public void Competir(Jugador jugador, Garage garage){
        carros[0].informacionRival();
        carros[1].informacionRival();
        auto.informacionGeneral();
        


        
        
        
        

    }

}
