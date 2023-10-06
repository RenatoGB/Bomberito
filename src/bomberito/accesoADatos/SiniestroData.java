
package bomberito.accesoADatos;

import bomberito.entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql="INSERT INTO siniestro(tipo, fechaSiniestro, coordX, coordY, detalles)"
                +"VALUE(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, sin.getTipo());
            ps.setDate(2, Date.valueOf(sin.getFechaSiniestro()));
            ps.setInt(3, sin.getCoordX());
            ps.setInt(4, sin.getCoordY());
            ps.setString(5, sin.getDetalles());
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
    
    public List<Siniestro> traerSiniestros(){
        List<Siniestro> siniestres = new ArrayList<>();
        try{
            String sql = "SELECT * FROM siniestro";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()) {
                Siniestro sin= new Siniestro();
                BrigadaData brig = new BrigadaData();
                sin.setIdSiniestro(rs.getInt("IdSiniestro"));
                sin.setTipo(rs.getString("tipo"));
                sin.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                sin.setCoordX(rs.getInt("coordX"));
                sin.setCoordY(rs.getInt("coordY"));
                sin.setDetalles(rs.getString("detalles"));
                sin.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
                sin.setPuntuacion(rs.getInt("puntuacion"));
                sin.setCodBrigada(brig.traerBrigadaID(rs.getInt("codBrigada")));
                sin.setActivo(true);
                
                siniestres.add(sin);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro");
        }
        return siniestres;
    }
    
    
}
