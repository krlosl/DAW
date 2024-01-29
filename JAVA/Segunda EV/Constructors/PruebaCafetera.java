package lib;

public class cafetera {

    private int cantmax = 1000; 
    private int cantact = 0;

    public cafetera() {
        this.cantmax;
        this.cantact;
    }
    public cafetera(int a_cantmax) {
        this.cantmax = a_cantmax;
        this.cantact = a_cantmax;
    }
    public cafetera(int a_cantact, int a_cantamx) {
        this.cantact = a_cantact;
        this.cantmax = a_cantmax;
        if(cantact > cantmax) {
            this.cantact = a_cantmax;
        }
        return cantact
    }
    public int getCantmax() {
        return cantmax;
    }
    public void setCantmax(int cantmax) {
        this.cantmax = cantmax;
    }
    public int getCantcat() {
        return cantact;
    }
    public void setCantact(int cantact) {
        this.cantact = cantact
    }
    public llenarcafetera(int a_cantact, int a_cantmax) {
        a_cantact = a_cantmax;
        return a_cantact;
    }
    public servirtaza() {
        if(cantmax > cantact) {
            cantmax = cantact;
        }
        return cantmax;
    }
    public vaciarcafetera(int a_cantact) {
        a_cantact = 0;
        return a_cantact;
    }
    public agregarcafe(int cant, int cantact){
        cantact = cantact + cant;
        return cantact;
    }
}