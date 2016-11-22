package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Cliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import barreiralarrañaga.Dominio.Sorteo;


public final class ResultadosSorteoDetallado extends javax.swing.JFrame {

    Sorteo sorteoDesc;

    public ResultadosSorteoDetallado(Sorteo sor) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        initComponents();
        sorteoDesc = sor;
        borrarCacheTablaGanadores();

        cargarListaGanadores();

        fechaLbl.setText(dateFormat.format(sor.getFecha()));
        lblNombreSOrteo.setText(sor.getNombre());
        txtAreaDesc.setText(sor.getPremio());
    }

    public void cargarListaGanadores() {
        borrarCacheTablaGanadores();

        DefaultTableModel modelo = (DefaultTableModel) tablaGanadores.getModel();
        ArrayList<Cliente> ganadoresArray = sorteoDesc.getGanadores();
        for (int i = 0; i < ganadoresArray.size(); i++) {
            Cliente ganador = ganadoresArray.get(i);
            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tablaGanadores.setValueAt(ganador.getNombreCliente(), i, 1);
            tablaGanadores.setValueAt(ganador.getEmailCliente(), i, 0);
        }
    }

    private void borrarCacheTablaGanadores() {
        DefaultTableModel modelo = (DefaultTableModel) tablaGanadores.getModel();
        int filas = tablaGanadores.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextGanadores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGanadores = new javax.swing.JTable();
        lblNombreSorteo = new javax.swing.JLabel();
        lblDescripcionPremios = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();
        fechaLbl = new javax.swing.JLabel();
        lblNombreSOrteo = new javax.swing.JLabel();
        lblTextResumenSorteo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumen de Sorteo");

        lblTextGanadores.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        lblTextGanadores.setText("Ganadores");

        tablaGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Correo", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tablaGanadores);

        lblNombreSorteo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblNombreSorteo.setText("Nombre de sorteo:");

        lblDescripcionPremios.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDescripcionPremios.setText("Descripción de premios:");

        lblFecha.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtAreaDesc.setEditable(false);
        txtAreaDesc.setColumns(20);
        txtAreaDesc.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        txtAreaDesc.setRows(5);
        jScrollPane3.setViewportView(txtAreaDesc);

        lblTextResumenSorteo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        lblTextResumenSorteo.setText("Resumen de sorteo");

        btnSalir.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblTextGanadores)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcionPremios)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTextResumenSorteo)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblFecha)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fechaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblNombreSorteo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblNombreSOrteo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(0, 49, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTextResumenSorteo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreSOrteo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreSorteo))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha)
                    .addComponent(fechaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcionPremios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTextGanadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadosSorteoDetallado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosSorteoDetallado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosSorteoDetallado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosSorteoDetallado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDescripcionPremios;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombreSOrteo;
    private javax.swing.JLabel lblNombreSorteo;
    private javax.swing.JLabel lblTextGanadores;
    private javax.swing.JLabel lblTextResumenSorteo;
    private javax.swing.JTable tablaGanadores;
    private javax.swing.JTextArea txtAreaDesc;
    // End of variables declaration//GEN-END:variables
}
