/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PrincipalController;
import Model.vo.Requerimiento_1;
import Model.vo.Requerimiento_2;
import Model.vo.Requerimiento_3;
import java.util.ArrayList;

/**
 *
 * @author Berserker
 */
public class PrincipalView extends javax.swing.JFrame {

    public static final PrincipalController controlador = new PrincipalController();
    /**
     * Creates new form principalView
     */
    public PrincipalView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta_2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConsulta_3 = new javax.swing.JButton();
        btnConsulta_1 = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" CAMACOL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 180, -1));

        btnConsulta_2.setText("Consultar");
        btnConsulta_2.setFocusPainted(false);
        btnConsulta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Obtener el listado de compras con información");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Obtener Cargo y el máximo de los salarios de los lideres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Obtener el listado de proyectos con información");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        btnConsulta_3.setText("Consultar");
        btnConsulta_3.setFocusPainted(false);
        btnConsulta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, -1, -1));

        btnConsulta_1.setText("Consultar");
        btnConsulta_1.setFocusPainted(false);
        btnConsulta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        btnResetear.setText("Resetear");
        btnResetear.setFocusPainted(false);
        jPanel1.add(btnResetear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsulta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta_1ActionPerformed
        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try {
            // Su código

            // Encabezado del resultado
            System.out
                    .println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_1> lista = controlador.consultarRequerimiento1();

            lista.forEach(item -> {
                System.out.println(item.getConstructora() + " " + item.getCiudad() + " " + item.getBanco() + " "
                        + String.format("%.6f", item.getPorcentaje()).replace(",", ".")  + " " + item.getClasificacion() + " " + item.getFecha());
            });

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }//GEN-LAST:event_btnConsulta_1ActionPerformed

    private void btnConsulta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta_2ActionPerformed
        try {
            // Su código

            System.out.println("----------Listado de compras----------");
            // Encabezado del resultado
            System.out.println("Proveedor Constructora Pagado");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_2> lista = controlador.consultarRequerimiento2();

            lista.forEach(item -> {
                System.out.println(item.getProveedor() + " " + item.getConstructora() + " " + item.getPagado());
            });
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }//GEN-LAST:event_btnConsulta_2ActionPerformed

    private void btnConsulta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta_3ActionPerformed
        try {
            // Su código

            System.out.println("----------Cargo y el máximo de los salarios----------");
            // Encabezado del resultado
            System.out.println("Cargo MAX(l.Salario)");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_3> lista = controlador.consultarRequerimiento3();

            lista.forEach(item -> {
                System.out.println(item.getCargo() + " " + item.getMaxSalario());
            });
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error! " + e.getMessage());
        }
    }//GEN-LAST:event_btnConsulta_3ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta_1;
    private javax.swing.JButton btnConsulta_2;
    private javax.swing.JButton btnConsulta_3;
    private javax.swing.JButton btnResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
