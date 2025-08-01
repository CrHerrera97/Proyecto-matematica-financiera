/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas_base;

/**
 *
 * @author User
 */

import diseño_primero.Periodica;
import java.math.BigDecimal;
public class In_Pe_Pago_Vencido {
    
    public double VFuturo_CVencida_IVencido(double a, int i, int  n){
    double resul=a*((Math.pow((1+i), 2)-1)/i);
    return resul;
    }
}
