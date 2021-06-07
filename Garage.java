import java.util.Scanner;

public class Garage {

    Scanner escoger = new Scanner(System.in);
    int opcion = 0;
    private int eleccion = 0;
    private int almacenarAuto;
    private double precioMonedas;
    private int precioGemas;
    private final String Rojo = "Rojo";
    private final String Azul = "Azul";
    private final String Verde = "Verde";
    private final int motor1 = 4;
    private final int motor2 = 5;
    private final int motor3 = 6;
    private Auto seleccion[] = { new Auto("tesla", "Amarilo", 2, 1, 100), new Auto("For Mustang", "Amarillo", 2, 1, 100),
    new Auto("Bugatti", "Amarillo", 2, 1, 100), new Auto("Jeep", "Amarillo", 2, 1, 100), 
    new Auto("Mercedez", "Amarillo", 2 , 1 , 100) };

    public Garage(int eleccion, Auto[] seleccion) {
        this.eleccion = eleccion;
        this.seleccion = seleccion;

    }
    public Auto[] getSeleccion(){
        return seleccion;
    }
    public void setSelecion(Auto seleccion[]){
        this.seleccion = seleccion;
    }
    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }

    public void opciones(Jugador jugador) {

        do {
            jugador.informacionDelJuego();
            System.out.println("-----------Bienvenidos a  GAS MONKEY-------------");
            System.out.println("Ya que estas aqui te ayudaremos a mejorar tu auto");
            System.out.println("---------------Que quieres hacer-----------------");
            System.out.println("1-  Mejorar Potencia");
            System.out.println("2-  Llenar tanque de gasolina");
            System.out.println("3-  Mejorar llantas");
            System.out.println("4-  Cambiar color");
            System.out.println("5-  Ver propiedades del carro actual");
            System.out.println("6-  Comprar otro Vehiculo");
            System.out.println("7-  Cambiar auto");
            System.out.println("8-  volver al Menu Principal");
            opcion = escoger.nextInt();
            switch (opcion) {
                case 1:
                    this.mejorPotencia(jugador);
                    break;
                case 2:
                    this.llenarTanque(jugador);
                    break;
                case 3:
                    this.mejoraLlantas(jugador);
                    break;
                case 4:
                    this.cambioColor(jugador);
                    break;
                case 5:
                    seleccion[eleccion].informacionGeneral();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        } while (opcion != 8);

    }

    public Garage() {

    }
 


    public void carros(){
        System.out.println("\n Es hora de elegir tu auto  ");
        // son los 3 carros que puede seleecionar el jugador
        for (almacenarAuto = 0; almacenarAuto < 3; almacenarAuto++) {
            System.out.println("Carros # " + almacenarAuto);
            seleccion[almacenarAuto].informacionGeneral();
        }
        do{
        System.out.println("\n Que Carro vas a seleccionar ");
        System.out.println("Debes de ver le numero que esta arriab para selecionar");
        System.out.print("el que quieres   ;");
        eleccion = escoger.nextInt();
        this.seleccionarAuto(seleccion);
        }while(eleccion > 3);
    }


    public void seleccionarAuto(Auto auto[]) {
        seleccion[eleccion].informacionGeneral();

    }

    public void cambioColor(Jugador jugador) {
        System.out.println("Bienvenido a la paleta de colores");
        System.out.println("El corto por los colores es de 20 monedas de oro");
        System.out.println("el color que tienes actualmente es " + seleccion[eleccion].getColor());
        System.out.println("los clores que tenemos son :");
        precioMonedas = 20.0;
        while (opcion > 3) {
            System.out.println("1-  ROJO ");
            System.out.println("2-  AZUL ");
            System.out.println("3-  VERDE ");
            opcion = escoger.nextInt();

            if (opcion == 1) {
                seleccion[eleccion].setColor(Rojo);
                jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
            } else if (opcion == 2) {
                seleccion[eleccion].setColor(Azul);
                jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
            } else if (opcion == 3) {
                seleccion[eleccion].setColor(Verde);
                jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
            } else {
                System.out.println("Eleccion ERRONEA");
            }
        }

    }

    public void mejorPotencia(Jugador jugador) {
        System.out.println("Debemos de mejorar tu auto");
        System.out.println("Tu auto tiene actualmente un potencia de " + seleccion[eleccion].getMotor());
        System.out.println("Te recuerdo que el precio de los motores varia depende ");
        System.out.println("de la potencia que quires");
        do {
            System.out.println("1-  Potencia 4");
            System.out.println("Precio: 5 Gemas\n");
            System.out.println("2-  Potencia 5");
            System.out.println("Precio:  20 Gemas\n");
            System.out.println("3-  Potencia de 7");
            System.out.println("Precio:  35 Gemas\n");
            System.out.println("Selecciona tu motor a travez del numero y enter");
            opcion = escoger.nextInt();
            switch (opcion) {
                case 1:
                seleccion[eleccion].setMotor(motor1);
                    precioGemas = 5;
                    jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
                    break;
                case 2:
                seleccion[eleccion].setMotor(motor2);
                    precioGemas = 20;
                    jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
                    break;
                case 3:
                seleccion[eleccion].setMotor(motor3);
                    precioGemas = 35;
                    jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
                    break;
                default:
                    System.out.println("Eleccion ERRONEA");
            }
        } while (opcion > 3);

    }

    public void llenarTanque(Jugador jugador) {
        System.out.println("LLENEMOS ESE TANQUE");
        System.out.println("cada galón costará 2.5 monedas de Oro");
        System.out.println("Tienes ahorita " + seleccion[eleccion].getGas() + " de gasolina");
        System.out.println("Con cuantos galones quieres llenarlo");
        opcion = escoger.nextInt();
        if (seleccion[eleccion].getGas() == 100) {
            System.out.println("Ya esta lleno");

        } else {
            int llenar = seleccion[eleccion].getGas() + opcion;
            seleccion[eleccion].setGas(llenar);
            precioMonedas = 2.5 * opcion;
            jugador.quitarMonedasYGemas(precioMonedas, precioGemas);
        }
    }

    public void mejoraLlantas(Jugador jugador) {
        System.out.println("Bienvenidos a MICHELIN");
        System.out.println("Cambiemos esas llantas");
        System.out.println("tu  numero de rin es " + seleccion[eleccion].getLlantas());
        System.out.println("el precio de las llantas varias y son lo siguientes");
        System.out.println("1)   Calidad baja 2");
        System.out.println("precio de 25 monedas de oro");
        System.out.println("2)   Calidad Media 3");
        System.out.println("precio de 50 monedas de oro");
        System.out.println("3)   Calidad Alta 5");
        System.out.println("Precio de 75 monedas de oro");
        opcion = escoger.nextInt();
        if (opcion == 1) {
            seleccion[eleccion].setLlantas(2);
            precioMonedas = 25;
            jugador.quitarMonedasYGemas(precioGemas, precioGemas);
        } else if (opcion == 2) {
            seleccion[eleccion].setLlantas(3);
            precioMonedas = 50;
            jugador.quitarMonedasYGemas(precioGemas, precioGemas);
        } else if (opcion == 3) {
            seleccion[eleccion].setLlantas(5);
            precioMonedas = 75;
            jugador.quitarMonedasYGemas(precioGemas, precioGemas);
        } else {
            System.out.println("Elecciona ERRONEA");
        }

    }
}