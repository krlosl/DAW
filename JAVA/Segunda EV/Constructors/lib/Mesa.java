package lib;

public class Mesa {

    private String color;
    private int npatas;
    private int ancho;
    private int largo;
    private String material;

    public Mesa() {
        this.color = "Blanco";
        this.npatas = 4;
        this.ancho = 100;
        this.largo = 100;
        this.material = "Madera";

    }
    public Mesa (String a_color, int a_npatas, int a_ancho, int a_largo, String a_material) {
        
        this.color = a_color;
        this.npatas = a_npatas;
        this.ancho = a_ancho;
        this.largo = a_largo;
        this.material = a_material;
    }
    public int area() {
        return this.ancho*this.largo;
    }
    public double area (String unidad) {
        double area;
        area = this.ancho*this.largo;
        switch(unidad) {
            case "m":
                area = area / 10000;
                break;
            case "in":
                area = area / 2.54 /2.54;
                break;
        }
        return area;
    }
    public void setColor (String a_color) {
        this.color = a_color;
    }
    public String getColor() {
        return this.color;
    }
    public void setMaterial (String a_material) {
        this.material = a_material;
    }
    public String getMaterial() {
        return this.material;
    }
}