/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberito.vistas;

import bomberito.accesoADatos.BrigadaData;
import bomberito.accesoADatos.CuartelData;
import bomberito.entidades.Brigada;
import bomberito.entidades.Cuartel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author renat
 */
public class FormularioBrigada extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    BrigadaData dataBrigada = null;
    CuartelData dataCuartel = null;
    int guardarID;
    int numViejo;
    int locura;
    String locuraString;

    /**
     * Creates new form Brigadas
     */
    public FormularioBrigada() {
        initComponents();
        dataBrigada= new BrigadaData();
        dataCuartel= new CuartelData();
        cargarCombo();
        encabezadoTabla();
        cargarTabla();
        btnModificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNombreBrigada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jNuevaBrigada = new javax.swing.JButton();
        JCBXCuartel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBrigada = new javax.swing.JTable();
        jEspecialidadBrigada = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Brigada");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Especialidad : ");

        jLabel5.setText("Cuartel :");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jNuevaBrigada.setText("Nuevo");
        jNuevaBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaBrigadaActionPerformed(evt);
            }
        });

        tbBrigada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbBrigada);

        jEspecialidadBrigada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1- Incendios en viviendas, e industrias ", "2- Salvamento en derrumbes", "3- Rescates en ámbito montaña ", "4- Rescate de personas atrapadas en accidentes de tráfico", "5- Socorrer inundaciones", "6- Operativos de prevención" }));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(JCBXCuartel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(123, 123, 123))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jEspecialidadBrigada, 0, 1, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(49, 49, 49)
                                        .addComponent(jNombreBrigada)
                                        .addGap(25, 25, 25)
                                        .addComponent(btnSeleccionar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jNuevaBrigada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(228, 228, 228)
                                        .addComponent(btnModificar)
                                        .addGap(0, 153, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar)
                        .addGap(188, 188, 188)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEspecialidadBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCBXCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jNuevaBrigada)
                    .addComponent(btnModificar)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCuartelBrigadaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jNuevaBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaBrigadaActionPerformed
        if(jNombreBrigada.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre incompleto, intente de nuevo");
        }else{
            
        
        String nombreBrigada=jNombreBrigada.getText();
        String Especialidad= jEspecialidadBrigada.getSelectedItem()+"";
        Cuartel cuartelselec=(Cuartel)JCBXCuartel.getSelectedItem();        
        Brigada asd=new Brigada(nombreBrigada,Especialidad,false,cuartelselec);        
        dataBrigada.nuevaBrigada(asd);
        //dataCuartel.traerCuartelID(idcuartel); 
        limpiar();
    }
    }//GEN-LAST:event_jNuevaBrigadaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (tbBrigada.getSelectedRow() != -1) {
        btnModificar.setEnabled(true);
        jNuevaBrigada.setEnabled(false);
        int id = Integer.parseInt(String.valueOf(tbBrigada.getValueAt(tbBrigada.getSelectedRow(), 0)));
        for (Brigada bri : dataBrigada.traerBrigadas()) {
            if (id == bri.getIdBrigada()) {
                numViejo=bri.getIdBrigada();
                jNombreBrigada.setText(bri.getNombreBrigada());
                int itemCount = jEspecialidadBrigada.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    String item = jEspecialidadBrigada.getItemAt(i);
                    String probando = String.valueOf(tbBrigada.getValueAt(tbBrigada.getSelectedRow(), 2));
                    if (item.contains(probando)) {
                        jEspecialidadBrigada.setSelectedIndex(i);
                    }
                }
                String probando = String.valueOf(tbBrigada.getValueAt(tbBrigada.getSelectedRow(), 0));
                int maspruebas = Integer.parseInt(probando);
                for (Brigada object : dataBrigada.traerBrigadas()) {
                    if (maspruebas==object.getIdBrigada()) {
                        locuraString=object.getNroCuartel().getNombreCuartel();
                    }
                }
                int itemCount2 = JCBXCuartel.getItemCount();
                for (int i = 0; i < itemCount2; i++) {
                    String item = JCBXCuartel.getItemAt(i).getNombreCuartel();
                        if (locuraString.contains(item)) {
                            JCBXCuartel.setSelectedIndex(i);
                        }                    
                }
            }
        } 
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona una Brigada");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int cambio= Integer.parseInt(String.valueOf(tbBrigada.getValueAt(tbBrigada.getSelectedRow(), 0)));
        for (Brigada listita : dataBrigada.traerBrigadas()) {         
            if (cambio==listita.getIdBrigada()) {
                listita.setIdBrigada(cambio);
                listita.setNombreBrigada(jNombreBrigada.getText());
                listita.setEspecialidad(jEspecialidadBrigada.getSelectedItem()+"");
                Cuartel cuartelSelec = (Cuartel) JCBXCuartel.getSelectedItem();
                listita.setNroCuartel(cuartelSelec);
                dataBrigada.modificarBrigada(listita);
                limpiar();
                jNuevaBrigada.setEnabled(true);
                btnModificar.setEnabled(false);
                return;                
            }
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        jNuevaBrigada.setEnabled(true);
        btnModificar.setEnabled(false);
        
    }//GEN-LAST:event_jbLimpiarActionPerformed
    private void cargarCombo(){  
        for (Cuartel lista : dataCuartel.traerCuarteles()){ 
            JCBXCuartel.addItem(new Cuartel(lista.getIdCuartel() ,lista.getNombreCuartel()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cuartel> JCBXCuartel;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jEspecialidadBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNombreBrigada;
    private javax.swing.JButton jNuevaBrigada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTable tbBrigada;
    // End of variables declaration//GEN-END:variables
    private void encabezadoTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Libre");
        tbBrigada.setModel(modelo);
    }

    private void cargarTabla() {
        for (Brigada bri : dataBrigada.traerBrigadas()) {
            modelo.addRow(new Object[]{
                bri.getIdBrigada(),
                bri.getNombreBrigada(),
                bri.getEspecialidad(),
                bri.isLibre()});
        }
    }
    
    private void limpiar(){
        jNombreBrigada.setText("");
        borrarTabla();
        cargarTabla();
    }
    
    private void borrarTabla(){
        int ind=modelo.getRowCount()-1;
        for(int i=ind;i>=0;i--){
            modelo.removeRow(i);
        }
    }

}


