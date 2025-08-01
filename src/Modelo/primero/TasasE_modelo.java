package Modelo.primero;

import static diseño_primero.TasasE.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TasasE_modelo {

    //datos de entrada
    private String interes;
    private double porcentaje;
    private double periodo_p;
    private String forma_p;

    //constantes de forma de pago
    final int diario = 360;
    final int mensual = 12;
    final int bimestral = 6;
    final int trimestral = 4;
    final int semestral = 2;
    final int anual = 1;

    int[] constantes = {360, 12, 6, 4, 2, 1};

    //metodo para los decimales
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

    public TasasE_modelo() {

    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPeriodo_p() {
        return periodo_p;
    }

    public void setPeriodo_p(double periodo_p) {
        this.periodo_p = periodo_p;
    }

    public String getForma_p() {
        return forma_p;
    }

    public void setForma_p(String forma_p) {
        this.forma_p = forma_p;
    }

    //////////////////////////////////////////////////////////////////////////////////
    public void NominalAnticipada() {

//      interes = btnNominalA.toString();
        porcentaje = Integer.parseInt(txtPorcentajeN.getText());

        //JOptionPane.showMessageDialog(null, porcentaje);
        //forma_p = btnGroupNominal.toString();
//        if (radAnticipadaN.isSelected() == true) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipadaaaaaaaaaa");
//        }
        //periodo_p = cmbNominal.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "boton oprimido");
        double resultado = 0;
        double resultadoF = 0;
        for (int i = 0; i <= 5; i++) {
            if (cmbNominal.getSelectedIndex() == i) {
                //JOptionPane.showMessageDialog(null, constantes[i]);
                resultado = Math.pow((1 / (1 - (porcentaje / 100 / constantes[i]))), (constantes[i])) - 1;
                resultadoF = resultado * Math.pow(10, 2);
                //DecimalFormat formateador = new DecimalFormat("#.####");

                //JOptionPane.showMessageDialog(null, formateador.format(resultadoF));
                resultadoF = formatearDecimales(resultadoF, 4);
                //JOptionPane.showMessageDialog(null, resultadoF);
            }
        }

        //JOptionPane.showMessageDialog(null, periodo_p);
//        if (radAnticipadaN.isSelected()) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipada");
//        }
        //aqui van todos los resultados
        //primero variables de anticipada
        double resultDa, resultMa, resultBa, resultTa, resultSa, resultAa;
        double da, ma, ba, ta, sa, aa;

        
        //resultDa = (1 - (1 / (1 + resultadoF / 100))) * 1 / 360;
        
        //resultDa = (Math.pow(1+resultadoF*0.01, (1/360)));
        resultDa = 1/Math.pow((1+resultadoF*0.01),(0.00277777777));
        //JOptionPane.showMessageDialog(null, 1-resultDa);
        resultDa = 1-resultDa;

        //result3 = result2 * 1/360;
        da = resultDa * Math.pow(10, 2);
        //da = formatearDecimales(da, 6);

        
        resultMa = 1/Math.pow((1+resultadoF*0.01),(0.08333333333));
        resultMa = 1-resultMa;
        ma = resultMa * Math.pow(10, 2);
        //ma = formatearDecimales(ma, 4);

        resultBa = 1/Math.pow((1+resultadoF*0.01),(0.16666666666));
        resultBa = 1-resultBa;
        ba = resultBa * Math.pow(10, 2);
        //ba = formatearDecimales(ba, 4);

        resultTa = 1/Math.pow((1+resultadoF*0.01),(0.25));
        resultTa = 1-resultTa;
        ta = resultTa * Math.pow(10, 2);
        //ta = formatearDecimales(ta, 4);

        resultSa = 1/Math.pow((1+resultadoF*0.01),(0.5));
        resultSa = 1-resultSa;
        sa = resultSa * Math.pow(10, 2);
        
        resultAa = 1/Math.pow((1+resultadoF*0.01),(1));
        resultAa = 1-resultAa;
        aa = resultAa * Math.pow(10, 2);

        //resultAda = Math.round(da*360);
        DecimalFormat formateador = new DecimalFormat("#.######");
        //JOptionPane.showMessageDialog(null, formateador.format(da));
        //Todas las anticipadas
        DA.setText("" + formateador.format(da));
        //DA.setText(""+formatearDecimales(da, 4));

        //DA.setText(""+da);
        MA.setText("" + formateador.format(ma));
        //MA.setText(""+ma);

        BA.setText("" + formateador.format(ba));
        //BA.setText("" + ba);

        TA.setText("" + formateador.format(ta));
        //TA.setText("" + ta);

        SA.setText("" + formateador.format(sa));
        AA.setText("" + formateador.format(aa));

        //ADA.setText("" +formatearDecimales(da*360, 4));
        ADA.setText("" + formateador.format(da * 360));
        AMA.setText("" + formateador.format(ma * 12));
        //AMA.setText(""+formatearDecimales(ma*12, 4));

        ABA.setText("" + formateador.format(ba * 6));
        //ABA.setText(""+formatearDecimales(ba*6, 4));

        ATA.setText("" + formateador.format(ta * 4));
        //ATA.setText(""+formatearDecimales(ta*4, 4));

        ASA.setText("" + formateador.format(sa * 2));
        AAA.setText("" + formateador.format(aa * 1));

        //segundo variables de vencida
        double resultDv, resultMv, resultBv, resultTv, resultSv, resultEa;
        double dv, mv, bv, tv, sv, ea;

        resultDv = Math.pow((1+resultadoF*0.01), (0.00277777777));
        resultDv = resultDv-1;
        //resultDv = 1 + resultadoF / 100 * 1 / 360 - 1;
        dv = resultDv * Math.pow(10, 2);

        resultMv = Math.pow((1+resultadoF*0.01), (0.08333333333));
        resultMv = resultMv-1;
        mv = resultMv * Math.pow(10, 2);

        resultBv = Math.pow((1+resultadoF*0.01), (0.16666666666));
        resultBv = resultBv-1;
        bv = resultBv * Math.pow(10, 2);

        resultTv = Math.pow((1+resultadoF*0.01), (0.25));
        resultTv = resultTv-1;
        tv = resultTv * Math.pow(10, 2);

        resultSv = Math.pow((1+resultadoF*0.01), (0.5));
        resultSv = resultSv-1;
        sv = resultSv * Math.pow(10, 2);

        resultEa = Math.pow((1+resultadoF*0.01), (1));
        resultEa = resultEa-1;
        ea = resultEa * Math.pow(10, 2);

        DV.setText("" + formateador.format(dv));
        MV.setText("" + formateador.format(mv));
        BV.setText("" + formateador.format(bv));
        TV.setText("" + formateador.format(tv));
        SV.setText("" + formateador.format(sv));
        EA.setText("" + formateador.format(ea));

        ADV.setText("" + formateador.format(dv * 360));
        AMV.setText("" + formateador.format(mv * 12));
        ABV.setText("" + formateador.format(bv * 6));
        ATV.setText("" + formateador.format(tv * 4));
        ASV.setText("" + formateador.format(sv * 2));
        AAV.setText("" + formateador.format(ea * 1));

    }
    
    //////////////////////////////////////////////////////////////////////////////////

    public void NominalVencida() {

//      interes = btnNominalA.toString();
        porcentaje = Integer.parseInt(txtPorcentajeN.getText());

        //JOptionPane.showMessageDialog(null, porcentaje);
        forma_p = btnGroupNominal.toString();

        if (radAnticipadaN.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "oprimiste anticipadaaaaaaaaaa");
        }
        //periodo_p = cmbNominal.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "boton oprimido");
        double resultado = 0;
        double resultadoF = 0;
        for (int i = 0; i <= 5; i++) {
            if (cmbNominal.getSelectedIndex() == i) {
                //JOptionPane.showMessageDialog(null, constantes[i]);
                resultado = Math.pow((1 + (porcentaje / 100 / constantes[i])), (constantes[i])) - 1;
                resultadoF = resultado * Math.pow(10, 2);
                DecimalFormat formateador = new DecimalFormat("#.####");

                //JOptionPane.showMessageDialog(null, formateador.format(resultadoF));
            }
        }

        //JOptionPane.showMessageDialog(null, periodo_p);
//        if (radAnticipadaN.isSelected()) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipada");
//        }
        //aqui van todos los resultados
        //primero variables de anticipada
        double resultDa, resultMa, resultBa, resultTa, resultSa, resultAa;
        double da, ma, ba, ta, sa, aa;

        //result2 = 1-(1/Math.pow(1+resultadoF/100, 1/360));
        //result2 = Math.pow((1-(1/1+resultadoF/100)),1/360);
        resultDa = 1/Math.pow((1+resultadoF*0.01),(0.00277777777));
        //JOptionPane.showMessageDialog(null, 1-resultDa);
        resultDa = 1-resultDa;

        //result3 = result2 * 1/360;
        da = resultDa * Math.pow(10, 2);
        
        
        resultMa = 1/Math.pow((1+resultadoF*0.01),(0.08333333333));
        resultMa = 1-resultMa;
        ma = resultMa * Math.pow(10, 2);
        //ma = formatearDecimales(ma, 4);
        
        
        resultBa = 1/Math.pow((1+resultadoF*0.01),(0.16666666666));
        resultBa = 1-resultBa;
        ba = resultBa * Math.pow(10, 2);
        //ba = formatearDecimales(ba, 4);
        
        
        resultTa = 1/Math.pow((1+resultadoF*0.01),(0.25));
        resultTa = 1-resultTa;
        ta = resultTa * Math.pow(10, 2);
        //ta = formatearDecimales(ta, 4);
        
        
        resultSa = 1/Math.pow((1+resultadoF*0.01),(0.5));
        resultSa = 1-resultSa;
        sa = resultSa * Math.pow(10, 2);
        
        
        resultAa = 1/Math.pow((1+resultadoF*0.01),(1));
        resultAa = 1-resultAa;
        aa = resultAa * Math.pow(10, 2);

        //resultAda = Math.round(da*360);
        DecimalFormat formateador = new DecimalFormat("#.######");
        //JOptionPane.showMessageDialog(null, formateador.format(da));
        //Todas las anticipadas
        DA.setText("" + formateador.format(da));
        MA.setText("" + formateador.format(ma));
        BA.setText("" + formateador.format(ba));
        TA.setText("" + formateador.format(ta));
        SA.setText("" + formateador.format(sa));
        AA.setText("" + formateador.format(aa));

        ADA.setText("" + formateador.format(da * 360));
        AMA.setText("" + formateador.format(ma * 12));
        ABA.setText("" + formateador.format(ba * 6));
        ATA.setText("" + formateador.format(ta * 4));
        ASA.setText("" + formateador.format(sa * 2));
        AAA.setText("" + formateador.format(aa * 1));

        //segundo variables de vencida
        double resultDv, resultMv, resultBv, resultTv, resultSv, resultEa;
        double dv, mv, bv, tv, sv, ea;

        //resultDv = Math.pow((1+resultadoF/100), (1/360)-1);
        resultDv = Math.pow((1+resultadoF*0.01), (0.00277777777));
        resultDv = resultDv-1;
        //resultDv = 1 + resultadoF / 100 * 1 / 360 - 1;
        dv = resultDv * Math.pow(10, 2);

        resultMv = Math.pow((1+resultadoF*0.01), (0.08333333333));
        resultMv = resultMv-1;
        mv = resultMv * Math.pow(10, 2);

        resultBv = Math.pow((1+resultadoF*0.01), (0.16666666666));
        resultBv = resultBv-1;
        bv = resultBv * Math.pow(10, 2);

        resultTv = Math.pow((1+resultadoF*0.01), (0.25));
        resultTv = resultTv-1;
        tv = resultTv * Math.pow(10, 2);

        resultSv = Math.pow((1+resultadoF*0.01), (0.5));
        resultSv = resultSv-1;
        sv = resultSv * Math.pow(10, 2);

        resultEa = Math.pow((1+resultadoF*0.01), (1));
        resultEa = resultEa-1;
        ea = resultEa * Math.pow(10, 2);

        DV.setText("" + formateador.format(dv));
        MV.setText("" + formateador.format(mv));
        BV.setText("" + formateador.format(bv));
        TV.setText("" + formateador.format(tv));
        SV.setText("" + formateador.format(sv));
        EA.setText("" + formateador.format(ea));

        ADV.setText("" + formateador.format(dv * 360));
        AMV.setText("" + formateador.format(mv * 12));
        ABV.setText("" + formateador.format(bv * 6));
        ATV.setText("" + formateador.format(tv * 4));
        ASV.setText("" + formateador.format(sv * 2));
        AAV.setText("" + formateador.format(ea * 1));

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //AQUI VAMOS A HACER EL METODO PARA CALCULAR LA PERIODICA 
    public void PeriodicaAnticipada() {

//      interes = btnNominalA.toString();
        porcentaje = Integer.parseInt(txtPorcentajeP.getText());

        //JOptionPane.showMessageDialog(null, porcentaje);
        forma_p = btnGroupNominal.toString();

//        if (radAnticipadaN.isSelected() == true) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipadaaaaaaaaaa");
//        }
        //periodo_p = cmbNominal.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "boton oprimido");
        double resultado = 0;
        double resultadoF = 0;
        for (int i = 0; i <= 5; i++) {
            if (cmbPeriodica.getSelectedIndex() == i) {
                //JOptionPane.showMessageDialog(null, constantes[i]);
                resultado = Math.pow((1 / (1 - porcentaje / 100)), (constantes[i])) - 1;
                resultadoF = resultado * Math.pow(10, 2);
                DecimalFormat formateador = new DecimalFormat("#.####");

                //JOptionPane.showMessageDialog(null, formateador.format(resultadoF));
            }
        }

        //JOptionPane.showMessageDialog(null, periodo_p);
//        if (radAnticipadaN.isSelected()) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipada");
//        }
        //aqui van todos los resultados
        //primero variables de anticipada
        double resultDa, resultMa, resultBa, resultTa, resultSa, resultAa;
        double da, ma, ba, ta, sa, aa;

        //result2 = 1-(1/Math.pow(1+resultadoF/100, 1/360));
        //result2 = Math.pow((1-(1/1+resultadoF/100)),1/360);
        resultDa = 1/Math.pow((1+resultadoF*0.01),(0.00277777777));
        //JOptionPane.showMessageDialog(null, 1-resultDa);
        resultDa = 1-resultDa;

        //result3 = result2 * 1/360;
        da = resultDa * Math.pow(10, 2);
        
        
        resultMa = 1/Math.pow((1+resultadoF*0.01),(0.08333333333));
        resultMa = 1-resultMa;
        ma = resultMa * Math.pow(10, 2);
        //ma = formatearDecimales(ma, 4);
        
        
        resultBa = 1/Math.pow((1+resultadoF*0.01),(0.16666666666));
        resultBa = 1-resultBa;
        ba = resultBa * Math.pow(10, 2);
        //ba = formatearDecimales(ba, 4);
        
        
        resultTa = 1/Math.pow((1+resultadoF*0.01),(0.25));
        resultTa = 1-resultTa;
        ta = resultTa * Math.pow(10, 2);
        //ta = formatearDecimales(ta, 4);
        
        
        resultSa = 1/Math.pow((1+resultadoF*0.01),(0.5));
        resultSa = 1-resultSa;
        sa = resultSa * Math.pow(10, 2);
        
        
        resultAa = 1/Math.pow((1+resultadoF*0.01),(1));
        resultAa = 1-resultAa;
        aa = resultAa * Math.pow(10, 2);

        //resultAda = Math.round(da*360);
        DecimalFormat formateador = new DecimalFormat("#.######");
        //JOptionPane.showMessageDialog(null, formateador.format(da));
        //Todas las anticipadas
        DA.setText("" + formateador.format(da));
        MA.setText("" + formateador.format(ma));
        BA.setText("" + formateador.format(ba));
        TA.setText("" + formateador.format(ta));
        SA.setText("" + formateador.format(sa));
        AA.setText("" + formateador.format(aa));

        ADA.setText("" + formateador.format(da * 360));
        AMA.setText("" + formateador.format(ma * 12));
        ABA.setText("" + formateador.format(ba * 6));
        ATA.setText("" + formateador.format(ta * 4));
        ASA.setText("" + formateador.format(sa * 2));
        AAA.setText("" + formateador.format(aa * 1));

        //segundo variables de vencida
        double resultDv, resultMv, resultBv, resultTv, resultSv, resultEa;
        double dv, mv, bv, tv, sv, ea;

        //resultDv = Math.pow((1+resultadoF/100), (1/360)-1);
        resultDv = Math.pow((1+resultadoF*0.01), (0.00277777777));
        resultDv = resultDv-1;
        //resultDv = 1 + resultadoF / 100 * 1 / 360 - 1;
        dv = resultDv * Math.pow(10, 2);

        resultMv = Math.pow((1+resultadoF*0.01), (0.08333333333));
        resultMv = resultMv-1;
        mv = resultMv * Math.pow(10, 2);

        resultBv = Math.pow((1+resultadoF*0.01), (0.16666666666));
        resultBv = resultBv-1;
        bv = resultBv * Math.pow(10, 2);

        resultTv = Math.pow((1+resultadoF*0.01), (0.25));
        resultTv = resultTv-1;
        tv = resultTv * Math.pow(10, 2);

        resultSv = Math.pow((1+resultadoF*0.01), (0.5));
        resultSv = resultSv-1;
        sv = resultSv * Math.pow(10, 2);

        resultEa = Math.pow((1+resultadoF*0.01), (1));
        resultEa = resultEa-1;
        ea = resultEa * Math.pow(10, 2);

        DV.setText("" + formateador.format(dv));
        MV.setText("" + formateador.format(mv));
        BV.setText("" + formateador.format(bv));
        TV.setText("" + formateador.format(tv));
        SV.setText("" + formateador.format(sv));
        EA.setText("" + formateador.format(ea));

        ADV.setText("" + formateador.format(dv * 360));
        AMV.setText("" + formateador.format(mv * 12));
        ABV.setText("" + formateador.format(bv * 6));
        ATV.setText("" + formateador.format(tv * 4));
        ASV.setText("" + formateador.format(sv * 2));
        AAV.setText("" + formateador.format(ea * 1));

    }

    public void PeriodicaVencida() {

//      interes = btnNominalA.toString();
        porcentaje = Integer.parseInt(txtPorcentajeP.getText());

        //JOptionPane.showMessageDialog(null, porcentaje);
        forma_p = btnGroupNominal.toString();

//        if (radAnticipadaN.isSelected() == true) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipadaaaaaaaaaa");
//        }
        //periodo_p = cmbNominal.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "boton oprimido");
        double resultado = 0;
        double resultadoF = 0;
        for (int i = 0; i <= 5; i++) {
            if (cmbPeriodica.getSelectedIndex() == i) {
                //JOptionPane.showMessageDialog(null, constantes[i]);
                resultado = Math.pow((1 + porcentaje / 100), (constantes[i])) - 1;
                resultadoF = resultado * Math.pow(10, 2);
                DecimalFormat formateador = new DecimalFormat("#.####");

                //JOptionPane.showMessageDialog(null, formateador.format(resultadoF));
            }
        }

        //JOptionPane.showMessageDialog(null, periodo_p);
//        if (radAnticipadaN.isSelected()) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipada");
//        }
        //aqui van todos los resultados
        //primero variables de anticipada
        double resultDa, resultMa, resultBa, resultTa, resultSa, resultAa;
        double da, ma, ba, ta, sa, aa;

        //result2 = 1-(1/Math.pow(1+resultadoF/100, 1/360));
        //result2 = Math.pow((1-(1/1+resultadoF/100)),1/360);
        resultDa = 1/Math.pow((1+resultadoF*0.01),(0.00277777777));
        //JOptionPane.showMessageDialog(null, 1-resultDa);
        resultDa = 1-resultDa;

        //result3 = result2 * 1/360;
        da = resultDa * Math.pow(10, 2);
        
        
        resultMa = 1/Math.pow((1+resultadoF*0.01),(0.08333333333));
        resultMa = 1-resultMa;
        ma = resultMa * Math.pow(10, 2);
        //ma = formatearDecimales(ma, 4);
        
        
        resultBa = 1/Math.pow((1+resultadoF*0.01),(0.16666666666));
        resultBa = 1-resultBa;
        ba = resultBa * Math.pow(10, 2);
        //ba = formatearDecimales(ba, 4);
        
        
        resultTa = 1/Math.pow((1+resultadoF*0.01),(0.25));
        resultTa = 1-resultTa;
        ta = resultTa * Math.pow(10, 2);
        //ta = formatearDecimales(ta, 4);
        
        
        resultSa = 1/Math.pow((1+resultadoF*0.01),(0.5));
        resultSa = 1-resultSa;
        sa = resultSa * Math.pow(10, 2);
        
        
        resultAa = 1/Math.pow((1+resultadoF*0.01),(1));
        resultAa = 1-resultAa;
        aa = resultAa * Math.pow(10, 2);

        //resultAda = Math.round(da*360);
        DecimalFormat formateador = new DecimalFormat("#.######");
        //JOptionPane.showMessageDialog(null, formateador.format(da));
        //Todas las anticipadas
        DA.setText("" + formateador.format(da));
        MA.setText("" + formateador.format(ma));
        BA.setText("" + formateador.format(ba));
        TA.setText("" + formateador.format(ta));
        SA.setText("" + formateador.format(sa));
        AA.setText("" + formateador.format(aa));

        ADA.setText("" + formateador.format(da * 360));
        AMA.setText("" + formateador.format(ma * 12));
        ABA.setText("" + formateador.format(ba * 6));
        ATA.setText("" + formateador.format(ta * 4));
        ASA.setText("" + formateador.format(sa * 2));
        AAA.setText("" + formateador.format(aa * 1));

        //segundo variables de vencida
        double resultDv, resultMv, resultBv, resultTv, resultSv, resultEa;
        double dv, mv, bv, tv, sv, ea;

        //resultDv = Math.pow((1+resultadoF/100), (1/360)-1);
        resultDv = Math.pow((1+resultadoF*0.01), (0.00277777777));
        resultDv = resultDv-1;
        //resultDv = 1 + resultadoF / 100 * 1 / 360 - 1;
        dv = resultDv * Math.pow(10, 2);

        resultMv = Math.pow((1+resultadoF*0.01), (0.08333333333));
        resultMv = resultMv-1;
        mv = resultMv * Math.pow(10, 2);

        resultBv = Math.pow((1+resultadoF*0.01), (0.16666666666));
        resultBv = resultBv-1;
        bv = resultBv * Math.pow(10, 2);

        resultTv = Math.pow((1+resultadoF*0.01), (0.25));
        resultTv = resultTv-1;
        tv = resultTv * Math.pow(10, 2);

        resultSv = Math.pow((1+resultadoF*0.01), (0.5));
        resultSv = resultSv-1;
        sv = resultSv * Math.pow(10, 2);

        resultEa = Math.pow((1+resultadoF*0.01), (1));
        resultEa = resultEa-1;
        ea = resultEa * Math.pow(10, 2);

        DV.setText("" + formateador.format(dv));
        MV.setText("" + formateador.format(mv));
        BV.setText("" + formateador.format(bv));
        TV.setText("" + formateador.format(tv));
        SV.setText("" + formateador.format(sv));
        EA.setText("" + formateador.format(ea));

        ADV.setText("" + formateador.format(dv * 360));
        AMV.setText("" + formateador.format(mv * 12));
        ABV.setText("" + formateador.format(bv * 6));
        ATV.setText("" + formateador.format(tv * 4));
        ASV.setText("" + formateador.format(sv * 2));
        AAV.setText("" + formateador.format(ea * 1));

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //METODO PARA CALCULAR LA EFECTIVA
    public void Efectiva() {

//      interes = btnNominalA.toString();
        porcentaje = Integer.parseInt(txtPorcentajeE.getText());

        //JOptionPane.showMessageDialog(null, porcentaje);
        forma_p = btnGroupNominal.toString();

//        if (radAnticipadaN.isSelected() == true) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipadaaaaaaaaaa");
//        }
        //periodo_p = cmbNominal.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "boton oprimido");
        double resultado = 0;
        double resultadoF = porcentaje;

        //JOptionPane.showMessageDialog(null, periodo_p);
//        if (radAnticipadaN.isSelected()) {
//            JOptionPane.showMessageDialog(null, "oprimiste anticipada");
//        }
        //aqui van todos los resultados
        //primero variables de anticipada
        double resultDa, resultMa, resultBa, resultTa, resultSa, resultAa;
        double da, ma, ba, ta, sa, aa;

        //result2 = 1-(1/Math.pow(1+resultadoF/100, 1/360));
        //result2 = Math.pow((1-(1/1+resultadoF/100)),1/360);
        resultDa = 1/Math.pow((1+resultadoF*0.01),(0.00277777777));
        //JOptionPane.showMessageDialog(null, 1-resultDa);
        resultDa = 1-resultDa;

        //result3 = result2 * 1/360;
        da = resultDa * Math.pow(10, 2);
        
        
        resultMa = 1/Math.pow((1+resultadoF*0.01),(0.08333333333));
        resultMa = 1-resultMa;
        ma = resultMa * Math.pow(10, 2);
        //ma = formatearDecimales(ma, 4);
        
        
        resultBa = 1/Math.pow((1+resultadoF*0.01),(0.16666666666));
        resultBa = 1-resultBa;
        ba = resultBa * Math.pow(10, 2);
        //ba = formatearDecimales(ba, 4);
        
        
        resultTa = 1/Math.pow((1+resultadoF*0.01),(0.25));
        resultTa = 1-resultTa;
        ta = resultTa * Math.pow(10, 2);
        //ta = formatearDecimales(ta, 4);
        
        
        resultSa = 1/Math.pow((1+resultadoF*0.01),(0.5));
        resultSa = 1-resultSa;
        sa = resultSa * Math.pow(10, 2);
        
        
        resultAa = 1/Math.pow((1+resultadoF*0.01),(1));
        resultAa = 1-resultAa;
        aa = resultAa * Math.pow(10, 2);

        //resultAda = Math.round(da*360);
        DecimalFormat formateador = new DecimalFormat("#.######");
        //JOptionPane.showMessageDialog(null, formateador.format(da));
        //Todas las anticipadas
        DA.setText("" + formateador.format(da));
        MA.setText("" + formateador.format(ma));
        BA.setText("" + formateador.format(ba));
        TA.setText("" + formateador.format(ta));
        SA.setText("" + formateador.format(sa));
        AA.setText("" + formateador.format(aa));

        ADA.setText("" + formateador.format(da * 360));
        AMA.setText("" + formateador.format(ma * 12));
        ABA.setText("" + formateador.format(ba * 6));
        ATA.setText("" + formateador.format(ta * 4));
        ASA.setText("" + formateador.format(sa * 2));
        AAA.setText("" + formateador.format(aa * 1));

        //segundo variables de vencida
        double resultDv, resultMv, resultBv, resultTv, resultSv, resultEa;
        double dv, mv, bv, tv, sv, ea;

        //resultDv = Math.pow((1+resultadoF/100), (1/360)-1);
        resultDv = Math.pow((1+resultadoF*0.01), (0.00277777777));
        resultDv = resultDv-1;
        //resultDv = 1 + resultadoF / 100 * 1 / 360 - 1;
        dv = resultDv * Math.pow(10, 2);

        resultMv = Math.pow((1+resultadoF*0.01), (0.08333333333));
        resultMv = resultMv-1;
        mv = resultMv * Math.pow(10, 2);

        resultBv = Math.pow((1+resultadoF*0.01), (0.16666666666));
        resultBv = resultBv-1;
        bv = resultBv * Math.pow(10, 2);

        resultTv = Math.pow((1+resultadoF*0.01), (0.25));
        resultTv = resultTv-1;
        tv = resultTv * Math.pow(10, 2);

        resultSv = Math.pow((1+resultadoF*0.01), (0.5));
        resultSv = resultSv-1;
        sv = resultSv * Math.pow(10, 2);

        resultEa = Math.pow((1+resultadoF*0.01), (1));
        resultEa = resultEa-1;
        ea = resultEa * Math.pow(10, 2);

        DV.setText("" + formateador.format(dv));
        MV.setText("" + formateador.format(mv));
        BV.setText("" + formateador.format(bv));
        TV.setText("" + formateador.format(tv));
        SV.setText("" + formateador.format(sv));
        EA.setText("" + formateador.format(ea));

        ADV.setText("" + formateador.format(dv * 360));
        AMV.setText("" + formateador.format(mv * 12));
        ABV.setText("" + formateador.format(bv * 6));
        ATV.setText("" + formateador.format(tv * 4));
        ASV.setText("" + formateador.format(sv * 2));
        AAV.setText("" + formateador.format(ea * 1));

    }

}
