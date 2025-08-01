/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas_base;

/**
 *
 * @author usuario
 */
import diseño_primero.Periodica;
import java.math.BigDecimal;
public class Interes_periodico {

    double valorBaseAnticipado=10;
    double valorBaseVencido=10;
    

    public double getValorBaseAnticipado() {
        return valorBaseAnticipado;
    }

    public double getValorBaseVencido() {
        return valorBaseVencido;
    }

    public void setValorBaseAnticipado(double valorBaseAnticipado) {
        this.valorBaseAnticipado = valorBaseAnticipado;
    }

    public void setValorBaseVencido(double valorBaseVencido) {
        this.valorBaseVencido = valorBaseVencido;
    }

    public Interes_periodico() {
        this.valorBaseAnticipado=valorBaseAnticipado;
        this.valorBaseVencido=valorBaseVencido;
    }
    
    
    
    
    public double pedidoDatosAnticipado(int n, double valorIn){
        double resul=(Math.pow(1/(1-(valorIn/100)), n)-1)*100;
        return resul;
    }
    
    public double pedidoDatosVencido(int n, double valorIn){
        double resul=(Math.pow((1+(valorIn/100)), n)-1)*100;
        return resul;
    }
    
    public double hallarPeriodicoAnticipado(int n){
        double prueba1=(double)Double.parseDouble(Periodica.txtPrueba.getText())/100;
        double exponente1=(double)1/n;
        double prueba2=(double)(Math.pow(1+prueba1, exponente1));
    double resulFinal=(1-(1/prueba2))*100;
    return resulFinal;
    }
    

    
    public double hallarPeriodicoVencido(int n){
        double prueba1=(double)Double.parseDouble(Periodica.txtPrueba.getText())/100;
        double exponente1=(double)1/n;
    double resulFinal=(Math.pow(1+prueba1, exponente1)-1)*100;
    return resulFinal;
    }
    
}
