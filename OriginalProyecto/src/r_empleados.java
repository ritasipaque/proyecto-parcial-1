
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class r_empleados extends javax.swing.JFrame {
    String barra= File.separator;
    String CrearUbicacion=System.getProperty("user.dir")+barra+"DatosTXT"+barra;
    //Se esta creando una carpeta llamada datosTXT dentro de nuestro proyecto
    //Lugar donde se almacenaran los datos 


    /**
     * Creates new form r_empleados
     */
    public r_empleados() {
        initComponents();
        this.tablaempleado.setModel(model);
        this.model.addColumn("Codigo");
        this.model.addColumn("Empleado");
        this.model.addColumn("Cargo");
        this.model.addColumn("Fecha de Contrato");
        this.model.addColumn("Sueldo");
        
    }
private void crearempleado(){ //throws FileNotFoundException{
    String archivo=txtcodigo.getText()+".txt";
    File CrearUbi=new File(CrearUbicacion);
    File CrearArchi = new File(CrearUbicacion+archivo);
    if(txtcodigo.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane,"No Existe Codigo");
    }else{
        try {
            if(CrearArchi.exists()){
                JOptionPane.showMessageDialog(rootPane,"El Codigo ya se encuentra registrado");
  
            }else{
                CrearUbi.mkdirs();
                Formatter CrearForma=new Formatter(CrearUbicacion+archivo);
                //s\r\n por cada campo de texto que vamos a registrar
                //codigo, empleado, etc
                CrearForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","Codigo="+txtcodigo.getText(),
                        "Empleado="+txtempleado.getText(),
                        "Cargo="+comcargo.getSelectedItem(),
                        "Fecha de Contratacion="+txtfecha.getText(),
                        "Sueldo="+txtsueldo.getText());
                CrearForma.close();
                JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Registro Incorrecto");
        }
    }
}
    
    @SuppressWarnings("unchecked")
        DefaultTableModel model=new DefaultTableModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        comcargo = new javax.swing.JComboBox<>();
        txtsueldo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CrearArchivo = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO EMPLEADOS");

        tablaempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempleado);

        jLabel2.setText("Codigo");

        jLabel3.setText("Empleado");

        jLabel4.setText("Cargo");

        jLabel5.setText("Fecha Contrato");

        jLabel6.setText("Sueldo");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        comcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador", "Auxiliar", "Secretaria", "Vendedora", "Chofer", "Mensajero" }));

        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDITAR (ACTUALIZAR)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("GRABAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CrearArchivo.setText("Generar Archivo");
        CrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearArchivoActionPerformed(evt);
            }
        });

        jButton7.setText("Bitacora");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigo)
                            .addComponent(txtempleado)
                            .addComponent(comcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtsueldo))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton7))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CrearArchivo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.model.addRow(new Object [] {
            this.txtcodigo.getText(),this.txtempleado.getText(), this.comcargo.getSelectedItem(),this.txtfecha.getText(),this.txtsueldo.getText()
        });
        this.txtcodigo.setText("");
        this.txtempleado.setText("");
        this.comcargo.setSelectedIndex(0);
        this.txtfecha.setText("");
        this.txtsueldo.setText("");
        txtcodigo.grabFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.txtcodigo.setText("");
         this.txtempleado.setText("");
        this.comcargo.setSelectedIndex(0);
        this.txtfecha.setText("");
        this.txtsueldo.setText("");
        txtcodigo.grabFocus();
    }//GEN-LAST:event_jButton2ActionPerformed
int filas;

    @SuppressWarnings("empty-statement")
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String [] datos=new String [5];
        datos[0]=txtcodigo.getText();
        datos[1]=txtempleado.getText();
        datos[2]=this.comcargo.getSelectedItem().toString();
        datos[3]=txtfecha.getText();
        datos[4]=txtsueldo.getText();
        int i = 0;
        
        for (int a  = 0; a < tablaempleado.getColumnCount(); a++) {
        modelo.setValueAt(datos[a],filas, a );
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       // int fila_seleccionada=tablaempleado.getSelectedRow();
       // if(fila_seleccionada>=0){
       //     modelo.removeRow(fila_seleccionada);
       // }else{
       //     JOptionPane.showMessageDialog(null, "seleccione una fila por favor");
       // }
       DefaultTableModel modelo = (DefaultTableModel) tablaempleado.getModel();
       int a=tablaempleado.getSelectedRow();
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

 
    private void CrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearArchivoActionPerformed

// TODO add your handling code here:
   crearempleado();
txtcodigo.setText("");
txtempleado.setText("");
txtfecha.setText("");
txtsueldo.setText("");
    }//GEN-LAST:event_CrearArchivoActionPerformed

    private void tablaempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadoMouseClicked
        // TODO add your handling code here:

        int fila_seleccionada=tablaempleado.getSelectedRow();
        txtcodigo.setText(tablaempleado.getValueAt(fila_seleccionada,0).toString());
        txtempleado.setText(tablaempleado.getValueAt(fila_seleccionada,1).toString());
        comcargo.setSelectedItem(tablaempleado.getValueAt(fila_seleccionada,2).toString());
        txtfecha.setText(tablaempleado.getValueAt(fila_seleccionada,3).toString());
        txtsueldo.setText(tablaempleado.getValueAt(fila_seleccionada,4).toString());
        int filas_selaeccionada = 0;
        filas=filas_selaeccionada;
    }//GEN-LAST:event_tablaempleadoMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        bitacora bita=new bitacora();
        bita.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton7MouseClicked
     DefaultTableModel modelo=new DefaultTableModel();
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
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new r_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearArchivo;
    private javax.swing.JComboBox<String> comcargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempleado;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables

    private void Crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
