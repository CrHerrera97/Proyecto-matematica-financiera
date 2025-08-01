
package Modelo.primero;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Npe_modelo {
    
    private double nominal;
    private double periodica;
    private double efectiva;
    private int periodo;
    private String formaPago;

    //CONSTRUCTOR ---------------------------------------------------------------------------------------
    
    public Npe_modelo(double nominal, double periodica, double efectiva, int periodo, String formaPago) {
        this.nominal = nominal;
        this.periodica = periodica;
        this.efectiva = efectiva;
        this.periodo = periodo;
        this.formaPago = formaPago;
    }
    
    public Npe_modelo(double efectiva, int periodo, String formaPago) {
        this.efectiva = efectiva;
        this.periodo = periodo;
        this.formaPago = formaPago;
    }
    
    //NONIMAL -------------------------------------------------------------------------------------------
    public double nominal_anticipada_vencida_periodica(){
        double nomAntPeriodica = 0;
        
        if(periodo == 0){
            nomAntPeriodica = ((this.nominal/100)/365)*100;
        } else if(periodo == 1){
            nomAntPeriodica = ((this.nominal/100)/12)*100;
        } else if(periodo == 2){
            nomAntPeriodica = ((this.nominal/100)/6)*100;
        } else if(periodo == 3){
            nomAntPeriodica = ((this.nominal/100)/4)*100;
        } else if(periodo == 4){
            nomAntPeriodica = ((this.nominal/100)/2)*100;
        } else if(periodo == 5){
            nomAntPeriodica = ((this.nominal/100)/1)*100;
        }
        
        return nomAntPeriodica;
    }
    
    public double nominal_anticipada_efectiva(double periodica){
        double pow = 0;
        double nomAntEfectiva = 0;
        
        if(periodo == 0){
            pow = Math.pow(1-(periodica/100), -365);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 1){
            pow = Math.pow(1-(periodica/100), -12);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 2){
            pow = Math.pow(1-(periodica/100), -6);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 3){
            pow = Math.pow(1-(periodica/100), -4);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 4){
            pow = Math.pow(1-(periodica/100), -2);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 5){
            pow = Math.pow(1-(periodica/100), -1);
            nomAntEfectiva = (pow-1)*100;
        }
        
        return nomAntEfectiva;
    }
    
    public double nominal_vencida_efectiva(double vencida){
        double pow = 0;
        double nomAntEfectiva = 0;
        
        if(periodo == 0){
            pow = Math.pow(1+(vencida/100), 365);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 1){
            pow = Math.pow(1+(vencida/100), 12);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 2){
            pow = Math.pow(1+(vencida/100), 6);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 3){
            pow = Math.pow(1+(vencida/100), 4);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 4){
            pow = Math.pow(1+(vencida/100), 2);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 5){
            pow = Math.pow(1+(vencida/100), 1);
            nomAntEfectiva = (pow-1)*100;
        }
        
        return nomAntEfectiva;
    }
    
    
    //EFECTIVA -----------------------------------------------------------------------
    public double efectiva_anticipada_vencida_nominal(double periodica){
        double nomAntPeriodica = 0;
        
        if(periodo == 0){
            nomAntPeriodica = ((periodica/100)*365)*100;
        } else if(periodo == 1){
            nomAntPeriodica = ((periodica/100)*12)*100;
        } else if(periodo == 2){
            nomAntPeriodica = ((periodica/100)*6)*100;
        } else if(periodo == 3){
            nomAntPeriodica = ((periodica/100)*4)*100;
        } else if(periodo == 4){
            nomAntPeriodica = ((periodica/100)*2)*100;
        } else if(periodo == 5){
            nomAntPeriodica = ((periodica/100)*1)*100;
        }
        
        return nomAntPeriodica;
    }
    
    public double efectiva_vencida_nominal(){
        double pow = 0;
        double efeVenNominal = 0;
        
        if(periodo == 0){
            pow = Math.pow(1+this.efectiva/100, 1.0/365);
            efeVenNominal = (pow-1)*100;
        } else if(periodo == 1){
            pow = Math.pow(1+this.efectiva/100, 1.0/12);
            efeVenNominal = (pow-1)*100;
        } else if(periodo == 2){
            pow = Math.pow(1+this.efectiva/100, 1.0/6);
            efeVenNominal = (pow-1)*100;
        } else if(periodo == 3){
            pow = Math.pow(1+this.efectiva/100, 1.0/4);
            efeVenNominal = (pow-1)*100;
        } else if(periodo == 4){
            pow = Math.pow(1+this.efectiva/100, 1.0/2);
            efeVenNominal = (pow-1)*100;
        } else if(periodo == 5){
            pow = Math.pow(1+this.efectiva/100, 1.0/1);
            efeVenNominal = (pow-1)*100;
        }
        
        return efeVenNominal;
    }
    
    public double efectiva_anticipada_nominal(){
        double pow = 0;
        double efeAntNominal = 0;
        
        if(periodo == 0){
            pow = Math.pow(1+this.efectiva/100, 1.0/365);
            efeAntNominal = (1-(1/pow))*100;
        } else if(periodo == 1){
            pow = Math.pow(1+this.efectiva/100, 1.0/12);
            efeAntNominal = (1-(1/pow))*100;
        } else if(periodo == 2){
            pow = Math.pow(1+this.efectiva/100, 1.0/6);
            efeAntNominal = (1-(1/pow))*100;
        } else if(periodo == 3){
            pow = Math.pow(1+this.efectiva/100, 1.0/4);
            efeAntNominal = (1-(1/pow))*100;
        } else if(periodo == 4){
            pow = Math.pow(1+this.efectiva/100, 1.0/2);
            efeAntNominal = (1-(1/pow))*100;
        } else if(periodo == 5){
            pow = Math.pow(1+this.efectiva/100, 1.0/1);
            efeAntNominal = (1-(1/pow))*100;
        }
        
        return efeAntNominal;
    }
    
    //PERIODICA --------------------------------------------------------------------------------------
    public double periodica_anticipada_vencida_nominal(){
        double nomAntPeriodica = 0;
        
        if(periodo == 0){
            nomAntPeriodica = ((this.periodica/100)*365)*100;
        } else if(periodo == 1){
            nomAntPeriodica = ((this.periodica/100)*12)*100;
        } else if(periodo == 2){
            nomAntPeriodica = ((this.periodica/100)*6)*100;
        } else if(periodo == 3){
            nomAntPeriodica = ((this.periodica/100)*4)*100;
        } else if(periodo == 4){
            nomAntPeriodica = ((this.periodica/100)*2)*100;
        } else if(periodo == 5){
            nomAntPeriodica = ((this.periodica/100)*1)*100;
        }
        
        return nomAntPeriodica;
    }
    
    public double periodica_anticipada_efectiva(){
        double pow = 0;
        double nomAntEfectiva = 0;
        
        if(periodo == 0){
            pow = Math.pow(1-(this.periodica/100), -365);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 1){
            pow = Math.pow(1-(this.periodica/100), -12);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 2){
            pow = Math.pow(1-(this.periodica/100), -6);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 3){
            pow = Math.pow(1-(this.periodica/100), -4);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 4){
            pow = Math.pow(1-(this.periodica/100), -2);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 5){
            pow = Math.pow(1-(this.periodica/100), -1);
            nomAntEfectiva = (pow-1)*100;
        }
        
        return nomAntEfectiva;
    }
    
    public double periodica_vencida_efectiva(){
        double pow = 0;
        double nomAntEfectiva = 0;
        
        if(periodo == 0){
            pow = Math.pow(1+(this.periodica/100), 365);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 1){
            pow = Math.pow(1+(this.periodica/100), 12);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 2){
            pow = Math.pow(1+(this.periodica/100), 6);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 3){
            pow = Math.pow(1+(this.periodica/100), 4);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 4){
            pow = Math.pow(1+(this.periodica/100), 2);
            nomAntEfectiva = (pow-1)*100;
        } else if(periodo == 5){
            pow = Math.pow(1+(this.periodica/100), 1);
            nomAntEfectiva = (pow-1)*100;
        }
        
        return nomAntEfectiva;
    }
    
    
    //GET and SET ---------------------------------------------------------------------------------------

    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getPeriodica() {
        return periodica;
    }

    public void setPeriodica(double periodica) {
        this.periodica = periodica;
    }

    public double getEfectiva() {
        return efectiva;
    }

    public void setEfectiva(double efectiva) {
        this.efectiva = efectiva;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
    
}
