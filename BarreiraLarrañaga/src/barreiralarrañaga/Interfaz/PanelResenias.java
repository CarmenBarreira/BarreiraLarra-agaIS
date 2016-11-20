package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Cliente;
import barreiralarrañaga.Dominio.Evaluacion;
import barreiralarrañaga.Dominio.Sistema;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.border.Border;

public class PanelResenias extends javax.swing.JPanel {

    int cantEstrellas = 0;
    Sistema unSis;
    Border bor;

    public PanelResenias(Sistema sis) {
        initComponents();
        unSis = sis;
    }

    public void initializeButtons() {
        bor = BorderFactory.createLineBorder(Color.white);
        bor = BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createLoweredBevelBorder());
        btnStarFive.setBorder(bor);
        btnStarFour.setBorder(bor);
        btnStarThree.setBorder(bor);
        btnStarTwo.setBorder(bor);
        btnStarOne.setBorder(bor);
        btnStarOne.setOpaque(false);
        btnStarOne.setContentAreaFilled(false);
        btnStarOne.setBorderPainted(false);
        btnStarTwo.setOpaque(false);
        btnStarTwo.setContentAreaFilled(false);
        btnStarTwo.setBorderPainted(false);
        btnStarThree.setOpaque(false);
        btnStarThree.setContentAreaFilled(false);
        btnStarThree.setBorderPainted(false);
        btnStarFour.setOpaque(false);
        btnStarFour.setContentAreaFilled(false);
        btnStarFour.setBorderPainted(false);
        btnStarFive.setOpaque(false);
        btnStarFive.setContentAreaFilled(false);
        btnStarFive.setBorderPainted(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCorreoCliente = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResenia = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnStarFour = new javax.swing.JToggleButton();
        btnStarFive = new javax.swing.JToggleButton();
        btnStarOne = new javax.swing.JToggleButton();
        btnStarTwo = new javax.swing.JToggleButton();
        btnStarThree = new javax.swing.JToggleButton();
        lblPuntuacion = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblResenia = new javax.swing.JLabel();
        lblTextoResenia1 = new javax.swing.JLabel();
        lblTextoResenia2 = new javax.swing.JLabel();
        lblTextoResenia3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(982, 504));
        setMinimumSize(new java.awt.Dimension(982, 504));
        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/reseniaTitulo.png"))); // NOI18N

        lblCorreoCliente.setText("Correo: ");

        txtCorreoCliente.setToolTipText("(Opcional)");

        txtNombreCliente.setToolTipText("(Opcional)");

        txtResenia.setColumns(20);
        txtResenia.setRows(5);
        txtResenia.setToolTipText("(Opcional)");
        jScrollPane1.setViewportView(txtResenia);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/cancelarIcono.png"))); // NOI18N
        btnCancelar.setMaximumSize(new java.awt.Dimension(175, 92));
        btnCancelar.setMinimumSize(new java.awt.Dimension(175, 92));
        btnCancelar.setPreferredSize(new java.awt.Dimension(175, 92));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/enviarPng.png"))); // NOI18N
        btnEnviar.setMaximumSize(new java.awt.Dimension(175, 92));
        btnEnviar.setMinimumSize(new java.awt.Dimension(175, 92));
        btnEnviar.setPreferredSize(new java.awt.Dimension(175, 92));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnStarFour.setBackground(new java.awt.Color(204, 204, 255));
        btnStarFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarFour.setBorderPainted(false);
        btnStarFour.setContentAreaFilled(false);
        btnStarFour.setFocusPainted(false);
        btnStarFour.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarFour.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarFourActionPerformed(evt);
            }
        });

        btnStarFive.setBackground(new java.awt.Color(204, 204, 255));
        btnStarFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarFive.setBorderPainted(false);
        btnStarFive.setContentAreaFilled(false);
        btnStarFive.setFocusPainted(false);
        btnStarFive.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarFive.setRequestFocusEnabled(false);
        btnStarFive.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarFiveActionPerformed(evt);
            }
        });

        btnStarOne.setBackground(new java.awt.Color(204, 204, 255));
        btnStarOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarOne.setBorderPainted(false);
        btnStarOne.setContentAreaFilled(false);
        btnStarOne.setFocusPainted(false);
        btnStarOne.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarOneActionPerformed(evt);
            }
        });

        btnStarTwo.setBackground(new java.awt.Color(204, 204, 255));
        btnStarTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarTwo.setBorderPainted(false);
        btnStarTwo.setContentAreaFilled(false);
        btnStarTwo.setFocusPainted(false);
        btnStarTwo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarTwo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarTwoActionPerformed(evt);
            }
        });

        btnStarThree.setBackground(new java.awt.Color(204, 204, 255));
        btnStarThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/notPressed.png"))); // NOI18N
        btnStarThree.setBorderPainted(false);
        btnStarThree.setContentAreaFilled(false);
        btnStarThree.setFocusPainted(false);
        btnStarThree.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarThree.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/star.png"))); // NOI18N
        btnStarThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarThreeActionPerformed(evt);
            }
        });

        lblPuntuacion.setText("Puntuación");

        lblNombreCliente.setText("Nombre: ");

        lblResenia.setText("Reseña: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarOne, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarThree, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarFour, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarFive, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCorreoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblResenia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(650, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStarOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStarTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStarThree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStarFour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStarFive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addComponent(lblResenia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        lblTextoResenia1.setText("              Le agradecemos por habernos visitado. Para mejorar la atencion y a la calidad del servicio");

        lblTextoResenia2.setText("le pedimos que nos deje su reseña. Completando esta misma con su nombre y correo electronico ");

        lblTextoResenia3.setText("participa usted en los frecuentes sorteos del establecimiento.  No se lo puede perder!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextoResenia3)
                            .addComponent(lblTextoResenia2)
                            .addComponent(lblTextoResenia1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoResenia1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoResenia2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoResenia3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCorreoCliente.setText(null);
        txtNombreCliente.setText(null);
        txtResenia.setText(null);
        btnStarTwo.setSelected(false);
        btnStarOne.setSelected(false);
        btnStarThree.setSelected(false);
        btnStarFive.setSelected(false);
        btnStarFour.setSelected(false);
        cantEstrellas = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String nombre, email, resenia;
        nombre = txtNombreCliente.getText();
        email = txtCorreoCliente.getText();
        resenia = txtResenia.getText();       

        if (validaEmail(email) == false && email.length() != 0) {
            JOptionPane.showMessageDialog(this, "El correo ingresado es Incorrecto", "Email Incorrecto", ERROR_MESSAGE);
        } else if (cantEstrellas == 0) {
            JOptionPane.showMessageDialog(this, "Califique con al menos una estrella", "Calificación incompleta", ERROR_MESSAGE);
        } else {
            Evaluacion evaluacion;// = new Evaluacion(clie, WIDTH, resenia)
            
            Cliente c;
            if (nombre.length() != 0 && email.length() != 0) {
                c = new Cliente(nombre, email);
            } else {
                c = new Cliente();
            }
            evaluacion = new Evaluacion(c, cantEstrellas, resenia);
            unSis.getEvaluaciones().add(evaluacion);
            JOptionPane.showMessageDialog(null, "Gracias por la votación! Es muy importante para nosotros su opinión!",
                    "Evaluación ingresada exitosamente", JOptionPane.INFORMATION_MESSAGE);            
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnStarOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarOneActionPerformed
        btnStarTwo.setSelected(false);
        btnStarOne.setSelected(true);
        btnStarThree.setSelected(false);
        btnStarFive.setSelected(false);
        btnStarFour.setSelected(false);
        cantEstrellas = 1;
    }//GEN-LAST:event_btnStarOneActionPerformed

    private void btnStarTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarTwoActionPerformed
        btnStarTwo.setSelected(true);
        btnStarOne.setSelected(true);
        btnStarThree.setSelected(false);
        btnStarFive.setSelected(false);
        btnStarFour.setSelected(false);
        cantEstrellas = 2;
    }//GEN-LAST:event_btnStarTwoActionPerformed

    private void btnStarThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarThreeActionPerformed
        btnStarTwo.setSelected(true);
        btnStarOne.setSelected(true);
        btnStarThree.setSelected(true);
        btnStarFive.setSelected(false);
        btnStarFour.setSelected(false);
        cantEstrellas = 3;
    }//GEN-LAST:event_btnStarThreeActionPerformed

    private void btnStarFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarFourActionPerformed
        btnStarTwo.setSelected(true);
        btnStarOne.setSelected(true);
        btnStarThree.setSelected(true);
        cantEstrellas = 4;
        btnStarFive.setSelected(false);
    }//GEN-LAST:event_btnStarFourActionPerformed

    private void btnStarFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarFiveActionPerformed
        btnStarTwo.setSelected(true);
        btnStarOne.setSelected(true);
        btnStarThree.setSelected(true);
        cantEstrellas = 5;
        btnStarFour.setSelected(true);


    }//GEN-LAST:event_btnStarFiveActionPerformed
    //Caracteres aceptados en direccion de email
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    
    public static boolean validaEmail(String email) {
       /*Esta funcion valida si el mail pasado por paramentro cumple el formato de mail*/
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JToggleButton btnStarFive;
    private javax.swing.JToggleButton btnStarFour;
    private javax.swing.JToggleButton btnStarOne;
    private javax.swing.JToggleButton btnStarThree;
    private javax.swing.JToggleButton btnStarTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreoCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JLabel lblResenia;
    private javax.swing.JLabel lblTextoResenia1;
    private javax.swing.JLabel lblTextoResenia2;
    private javax.swing.JLabel lblTextoResenia3;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextArea txtResenia;
    // End of variables declaration//GEN-END:variables
}
