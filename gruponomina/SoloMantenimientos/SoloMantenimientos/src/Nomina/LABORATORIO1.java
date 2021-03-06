//DIANA VICTORES 9959-19-1471/ BASE DE LA PLANILLA, MODIFICACION EN DISEÑO 
package Nomina;


//import java.awt.Color;
import CONTENEDOR.Contenedor;
/*import Recibo.recibo;*/
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class LABORATORIO1 extends javax.swing.JFrame {
    //Esto significa que colocando la palabra eslash sera lo mismo poner las barras invertidas \\
    String eslash=File.separator;
    //Esta es la ubicacion de la base de datos
    String ubicacion=System.getProperty("user.dir")+eslash+"Empleados"+eslash;
    //user.dir es para decir que la ubicacion de la bd estara dentro del proyecto
    //ademas de que este en la carpeta del proyecto que me cree una nueva carpeta que se llamara registros
    
    /**
     * Creates new form Planilla
     */
       public LABORATORIO1() {
        initComponents();
    }
       
       //colocames un metodo crear 
    private void Crear(){
        //como ya tengo creada la ubicacion del archivo creare el nombre del archivo, es decir el archivop tendra el nombre ID   
        String archivo=txtnombres.getText()+".registros"; //registros sera la extension del archivo
        //en un file creara la ubicacion
        File crea_ubicacion=new File(ubicacion);
        File crea_archivo=new File(ubicacion+archivo); //el archivo se creara en donde esta la ubicacion
        
        //en caso que no tenga nada escrito el campo del ID
        if(txtnombres.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "NO ESTA INGRESADO EL ID");
        }else{
            
            try {
                //en caso que no exista el archivo lo cree
            if(crea_archivo.exists()){
                JOptionPane.showMessageDialog(rootPane, "EL REGISTO YA EXISTE");
            }else{
                
                String puestooo;
                
               //sirve para crear la carpeta
               crea_ubicacion.mkdirs();
                try (Formatter creaForma = new Formatter(ubicacion+archivo)) {
                    creaForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","***Empresa "+jLabel3.getText(),
                            "NOMBRE= "+txtnombres.getText(),
                            "PUESTO= "+txtpues.getText(),
                            "***INGRESOS DEL EMPLEADO***",
                            "SUELDO_EXTRAORDINARIO= "+txtsueldoextra.getText(),
                            "COMISIONES= "+txtcomis.getText(),
                            "***DESCUENTOS DEL EMPLEADO***",
                            "ANTICIPOS= "+txtanticipos.getText(),
                            "DESCUENTO_JUDICIAL= "+txtjudicial.getText());
                }
               JOptionPane.showMessageDialog(rootPane,"REGISTRO INGRESADO CORRECTAMENTE");
            }
         } catch (Exception e){
         JOptionPane.showMessageDialog(rootPane,"REGISTRO INCORRECTO");
            }
        }
    }

    
    private void Buscar(){
        File url= new File(ubicacion+txtnombres.getText()+".registros");
       
        if(txtnombres.getText().equals("")){
            
        JOptionPane.showMessageDialog(rootPane, "Indique el nombre para mostrar");
        
        }else{
    
        if(url.exists()){
            
            try {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);
                        
                txtpues.setText(mostrar.getProperty("PUESTO"));
                txtsueldoextra.setText(mostrar.getProperty("SUELDO_EXTRAORDINARIO"));
                txtcomis.setText(mostrar.getProperty("COMISIONES"));
                txtanticipos.setText(mostrar.getProperty("ANTICIPOS"));
                txtjudicial.setText(mostrar.getProperty("DESCUENTO_JUDICIAL"));
                
            } catch (Exception e){
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ese registro no existe");
        }
    }
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
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpues = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsueldoextra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcomis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtotross = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtanticipos = new javax.swing.JTextField();
        txtjudicial = new javax.swing.JTextField();
        txtotrosss = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CmdCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        CmdSalir = new javax.swing.JButton();
        CmdTotales = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TSal = new javax.swing.JTextField();
        CmdCalc1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Label_status = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        CmdCalc2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 60, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtnombres.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puesto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, -1));
        jPanel1.add(txtpues, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATOS PERSONALES");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("INGRESOS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sueldo Extraordinario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtsueldoextra.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtsueldoextra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Comisiones:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtcomis.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtcomis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Otros:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtotross.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtotross, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Anticipos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descuento Judicial:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Otros:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        txtanticipos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtanticipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 138, -1));

        txtjudicial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtjudicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 138, -1));

        txtotrosss.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtotrosss, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 138, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DESCUENTOS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 490, 480));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nomina/blu2.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 290));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desarrollo Empresarial S.A.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 11, -1, -1));

        CmdCalc.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        CmdCalc.setText("Registrar/Calcular");
        CmdCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalcActionPerformed(evt);
            }
        });
        getContentPane().add(CmdCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 50, 170, 30));

        tablita.setBackground(new java.awt.Color(102, 102, 102));
        tablita.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        tablita.setForeground(new java.awt.Color(255, 255, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puesto", "Sueldo Ordinario", "Sueldo Extra", "Bonificación", "Comisiones", "Otros", "Total Ingreso", "IGSS", "ISR", "Anticipos", "Descuento Judicial", "Otros", "Total Descuentosl", "Sueldo Líquido"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 833, 206));

        CmdSalir.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        CmdSalir.setText("Salir");
        CmdSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(CmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 100, 40));

        CmdTotales.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        CmdTotales.setText("Totales");
        CmdTotales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdTotalesActionPerformed(evt);
            }
        });
        getContentPane().add(CmdTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 170, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Salarios:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, -1));

        TSal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(TSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 120, -1));

        CmdCalc1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        CmdCalc1.setText("Modificar");
        CmdCalc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalc1ActionPerformed(evt);
            }
        });
        getContentPane().add(CmdCalc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 90, 170, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setText("Registros Empleados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 170, 40));

        Label_status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(Label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 287, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, 40));

        Regresar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 100, 40));

        label_status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 110, -1));

        CmdCalc2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        CmdCalc2.setText("Buscar");
        CmdCalc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalc2ActionPerformed(evt);
            }
        });
        getContentPane().add(CmdCalc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 170, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nomina/blu2.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 900, 640));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nomina/blu2.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 900, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CmdCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalcActionPerformed
     
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyectofinal","root","");

            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into planilla values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtnombres.getText().trim());
            pst.setString(3, txtpues.getText().trim());   
            pst.setString(4, txtsueldoextra.getText().trim());
            pst.setString(5, txtcomis.getText().trim());
            pst.setString(6, txtotross.getText().trim());
            pst.setString(7, txtanticipos.getText().trim());
            pst.setString(8, txtjudicial.getText().trim());
            pst.setString(9, txtotrosss.getText().trim());  
        
            pst.executeUpdate();
            txtnombres.setText("");
            txtpues.setText("");
            txtsueldoextra.setText(""); 
            txtcomis.setText("");
            txtotross.setText("");
            txtanticipos.setText("");
            txtjudicial.setText("");
            txtotrosss.setText("");
            
            label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }        





//----- VARIABLES -----//
        String nombree="";
        String puestoo="";
        double sueldo=0.0;
        //------------------------//
        nombree = txtnombres.getText();
        puestoo = txtpues.getText();
        switch(puestoo)
        {
            case "Contador":
                sueldo=6000;
                break;
            case "Auxiliar":
                sueldo=2000;
                break;
            case "Secretaria":
                sueldo=2500;
                break;
            case "Vendedora":
                sueldo=1000;
                break;
            case "Chofer":
                sueldo=1800;
                break;
            case "Mensajero":
                sueldo=900;
                break;
        }
        //--------------------------//
        double sueldoExtra=0, comisiones=0, otrosIngresos=0;
        sueldoExtra=Double.parseDouble(txtsueldoextra.getText());
        comisiones=Double.parseDouble(txtcomis.getText());
        otrosIngresos=Double.parseDouble(txtotross.getText());
        //----------------------------------------------//
        double totIngresos=0;
        //--- SE ADICIONAN 154.5, VALOR DE LA BONIFICACIÓN INCENTIVO
        totIngresos = 154.5+sueldo+sueldoExtra+comisiones+otrosIngresos;
        //-------------------------------------------------------//
        double igss=0;
        igss=sueldo*0.0483;
        double isr=0;
        if(sueldo>=5000){
            isr=71.98;
        }
        double anticipos=0, dj=0, otrosDescuentos=0;
        double totDesc=0;
        anticipos=Double.parseDouble(txtanticipos.getText());
        dj=Double.parseDouble(txtjudicial.getText());
        otrosDescuentos=Double.parseDouble(txtotrosss.getText());
        //---------
        totDesc=igss+isr+anticipos+dj+otrosDescuentos;
        //---------------------//
        double sueldoLiquido=0;
        sueldoLiquido = totIngresos-totDesc;
        //---------------------------------------//
        Object[] data = new Object[15];
        data[0]=nombree;
        data[1]=puestoo;
        data[2]=String.valueOf(sueldo);
        data[3]=String.valueOf(sueldoExtra);
        data[4]="154.5";
        data[5]=String.valueOf(comisiones);
        data[6]=String.valueOf(otrosIngresos);
        data[7]=String.valueOf(totIngresos);
        data[8]=String.valueOf(igss);
        data[9]="71.98";
        data[10]=String.valueOf(anticipos);
        data[11]=String.valueOf(dj);
        data[12]=String.valueOf(otrosDescuentos);
        data[13]=String.valueOf(totDesc);
        data[14]=String.valueOf(sueldoLiquido);
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo);
        //--------------------------//
        txtnombres.setText("");
        txtsueldoextra.setText("");
        txtcomis.setText("");
        txtotross.setText("");
        txtanticipos.setText("");
        txtotrosss.setText("");
        txtjudicial.setText("");
        txtnombres.requestFocus();
    }//GEN-LAST:event_CmdCalcActionPerformed

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_CmdSalirActionPerformed

    private void CmdTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdTotalesActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        float t2=0; String t0="";
        for(int i=0; i<modelo.getRowCount(); i++)
        {
            t0=(String)modelo.getValueAt(i,14);
            t2=t2+Float.parseFloat(t0);
        }
        TSal.setText(String.valueOf(t2));
    }//GEN-LAST:event_CmdTotalesActionPerformed

    private void CmdCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalc1ActionPerformed
       // Crear();
         try {
            String ID = txtid.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("update planilla set CodigoNombre=?, CodigoPuesto=?, CodigoSueldo=?, CodigoComisiones= ?, CodigoOtros= ?, CodigoAnticipos= ?, CodigoDescuento= ?, CodigoOtros2 = ? where ID = " + ID);

            
            pst.setString(1, txtnombres.getText().trim());
            pst.setString(2, txtpues.getText().trim());
            pst.setString(3, txtsueldoextra.getText().trim());
            pst.setString(4, txtcomis.getText().trim());
            pst.setString(5, txtotross.getText().trim()); 
            pst.setString(6, txtanticipos.getText().trim());    
            pst.setString(7, txtjudicial.getText().trim());
            pst.setString(8, txtotrosss.getText().trim());
           
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_CmdCalc1ActionPerformed

    private void CmdCalc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalc2ActionPerformed
      //  Buscar();
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from planilla where ID = ?");
            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtnombres.setText(rs.getString("CodigoNombre"));
                txtpues.setText(rs.getString("CodigoPuesto"));
                txtsueldoextra.setText(rs.getString("CodigoSueldo"));
                txtcomis.setText(rs.getString("CodigoComisiones"));
                txtotross.setText(rs.getString("CodigoOtros"));
                txtanticipos.setText(rs.getString("CodigoAnticipos"));
                txtjudicial.setText(rs.getString("CodigoDescuento"));
                txtotrosss.setText(rs.getString("CodigoOtros2"));

            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

    } 
    }//GEN-LAST:event_CmdCalc2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           r_empleados GN= new r_empleados(); 
          GN.setVisible(true);
           this.setVisible(false);
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from planilla where ID = ?");

            pst.setString(1, txtid.getText().trim());
            pst.executeUpdate();
            txtnombres.setText("");
            txtpues.setText("");
            txtsueldoextra.setText("");
            txtcomis.setText("");
            txtotross.setText("");
            txtanticipos.setText("");
            txtjudicial.setText("");
            txtotrosss.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // REGRESAR
         Contenedor GN= new Contenedor(); 
         GN.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LABORATORIO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LABORATORIO1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdCalc;
    private javax.swing.JButton CmdCalc1;
    private javax.swing.JButton CmdCalc2;
    private javax.swing.JButton CmdSalir;
    private javax.swing.JButton CmdTotales;
    private javax.swing.JLabel Label_status;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TSal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField txtanticipos;
    private javax.swing.JTextField txtcomis;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjudicial;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtotross;
    private javax.swing.JTextField txtotrosss;
    private javax.swing.JTextField txtpues;
    private javax.swing.JTextField txtsueldoextra;
    // End of variables declaration//GEN-END:variables
}
