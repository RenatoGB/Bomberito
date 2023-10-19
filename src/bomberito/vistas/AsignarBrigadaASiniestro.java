/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberito.vistas;

import bomberito.accesoADatos.BrigadaData;
import bomberito.accesoADatos.CuartelData;
import bomberito.accesoADatos.SiniestroData;
import bomberito.entidades.Brigada;
import bomberito.entidades.Cuartel;
import bomberito.entidades.Siniestro;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Melina
 */
public class AsignarBrigadaASiniestro extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
            //no me funciona, editar desde propiedades
        }
    };
    
    
    SiniestroData controlSin=null;
    CuartelData controlCuar=null;
    BrigadaData controlBri=null;
    
    /**
     * Creates new form AsignarBrigadaASiniestro
     */
    public AsignarBrigadaASiniestro() {
        initComponents();
        controlSin=new SiniestroData();
        controlCuar=new CuartelData();
        controlBri=new BrigadaData();
        modelo=new DefaultTableModel();
        
        armarCabeceraTabla();
        cargarTabla();
        cargarComboCuartel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JCBXCuartel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JCBXBrig = new javax.swing.JComboBox<>();
        JBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();

        jLabel6.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Asignar brigada al Siniestro");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Siniestros");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Cuartel:");

        JCBXCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBXCuartelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Brigada:");

        JBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBoton.setForeground(new java.awt.Color(0, 204, 204));
        JBoton.setText("MANDAR BRIGADA");
        JBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("\"Abnegación, Sacrificio y Desinterés\"");

        JTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTabla.getTableHeader().setResizingAllowed(false);
        JTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel5))
                                .addComponent(JBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBXCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBXBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCBXBrig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JCBXCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonActionPerformed
        ////////////////////////////////////////////////////////
        Brigada codBrigada = (Brigada) JCBXBrig.getSelectedItem();
        int sinSelec =JTabla.getSelectedRow();
        int idSiniestro= (Integer)JTabla.getValueAt(sinSelec, 0);
        Siniestro nuevo= new Siniestro(codBrigada,idSiniestro);
        controlSin.AsignarBrigada(nuevo);
        ///////////////////////////////////////////////////////
        boolean libre=false;
        int idBrigada = codBrigada.getIdBrigada();
        //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        controlSin.actualizarBrigada(idBrigada,libre);  //Al asignarlos directamente te ahorras de crear un constructor en la entidad Brigada
        //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        
    }//GEN-LAST:event_JBotonActionPerformed

    private void JCBXCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBXCuartelActionPerformed
        Cuartel cuartelselec = (Cuartel) JCBXCuartel.getSelectedItem();
        int idCuartel = cuartelselec.getIdCuartel();
        int sinSelec = JTabla.getSelectedRow();
        if (sinSelec >= 0) {
            String sintipo = (String) JTabla.getValueAt(sinSelec, 2);
            JCBXBrig.removeAllItems();
            for (Brigada brgda : controlBri.traerBrigadas()) {
                if (brgda.getNroCuartel().getIdCuartel() == idCuartel && brgda.getEspecialidad().contains(sintipo) && brgda.isLibre()) {
                    JCBXBrig.addItem(brgda);
                }
            }
        }      
    }//GEN-LAST:event_JCBXCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBoton;
    private javax.swing.JComboBox<Brigada> JCBXBrig;
    private javax.swing.JComboBox<Cuartel> JCBXCuartel;
    private javax.swing.JTable JTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla(){
      modelo.addColumn("ID");
      modelo.addColumn("Fecha");
      modelo.addColumn("Tipo");
      modelo.addColumn("X");
      modelo.addColumn("Y");
      modelo.addColumn("Detalles");
      JTabla.setModel(modelo);
      
      JTabla.setAutoResizeMode(JTabla.AUTO_RESIZE_OFF);
      JTabla.getColumnModel().getColumn(0).setPreferredWidth(17);
      JTabla.getColumnModel().getColumn(1).setPreferredWidth(67);
      JTabla.getColumnModel().getColumn(2).setPreferredWidth(330);
      JTabla.getColumnModel().getColumn(3).setPreferredWidth(25);
      JTabla.getColumnModel().getColumn(4).setPreferredWidth(25);
      JTabla.getColumnModel().getColumn(5).setPreferredWidth(300);

      
    }

    private void borrarFilaTabla(){
        int ind =modelo.getRowCount() -1;
            for(int i= ind;i>=0;i--){
                modelo.removeRow(i);
            }
                
    }

    private void cargarTabla(){
        borrarFilaTabla();
        for(Siniestro cosa: controlSin.traerSiniestrosParaAsignar()){
            modelo.addRow(new Object[]{
                cosa.getIdSiniestro(),
                cosa.getFechaSiniestro(),
                cosa.getTipo(),
                cosa.getCoordX(),
                cosa.getCoordY(),
                cosa.getDetalles()
            });
        }
    }
 
    private void cargarComboCuartel(){
        for(Cuartel ctl: controlCuar.traerCuarteles()){
            JCBXCuartel.addItem(new Cuartel(ctl.getIdCuartel(),ctl.getNombreCuartel()));
        }
    }
    
    public void calcularDistancia(){
       Siniestro asd=new Siniestro();
       Cuartel asd2=new Cuartel();
       int coordx=asd.getCoordX();
       int coordy=asd.getCoordY();
       
       int cordx=asd2.getCoordX();
       int cordy=asd2.getCoordY();
       
       double distancia= Math.sqrt(Math.pow(coordx - cordx, 2) + Math.pow(coordy - cordy, 2));
       
    }
    
    
}
