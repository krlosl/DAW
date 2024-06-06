public class DocumentoCCC extends Documento {
    private String swift;

    public DocumentoCCC(String ccc, String swift) {
        super(ccc);
        this.swift = swift;
    }

    @Override
    public boolean verifica() {
        return Algoritmos.validarCCC(doc) && !swift.endsWith("ZZZ");
    }

    @Override
    public String toString() {
        return "CCC:" + doc + "-" + swift;
    }
}
