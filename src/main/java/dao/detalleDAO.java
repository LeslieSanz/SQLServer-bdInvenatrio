/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Detalle;
import util.Conexion;

/**
 *
 * @author esther
 */
public class detalleDAO {
       //Para obtener los datos de la venta: fecha, nombre del cliente y del vendedor
    public List<Detalle> listaDetalles(String codven){
   List<Detalle> lis=new ArrayList();
   Connection cn=Conexion.getConexion();
   String sql="{call sp_lista_detallesVenta(?)}";   
   try{
     CallableStatement st=cn.prepareCall(sql);
     st.setString(1, codven);
     ResultSet rs = st.executeQuery();
     
     while(rs.next()){
        Detalle d=new Detalle();
        d.setCodPro(rs.getString(1));
        d.setDescripcion(rs.getString(2));
        d.setCantDeta(rs.getInt(3));
        d.setPrePro(rs.getDouble(4)); 
        d.setSubtotal(rs.getDouble(5));
        lis.add(d);
     }
   }catch(Exception ex){
     ex.printStackTrace();
   }   
  return lis;    
  }
}
