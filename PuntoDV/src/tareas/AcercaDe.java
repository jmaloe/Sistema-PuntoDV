/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AcercaDe.java
 *
 * Created on 7/06/2011, 11:32:10 AM
 */
package tareas;

import controladores.RecursosPC;

/**
 *
 * @author USUARIO
 */
public class AcercaDe extends javax.swing.JDialog {

    /** Creates new form AcercaDe */
    public AcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Copyright 2021");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 153, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Sistema PuntoDV2021\"\n-----------------------------\nSoporte: Jesús Malo Escobar\n-----------------------------\nContacto:\n  e-mail: dic.malo@gmail.com\n  cel. 962 212 4109\n\nTapachula, Chiapas, México.\n-----------------------------\nUltima actualización: diciembre del 2021.\nOperaciones disponibles:\n-Punto de venta\n-Control de notas\n-Facturacion\n-Compras\n-Reportes\n-Control de clientes\n-Preventa\n-Inventario");
        jTextArea1.setToolTipText("Todos los derechos reservados 2011");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AcercaDe dialog = new AcercaDe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
