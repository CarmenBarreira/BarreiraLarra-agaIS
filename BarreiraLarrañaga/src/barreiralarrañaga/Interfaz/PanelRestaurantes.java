package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Evaluacion;
import barreiralarrañaga.Dominio.Sistema;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.table.DefaultTableModel;

public final class PanelRestaurantes extends javax.swing.JPanel implements Observer {

    private final Sistema elSis;

    public PanelRestaurantes(Sistema sis) {
        initComponents();
        elSis = sis;
        cargarLista();
       jLabel1.setText( elSis.getRestaurante().getNombre());
        double eval = elSis.getPromedioEval();
        lblPromedioTitulo.setVisible(true);
        if (eval > 0) {
            lblPromedio.setText((new DecimalFormat("##.##").format(eval)));
            promedioMuestra(eval);
        }

    }

    private void promedioMuestra(double eval) {
        if (eval <= 2) {
            btnStarOne.setSelected(true);
            btnStarOne1.setSelected(false);
            btnStarOne2.setSelected(false);
            btnStarOne3.setSelected(false);
            btnStarOne4.setSelected(false);
        }
        if (eval >= 2 && eval < 3) {
            btnStarOne.setSelected(true);
            btnStarOne1.setSelected(true);
            btnStarOne2.setSelected(false);
            btnStarOne3.setSelected(false);
            btnStarOne4.setSelected(false);
        }

        if (eval >= 3 && eval < 4) {
            btnStarOne.setSelected(true);
            btnStarOne1.setSelected(true);
            btnStarOne2.setSelected(false);
            btnStarOne3.setSelected(true);
            btnStarOne4.setSelected(false);
        }
        if (eval >= 4 && eval < 5) {
            btnStarOne.setSelected(true);
            btnStarOne1.setSelected(true);
            btnStarOne2.setSelected(true);
            btnStarOne3.setSelected(true);
            btnStarOne4.setSelected(false);
        }
        if (eval == 5) {
            btnStarOne.setSelected(true);
            btnStarOne1.setSelected(true);
            btnStarOne2.setSelected(true);
            btnStarOne3.setSelected(true);
            btnStarOne4.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFotoRes = new javax.swing.JLabel();
        lblComidaDesc = new javax.swing.JLabel();
        lblTiposComida = new javax.swing.JLabel();
        lblHorarios = new javax.swing.JLabel();
        lblDireccionRestaurante1 = new javax.swing.JLabel();
        btnEditarRestaurante = new javax.swing.JButton();
        lblDirMostrar = new javax.swing.JLabel();
        lblHorarioDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResenias = new javax.swing.JTable();
        lblPromedioTitulo = new javax.swing.JLabel();
        btnStarOne = new javax.swing.JToggleButton();
        btnStarOne1 = new javax.swing.JToggleButton();
        btnStarOne2 = new javax.swing.JToggleButton();
        btnStarOne3 = new javax.swing.JToggleButton();
        btnStarOne4 = new javax.swing.JToggleButton();
        lblPromedio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(683, 548));
        setMinimumSize(new java.awt.Dimension(683, 548));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(683, 548));

        lblFotoRes.setFont(lblFotoRes.getFont());
        lblFotoRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/restauranteFoto.jpg"))); // NOI18N
        lblFotoRes.setIconTextGap(6);
        lblFotoRes.setMaximumSize(new java.awt.Dimension(434, 150));
        lblFotoRes.setMinimumSize(new java.awt.Dimension(434, 150));
        lblFotoRes.setPreferredSize(new java.awt.Dimension(434, 150));
        lblFotoRes.setVerifyInputWhenFocusTarget(false);

        lblComidaDesc.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblComidaDesc.setText("Comidas: ");

        lblTiposComida.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblTiposComida.setText("Italiana");

        lblHorarios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblHorarios.setText("Jueves a Domingos - 10:00 a 00:00");

        lblDireccionRestaurante1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblDireccionRestaurante1.setText("Cuareim 1451");

        btnEditarRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/editar.png"))); // NOI18N
        btnEditarRestaurante.setText("Editar Restaurante");
        btnEditarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestauranteActionPerformed(evt);
            }
        });

        lblDirMostrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDirMostrar.setText("Direccion: ");

        lblHorarioDesc.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHorarioDesc.setText("Horario: ");

        tablaResenias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Calificacion", "Reseña", "Correo Electronico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResenias.setColumnSelectionAllowed(true);
        tablaResenias.getTableHeader().setReorderingAllowed(false);
        tablaResenias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReseniasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaResenias);
        tablaResenias.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lblPromedioTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPromedioTitulo.setText("Promedio:");

        btnStarOne.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne.setBorderPainted(false);
        btnStarOne.setContentAreaFilled(false);
        btnStarOne.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne.setEnabled(false);
        btnStarOne.setFocusPainted(false);
        btnStarOne.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N

        btnStarOne1.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne1.setBorderPainted(false);
        btnStarOne1.setContentAreaFilled(false);
        btnStarOne1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne1.setEnabled(false);
        btnStarOne1.setFocusPainted(false);
        btnStarOne1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N

        btnStarOne2.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne2.setBorderPainted(false);
        btnStarOne2.setContentAreaFilled(false);
        btnStarOne2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne2.setEnabled(false);
        btnStarOne2.setFocusPainted(false);
        btnStarOne2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N

        btnStarOne3.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne3.setBorderPainted(false);
        btnStarOne3.setContentAreaFilled(false);
        btnStarOne3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne3.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne3.setEnabled(false);
        btnStarOne3.setFocusPainted(false);
        btnStarOne3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N

        btnStarOne4.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne4.setBorderPainted(false);
        btnStarOne4.setContentAreaFilled(false);
        btnStarOne4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne4.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne4.setEnabled(false);
        btnStarOne4.setFocusPainted(false);
        btnStarOne4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N

        lblPromedio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 30)); // NOI18N
        jLabel1.setText("Nombre de Restaurant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHorarioDesc)
                        .addGap(28, 28, 28)
                        .addComponent(lblHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblPromedioTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnStarOne, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStarOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStarOne3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStarOne2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStarOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDirMostrar)
                                .addGap(4, 4, 4)
                                .addComponent(lblDireccionRestaurante1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblComidaDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTiposComida, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarRestaurante)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFotoRes, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarRestaurante)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblComidaDesc)
                                    .addComponent(lblTiposComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDirMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionRestaurante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHorarioDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(lblFotoRes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnStarOne, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnStarOne2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnStarOne3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPromedioTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnStarOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStarOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestauranteActionPerformed

        EditarRestaurante editRest = null;
        try {
            editRest = new EditarRestaurante(elSis, this);

        } catch (ParseException ex) {

        }
        Rectangle rct = editRest.getGraphicsConfiguration().getBounds();
        editRest.setLocation((rct.width - editRest.getWidth()) / 2,
                (rct.height - editRest.getHeight()) / 2);
        editRest.setVisible(true);

    }//GEN-LAST:event_btnEditarRestauranteActionPerformed

    private void tablaReseniasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReseniasMouseClicked
        int index = tablaResenias.getSelectedRow();

        Evaluacion ev = elSis.getEvaluaciones().get(index);
        LeerReseniaUI le = new LeerReseniaUI(ev);
        le.setVisible(true);
    }//GEN-LAST:event_tablaReseniasMouseClicked

    public void cargarLista() {
        borrarCacheTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaResenias.getModel();
        ArrayList<Evaluacion> reseniasTabla = elSis.getEvaluaciones();
        for (int i = 0; i < reseniasTabla.size(); i++) {
            Evaluacion eva = elSis.getEvaluaciones().get(i);
            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tablaResenias.setValueAt(eva.getCliente().getNombreCliente(), i, 0);
            tablaResenias.setValueAt(eva.getEstrellas(), i, 1);
            tablaResenias.setValueAt(eva.getResenia(), i, 2);
            tablaResenias.setValueAt(eva.getCliente().getEmailCliente(), i, 3);

        }

    }

    private void borrarCacheTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaResenias.getModel();
        int filas = tablaResenias.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarRestaurante;
    private javax.swing.JToggleButton btnStarOne;
    private javax.swing.JToggleButton btnStarOne1;
    private javax.swing.JToggleButton btnStarOne2;
    private javax.swing.JToggleButton btnStarOne3;
    private javax.swing.JToggleButton btnStarOne4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComidaDesc;
    private javax.swing.JLabel lblDirMostrar;
    private javax.swing.JLabel lblDireccionRestaurante1;
    private javax.swing.JLabel lblFotoRes;
    private javax.swing.JLabel lblHorarioDesc;
    private javax.swing.JLabel lblHorarios;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblPromedioTitulo;
    private javax.swing.JLabel lblTiposComida;
    private javax.swing.JTable tablaResenias;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
       lblDireccionRestaurante1.setText(elSis.getRestaurante().getDireccion());
       jLabel1.setText(elSis.getRestaurante().getNombre());
       lblTiposComida.setText(elSis.getRestaurante().getTiposComida());
       lblHorarios.setText(elSis.getRestaurante().getHorarios());
    }
}
