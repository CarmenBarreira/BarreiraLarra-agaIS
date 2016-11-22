package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import java.text.ParseException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class EditarRestaurante extends javax.swing.JFrame {

    boolean nombreCorrecto = true, dirCorrecta = true, horCorrecta = true, tipoCorrecto = true;
    Sistema sis;
    String nombre, direccion, tipoComida, horarios;
    PanelRestaurantes res;

    public EditarRestaurante(Sistema unSis, PanelRestaurantes pRes) throws ParseException {
        initComponents();
        txtDireccion.setEnabled(false);
        txtHorariosDe.setEnabled(false);
        txtHorariosHasta.setEnabled(false);
        txtTipoComida.setEnabled(false);
        txtNombreR.setEnabled(false);
        sis = unSis;
        res = pRes;
        nombre = sis.getRestaurante().getNombre();
        direccion = sis.getRestaurante().getDireccion();
        tipoComida = sis.getRestaurante().getTiposComida();
        horarios = sis.getRestaurante().getHorarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDireccionR = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        lblNombreR = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnGuardarEditarRestaurante = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        lblDireccionR1 = new javax.swing.JLabel();
        lblDireccionR2 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        cmbHorariosDe = new javax.swing.JComboBox<>();
        lblHorarioHasta = new javax.swing.JLabel();
        cmbHorariosHasta = new javax.swing.JComboBox<>();
        chkBoxNombre = new javax.swing.JCheckBox();
        chkBoxDir = new javax.swing.JCheckBox();
        chkBoxTipo = new javax.swing.JCheckBox();
        chkBoxHorDe = new javax.swing.JCheckBox();
        txtHorariosDe = new javax.swing.JTextField();
        txtHorariosHasta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Datos Restaurante");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);

        lblDireccionR.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDireccionR.setText("Dirección: ");

        txtNombreR.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreR.setPreferredSize(new java.awt.Dimension(4, 20));

        lblNombreR.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblNombreR.setText("Nombre: ");

        lblTitulo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        lblTitulo.setText("Editar datos");

        btnGuardarEditarRestaurante.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        btnGuardarEditarRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/save_16.png"))); // NOI18N
        btnGuardarEditarRestaurante.setText("Guardar ");
        btnGuardarEditarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditarRestauranteActionPerformed(evt);
            }
        });

        txtDireccion.setPreferredSize(new java.awt.Dimension(4, 20));

        lblDireccionR1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDireccionR1.setText("Horarios: ");

        lblDireccionR2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDireccionR2.setText("Tipo/s de comida/s: ");

        txtTipoComida.setPreferredSize(new java.awt.Dimension(4, 20));

        lblFoto.setFont(lblFoto.getFont());
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/restauranteFoto.jpg"))); // NOI18N
        lblFoto.setIconTextGap(6);
        lblFoto.setMaximumSize(new java.awt.Dimension(434, 150));
        lblFoto.setMinimumSize(new java.awt.Dimension(434, 150));
        lblFoto.setPreferredSize(new java.awt.Dimension(434, 150));
        lblFoto.setVerifyInputWhenFocusTarget(false);

        lblDe.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblDe.setText("De: ");

        cmbHorariosDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        lblHorarioHasta.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        lblHorarioHasta.setText("Hasta: ");

        cmbHorariosHasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        chkBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxNombreActionPerformed(evt);
            }
        });

        chkBoxDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxDirActionPerformed(evt);
            }
        });

        chkBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxTipoActionPerformed(evt);
            }
        });

        chkBoxHorDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxHorDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkBoxDir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccionR2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkBoxTipo)
                                            .addComponent(chkBoxHorDe))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDe)
                            .addComponent(lblHorarioHasta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnGuardarEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(chkBoxNombre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(chkBoxDir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoComida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chkBoxTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkBoxHorDe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDe)
                            .addComponent(cmbHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorarioHasta)
                            .addComponent(txtHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(btnGuardarEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarEditarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditarRestauranteActionPerformed

        if (chkBoxNombre.isSelected()) {
            if (!stringCorrecto(txtNombreR.getText())) {

                JOptionPane.showMessageDialog(this, "Debe completar todos los datos",
                        "Campos Obligatorios", ERROR_MESSAGE);
                nombreCorrecto = false;
            } else {
                nombre = txtNombreR.getText();
                nombreCorrecto = true;
            }
        }
        if (chkBoxDir.isSelected()) {
            if (!stringCorrecto(txtDireccion.getText())) { //direccion incorrecta
                JOptionPane.showMessageDialog(this, "La direccion es Incorrecto",
                        "Direccion Incorrecta", ERROR_MESSAGE);
                dirCorrecta = false;
            } else {
                direccion = txtDireccion.getText();
                dirCorrecta = true;
            }

        }
        if (chkBoxTipo.isSelected()) { //tipo comida incorrecta

            if (!stringCorrecto(txtTipoComida.getText())) {

                JOptionPane.showMessageDialog(this, "El tipo de comida es "
                        + "Incorrecto (el mismo no puede ser vacio ni mayor a 30 caracteres)",
                        "Nombre Incorrecto", ERROR_MESSAGE);
                tipoCorrecto = false;

            } else {
                tipoComida = txtTipoComida.getText();
                tipoCorrecto = true;
            }
        }

        if (chkBoxHorDe.isSelected()) {

            if (!checkHorarios(txtHorariosDe.getText()) || !checkHorarios(txtHorariosHasta.getText())) {
                JOptionPane.showMessageDialog(this, "El formato de hora es hh:mm"
                        + "(siendo hh la hora y mm los minutos)",
                        "Horario Incorrecto", ERROR_MESSAGE);
                horCorrecta = false;
            } else {
                horarios = "De " + cmbHorariosDe.getSelectedItem().toString()
                        + " a " + cmbHorariosHasta.getSelectedItem().toString() + " - "
                        + txtHorariosDe.getText() + " a " + txtHorariosDe.getText();
                horCorrecta = true;
            }
        }

        if (nombreCorrecto && dirCorrecta && horCorrecta && tipoCorrecto) {//todos los datos bien

            //Armo el string de horarios en base a los combos de dias y los horarios
            sis.getRestaurante().setNombre(nombre);
            sis.getRestaurante().setHorarios(horarios);
            sis.getRestaurante().setDireccion(direccion);
            sis.getRestaurante().setTiposComida(tipoComida);
            res.update(null, null);
            this.dispose();


    }//GEN-LAST:event_btnGuardarEditarRestauranteActionPerformed
    }
    private void chkBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxNombreActionPerformed
        if (chkBoxNombre.isSelected()) {
            txtNombreR.setEnabled(true);

        } else {
            txtNombreR.setEnabled(false);
            nombreCorrecto = true;
            nombre = sis.getRestaurante().getNombre();
        }
    }//GEN-LAST:event_chkBoxNombreActionPerformed

    private void chkBoxDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxDirActionPerformed
        if (chkBoxDir.isSelected()) {
            txtDireccion.setEnabled(true);

        } else {
            txtDireccion.setEnabled(false);
            dirCorrecta = true;
            direccion = sis.getRestaurante().getDireccion();
        }
    }//GEN-LAST:event_chkBoxDirActionPerformed

    private void chkBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxTipoActionPerformed
        if (chkBoxTipo.isSelected()) {
            txtTipoComida.setEnabled(true);

        } else {
            txtTipoComida.setEnabled(false);
            tipoCorrecto = true;
            tipoComida = sis.getRestaurante().getTiposComida();
        }


    }//GEN-LAST:event_chkBoxTipoActionPerformed

    private void chkBoxHorDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxHorDeActionPerformed
        if (chkBoxHorDe.isSelected()) {
            txtHorariosDe.setEnabled(true);
            txtHorariosHasta.setEnabled(true);
        } else {
            txtHorariosDe.setEnabled(false);
            txtHorariosHasta.setEnabled(false);
            horCorrecta = true;
            horarios = sis.getRestaurante().getHorarios();
        }
    }//GEN-LAST:event_chkBoxHorDeActionPerformed

    public boolean checkHorarios(String horario) {
        boolean esCorrecto = false;
        if (horario.length() == 5) {
            String[] horarioSpl = horario.split(":");

            if (horarioSpl.length == 2) {
                int hora = Integer.parseInt(horarioSpl[0]);
                int minutos = Integer.parseInt(horarioSpl[1]);
                if (hora >= 0 && hora <= 24 && minutos >= 0 && minutos <= 59) {
                    esCorrecto = true;

                }

            }

        }
        return esCorrecto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarEditarRestaurante;
    private javax.swing.JCheckBox chkBoxDir;
    private javax.swing.JCheckBox chkBoxHorDe;
    private javax.swing.JCheckBox chkBoxNombre;
    private javax.swing.JCheckBox chkBoxTipo;
    private javax.swing.JComboBox<String> cmbHorariosDe;
    private javax.swing.JComboBox<String> cmbHorariosHasta;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDireccionR;
    private javax.swing.JLabel lblDireccionR1;
    private javax.swing.JLabel lblDireccionR2;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblHorarioHasta;
    private javax.swing.JLabel lblNombreR;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHorariosDe;
    private javax.swing.JTextField txtHorariosHasta;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtTipoComida;
    // End of variables declaration//GEN-END:variables

    public boolean stringCorrecto(String s) {
        /*Esta funcion valida si el string que se pasa por parametro segun el tipo
        es o no valido. Y retorna un booleano segun sea o no valido*/
        boolean esCorrecto = false;
        if (s.length()>0) {
            if ( s.charAt(0) != ' ') {
                 esCorrecto = true;
            } 
        }
        return esCorrecto;
    }
}