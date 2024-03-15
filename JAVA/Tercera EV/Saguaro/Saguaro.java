import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Saguaro {
    public static void main(String[] args) {
        //pillo los dos archivos que hay que usar
        File f = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        File bin = new File("SAC.bin");
        String[] array;

        try {
            //leo el tocho, lo leo por lineas, y lo guardo en una variable
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            //lo pico
            FileOutputStream fos = new FileOutputStream(bin);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //si linea tiene algo entra
            while (line != null) {
                //reemplaza las barras y los espacios para que esté todo junto
                String line2 = line.replaceAll("\"",  "").replaceAll(" ", "");
                //lo corto por las comas para poder sacar cada cosa
                array = line.split(",");

                if (line.contains("GALXY") ) {
                    //pinto los objetos según la posición en la que están
                    Datos d = new Datos(array[0], array[3], array[4], array[5], array[6]);

                    oos.writeObject(d);
                }
            }
            fr.close();
            br.close();
            fos.close();
            oos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}