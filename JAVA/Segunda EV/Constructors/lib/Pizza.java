package lib;

public class Pizza {
    private String tamano;
    private String tipo;
    private String sit;
    private static int TotalServidas = 0;
    private static int TotalPedidas = 0;

    public Pizza (String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.sit = "pedida";
        this.TotalPedidas ++;
    }
    
    @Override
        public String toString() {
            return "Pizza " + tamano + " " + tipo + " " + sit;
        }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSit() {
        return sit;
    }
    public void setSit(String sit) {
        this.sit = sit;
    }
    public static int getTotalServidas() {
        return TotalServidas;
    }
    public void setTotalServidas(int TotalServidas) {
        this.TotalServidas = TotalServidas;
    }
    public static int getTotalPedidas() {
        return TotalPedidas;
    }
    public void setTotalPedidas(int totalPedidas) {
        this.TotalPedidas = totalPedidas;
    }
    public void sirve() {
        if (this.sit.equals("servida")) {
            System.out.println("Esta pizza ya se ha servido");
        }else{
            this.sit = "servida";
            this.TotalServidas ++;
        }
    }
}