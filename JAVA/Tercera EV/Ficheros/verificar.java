import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class verificar {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String usuario;
        String contra;
        int temp = 1;
        
        System.out.println("Dime el nombre del fichero que deseas crear: ");
        nombre = sc.nextLine();
        try {   
            FileWriter fw = new FileWriter(nombre + ".txt");
            
            System.out.println("Dime el nombre del usuario: ");
            usuario = sc.nextLine();
            
            System.out.println("Dime la contraseña: ");
            contra = sc.nextLine();
            
            String contenido = (usuario + ":" + contra);
            fw.write(contenido + "\n");

            System.out.println("Vamos a verificar si se ha creado");
            System.out.println("Introduce el nombre y la contraseña: ");
            System.out.println("Nombre: ");
            String usu = sc.nextLine();

            System.out.println("Contraseña: ");
            String cont = sc.nextLine();

            FileReader fr = new FileReader(nombre + ".txt");

            String[] parts = contenido.split(":");
            for (int i = 0; i < temp; i++ ) {
                if (parts.length == 2) {
                    usuario = parts[0];
                    contra = parts[1];
                    if (usu.equals(usuario) && cont.equals(contra)) {
                        System.out.println("El usuario y la contraseña existen :).");
                        fw.flush();
                    } else {
                        System.out.println("No existe ni el usuario ni la contraseña :(.");
                    }
                }
                if (contenido.equals("salir")) {
                    fw.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        sc.close();
    }
}
