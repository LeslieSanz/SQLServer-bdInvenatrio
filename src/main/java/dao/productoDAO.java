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
import modelo.producto;
import util.Conexion;

public class productoDAO {
   //lista productos por categoria
    public List<producto> lisProdxCat(String categoria){
    List<producto> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    String sql="{call sp_listaProdCat(?)}";
    try{
        CallableStatement st=cn.prepareCall(sql);
        st.setString(1, categoria);
        ResultSet rs=st.executeQuery();
        
        while(rs.next()){
            producto p=new producto();
            p.setCodpro(rs.getString(1));
            p.setDespro(rs.getString(2));
            p.setPrepro(rs.getDouble(3));
            p.setStkpro(rs.getInt(4));
            lis.add(p);        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return lis;
    } 
}
