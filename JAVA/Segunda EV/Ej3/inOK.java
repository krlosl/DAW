import java.util.Scanner;

public class inOK {

    private static Scanner sc = new Scanner(System.in);

    private static void LeeInt() {

        System.out.println("Dime un número: ");
        try {
            int num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("NO ES UN NÚMERO ENTERO.");
            sc.nextLine();
        }
    }
    private static void LeeIntPos() {

        System.out.println("Dime un número positivo: ");
        try {
            int numpos = sc.nextInt();
            if (numpos < 0) throw new Exception("NO ES POSITIVO.");
        } catch (Exception e) {
            System.out.println("NO ES UN ENTERO.");
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }
    private static void LeeIntRango() {
        
        int min = 0;
        int max = 100;
        System.out.println("Dime un número pera ver si está en el rango: ");
        int num = sc.nextInt();
        try {
            if (num < max && num > min) throw new Exception("Numero dentro del rango");
            else {
                System.out.println("Número dentro del rango");
            }
        } catch (Exception e) {
            System.out.println("NO ESTÁ EN EL RANGO.");
            sc.nextLine();
        }
    }
    private static void LeeDou() {

        System.out.println("Dime un número: ");
        try {
            double num = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("NO ES UN NÚMERO REAL.");
            sc.nextLine();
        }
    }
    private static void LeeDouRango() {
        
        double min = 0;
        double max = 100;
        System.out.println("Dime un número pera ver si está en el rango: ");
        double num = sc.nextDouble();
        try {
            if (num < max && num > min) throw new Exception("Numero dentro del rango");
            else {
                System.out.println("Número dentro del rango");
            }
        } catch (Exception e) {
            System.out.println("NO ESTÁ EN EL RANGO.");
            sc.nextLine();
        }
    }
    public static void main(String[] args) throws Exception {
        LeeInt();
        LeeIntPos();
        LeeIntRango();
        LeeDou();
        LeeDouRango();
    }
}