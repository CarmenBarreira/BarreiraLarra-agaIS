package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Restaurante;
import barreiralarrañaga.Dominio.Sistema;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class EditarRestaurante extends javax.swing.JFrame {

    boolean esNuevo = true;
    
    public EditarRestaurante(Sistema sis) {
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
        jButton1 = new javax.swing.JButton();
        lblDireccionR2 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblDireccionR3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Restaurante");
        setAutoRequestFocus(false);
        setResizable(false);

        lblDireccionR.setText("Dirección: ");

        lblNombreR.setText("Nombre: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Modificar Restaurante IS");

        btnEditarRestaurante.setText("Guardar ");
        btnEditarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestauranteActionPerformed(evt);
            }
        });

        lblDireccionR1.setText("Horarios: ");

        jButton1.setText("+");

        lblDireccionR2.setText("Tipo de comida: ");

        jLabel4.setFont(jLabel4.getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/restauranteFoto.jpg"))); // NOI18N
        jLabel4.setIconTextGap(6);
        jLabel4.setMaximumSize(new java.awt.Dimension(434, 150));
        jLabel4.setMinimumSize(new java.awt.Dimension(434, 150));
        jLabel4.setPreferredSize(new java.awt.Dimension(434, 150));
        jLabel4.setVerifyInputWhenFocusTarget(false);

        lblDireccionR3.setText("Días: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDireccionR3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEditarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionR2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccionR3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDireccionR1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarRestaurante)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestauranteActionPerformed
        String nombre, direccion, tipoComida;
        nombre = txtNombreR.getText();
        direccion = txtDireccion.getText();
        tipoComida= txtTipoComida.getText();
        
        Restaurante aux = null ; 
        
        if(nombre.length() == 0 || direccion.length() ==0 || tipoComida.length() ==0){
             JOptionPane.showMessageDialog(this, "Debe completar todos los datos", "Campos Obligatorios", ERROR_MESSAGE);
        }else{
            if(!stringCorrecto(nombre, "nombre")){
                JOptionPane.showMessageDialog(this, "El nombre es Incorrecto (el mismo no puede ser vacio ni mayor a 30 caracteres)", "Nombre Incorrecto", ERROR_MESSAGE);
                txtNombreR.selectAll();
                txtNombreR.requestFocusInWindow();
            }
            else{//nombre correcto
                if(!stringCorrecto(direccion, "direccion")){
                    JOptionPane.showMessageDialog(this, "La direccion es Incorrecto", "Direccion Incorrecta", ERROR_MESSAGE);
                    txtDireccion.selectAll();
                    txtDireccion.requestFocusInWindow();
                }
                else{
                   if(!stringCorrecto(tipoComida, "tipoComida")){
                       JOptionPane.showMessageDialog(this, "El tipo de comida es Incorrecto (el mismo no puede ser vacio ni mayor a 30 caracteres)", "Nombre Incorrecto", ERROR_MESSAGE);
                        txtTipoComida.selectAll();
                        txtTipoComida.requestFocusInWindow();
                   }else{//todos los datos bien                        
                        aux = new Restaurante(nombre, direccion, tipoComida);
                        sis.setRestaurante(aux);   
                        JOptionPane.showMessageDialog(null, "Se modificó exitosamente el restaurante", "Editar restaurante", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDireccionR;
    private javax.swing.JLabel lblDireccionR1;
    private javax.swing.JLabel lblDireccionR2;
    private javax.swing.JLabel lblDireccionR3;
    private javax.swing.JLabel lblNombreR;
    private javax.swing.JTextField txtDireccion;
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
