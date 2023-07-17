package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Entrada;
import util.Conexion;


public class entradaDAO {
   public boolean agregar(Entrada e) {
         try {
            String sql = "insert into entrada (cod_ent, fec_ent,cant_ent,Producto_cod_pro)"
                    + " values (?, ?, ?, ?)";
            Connection cn = Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps = cn.prepareStatement(sql);
            ps.setString(1, e.getCodEnt());
            ps.setString(2, e.getFecEnt());
            ps.setInt(3, e.getCantEnt());
            ps.setString(4, e.getCodPro());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(entradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
   public String generaCodEntrada() {
    Connection cn = Conexion.getConexion();
    String cod="";

    try {
        String sql = "{? = call gen_cod_ent()}";
        CallableStatement st = cn.prepareCall(sql);
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        cod = st.getString(1);

    } catch (SQLException ex) {
        Logger.getLogger(entradaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(entradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return cod;
    }
}
