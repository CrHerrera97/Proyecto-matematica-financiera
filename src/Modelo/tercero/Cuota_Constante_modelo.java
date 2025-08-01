package Modelo.tercero;

public class Cuota_Constante_modelo {
    
    public double prestamo;
    public double interes;
    public int cuota;

    public Cuota_Constante_modelo(double prestamo, double interes, int cuota) {
        this.prestamo = prestamo;
        this.interes = interes;
        this.cuota = cuota;
    }
    
    public double anualidad(){        
        double exponente = Math.pow(1+this.interes/100, this.cuota);        
        double total = this.prestamo*(((this.interes/100)*exponente)/(exponente-1));
        return Math.round(total);
    }
    
}
