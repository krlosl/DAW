import lib.Tiempo;

public class PruebaTiempo {
    public static void main(String[] args) {
        

        Tiempo tiempo = new Tiempo(3, 30, 40);
        Tiempo tiempo2 = new Tiempo(2, 30, 40);

        System.out.println("Método suma: ");
        tiempo.suma(tiempo);
        System.out.println(tiempo.toString());

        System.out.println("Método resta: ");
        tiempo.resta(tiempo2);
        System.out.println(tiempo2.toString());

        System.out.println("Método comparación: ");
        int comparacion = tiempo.compareTo(tiempo2);
        if (comparacion > 0) {
            System.out.println("El tiempo actual es mayor que tiempo2");
        } else if (comparacion < 0) {
            System.out.println("El tiempo actual es menor que tiempo2");
        } else {
            System.out.println("Los tiempos son iguales");
        }
    }
}