package barreiralarrañaga.Interfaz;

import barreiralarrañaga.Dominio.Sistema;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.border.Border;

public class InicioUI extends javax.swing.JFrame {

    Sistema elSis;
    Border bor;

    public InicioUI(Sistema unSis) throws ClassNotFoundException {

        initComponents();

        paneInterior.setVisible(false);
        //seteo icono de form

        elSis = unSis;
        try {
            elSis = elSis.persistirLeer();

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        }
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                try {
                    elSis.persistirGuardar(elSis);
                    System.out.println("Guardado con Exito!");
                } catch (IOException ex) {
                
                }
            }
        });
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restauranteBtn = new javax.swing.JButton();
        reseniaBtn = new javax.swing.JButton();
        sorteoBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        paneInterior = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Coffee Room");
        setMaximumSize(new java.awt.Dimension(904, 570));
        setMinimumSize(new java.awt.Dimension(904, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(904, 570));
        getContentPane().setLayout(null);

        restauranteBtn.setBackground(new java.awt.Color(220, 234, 255));
        restauranteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconoRestaurant.png"))); // NOI18N
        restauranteBtn.setBorderPainted(false);
        restauranteBtn.setContentAreaFilled(false);
        restauranteBtn.setFocusPainted(false);
        restauranteBtn.setFocusable(false);
        restauranteBtn.setMaximumSize(new java.awt.Dimension(180, 120));
        restauranteBtn.setMinimumSize(new java.awt.Dimension(180, 120));
        restauranteBtn.setPreferredSize(new java.awt.Dimension(180, 120));
        restauranteBtn.setRequestFocusEnabled(false);
        restauranteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restauranteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(restauranteBtn);
        restauranteBtn.setBounds(10, 30, 180, 120);

        reseniaBtn.setBackground(new java.awt.Color(220, 234, 255));
        reseniaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconoResenia.png"))); // NOI18N
        reseniaBtn.setBorderPainted(false);
        reseniaBtn.setContentAreaFilled(false);
        reseniaBtn.setDefaultCapable(false);
        reseniaBtn.setFocusPainted(false);
        reseniaBtn.setFocusable(false);
        reseniaBtn.setMaximumSize(new java.awt.Dimension(180, 120));
        reseniaBtn.setMinimumSize(new java.awt.Dimension(180, 120));
        reseniaBtn.setPreferredSize(new java.awt.Dimension(180, 120));
        reseniaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reseniaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reseniaBtn);
        reseniaBtn.setBounds(10, 150, 179, 127);

        sorteoBtn.setBackground(new java.awt.Color(220, 234, 255));
        sorteoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconSorteos.png"))); // NOI18N
        sorteoBtn.setBorderPainted(false);
        sorteoBtn.setContentAreaFilled(false);
        sorteoBtn.setDefaultCapable(false);
        sorteoBtn.setFocusPainted(false);
        sorteoBtn.setFocusable(false);
        sorteoBtn.setMaximumSize(new java.awt.Dimension(180, 120));
        sorteoBtn.setMinimumSize(new java.awt.Dimension(180, 120));
        sorteoBtn.setPreferredSize(new java.awt.Dimension(180, 120));
        sorteoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sorteoBtn);
        sorteoBtn.setBounds(10, 280, 180, 120);

        salirBtn.setBackground(new java.awt.Color(220, 234, 255));
        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/iconSalir.png"))); // NOI18N
        salirBtn.setBorderPainted(false);
        salirBtn.setContentAreaFilled(false);
        salirBtn.setDefaultCapable(false);
        salirBtn.setFocusPainted(false);
        salirBtn.setFocusable(false);
        salirBtn.setMaximumSize(new java.awt.Dimension(180, 120));
        salirBtn.setMinimumSize(new java.awt.Dimension(180, 120));
        salirBtn.setPreferredSize(new java.awt.Dimension(180, 120));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn);
        salirBtn.setBounds(10, 400, 180, 120);

        paneInterior.setForeground(new java.awt.Color(60, 63, 65));
        paneInterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paneInterior.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        paneInterior.setMaximumSize(new java.awt.Dimension(683, 548));
        paneInterior.setMinimumSize(new java.awt.Dimension(683, 548));
        paneInterior.setOpaque(false);
        paneInterior.setLayout(new java.awt.GridLayout(1, 2));
        getContentPane().add(paneInterior);
        paneInterior.setBounds(200, 0, 700, 560);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barreiralarrañaga/Interfaz/img/fondoTest.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 960, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorteoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorteoBtnActionPerformed
        paneInterior.removeAll();
        paneInterior.setVisible(true);
        PanelSorteo sort = new PanelSorteo(elSis);
        paneInterior.add(sort);
        paneInterior.revalidate();
        paneInterior.repaint();
    }//GEN-LAST:event_sorteoBtnActionPerformed

    private void reseniaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reseniaBtnActionPerformed
        paneInterior.setVisible(true);
        paneInterior.removeAll();
        PanelResenias pRes = new PanelResenias(elSis);
        paneInterior.add(pRes);
        paneInterior.revalidate();
        paneInterior.repaint();
    }//GEN-LAST:event_reseniaBtnActionPerformed

    private void restauranteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restauranteBtnActionPerformed
        paneInterior.removeAll();
        paneInterior.setVisible(true);
        PanelRestaurantes pRestau = new PanelRestaurantes(elSis);
        paneInterior.add(pRestau);
        paneInterior.revalidate();
        paneInterior.repaint();
    }//GEN-LAST:event_restauranteBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        try {
           //al salir se persiste sistema
            elSis.persistirGuardar(elSis);
           dispose();
           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.exit(0);
    }//GEN-LAST:event_salirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDesktopPane paneInterior;
    private javax.swing.JButton reseniaBtn;
    private javax.swing.JButton restauranteBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton sorteoBtn;
    // End of variables declaration//GEN-END:variables
}
