package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Restaurante;
import barreiralarrañaga.Dominio.Sistema;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.text.MaskFormatter;

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
        jLabel1 = new javax.swing.JLabel();
        btnEditarRestaurante = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        lblDireccionR1 = new javax.swing.JLabel();
        lblDireccionR2 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHorariosDe = new JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbHorariosDe = new javax.swing.JComboBox<>();
        lblHorarioHasta = new javax.swing.JLabel();
        cmbHorariosHasta = new javax.swing.JComboBox<>();
        txtHorariosHasta = new JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Restaurante");
        setAutoRequestFocus(false);

        lblDireccionR.setText("Dirección: ");

        lblNombreR.setText("Nombre: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Modificar Restaurante IS");

        btnEditarRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/save_16.png"))); // NOI18N
        btnEditarRestaurante.setText("Guardar ");
        btnEditarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestauranteActionPerformed(evt);
            }
        });

        lblDireccionR1.setText("Horarios: ");

        lblDireccionR2.setText("Tipo/s de comida/s: ");

        jLabel4.setFont(jLabel4.getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/restauranteFoto.jpg"))); // NOI18N
        jLabel4.setIconTextGap(6);
        jLabel4.setMaximumSize(new java.awt.Dimension(434, 150));
        jLabel4.setMinimumSize(new java.awt.Dimension(434, 150));
        jLabel4.setPreferredSize(new java.awt.Dimension(434, 150));
        jLabel4.setVerifyInputWhenFocusTarget(false);

        txtHorariosDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorariosDe.setToolTipText("hh:mm");

        jLabel2.setText("De: ");

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
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblDireccionR1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHorarioHasta)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(101, 101, 101)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(cmbHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorariosDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHorarioHasta)
                            .addComponent(cmbHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorariosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestauranteActionPerformed
        String nombre, direccion, tipoComida;
        nombre = txtNombreR.getText();
        direccion = txtDireccion.getText();
        tipoComida= txtTipoComida.getText();
        String horarios = "De " + cmbHorariosDe.getSelectedItem().toString() +
                " a "+ cmbHorariosHasta.getSelectedItem().toString() + " - " + 
                txtHorariosDe.getText() + " a " + txtHorariosHasta.getText();
        Restaurante aux = null ; 
        
        if(nombre.length() == 0 || direccion.length() ==0 || tipoComida.length() ==0 
                || txtHorariosDe.getText().length() ==0 || txtHorariosHasta.getText().length() ==0 ){
             JOptionPane.showMessageDialog(this, "Debe completar todos los datos", 
                     "Campos Obligatorios", ERROR_MESSAGE);
        }else{
            if(!stringCorrecto(nombre, "nombre")){
                JOptionPane.showMessageDialog(this, "El nombre es Incorrecto "
                        + "(el mismo no puede ser vacio ni mayor a 30 caracteres)", 
                        "Nombre Incorrecto", ERROR_MESSAGE);
                txtNombreR.selectAll();
                txtNombreR.requestFocusInWindow();
            }
            else{//nombre correcto
                if(!stringCorrecto(direccion, "direccion")){
                    JOptionPane.showMessageDialog(this, "La direccion es Incorrecto", 
                            "Direccion Incorrecta", ERROR_MESSAGE);
                    txtDireccion.selectAll();
                    txtDireccion.requestFocusInWindow();
                }
                else{
                   if(!stringCorrecto(tipoComida, "tipoComida")){
                       JOptionPane.showMessageDialog(this, "El tipo de comida es "
                            + "Incorrecto (el mismo no puede ser vacio ni mayor a 30 caracteres)", 
                            "Nombre Incorrecto", ERROR_MESSAGE);
                        txtTipoComida.selectAll();
                        txtTipoComida.requestFocusInWindow();
                   }else{
                       if(txtHorariosDe.getText().length()==0 || txtHorariosHasta.getText().length() == 0){
                            JOptionPane.showMessageDialog(this, "El formato de hora es hh:mm"
                                    + "(siendo hh la hora y mm los minutos)", 
                            "Horario Incorrecto", ERROR_MESSAGE);
                       }
                       else{//todos los datos bien
                           aux = new Restaurante(nombre, direccion, tipoComida, horarios);   
                           JOptionPane.showMessageDialog(null, "Se edito exitosamente el restaurante",  
                                   "Modifcación exitosa", JOptionPane.INFORMATION_MESSAGE);
                       }
                   }
                } 
            }           
        }
    
    }//GEN-LAST:event_btnEditarRestauranteActionPerformed

    /**
     * @param args the command line arguments
     */
  /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
   /*      java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditarRestaurante().setVisible(true);
            }
        });
    }*/
    Sistema sis = new Sistema();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarRestaurante;
    private javax.swing.JComboBox<String> cmbHorariosDe;
    private javax.swing.JComboBox<String> cmbHorariosHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDireccionR;
    private javax.swing.JLabel lblDireccionR1;
    private javax.swing.JLabel lblDireccionR2;
    private javax.swing.JLabel lblHorarioHasta;
    private javax.swing.JLabel lblNombreR;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtHorariosDe;
    private javax.swing.JFormattedTextField txtHorariosHasta;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtTipoComida;
    // End of variables declaration//GEN-END:variables

 public MaskFormatter Mascara(String Mascara){
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        } 
        return F_Mascara;
 }   
    
    public boolean stringCorrecto(String s, String tipo) {
        /*Esta funcion valida si el string que se pasa por parametro segun el tipo
        es o no valido. Y retorna un booleano segun sea o no valido*/
        boolean esCorrecto = false;
        boolean espaciosVacios = false;
        if (!s.isEmpty()) {
            if (s.charAt(0) == ' ' || s.isEmpty()) {
                espaciosVacios = true;
            }
            if (s.equals("") || espaciosVacios || s.length()>10) {
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
