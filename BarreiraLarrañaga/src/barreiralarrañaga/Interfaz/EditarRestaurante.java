package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class EditarRestaurante extends javax.swing.JFrame {

    public EditarRestaurante(Sistema sis) throws ParseException {
        initComponents();
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
        txtHorariosDe = new JFormattedTextField();
        lblDe = new javax.swing.JLabel();
        cmbHorariosDe = new javax.swing.JComboBox<>();
        lblHorarioHasta = new javax.swing.JLabel();
        cmbHorariosHasta = new javax.swing.JComboBox<>();
        txtHorariosHasta = new JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Datos Restaurante");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);

        lblDireccionR.setText("Dirección: ");

        txtNombreR.setPreferredSize(new java.awt.Dimension(4, 20));

        lblNombreR.setText("Nombre: ");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Editar datos");

        btnGuardarEditarRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/save_16.png"))); // NOI18N
        btnGuardarEditarRestaurante.setText("Guardar ");
        btnGuardarEditarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditarRestauranteActionPerformed(evt);
            }
        });

        txtDireccion.setPreferredSize(new java.awt.Dimension(4, 20));

        lblDireccionR1.setText("Horarios: ");

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

        txtHorariosDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorariosDe.setToolTipText("hh:mm");

        lblDe.setText("De: ");

        cmbHorariosDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        lblHorarioHasta.setText("Hasta: ");

        cmbHorariosHasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        txtHorariosHasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorariosHasta.setToolTipText("hh:mm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDe)
                                .addComponent(lblHorarioHasta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbHorariosHasta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnGuardarEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarEditarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditarRestauranteActionPerformed
        String nombre, direccion, tipoComida;
        nombre = txtNombreR.getText();
        direccion = txtDireccion.getText();
        tipoComida = txtTipoComida.getText();
        //Armo el string de horarios en base a los combos de dias y los horarios
        String horarios = "De " + cmbHorariosDe.getSelectedItem().toString()
                + " a " + cmbHorariosHasta.getSelectedItem().toString() + " - "
                + txtHorariosDe.getText() + " a " + txtHorariosDe.getText();

        if (nombre.length() == 0 || direccion.length() == 0 || tipoComida.length() == 0
                || txtHorariosDe.getText().length() == 0 || txtHorariosDe.getText().length() == 0) {
            //si algun dato esta vacio
            JOptionPane.showMessageDialog(this, "Debe completar todos los datos",
                    "Campos Obligatorios", ERROR_MESSAGE);
        } 
        else{ 
            if (!stringCorrecto(nombre, "nombre")) { //nombre incorrecto
                JOptionPane.showMessageDialog(this, "El nombre es Incorrecto "
                        + "(el mismo no puede ser vacio ni mayor a 30 caracteres)",
                        "Nombre Incorrecto", ERROR_MESSAGE);
                txtNombreR.selectAll();
                txtNombreR.requestFocusInWindow();
            } 
            else{//nombre correcto
                if (!stringCorrecto(direccion, "direccion")) { //direccion incorrecta
                    JOptionPane.showMessageDialog(this, "La direccion es Incorrecto",
                            "Direccion Incorrecta", ERROR_MESSAGE);
                    txtDireccion.selectAll();
                    txtDireccion.requestFocusInWindow();
                } else if (!stringCorrecto(tipoComida, "tipoComida")) { //tipo comida incorrecta
                    JOptionPane.showMessageDialog(this, "El tipo de comida es "
                            + "Incorrecto (el mismo no puede ser vacio ni mayor a 30 caracteres)",
                            "Nombre Incorrecto", ERROR_MESSAGE);
                    txtTipoComida.selectAll();
                    txtTipoComida.requestFocusInWindow();
                } else if (txtHorariosDe.getText().length() == 0 || txtHorariosDe.getText().length() == 0) {
                    JOptionPane.showMessageDialog(this, "El formato de hora es hh:mm"
                            + "(siendo hh la hora y mm los minutos)",
                            "Horario Incorrecto", ERROR_MESSAGE);
                } else {//todos los datos bien
                    sis.getRestaurante().setNombre(nombre);
                    sis.getRestaurante().setDireccion(direccion);
                    sis.getRestaurante().setHorarios(horarios);
                    sis.getRestaurante().setTiposComida(tipoComida);

                    JOptionPane.showMessageDialog(null, "Se edito exitosamente el restaurante",
                            "Modifcación exitosa", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                   // PanelRestaurantes.
                }
            }//Else de nombre correcto
        }
    }//GEN-LAST:event_btnGuardarEditarRestauranteActionPerformed

    Sistema sis = new Sistema();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarEditarRestaurante;
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
    private javax.swing.JFormattedTextField txtHorariosDe;
    private javax.swing.JFormattedTextField txtHorariosHasta;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtTipoComida;
    // End of variables declaration//GEN-END:variables

public boolean stringCorrecto(String s, String tipo) {
        /*Esta funcion valida si el string que se pasa por parametro segun el tipo
        es o no valido. Y retorna un booleano segun sea o no valido*/
        boolean esCorrecto = false;
        boolean espaciosVacios = false;
        if (!s.isEmpty()) {
            if (s.charAt(0) == ' ' || s.isEmpty()) {
                espaciosVacios = true;
            }
            if (s.equals("") || espaciosVacios) {
                //el string esta vacio o empieza con espacio
                if (tipo.toUpperCase().equals("nombre".toUpperCase())
                        || (tipo.toUpperCase().equals("alias".toUpperCase()))) {
                    esCorrecto = false;
                }
            } else {
                esCorrecto = true;
            }
        }
        return esCorrecto;
    }
}
