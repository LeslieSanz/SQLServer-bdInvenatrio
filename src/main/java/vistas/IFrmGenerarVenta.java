/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import dao.detalleDAO;
import dao.ventaDAO;
import modelo.Detalle;
import modelo.Venta;

/**
 *
 * @author esther
 */
public class IFrmGenerarVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmGenerarVenta
     */
    public IFrmGenerarVenta() {
        initComponents();
        setSize(965,553);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfactura = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtcodven = new javax.swing.JTextField();
        btngenerarf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("Categorías");

        txtfactura.setColumns(20);
        txtfactura.setRows(5);
        jScrollPane1.setViewportView(txtfactura);

        jLabel1.setText("Ingresar Codigo de Venta");

        btngenerarf.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btngenerarf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fact 1 (1).png"))); // NOI18N
        btngenerarf.setText("Generar Factura");
        btngenerarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setText("Venta");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventafac.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodven, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)))
                        .addComponent(btngenerarf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(btngenerarf))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarfActionPerformed
        String codven=txtcodven.getText();
        ventaDAO vd =new ventaDAO();
        String vendatos ="";
        for (Venta v : vd.lisVentaDatos(codven)) {
            vendatos += "---------------------------FACTURA DE VENTA------------------------------" + "\n";
            vendatos += "Cod de Venta:     " + v.getCodven()+ "\n"; 
            vendatos += "             Fecha:     " + v.getFecVen()+ "\n"; 
            vendatos += "       Vendedor:     " + v.getNomVen() + "\n";
            vendatos += "           Cliente:     " + v.getNomCli()+ "\n";
        }
        String detalle ="";
        detalleDAO dd =new detalleDAO();
        for (Detalle d : dd.listaDetalles(codven)) {
            detalle += "----------------------------------------------------------------------------------" + "\n";
            detalle += "Cod_pro     Descripcion                 Cant         Precio           Subtotal " + "\n";
            detalle += "" + d.getCodPro()+"         "+d.getDescripcion()+
                                "        "+d.getCantDeta()+"           "+d.getPrePro()+
                                "                 "+d.getSubtotal()+"\n";
            detalle += "----------------------------------------------------------------------------------" + "\n";
        }
        
        String venTot ="";
        for (Venta v : vd.lisTotVen(codven)) {
            venTot += "Op. Gravadas:   S/      " + v.getOpGrav()+ "\n"; 
            venTot += "        IGV-185:   S/      " + v.getIGV()+ "\n";
            venTot += "   Importe Tot:   S/      " + v.getImpT()+ "\n";
        }
        
        String factura = vendatos + "\n" +detalle+ "\n" +venTot;
        txtfactura.setText(factura);
    }//GEN-LAST:event_btngenerarfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerarf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodven;
    private javax.swing.JTextArea txtfactura;
    // End of variables declaration//GEN-END:variables
}