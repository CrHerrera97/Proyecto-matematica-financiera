/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.segungo;

import diseño_segundo.Presente_futuro.*;
//import static diseño_segundo.Presente_futuro.jTextField1;
import static diseño_segundo.Presente_futuro.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Herrera
 */
public class PresenteF_modelo {

    private float valorP;
    private float valorF;
    private float tasaP;
    private float numeroP;

    public PresenteF_modelo(float valorP, float valorF, float tasaP, float numeroP) {
        this.valorP = valorP;
        this.valorF = valorF;
        this.tasaP = tasaP;
        this.numeroP = numeroP;
    }

    public float getValorP() {
        return valorP;
    }

    public void setValorP(float valorP) {
        this.valorP = valorP;
    }

    public float getValorF() {
        return valorF;
    }

    public void setValorF(float valorF) {
        this.valorF = valorF;
    }

    public float getTasaP() {
        return tasaP;
    }

    public void setTasaP(float tasaP) {
        this.tasaP = tasaP;
    }

    public float getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(float numeroP) {
        this.numeroP = numeroP;
    }

    public PresenteF_modelo() {

    }

    public void valorPresentePagoI() {

        //Just do it
        //I can do it!!!
        double result = 0;

        //valorP = Integer.parseInt(jTextField1.getText());
        valorP = 0;
        valorF = Integer.parseInt(jTextField2.getText());
        tasaP = Integer.parseInt(jTextField3.getText());
        numeroP = Integer.parseInt(jTextField4.getText());

        result = valorF / Math.pow((1 + tasaP * 0.01), numeroP);

        //DecimalFormat formateador = new DecimalFormat("#");
        jTextField1.setText(Float.toString((float) result));

        //JOptionPane.showMessageDialog(null, formateador.format(result));
    }

    public void valorFuturoPagoI() {
        double result = 0;

        valorP = Integer.parseInt(jTextField1.getText());
        valorF = 0;
        tasaP = Integer.parseInt(jTextField3.getText());
        numeroP = Integer.parseInt(jTextField4.getText());

        result = valorP * Math.pow((1 + tasaP * 0.01), numeroP);

        //DecimalFormat formateador = new DecimalFormat("#");
        jTextField2.setText(Float.toString((float) result));
        //JOptionPane.showMessageDialog(null, formateador.format(result));
    }

    public void tasaPeriodicaPagoI() {

        double result = 0;
        double result2 = 0;

        valorP = Integer.parseInt(jTextField1.getText());
        valorF = Integer.parseInt(jTextField2.getText());
        tasaP = 0;
        numeroP = Integer.parseInt(jTextField4.getText());

        result = Math.pow((valorF / valorP), 1 / numeroP) - 1;
        //result = (valorF/valorP);
        result2 = result * Math.pow(10, 2);

        //DecimalFormat formateador = new DecimalFormat("#.##");
        jTextField3.setText(Float.toString((float) result2));
        //JOptionPane.showMessageDialog(null, formateador.format(result2));
    }

    //este resultado si se va para la porra
    public void numeroPeriodosPagoI() {
        double result = 0;

        valorP = Integer.parseInt(jTextField1.getText());
        valorF = Integer.parseInt(jTextField2.getText());
        tasaP = Integer.parseInt(jTextField3.getText());
        numeroP = 0;

        result = (Math.log(valorF) - Math.log(valorP)) / Math.log(1 + tasaP * 0.01);

        //DecimalFormat formateador = new DecimalFormat("#.##");
        jTextField4.setText(Float.toString((float) result));
        //JOptionPane.showMessageDialog(null, formateador.format(result));

        //JOptionPane.showMessageDialog(null, result);
    }
}
