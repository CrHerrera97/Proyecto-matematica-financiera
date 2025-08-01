package diseño_tercero;

import diseño_tercero.Cuota_Constante;
import Modelo.tercero.Capital_Constante_modelo;
import diseño_primero.ConversionT;
import diseño_primero.Diseño;
import diseño_segundo.Presente_futuro;
import diseño_segundo.Valor_del_dinero;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Capital_Constante extends javax.swing.JFrame {

    DecimalFormat formato = new DecimalFormat("#");
    DefaultTableModel dtm = new DefaultTableModel();

    public Capital_Constante() {
        initComponents();
        this.setLocationRelativeTo(null);

        String[] titulo = new String[]{"#", "Valor de la Cuota", "Interes", "Abono Capital", "Saldo Deuda", "Cambio Interes"};
        dtm.setColumnIdentifiers(titulo);
        tabla.setModel(dtm);

    }

    public void agregarDatosTabla(double prestamo, double interes, int cuota, double abonoCapital) {
        double interesCalculado = 0;
        double saldoDeuda = prestamo;
        double valorCuota = 0;

        for (int i = 1; i <= cuota; i++) {

            interesCalculado = Math.round(saldoDeuda * 0.01);
            valorCuota = Math.round(interesCalculado + abonoCapital);
            saldoDeuda = Math.round(saldoDeuda + interesCalculado - valorCuota);

            if (saldoDeuda <= 0) {
                saldoDeuda = 0;
            }

            dtm.addRow(new Object[]{
                i,
                formato.format(valorCuota),
                formato.format(interesCalculado),
                formato.format(abonoCapital),
                formato.format(saldoDeuda),
                formato.format(interes)
            });
        }
    }

    public void limpiarTabla() {
        while (tabla.getRowCount() > 0) {
            dtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        P_F = new javax.swing.JLabel();
        C_c = new javax.swing.JLabel();
        Menu1 = new javax.swing.JPanel();
        txtInteres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrestamo = new javax.swing.JTextField();
        txtCuota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/casa.jpg"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        P_F.setText("Capital Constante");
        P_F.setToolTipText("");
        P_F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FMouseClicked(evt);
            }
        });

        C_c.setText("Couta Constante");
        C_c.setToolTipText("");
        C_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_cMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(P_F, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(C_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_F, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        Menu1.setBackground(new java.awt.Color(255, 255, 255));
        Menu1.setBorder(javax.swing.BorderFactory.createTitledBorder("Capital Constante"));

        jLabel2.setText("Interes");

        jLabel1.setText("Prestamo");

        jLabel6.setText("Cuantos Meses");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbTotal.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setText("Abono Capital");

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(Menu1Layout.createSequentialGroup()
                        .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 110));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mes", "Capital", "Interes", "Saldo","Valor cuota"
            }
        ));
        tabla.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 700, 340));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/linea-gris-0_opt.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 790, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/fondo2-lanczos3.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Diseño ds = new Diseño();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double prestamo = Double.parseDouble(txtPrestamo.getText());
        double interes = Double.parseDouble(txtInteres.getText());
        int cuota = Integer.parseInt(txtCuota.getText());
        Capital_Constante_modelo sm = new Capital_Constante_modelo(prestamo, interes, cuota);

        limpiarTabla();

        double abonoCapital = sm.abonoCapital();
        lbTotal.setText("" + formato.format(abonoCapital));

        dtm.addRow(new Object[]{0, 0, 0, Math.round(prestamo), Math.round(interes)});
        agregarDatosTabla(prestamo, interes, cuota, abonoCapital);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void P_FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FMouseClicked
        Capital_Constante cc = new Capital_Constante();

        cc.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_P_FMouseClicked

    private void C_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_cMouseClicked
        Cuota_Constante cc = new Cuota_Constante();

        cc.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_C_cMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cuota_Constante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuota_Constante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuota_Constante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuota_Constante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuota_Constante().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel C_c;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Menu1;
    private javax.swing.JLabel P_F;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txtCuota;
    public static javax.swing.JTextField txtInteres;
    public static javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
