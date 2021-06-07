import java.util.Scanner;

public class Ruleta {

    Scanner sc = new Scanner(System.in);
    private int opcion;
    private int gemasGanadas;
    private double OroGanado;
    private int numAleatorio = 0;
    
    public Ruleta() {

    }

    public void suerte(Jugador jugador) { // como anteriormente habia ingresado el objeto jugador
            // para no crear un nuevo objeto jugador y no se reinicie los nombres

        jugador.informacionDelJuego();
        System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
        System.out.println("★       Bienvenido a Ruleta magica      ★ ");
        System.out.println("★         Donde siempre ganas           ★ ");
        System.out.println("★        seleciona tu opcion            ★ ");
        System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
        while(opcion != 2){
        System.out.println("1)  Jugar");
        System.out.println("2)  Regresar al Menu Principal");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("★ ★ Hora de jugar ★ ★");
                System.out.println("");
                System.out.println("Presiona el numero 1 y luego enter");
                System.out.println("y Veras las ganacias");
                opcion = sc.nextInt();

                    if (opcion == 1) {
                        numAleatorio = (int) (Math.random() * 100)+1;
                        System.out.println("Tu numero a aleatrio es  " + numAleatorio);
                        System.out.println("          ESO SIGNIFICA QUE   ");
                        System.out.println("");
                        if (numAleatorio >= 1 && numAleatorio <= 10) {
                            System.out.println("★Has ganado 40 gemas★");
                            System.out.println("");
                            gemasGanadas += 40;
                            break;
                        } else if (numAleatorio >= 11 && numAleatorio <= 25) {
                            System.out.println("★Has ganado 75 monedas de Oro★");
                            System.out.println("");
                            OroGanado += 30.0;
                        } else if (numAleatorio >= 26 && numAleatorio <= 30) {
                            System.out.println("★Le has dado alas 1000 Gemas★");
                            System.out.println("");
                            gemasGanadas += 1000;
                        } else if (numAleatorio >= 21 && numAleatorio <= 35) {
                            System.out.println("★Excelente has ganado 2000 MONEDAS DE ORO★");
                            System.out.println("");
                            OroGanado += 2000.0;
                        } else if (numAleatorio >= 36 && numAleatorio <= 65) {
                            System.out.println("★Bien ganaste 5 Gemas★");
                            System.out.println("");
                            gemasGanadas += 5;
                        } else if (numAleatorio >= 66 && numAleatorio <= 100) {
                            System.out.println("★Ganaste 10 monedas de oro★");
                            System.out.println("");
                            OroGanado += 10.0;
                        }
                        jugador.Ganar(OroGanado, gemasGanadas);
                        jugador.quitarMonedasYGemas(0, 5);
                        System.out.println("Te ha ido bien");
                        System.out.println("Quieres intentarlo de nuevo");
                        System.out.println("1.    SI ");
                        System.out.println("2.    NO ");
                        opcion = sc.nextInt();
                        if(opcion == 1){
                            this.suerte(jugador);  
                        }
                }
                    
                case 2:
                System.out.println("Cargando . . . .");
                break;

                default:
                System.out.println("Observa bien cuales son las opciones"); 

                }


    
            }
        }

}
