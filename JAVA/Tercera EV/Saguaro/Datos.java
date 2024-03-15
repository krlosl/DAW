public class Datos {
    private String OBJECT;
    private String CON;
    private String RA;
    private String DEC;
    private String MAG;
    
    public Datos(String OBJECT, String CON, String RA, String DEC, String MAG) {
        this.OBJECT = OBJECT;
        this.CON = CON;
        this.RA = RA;
        this.DEC = DEC;
        this.MAG = MAG;
    }

    public void printdatos() {
        System.out.println("Object: " + OBJECT + "Con: " + CON + "RA: " + RA + "DEC: " + DEC + "MAG: " + MAG);
    }
}
