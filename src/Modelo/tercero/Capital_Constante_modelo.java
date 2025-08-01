
package Modelo.tercero;

public class Capital_Constante_modelo {
    
    public double prestamo;
    public double interes;
    public int cuota;

    public Capital_Constante_modelo(double prestamo, double interes, int cuota) {
        this.prestamo = prestamo;
        this.interes = interes;
        this.cuota = cuota;
    }
    
    public double abonoCapital(){        
        return this.prestamo/this.cuota;
    }
    
}
