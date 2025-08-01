/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas_base;

import java.math.BigDecimal;
import diseño_segundo.Futuro_couta;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class ValorCuota_Futuro {
    
    double InteresInVencido;
    double InteresInAnticipado;
    

    public double getInteresInVencido() {
        return InteresInVencido;
    }

    public double getInteresInAnticipado() {
        return InteresInAnticipado;
    }

    public void setInteresInVencido(double InteresInVencido) {
        this.InteresInVencido = InteresInVencido;
    }

    public void setInteresInAnticipado(double InteresInAnticipado) {
        this.InteresInAnticipado = InteresInAnticipado;
    }

    public ValorCuota_Futuro() {
        this.InteresInVencido = InteresInVencido;
        this.InteresInAnticipado = InteresInAnticipado;
    }
    
    public String VFuturo_CVencida_IVencido(double a, int i, int  n){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.pow((1+exponente), n);
    double resul=(double)a*((formulacion1-1)/exponente);
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String VFuturo_CAnticipada_IVencido(double a, int i, int  n){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.pow((1+exponente), n);
    double formulacion2=(double)(1+exponente);
    double resul=(double)a*((formulacion1-1)/exponente)*formulacion2;
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String VFuturo_CAnticipadaVencida_IAnticipado(double a, int i, int  n){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    exponente=(double)exponente/(1-exponente);
    double formulacion1=(double)Math.pow((1+exponente), n);
    double formulacion2=(double)(1+exponente);
    double resul=(double)a*((formulacion1-1)/exponente)*formulacion2;
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String CUniforme_CVencida_IVencido(double f, int i, int  n){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.pow((1+exponente), n);
    double resul=(double)f*(exponente/(formulacion1-1));
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String CUniforme_CAnticipada_IVencido(double f, int i, int  n){
        DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.pow((1+exponente), n);
    double formulacion2=(double)(1/(1+exponente));
    double resul=(double)f*(exponente/(formulacion1-1))*formulacion2;
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String CUniforme_CVencida_IAnticipado(double f, int i, int  n){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    exponente=(double)exponente/(1+exponente);
    double formulacion1=(double)Math.pow((1+exponente), n);
    double resul=(double)f*(exponente/(formulacion1-1));
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public String CUniforme_CAnticipada_IAnticipado(double f, int i, int  n){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    exponente=(double)exponente/(1-exponente);
    double formulacion1=(double)Math.pow((1+exponente), n);
    double formulacion2=(double)(1/(1+exponente));
    double resul=(double)f*(exponente/(formulacion1-1))*formulacion2;
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    String valorFormateado = formato.format(Double.parseDouble(bg2.toString()));
    return valorFormateado;
    }
    
    public double NPeriodos_CVencida_IVencido(double f, double a, int  i){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.log(1+exponente);
    double formulacion2=(double)f/a;
    double resul=(double)Math.log(exponente*formulacion2+1)/formulacion1;
    bg1=new BigDecimal(resul);
    bg2=bg1.setScale(2,RoundingMode.CEILING);
    return Double.parseDouble(bg2.toString());
    }
    
    public double NPeriodos_CAnticipada_IVencido(double f, double a, int  i){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    double formulacion1=(double)Math.log(1+exponente);
    double formulacion2=(double)a*(1+exponente);
    double resul=(double)Math.log(((exponente*f)/formulacion2)+1)/formulacion1;
    return resul;
    }
    
    public double NPeriodos_CVencida_IAnticipado(double f, double a, int  i){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    exponente=(double)exponente/(1-exponente);
    double formulacion1=(double)Math.log(1+exponente);
    double formulacion2=(double)f/a;
    double resul=(double)Math.log(exponente*formulacion2+1)/formulacion1;
    return resul;
    }
    
    public double NPeriodos_CAnticipada_IAnticipado(double f, double a, int  i){
DecimalFormat formato = new DecimalFormat("#,###.00");
        BigDecimal bg1, bg2;
        
    double exponente=(double)i/100;
    exponente=(double)exponente/(1-exponente);
    double formulacion1=(double)Math.log(1+exponente);
    double formulacion2=(double)a*(1+exponente);
    double resul=(double)Math.log(((exponente*f)/formulacion2)+1)/formulacion1;
    return resul;
    }
    
}
