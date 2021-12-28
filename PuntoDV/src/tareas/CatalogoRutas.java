/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CatalogoRutas.java
 *
 * Created on 14/06/2011, 10:26:08 AM
 */
package tareas;

import controladores.*;
import java.awt.Frame;
import javax.swing.JRadioButton;
import reportes.ReportesClass;

/**
 *
 * @author USUARIO
 */
public class CatalogoRutas extends javax.swing.JDialog {

    Rutas r;
    ReportesClass rep;    
    Frame parental;
    String frecuencia;
    int aux;
    JRadioButton radios[];
    public CatalogoRutas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        parental = parent;
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        r = new Rutas();
        rep = new ReportesClass(parent);
        dias.add(lun);
        dias.add(mar);
        dias.add(mier);
        dias.add(juev);
        dias.add(vier);
        dias.add(sab);
        dias.add(dom);
         radios = new JRadioButton[]{lun,mar,mier,juev,vier,sab,dom};
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dias = new javax.swing.ButtonGroup();
        generar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        responsable = new javax.swing.JTextField();
        combo_rutas = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lun = new javax.swing.JRadioButton();
        mar = new javax.swing.JRadioButton();
        mier = new javax.swing.JRadioButton();
        juev = new javax.swing.JRadioButton();
        vier = new javax.swing.JRadioButton();
        sab = new javax.swing.JRadioButton();
        dom = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        generar_btn.setText("Leer");
        generar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Responsable:");

        responsable.setEditable(false);

        combo_rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_rutasActionPerformed(evt);
            }
        });

        jLabel12.setText("Ruta:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia de visita"));

        lun.setSelected(true);
        lun.setText("Lun");
        lun.setToolTipText("LUNES");

        mar.setText("Mar");
        mar.setToolTipText("MARTES");

        mier.setText("Mie");
        mier.setToolTipText("MIERCOLES");

        juev.setText("Jue");
        juev.setToolTipText("JUEVES");

        vier.setText("Vie");
        vier.setToolTipText("VIERNES");

        sab.setText("Sab");
        sab.setToolTipText("SABADO");

        dom.setText("Dom");
        dom.setToolTipText("DOMINGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lun)
                .addGap(18, 18, 18)
                .addComponent(mar)
                .addGap(18, 18, 18)
                .addComponent(mier)
                .addGap(18, 18, 18)
                .addComponent(juev)
                .addGap(18, 18, 18)
                .addComponent(vier)
                .addGap(18, 18, 18)
                .addComponent(sab)
                .addGap(18, 18, 18)
                .addComponent(dom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mier, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(juev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vier, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sab)
                        .addComponent(dom))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(responsable, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(generar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_btnActionPerformed
        for(aux=0; aux<7; aux++)
            if(radios[aux].isSelected())
               break;        
         rep.setNomReporte("LibroRuta");
         rep.setParametro("ID_RUTA", combo_rutas.getSelectedIndex()+1);
         rep.setParametro("POSICION_DIA", aux+1);
         rep.setParametro("DIA", radios[aux].getToolTipText());
          rep.doReporte();        
        //dispose();       
}//GEN-LAST:event_generar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();
}//GEN-LAST:event_salir_btnActionPerformed

    private void combo_rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_rutasActionPerformed
        r.setIdRuta(combo_rutas.getSelectedIndex()+1);
        responsable.setText(r.getResponsable());
}//GEN-LAST:event_combo_rutasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        r.getRutas(combo_rutas);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        r.desconectar();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.ButtonGroup dias;
    private javax.swing.JRadioButton dom;
    private javax.swing.JButton generar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton juev;
    private javax.swing.JRadioButton lun;
    private javax.swing.JRadioButton mar;
    private javax.swing.JRadioButton mier;
    private javax.swing.JTextField responsable;
    private javax.swing.JRadioButton sab;
    private javax.swing.JButton salir_btn;
    private javax.swing.JRadioButton vier;
    // End of variables declaration//GEN-END:variables
}
