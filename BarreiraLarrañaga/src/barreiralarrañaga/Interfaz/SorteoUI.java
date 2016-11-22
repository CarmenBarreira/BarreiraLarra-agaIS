/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Cliente;
import barreiralarrañaga.Dominio.Sistema;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan
 */
public final class SorteoUI extends javax.swing.JFrame {

    Sistema unSis;
    ArrayList<Cliente> arrayGanadores;

    /**
     * Creates new form SorteoUI
     * @param sis
     */
    public SorteoUI(Sistema sis) {
        unSis = sis;
        initComponents();

        Date date = new Date();
        ArrayList<Cliente> partAux = (ArrayList<Cliente>) unSis.getParticipantesSorteo().clone();
        unSis.getSorteoActual().setParticipantes(unSis.getParticipantesSorteo());
        unSis.getSorteoActual().setCantidadParticipantes(unSis.getSorteoActual().getParticipantes().size());
        arrayGanadores = unSis.sortear();
        unSis.getSorteoActual().setGanadores(arrayGanadores);
        lblLoadNombreSorteo.setText(unSis.getSorteoActual().getNombre());
        lblLoadDesc.setText(unSis.getSorteoActual().getPremio());
        lblLoadPart.setText("" + unSis.getSorteoActual().getCantidadParticipantes());
        unSis.getSorteoActual().setParticipantes(partAux);
        unSis.getSorteoActual().setFecha(date);
        cargarLista();

        unSis.getSorteos().add(unSis.getSorteoActual());
        unSis.setSorteoActual(null);
    }

    public void cargarLista() {
        borrarCacheTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaGanadores.getModel();
        ArrayList<Cliente> clientesTabla = arrayGanadores;
        for (int i = 0; i < clientesTabla.size(); i++) {

            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tablaGanadores.setValueAt(i + 1, i, 0);
            tablaGanadores.setValueAt(clientesTabla.get(i).getNombreCliente(), i, 1);
            tablaGanadores.setValueAt(clientesTabla.get(i).getEmailCliente(), i, 2);

        }

    }

    private void borrarCacheTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaGanadores.getModel();
        int filas = tablaGanadores.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResultados = new javax.swing.JLabel();
        lblGanadores = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        tblPane = new javax.swing.JScrollPane();
        tablaGanadores = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblLoadNombreSorteo = new javax.swing.JLabel();
        lblLoadPart = new javax.swing.JLabel();
        lblLoadDesc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblResultados.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblResultados.setText("RESULTADOS DE SORTEO");

        lblGanadores.setText("Ganadores");

        lblDesc.setText("Descripcion");

        lblParticipantes.setText("Participantes");

        tablaGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Premio N°", "Nombre", "Correo"
            }
        ));
        tblPane.setViewportView(tablaGanadores);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLoadPart, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblPane, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLoadNombreSorteo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(lblLoadDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoadNombreSorteo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblLoadPart, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblPane, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(lblLoadDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblGanadores;
    private javax.swing.JLabel lblLoadDesc;
    private javax.swing.JLabel lblLoadNombreSorteo;
    private javax.swing.JLabel lblLoadPart;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JTable tablaGanadores;
    private javax.swing.JScrollPane tblPane;
    // End of variables declaration//GEN-END:variables
}
