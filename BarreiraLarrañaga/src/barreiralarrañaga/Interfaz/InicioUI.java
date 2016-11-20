/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Juan
 */
public class InicioUI extends javax.swing.JFrame {
    
    IntroPanel asd = new IntroPanel();
    Sistema sis;
    Border bor;

    /**
     * Creates new form NewUITest
     */
    public InicioUI(Sistema unSis) {
        initComponents();
        paneInterior.add(asd);
        asd.setVisible(true);
        sis = unSis;
        bor = BorderFactory.createLineBorder(Color.white);
        bor = BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createLoweredBevelBorder());
        restauranteBtn.setBorder(bor);
        sorteoBtn.setBorder(bor);
        salirBtn.setBorder(bor);
        reseniaBtn.setBorder(bor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneInterior = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        restauranteBtn = new javax.swing.JButton();
        reseniaBtn = new javax.swing.JButton();
        sorteoBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Coffee Room");

        paneInterior.setForeground(new java.awt.Color(60, 63, 65));
        paneInterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paneInterior.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        paneInterior.setMaximumSize(new java.awt.Dimension(683, 548));
        paneInterior.setMinimumSize(new java.awt.Dimension(683, 548));
        paneInterior.setLayout(new java.awt.GridLayout(1, 2));

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setFocusable(false);

        restauranteBtn.setBackground(new java.awt.Color(220, 234, 255));
        restauranteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconoRestaurant.png"))); // NOI18N
        restauranteBtn.setFocusPainted(false);
        restauranteBtn.setFocusable(false);
        restauranteBtn.setPreferredSize(new java.awt.Dimension(75, 32));
        restauranteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restauranteBtnActionPerformed(evt);
            }
        });

        reseniaBtn.setBackground(new java.awt.Color(220, 234, 255));
        reseniaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconoResenia.png"))); // NOI18N
        reseniaBtn.setFocusPainted(false);
        reseniaBtn.setFocusable(false);
        reseniaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reseniaBtnActionPerformed(evt);
            }
        });

        sorteoBtn.setBackground(new java.awt.Color(220, 234, 255));
        sorteoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconSorteos.png"))); // NOI18N
        sorteoBtn.setFocusPainted(false);
        sorteoBtn.setFocusable(false);
        sorteoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteoBtnActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(220, 234, 255));
        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconSalir.png"))); // NOI18N
        salirBtn.setFocusPainted(false);
        salirBtn.setFocusable(false);
        salirBtn.setPreferredSize(new java.awt.Dimension(75, 32));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sorteoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(reseniaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(restauranteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, Short.MAX_VALUE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(restauranteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(reseniaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sorteoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorteoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorteoBtnActionPerformed
        
        paneInterior.removeAll();
        PanelSorteo sort = new PanelSorteo(sis);
        paneInterior.add(sort);
        paneInterior.revalidate();
        paneInterior.repaint();
    }//GEN-LAST:event_sorteoBtnActionPerformed

    private void reseniaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reseniaBtnActionPerformed
        paneInterior.removeAll();
        PanelResenias pRes = new PanelResenias(sis);
        paneInterior.add(pRes);
        paneInterior.revalidate();
        paneInterior.repaint();

    }//GEN-LAST:event_reseniaBtnActionPerformed

    private void restauranteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restauranteBtnActionPerformed
        paneInterior.removeAll();
        PanelRestaurantes pRestau = new PanelRestaurantes(sis);
        paneInterior.add(pRestau);
        paneInterior.revalidate();
        paneInterior.repaint();
        

    }//GEN-LAST:event_restauranteBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtnActionPerformed

    /*

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUITest().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane paneInterior;
    private javax.swing.JButton reseniaBtn;
    private javax.swing.JButton restauranteBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton sorteoBtn;
    // End of variables declaration//GEN-END:variables
}
