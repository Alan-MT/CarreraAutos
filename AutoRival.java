public class AutoRival {
    private String nombre;
    private String color;
    private String marca;
    private int llantas;
    private int motor;
    private int gas;

    public AutoRival(String nombre, String color, String marca, int llantas, int motor, int gas) {
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
        this.llantas = llantas;
        this.gas = gas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void informacionRival() { // metodo para mostrar la informacion del auto
        System.out.println("Mi nombre es " + this.nombre);
        System.out.println("La marca del carro es: " + this.marca);
        System.out.println("El color del carro es: " + this.color);
        System.out.println("El motor del carro es generico: " + this.motor);
        System.out.println("Las llantas del carro son: genericas " + this.llantas);
        System.out.println("La gasolina del carro es: " + this.gas + "\n\n");
    }

}
