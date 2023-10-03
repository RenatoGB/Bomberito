
package bomberito.accesoADatos;

import bomberito.entidades.Brigada;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void nuevaBrigada(Brigada brigadita) {
        String sql = "INSERT INTO brigada(nombreBrigada,especialidad, libre, nroCuartel)"
                + "VALUE (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigadita.getNombreBrigada());
            ps.setString(2, brigadita.getEspecialidad());
            ps.setBoolean(3, brigadita.isLibre());
            ps.setInt(4, brigadita.getNroCuartel().getIdCuartel());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigadita.setIdBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    }
    
    public List<Brigada> traerBrigadas() {        
        List<Brigada> brigadas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM brigada";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada bri = new Brigada();
                CuartelData cuar = new CuartelData();
                bri.setIdBrigada(rs.getInt("idBrigada"));
                bri.setNombreBrigada(rs.getString("nombreBrigada"));
                bri.setEspecialidad(rs.getString("especialidad"));
                bri.setLibre(rs.getBoolean("libre"));
                bri.setNroCuartel(cuar.traerCuartelID(rs.getInt("nroCuartel")));
                brigadas.add(bri);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return brigadas;
    }
    
        public Brigada traerBrigadaID(int id){
            Brigada cuart = new Brigada();
        try {
            String sql = "SELECT * FROM brigada WHERE idBrigada= "+id;
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada bri = new Brigada();
                CuartelData cuar = new CuartelData();
                bri.setIdBrigada(rs.getInt("idBrigada"));
                bri.setNombreBrigada(rs.getString("nombreBrigada"));
                bri.setEspecialidad(rs.getString("especialidad"));
                bri.setLibre(rs.getBoolean("libre"));
                bri.setNroCuartel(cuar.traerCuartelID(rs.getInt("nroCuartel")));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel " + ex.getMessage());
        }
        return cuart;
    }
}
