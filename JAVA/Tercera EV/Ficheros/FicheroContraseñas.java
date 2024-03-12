//Crear un programa que pida un nombre de usuario y contraseña
//y lo guarde en un fichero con formato
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FicheroContraseñas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String contra;
        String op;
        int temp = 0;

        System.out.println("Dime el nombre del archivo a crear: ");
        String nomb = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(nomb);
            System.out.println("Quieres continuar? (si/no) ");
            op = sc.nextLine();

            if (op.equals("no")) {
                System.exit(0);
            } else {
                
                System.out.println("Escribe los usuarios y contraseñas, si quieres salir escribe 'salir'");
                
                for (int i = 1; i > temp; i++) {
                    System.out.println("Dime el usuario: ");
                    nombre = sc.nextLine();
                    
                    System.out.println("Dime la contraseña: ");
                    contra = sc.nextLine();
                    
                    String contenido = (nombre + ":" + contra);
                    fw.write(contenido + "\n");
                    
                    if (contenido.equals("salir")) {
                        fw.close();
                    }
                }   
            }
        }  catch (IOException e) {
            System.out.println("ERROR");
        }
        sc.close();    
    }    
}