public abstract class Documento {
    protected String doc;

    public Documento(String doc) {
        this.doc = doc;
    }

    public String getDoc() {
        return doc;
    }

    public abstract boolean verifica();

    @Override
    public abstract String toString();
}
