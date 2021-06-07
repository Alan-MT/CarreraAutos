import java.util.Scanner;

public class Auto {
    // Atributos
    private String color;
    private String marca;
    private int llantas;
    private int motor;
    // cuanta gasolina tiene
    private int gas;
    Scanner sc = new Scanner(System.in);

    public Auto(String marca, String color, int motor, int llantas, int gas) { // Constructor para inicializarlo
        this.color = color;
        this.marca = marca;
        this.llantas = llantas;
        this.gas = gas;
        this.motor = motor;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getMarca() {
        return marca;

    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;

    }

    public int getLlantas() {
        return llantas;

    }

    public void setMotor(int motor) {
        this.motor = motor;

    }

    public int getMotor() {
        return motor;

    }

    public void setGas(int gas) {
        this.gas = gas;

    }

    public int getGas() {
        return gas;
    }

    public void informacionGeneral() { // metodo para mostrar la informacion del auto
        System.out.println("La marca del carro es: " + this.marca);
        System.out.println("El color del carro es: " + this.color);
        System.out.println("El motor del carro es generico: " + this.motor);
        System.out.println("Las llantas del carro son: genericas " + this.llantas);
        System.out.println("La gasolina del carro es: " + this.gas + "\n\n");
    }
    public Auto(){
        
    }

 

}
