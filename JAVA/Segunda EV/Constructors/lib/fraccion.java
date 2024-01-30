package lib;

public class Fraccion {

    private int numerador;
    private int denominador;

    public void fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }
    //getters and setters
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public int setNumerador() {
        return numerador;
    }
    public int setDenominador() {
        return denominador;
    }
    //getters and setters
    public void fraccion(int num, int denom) {
        this.numerador = num;
        this.denominador = denom;
    }
    public void invertir() {
        int temp;
        temp = numerador;
        this.numerador = denominador;
        this.denominador = temp;
    }
    public int mcd(int num, int denom) {
        while (denom != 0) {
            int temp2 = denom;
            denom = num % denom;
            num = temp2;
        }
        return num;
    }
    public void simplificar(int num, int denom) {
        int a = mcd(num, denom);
        this.numerador = num / a;
        this.denominador = denom /a;
    }
    public void multiplicar(int num, int denom, int mult) {
        this.numerador = numerador * mult;
        this.denominador = denominador * mult;
    }
    public void dividir(int num, int denom, int div) {
        this.numerador = numerador / div;
        this.denominador = denominador / div;
    }
}
