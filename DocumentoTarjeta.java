public class DocumentoTarjeta extends Documento {
    private String fechaCaducidad;

    public DocumentoTarjeta(String numero, String fechaCaducidad) {
        super(numero);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public boolean verifica() {
        return Algoritmos.validarTarjeta(doc) && !fechaCaducidad.endsWith("30");
    }

    @Override
    public String toString() {
        return "Card:" + doc + "-" + fechaCaducidad;
    }
}
