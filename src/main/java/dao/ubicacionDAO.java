/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Ubicacion;
import util.Conexion;


public class ubicacionDAO {
    public List<Ubicacion> lisUbi() {
    List<Ubicacion> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
        try {
            String sql = "select * from Ubicacion";            
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Ubicacion u = new Ubicacion();
                u.setCodubi(rs.getString("cod_ubi"));
                u.setSeccion(rs.getString("seccion"));
                u.setCapacidad(rs.getInt("capacidad"));
                lis.add(u);
            }
        }catch(Exception ex){
        ex.printStackTrace();
    }
        return lis;
    }
}
