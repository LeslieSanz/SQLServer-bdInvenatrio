/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author lesly
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedore = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProductos = new javax.swing.JMenu();
        jmiCategorias = new javax.swing.JMenuItem();
        jmiCatalogoProd = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jmigenerarVenta = new javax.swing.JMenuItem();
        jmireporte = new javax.swing.JMenuItem();
        jmiProveedor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedore.setBackground(new java.awt.Color(204, 204, 204));
        contenedore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout contenedoreLayout = new javax.swing.GroupLayout(contenedore);
        contenedore.setLayout(contenedoreLayout);
        contenedoreLayout.setHorizontalGroup(
            contenedoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        contenedoreLayout.setVerticalGroup(
            contenedoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jMenuProductos.setText("Productos");
        jMenuProductos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });

        jmiCategorias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jmiCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categorias 1.png"))); // NOI18N
        jmiCategorias.setText("Categorías");
        jmiCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoriasActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmiCategorias);

        jmiCatalogoProd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jmiCatalogoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entradita.png"))); // NOI18N
        jmiCatalogoProd.setText("Registro");
        jmiCatalogoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCatalogoProdActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmiCatalogoProd);

        jMenuBar1.add(jMenuProductos);

        jMenuVenta.setBackground(new java.awt.Color(0, 0, 0));
        jMenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        jMenuVenta.setText("Venta");
        jMenuVenta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jmigenerarVenta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jmigenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/generarV.png"))); // NOI18N
        jmigenerarVenta.setText("Generar Venta");
        jmigenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmigenerarVentaActionPerformed(evt);
            }
        });
        jMenuVenta.add(jmigenerarVenta);

        jmireporte.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jmireporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        jmireporte.setText("Reporte");
        jmireporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmireporteActionPerformed(evt);
            }
        });
        jMenuVenta.add(jmireporte);

        jMenuBar1.add(jMenuVenta);

        jmiProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proveedor.png"))); // NOI18N
        jmiProveedor.setText("Proveedor");
        jmiProveedor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista.png"))); // NOI18N
        jMenuItem1.setText("Listar Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiProveedor.add(jMenuItem1);

        jMenuBar1.add(jmiProveedor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedore)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriasActionPerformed
        actualizarInterfaz();
        IFrmCategoria c= new IFrmCategoria();
        contenedore.add(c);
        c.show();
    }//GEN-LAST:event_jmiCategoriasActionPerformed

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jmiCatalogoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCatalogoProdActionPerformed
        actualizarInterfaz();
        IFrmProducto p= new IFrmProducto();
        contenedore.add(p);
        p.show();
    }//GEN-LAST:event_jmiCatalogoProdActionPerformed

    private void jmireporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmireporteActionPerformed
        actualizarInterfaz();
        IFrmReporte r= new IFrmReporte();
        contenedore.add(r);
        r.show();
    }//GEN-LAST:event_jmireporteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        actualizarInterfaz();
        IFrmProveedor prov= new IFrmProveedor();
        contenedore.add(prov);
        prov.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmigenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmigenerarVentaActionPerformed
        actualizarInterfaz();
        IFrmGenerarVenta gv= new IFrmGenerarVenta();
        contenedore.add(gv);
        gv.show();
    }//GEN-LAST:event_jmigenerarVentaActionPerformed
    
    //Para que no se sobrepongan los frames internos
    public static void actualizarInterfaz(){
        contenedore.removeAll();
        contenedore.revalidate();
        contenedore.repaint();
    }
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane contenedore;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuVenta;
    private javax.swing.JMenuItem jmiCatalogoProd;
    private javax.swing.JMenuItem jmiCategorias;
    private javax.swing.JMenu jmiProveedor;
    private javax.swing.JMenuItem jmigenerarVenta;
    private javax.swing.JMenuItem jmireporte;
    // End of variables declaration//GEN-END:variables
}
