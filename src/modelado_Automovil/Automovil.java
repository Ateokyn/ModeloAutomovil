package modelado_Automovil;

/**
 *
 * @author Oye MacDonald
 */
public class Automovil {

    public static void main(String[] args) {
        Atributos_Automovil miAuto1 = new Atributos_Automovil("Suzuki", 2019, 1.6, "Gasolina", "Familiar", 4, 4, 150, "Azul", 100);
        miAuto1.Imprimir();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");
        
        miAuto1.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.frenar();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

    }
}
