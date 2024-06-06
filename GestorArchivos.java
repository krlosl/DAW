import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    public static void procesarDocumentos() {
        try (BufferedReader br = new BufferedReader(new FileReader("docs_in.txt"));
             FileWriter fwOk = new FileWriter("docs_ok.txt", true);
             FileWriter fwKo = new FileWriter("docs_ko.txt", true)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                Documento doc = crearDocumentoDesdeLinea(linea);
                if (doc != null && doc.verifica()) {
                    fwOk.write(doc.toString() + "\n");
                } else {
                    fwKo.write(linea + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Documento crearDocumentoDesdeLinea(String linea) {
        if (linea.matches("\\d{8}[A-Z]")) { // Patrón para NIF
            return new DocumentoNif(linea);
        } else if (linea.matches("\\d{20},[A-Z0-9]{11}")) { // Patrón para CCC
            String[] partes = linea.split(",");
            return new DocumentoCCC(partes[0], partes[1]);
        } else if (linea.matches("\\d{16},\\d{2}/\\d{2}")) { // Patrón para Tarjeta
            String[] partes = linea.split(",");
            return new DocumentoTarjeta(partes[0], partes[1]);
        } else {
            return null; // Formato no reconocido
        }
    }
}