package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import barreiralarrañaga.Dominio.Sorteo;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;

public class PanelSorteo extends javax.swing.JPanel implements Observer {

    Sistema unSis;

    public PanelSorteo(Sistema sis) {

        initComponents();
        unSis = sis;
        btnSortear.setEnabled(false);
        if (unSis.getSorteoActual() != null) {
            lblSorteoActual.setText(unSis.getSorteoActual().getNombre());
            if (unSis.getParticipantesSorteo().size() > 0) {
                btnSortear.setEnabled(true);
            }
        } else {
            btnSortear.setEnabled(false);
        }
        cargarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTitulo = new javax.swing.JLabel();
        btnNuevoSorteo = new javax.swing.JButton();
        btnSortear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSorteos = new javax.swing.JTable();
        lblSorteo = new javax.swing.JLabel();
        lblSorteoActual = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(683, 548));
        setMinimumSize(new java.awt.Dimension(683, 548));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(683, 548));

        btnTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/sorteosTitulo.png"))); // NOI18N

        btnNuevoSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/nuevoSorteoIcon.png"))); // NOI18N
        btnNuevoSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSorteoActionPerformed(evt);
            }
        });

        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/sortearIcon.png"))); // NOI18N
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        tablaSorteos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Ganadores", "Participantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSorteos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSorteosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSorteos);

        lblSorteo.setText("Sorteo Actual: ");

        lblSorteoActual.setText("No hay sorteos activos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTitulo)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSorteo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSorteoActual)
                        .addGap(224, 224, 224))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSorteo)
                    .addComponent(lblSorteoActual))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnNuevoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSorteoActionPerformed
        NuevoSorteoUI nuevoSorteo = new NuevoSorteoUI(unSis,this);
        nuevoSorteo.setVisible(true);

    }//GEN-LAST:event_btnNuevoSorteoActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        SorteoUI resultados = new SorteoUI(unSis, this);
        resultados.setVisible(true);
        btnSortear.setEnabled(false);
    }//GEN-LAST:event_btnSortearActionPerformed

    private void tablaSorteosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSorteosMouseClicked
        int index = tablaSorteos.getSelectedRow();

        Sorteo ev = unSis.getSorteos().get(index);
        ResultadosSorteoDetallado resultado = new ResultadosSorteoDetallado(ev);
        resultado.setVisible(true);
    }//GEN-LAST:event_tablaSorteosMouseClicked
    public void cargarLista() {
        borrarCacheTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaSorteos.getModel();
        ArrayList<Sorteo> sorteoTabla = unSis.getSorteos();
        for (int i = 0; i < sorteoTabla.size(); i++) {
            Sorteo sor = sorteoTabla.get(i);
            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tablaSorteos.setValueAt(sor.getNombre(), i, 0);
            tablaSorteos.setValueAt(sor.getPremio(), i, 1);
            tablaSorteos.setValueAt(sor.getGanadores().size(), i, 2);
            tablaSorteos.setValueAt(sor.getCantidadParticipantes(), i, 3);
        }
    }

    private void borrarCacheTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaSorteos.getModel();
        int filas = tablaSorteos.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }
   @Override
    public void update(Observable o, Object arg) {
        cargarLista();
        lblSorteoActual.setText(unSis.getSorteoActual().getNombre());
        btnSortear.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoSorteo;
    private javax.swing.JButton btnSortear;
    private javax.swing.JLabel btnTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSorteo;
    private javax.swing.JLabel lblSorteoActual;
    private javax.swing.JTable tablaSorteos;
    // End of variables declaration//GEN-END:variables

 
}
