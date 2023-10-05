
package bomberito.accesoADatos;

import bomberito.entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SiniestroData {
    private Connection con=null;
    
    public SiniestroData(){
        con=Conexion.getConexion();
    }
    
    public void NuevoSiniestro(Siniestro sin){
        String sql="INSERT INTO siniestro(tipo, fechaSiniestro, coordX, coordY, detalles, fechaResolucion, puntuacion,codBrigada)"
                +"VALUE(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, sin.getTipo());
            ps.setDate(2, Date.valueOf(sin.getFechaSiniestro()));
            ps.setInt(3, sin.getCoordX());
            ps.setInt(4, sin.getCoordY());
            ps.setString(5, sin.getDetalles());
            ps.setDate(6, Date.valueOf(sin.getFechaResolucion()));
            ps.setInt(7,sin.getPuntuacion());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                sin.setIdSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }  
    }
    
 /*   public List<Siniestro> traerSiniestros(){
        List<Siniestro>
    }*/
    
    
}
