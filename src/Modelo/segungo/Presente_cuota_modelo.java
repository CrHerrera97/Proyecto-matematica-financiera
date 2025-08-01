
package Modelo.segungo;

public class Presente_cuota_modelo {
    
    //ATRIBUTOS --------------------
    
    private double a;
    private double p;
    private double i;
    private double n;
    
    //CONSTRUCTOR --------------------

    public Presente_cuota_modelo(double a, double p, double i, double n) {
        this.a = a;
        this.p = p;
        this.i = i;
        this.n = n;
    }
       
    //SET AND GET --------------------

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
    
    //MEODOS ------------------------------------------------------------
    
    public double valor_presente_vencida_pagoVencida(){
        double exponente = Math.pow(1+(this.i/100), this.n);
        double arriba = exponente-1;
        double abajo = (this.i/100)*exponente;
        double valor_presente = this.a*(arriba/abajo);        
    return valor_presente;}
    
    public double cuota_uniforme_vencida_pagoVencida(){
        double exponente = Math.pow(1+(this.i/100), this.n);
        double arriba = (this.i/100)*exponente;
        double abajo = exponente-1;
        double cuota_uniforme = this.p*(arriba/abajo);        
    return cuota_uniforme;}
       
//    public double tasa_periodica_vencida_pagoVencida(){
//        double exponente = Math.pow(1+(this.i/100), this.n);
//        double arriba = (this.i/100)*exponente;
//        double abajo = exponente-1;
//        double tasa_periodica = this.p*(arriba/abajo);        
//    return tasa_periodica;}
    
    public double n_periodos_vencida_pagoVencida(){
        double logaritmoArriba = Math.log10(this.a)-Math.log10(this.a-this.p*(this.i/100));
        double logaritmoAbajo = Math.log10(1+(this.i/100));
        double n_periodo = logaritmoArriba/logaritmoAbajo;      
    return n_periodo;}
    
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------
    
    public double valor_presente_vencida_pagoAnticipado(){
        double exponente = Math.pow(1+(this.i/100), (-1)*this.n);
        double arriba = 1-exponente;
        double abajo = (this.i/100);
        double valor_presente = this.a*(arriba/abajo)*(1+(this.i/100));        
    return valor_presente;}
    
    public double cuota_uniforme_vencida_pagoAnticipado(){
        double exponente = Math.pow(1+(this.i/100), this.n);
        double arriba = (this.i/100)*exponente;
        double abajo = exponente-1;
        double cuota_uniforme = this.p*(arriba/abajo)/(1+(this.i/100));        
    return cuota_uniforme;}
    
    public double n_periodos_vencida_pagoAnticipado(){
        double logaritmoArriba = Math.log10(1-(this.i/100)*((this.p/this.a)-1));
        double logaritmoAbajo = Math.log10(1+(this.i/100));
        double n_periodo = 1-(logaritmoArriba/logaritmoAbajo); 
    return n_periodo;}
    
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------
        
}
