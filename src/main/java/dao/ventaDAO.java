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
import modelo.Venta;
import util.Conexion;

/**
 *
 * @author esther
 */
public class ventaDAO {
    public List<Venta> lisMes(int an){
   List<Venta> lis=new ArrayList();
   Connection cn=Conexion.getConexion();
   String sql="{call sp_reportem(?)}";   
   try{
     CallableStatement st=cn.prepareCall(sql);
     st.setInt(1, an);
     ResultSet rs = st.executeQuery();
     
     while(rs.next()){
        Venta v=new Venta();
        v.setMes(rs.getInt(1));
        v.setCantidad(rs.getInt(2));
        v.setTotal(rs.getInt(3));       
        lis.add(v);
     }
   }catch(Exception ex){
     ex.printStackTrace();
   }   
  return lis;    
  } 
}
