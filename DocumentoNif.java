public class DocumentoNif extends Documento {
    public DocumentoNif(String doc) {
        super(doc);
        
    }


    @Override
    public boolean verifica() {
        return Algoritmos.validarNIF(doc);
    }

    @Override
    public String toString() {
        return "NIF:" + doc;
    }
}
