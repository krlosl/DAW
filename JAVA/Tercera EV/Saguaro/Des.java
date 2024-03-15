import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Des {
    public static void main(String[] args) {
        File f = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        //DESERIALIZAMOS OBJETOS
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("Listado de objetos en el archivo txt:");

            Datos a3 = (Datos)ois.readObject();
            a3.printdatos();
            Datos a4 = (Datos)ois.readObject();
            a4.printdatos();


            ois.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Excepción: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Excepción: "+e.getMessage());
        }
    }
}