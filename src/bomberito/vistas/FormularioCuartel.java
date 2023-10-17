
package bomberito.vistas;

import bomberito.accesoADatos.CuartelData;
import bomberito.entidades.Cuartel;
import javax.swing.table.DefaultTableModel;


public class FormularioCuartel extends javax.swing.JInternalFrame {
CuartelData data=null;
int guardarID;
int numViejo;

    
    public FormularioCuartel() {
        initComponents();
        data=new CuartelData();
        cargarTabla();
        encabezadoTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNombreCuartel = new javax.swing.JTextField();
        jCoordenadaX = new javax.swing.JTextField();
        jDirecciónCuartel = new javax.swing.JTextField();
        jCoordenadaY = new javax.swing.JTextField();
        jTelefonoCuartel = new javax.swing.JTextField();
        jCorreoCuartel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNuevoCuartel = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCuarteles = new javax.swing.JTable();
        jSeleccionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();

        jLabel1.setText("Nombre del Cuartel :");

        jLabel2.setText("Dirección :");

        jLabel3.setText("Coordenada Y :");

        jLabel4.setText("Coordenada X :");

        jLabel5.setText("Teléfono :");

        jLabel6.setText("Correo :");

        jNombreCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNombreCuartelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreCuartelKeyTyped(evt);
            }
        });

        jCoordenadaX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCoordenadaXKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCoordenadaXKeyTyped(evt);
            }
        });

        jDirecciónCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDirecciónCuartelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDirecciónCuartelKeyTyped(evt);
            }
        });

        jCoordenadaY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCoordenadaYKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCoordenadaYKeyTyped(evt);
            }
        });

        jTelefonoCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTelefonoCuartelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoCuartelKeyTyped(evt);
            }
        });

        jCorreoCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCorreoCuartelKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Cuartel");

        jNuevoCuartel.setText("Nuevo Cuartel");
        jNuevoCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoCuartelActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jtCuarteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCuarteles);

        jSeleccionar.setText("Seleccionar");
        jSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeleccionarActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar Brigada");

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Editar)
                .addGap(72, 72, 72)
                .addComponent(jNuevoCuartel)
                .addGap(78, 78, 78)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jSalir))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTelefonoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNombreCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDirecciónCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeleccionar)
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCorreoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLimpiar)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNombreCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDirecciónCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeleccionar))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTelefonoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCorreoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLimpiar)))
                    .addComponent(jCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(jNuevoCuartel)
                    .addComponent(jSalir)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNuevoCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoCuartelActionPerformed
        String nombreCuartel = jNombreCuartel.getText();
        String direccion= jCoordenadaX.getText();
        int coordX= Integer.parseInt( jDirecciónCuartel.getText());
        int coordY=Integer.parseInt(jCoordenadaY.getText());
        String telefono= jTelefonoCuartel.getText();
        String correo=jCorreoCuartel.getText();
      Cuartel nuevo=new Cuartel(nombreCuartel, direccion, coordX, coordY, telefono, correo );
    data.nuevoCuartel(nuevo);
    }//GEN-LAST:event_jNuevoCuartelActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jNombreCuartelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreCuartelKeyReleased
        // TODO add your handling code here:
       borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
            if (prod.getNombreCuartel().toLowerCase().contains(jNombreCuartel.getText().toLowerCase())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
            }
        } 
    }//GEN-LAST:event_jNombreCuartelKeyReleased

    private void jNombreCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreCuartelKeyTyped
        // TODO add your handling code here:
        if (jNombreCuartel.getText().length()>=20) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean enieMin = key == 'ñ';
        boolean enieMay = key == 'Ñ';
       
        if (!num && !mayusculas && !minusculas && !espacio && !enieMin && !enieMay) {
            evt.consume();
        }
    }//GEN-LAST:event_jNombreCuartelKeyTyped

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        String nombreCuartel = jNombreCuartel.getText();
        String direccion= jCoordenadaX.getText();
        int coordX= Integer.parseInt( jCoordenadaX.getText());
        int coordY=Integer.parseInt(jCoordenadaY.getText());
        String telefono= jTelefonoCuartel.getText();
        String correo=jCorreoCuartel.getText();
      Cuartel nuevo=new Cuartel(nombreCuartel, direccion, coordX, coordY, telefono, correo );
    data.modificarCuartel(nuevo);
    }//GEN-LAST:event_EditarActionPerformed

    private void jSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeleccionarActionPerformed
        // TODO add your handling code here:
        for (Cuartel listaCuartel : data.traerCuarteles()) {
            if (guardarID == listaCuartel.getIdCuartel()) {
                numViejo=listaCuartel.getIdCuartel();
                jNombreCuartel.setText(listaCuartel.getNombreCuartel());
                jDirecciónCuartel.setText(listaCuartel.getDireccion());
                jCoordenadaX.setText(listaCuartel.getDireccion());
                jCoordenadaX.setText(listaCuartel.getCoordX()+"");
                jCoordenadaY.setText(listaCuartel.getCoordY()+"");
                jTelefonoCuartel.setText(listaCuartel.getTelefono());
                jCorreoCuartel.setText(listaCuartel.getCorreo()); ;

            }           
        }
    }//GEN-LAST:event_jSeleccionarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jCoordenadaXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCoordenadaXKeyTyped
        // TODO add your handling code here:
        if (jCoordenadaX.getText().length()>=3) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_jCoordenadaXKeyTyped

    private void jCoordenadaXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCoordenadaXKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
        String aux=prod.getCoordX()+"";
            if (aux.contains(jCoordenadaX.getText())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
                 } 
             } 

    }//GEN-LAST:event_jCoordenadaXKeyReleased

    private void jCoordenadaYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCoordenadaYKeyTyped
        if (jCoordenadaY.getText().length()>=3) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_jCoordenadaYKeyTyped

    private void jCoordenadaYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCoordenadaYKeyReleased
        // TODO add your handling code here:
                             borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
        String aux=prod.getCoordY()+"";
            if (aux.contains(jCoordenadaY.getText())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
                 } 
}
    }//GEN-LAST:event_jCoordenadaYKeyReleased

    private void jTelefonoCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoCuartelKeyTyped
        // TODO add your handling code here:
        if (jTelefonoCuartel.getText().length()>=20) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57 || key==45;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_jTelefonoCuartelKeyTyped

    private void jTelefonoCuartelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoCuartelKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
            if (prod.getTelefono().contains(jTelefonoCuartel.getText())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
                 } 
             }
    }//GEN-LAST:event_jTelefonoCuartelKeyReleased

    private void jDirecciónCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDirecciónCuartelKeyTyped
        // TODO add your handling code here:
        if (jDirecciónCuartel.getText().length()>=20) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean enieMin = key == 'ñ';
        boolean enieMay = key == 'Ñ';
       
        if (!num && !mayusculas && !minusculas && !espacio && !enieMin && !enieMay) {
            evt.consume();
        }
    }//GEN-LAST:event_jDirecciónCuartelKeyTyped

    private void jDirecciónCuartelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDirecciónCuartelKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
            if (prod.getDireccion().toLowerCase().contains(jDirecciónCuartel.getText().toLowerCase())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
            }
        }
    }//GEN-LAST:event_jDirecciónCuartelKeyReleased

    private void jCorreoCuartelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCorreoCuartelKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        for (Cuartel prod : data.traerCuarteles()) {
            if (prod.getCorreo().contains(jCorreoCuartel.getText())) {  //Implementar ignoreCase
                guardarID=prod.getIdCuartel();
                modelo.addRow(new Object[]{
                    prod.getNombreCuartel(),
                    prod.getDireccion(),
                    prod.getTelefono(),
                    prod.getCorreo()});
            }
        }
    }//GEN-LAST:event_jCorreoCuartelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCoordenadaX;
    private javax.swing.JTextField jCoordenadaY;
    private javax.swing.JTextField jCorreoCuartel;
    private javax.swing.JTextField jDirecciónCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNombreCuartel;
    private javax.swing.JButton jNuevoCuartel;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSeleccionar;
    private javax.swing.JTextField jTelefonoCuartel;
    private javax.swing.JTable jtCuarteles;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void encabezadoTabla() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        jtCuarteles.setModel(modelo);
    }

    private void cargarTabla() {
        for (Cuartel cuar : data.traerCuarteles()) {
            modelo.addRow(new Object[]{
                cuar.getNombreCuartel(),
                cuar.getDireccion(),
                cuar.getTelefono(),
                cuar.getCorreo()});
        }
    }

    public void limpiar() {
        jNombreCuartel.setText("");
        jCorreoCuartel.setText("");
        jCoordenadaX.setText("");
        jCoordenadaX.setText("");
        jCoordenadaY.setText("");
        jTelefonoCuartel.setText("");
        jCorreoCuartel.setText("");
    }

    private void borrarFilas() {
        int f = jtCuarteles.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
