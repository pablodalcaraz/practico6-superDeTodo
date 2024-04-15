/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.TreeSet;
import javax.swing.ImageIcon;


/**
 *
 * @author Pablo
 */
public class MenuGeneral extends javax.swing.JFrame {
    private TreeSet<Producto> productos=new TreeSet<>();
    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/familia.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiPorRubro = new javax.swing.JMenuItem();
        jmiPorNombre = new javax.swing.JMenuItem();
        jmiPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(1350, 650));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("Administración");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmiPorRubro.setText("Por Rubro");
        jmiPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmiPorRubro);

        jmiPorNombre.setText("Por Nombre");
        jmiPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmiPorNombre);

        jmiPorPrecio.setText("Por Precio");
        jmiPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiPorPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
          escritorio.removeAll();
          escritorio.repaint();
          GestionDeProductos gdp=new GestionDeProductos(productos);
          gdp.setVisible(true);
          escritorio.add(gdp);
          gdp.setLocation(450, 150);
         
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmiPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorRubroActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       ConsultaPorRubro cpr=new ConsultaPorRubro(productos);
       cpr.setVisible(true);
       escritorio.add(cpr);
       cpr.setLocation(450, 150);
       
    }//GEN-LAST:event_jmiPorRubroActionPerformed

    private void jmiPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorNombreActionPerformed
        escritorio.removeAll();
       escritorio.repaint();
       ConsultaPorNombre cpr=new ConsultaPorNombre(productos);
       cpr.setVisible(true);
       escritorio.add(cpr);
       cpr.setLocation(450, 150);
    }//GEN-LAST:event_jmiPorNombreActionPerformed

    private void jmiPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorPrecioActionPerformed
          escritorio.removeAll();
       escritorio.repaint();
       ConsultaPorPrecio cpr=new ConsultaPorPrecio(productos);
       cpr.setVisible(true);
       escritorio.add(cpr);
       cpr.setLocation(450, 150);
    }//GEN-LAST:event_jmiPorPrecioActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiPorNombre;
    private javax.swing.JMenuItem jmiPorPrecio;
    private javax.swing.JMenuItem jmiPorRubro;
    private javax.swing.JMenuItem jmiProductos;
    // End of variables declaration//GEN-END:variables
}