 /**
   librerias
     */
package Mantenimientos;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Almacenamiento_Departamento extends javax.swing.JFrame {

  
    public Almacenamiento_Departamento() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        codigo1 = new javax.swing.JTextField();
        codigo2 = new javax.swing.JTextField();
        puesto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jefe = new javax.swing.JTextField();
        ya = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mantenimiento de Departamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo de  Puesto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Puesto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 50, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo  de  Departamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 150, 22));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Departamento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo de Jefe de  Area");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        codigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 107, 159, -1));

        departamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 143, 159, -1));

        codigo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 191, 159, -1));

        codigo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 277, 159, -1));

        puesto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 318, 159, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 110, -1));

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 363, 120, -1));

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 363, 120, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre de Jefe de Area");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jefe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 238, 159, -1));

        ya.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(ya, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 470, 94, 17));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/Captura3.PNG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 263, 199));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/fondorombo2.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Departamento", "Departamento", "Codigo Jefe de area", "Nombre Jefe de area", "Codigo puesto", "Puesto"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
 /**
    conector de mi sql
     */
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/A_d", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into departamento values(?,?,?,?,?,?)");
 /**
    entrada y salida  de  arcrivos
     */
            pst.setString(1, codigo.getText().trim());
            pst.setString(2, departamento.getText().trim());
            pst.setString(3, codigo1 .getText().trim());
            pst.setString(4, jefe.getText().trim());
            pst.setString(5, codigo2.getText().trim());
            pst.setString(6, puesto.getText().trim());

            pst.executeUpdate();

            codigo.setText("");
            departamento.setText("");
            codigo1.setText("");
            jefe.setText("");
            codigo2.setText("");
            puesto.setText("");
             /**
     * aviso
     */
            ya.setText("Registro exitoso.");
        } catch (Exception e) {

        }
        
        //-----------------------------------------------------------------------------------------------------
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object  [] fila=new Object [6];
        fila[0]=codigo.getText();
        fila[1]=departamento.getText();
        fila[2]=codigo1.getText();
        fila[3]=jefe.getText();
        fila[4]=codigo2.getText();
        fila[5]=puesto.getText();
        modelo.addRow(fila);
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
             /**
    buscar  por el  codigo de la  tabla
     */
            String ID = codigo.getText().trim();
 /**
   connecion en la base de   datos
     */
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/A_D", "root", "");
          /**
    busque los  datatir que campo
     */
            PreparedStatement pst = cn.prepareStatement("update departamento set id = ?, departamento = ? ,codigo = ?, jefe = ?, codigo1 = ?, puesto = ? where ID = " + ID);
 /**
   cabiar los  datos
     */
            pst.setString(1, codigo.getText().trim());
            pst.setString(2, departamento.getText().trim());
            pst.setString(3, codigo1 .getText().trim());
            pst.setString(4, jefe.getText().trim());
            pst.setString(5, codigo2.getText().trim());
            pst.setString(6, puesto.getText().trim());
 /**
    aviso
     */
            ya.setText("Modificación exitosa.");

        } catch (Exception e) {
        }

        // ------------------------------------------------------------------------------------------------
        String [] datos=new String [6];
        datos[0]=codigo.getText();
        datos[1]=departamento.getText();
        datos[2]=codigo1.getText();
        datos[3]=jefe.getText();
        datos[4]=codigo2.getText();
        datos[5]=puesto.getText();
        int i = 0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
             /**
 conecion con la base de datos
     */
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/A_D", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from departamento where ID = ?");
 /**
     buscar por  codigo
     */
            pst.setString(1, codigo.getText().trim());
            pst.executeUpdate();

            codigo.setText("");
            departamento.setText("");
            codigo1.setText("");
            jefe.setText("");
            codigo2.setText("");
            puesto.setText("");
 /**
  aviso
     */
            ya.setText("Registro eliminado.");

        } catch (Exception e) {
        }

        // -----------------------------------------------------------
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        int a=tblDatos.getSelectedRow();
        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
            if (JOptionPane.OK_OPTION == confirmar){
                modelo.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         /**
   coneccion de base de tados
     */
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/A_D", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from departamento  where ID = ?");
            /**
     * quequeda  por  codigo
     */
            pst.setString(1, codigo.getText().trim());
            ResultSet rs = pst.executeQuery();
           /**
     busqueda  en los  base de datos
     */
            if(rs.next()){
                codigo.setText(rs.getString("id"));
                departamento.setText(rs.getString("departamento"));
                codigo1.setText(rs.getString("codigo"));
                jefe.setText(rs.getString("jefe"));
                codigo2.setText(rs.getString("codigo1"));
                puesto.setText(rs.getString("puesto"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2ActionPerformed

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
            java.util.logging.Logger.getLogger(Almacenamiento_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacenamiento_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacenamiento_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacenamiento_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacenamiento_Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JTextField departamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jefe;
    private javax.swing.JTextField puesto;
    private javax.swing.JTable tblDatos;
    private javax.swing.JLabel ya;
    // End of variables declaration//GEN-END:variables
}
