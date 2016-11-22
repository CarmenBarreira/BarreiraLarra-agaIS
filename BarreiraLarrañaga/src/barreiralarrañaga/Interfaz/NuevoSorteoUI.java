package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import barreiralarrañaga.Dominio.Sorteo;
import javax.swing.JOptionPane;

public class NuevoSorteoUI extends javax.swing.JFrame {

    Sistema sis;
    PanelSorteo updateSort;

    public NuevoSorteoUI(Sistema unSis, PanelSorteo pSort) {
        initComponents();
        sis = unSis;
        updateSort = pSort;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGanadores = new javax.swing.JLabel();
        spinnerGanadores = new javax.swing.JSpinner();
        btnCrear = new javax.swing.JButton();
        LblNuevoSorteo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        txtNombreSorteo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionPremio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Sorteo");

        lblGanadores.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblGanadores.setText("Cantidad de Ganadores:");

        btnCrear.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        btnCrear.setText("Crear Sorteo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        LblNuevoSorteo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        LblNuevoSorteo.setText("Nuevo Sorteo");

        lblNombre.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblNombre.setText("Nombre de sorteo:");

        lblDesc.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDesc.setText("Descripción de premio:");

        txtDescripcionPremio.setColumns(20);
        txtDescripcionPremio.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        txtDescripcionPremio.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionPremio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDesc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreSorteo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGanadores)
                                .addGap(28, 28, 28)
                                .addComponent(spinnerGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(LblNuevoSorteo)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNuevoSorteo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGanadores)
                    .addComponent(spinnerGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        int valueSpinner = (Integer) spinnerGanadores.getValue();
        int resp = 0;
        if (!txtNombreSorteo.getText().isEmpty()) {
            if (valueSpinner > 0) {
                if (!txtDescripcionPremio.getText().isEmpty()) {
                    if (sis.getSorteoActual() != null) {
                        resp = JOptionPane.showConfirmDialog(this,
                                "Esta seguro que quiere sobreescribir el sorteo actual?",
                                "Sorteo en marcha", JOptionPane.YES_NO_OPTION);
                    }
                    if (resp == 0) {
                        Sorteo sorteoActual = new Sorteo(txtNombreSorteo.getText(),
                                txtDescripcionPremio.getText(), valueSpinner);
                        sis.setSorteoActual(sorteoActual);
                        updateSort.update(null, null);
                        this.dispose();
                    } else if (resp == 1) {
                         updateSort.update(null, null);
                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese una descripcion para el premio",
                            "Premio Invalido", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Se necesita al menos un ganador",
                        "Cantidad de ganadores invalida", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para el sorteo",
                    "Nombre Invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblNuevoSorteo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblGanadores;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JSpinner spinnerGanadores;
    private javax.swing.JTextArea txtDescripcionPremio;
    private javax.swing.JTextField txtNombreSorteo;
    // End of variables declaration//GEN-END:variables
}