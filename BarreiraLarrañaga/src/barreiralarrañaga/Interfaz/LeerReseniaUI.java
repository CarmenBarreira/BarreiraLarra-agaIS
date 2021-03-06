package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Evaluacion;

public class LeerReseniaUI extends javax.swing.JFrame {

    public LeerReseniaUI(Evaluacion eva) {
        initComponents();
        lblCorreo.setText(eva.getCliente().getEmailCliente());
        lblNombre.setText(eva.getCliente().getNombreCliente());
        jTextArea1.removeAll();
        jTextArea1.setText(eva.getResenia());
        promedioMuestra(eva.getEstrellas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResTitulo = new javax.swing.JLabel();
        lblNombreClieTitulo = new javax.swing.JLabel();
        lblMailTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnStarOne = new javax.swing.JToggleButton();
        btnStarOne1 = new javax.swing.JToggleButton();
        btnStarOne3 = new javax.swing.JToggleButton();
        btnStarOne2 = new javax.swing.JToggleButton();
        btnStarOne4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblResTitulo.setText("Reseña:");

        lblNombreClieTitulo.setText("Nombre del Cliente:");

        lblMailTitulo.setText("Correo Electronico:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sin Descripcion.\n");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("DESCRIPCIÓN DE RESEÑA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMailTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStarOne, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarOne3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarOne2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStarOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreClieTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreClieTitulo)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMailTitulo)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResTitulo)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnStarOne, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStarOne2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStarOne3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStarOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStarOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void promedioMuestra(int eval) {

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnStarOne;
    private javax.swing.JToggleButton btnStarOne1;
    private javax.swing.JToggleButton btnStarOne2;
    private javax.swing.JToggleButton btnStarOne3;
    private javax.swing.JToggleButton btnStarOne4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblMailTitulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreClieTitulo;
    private javax.swing.JLabel lblResTitulo;
    // End of variables declaration//GEN-END:variables
}
