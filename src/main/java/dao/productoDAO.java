/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.producto;
import util.Conexion;

public class productoDAO {
    //agregar categoria
    public boolean agregar(producto p) {
    Connection cn=Conexion.getConexion();
        try {
            String sql="{call sp_InsertarProducto(?,?,?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            
            st.setString(1, p.getDespro());
            st.setDouble(2, p.getPrepro());
            st.setString(3, p.getCategoria().getCodcat());
            st.setString(4, p.getProveedor().getCodprov());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
   //lista productos por codigo de categoria
    public List<producto> lisProdxCat(String nomCat){
    List<producto> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    String sql="{call sp_listaProdCat(?)}";
    try{
        CallableStatement st=cn.prepareCall(sql);
        st.setString(1, nomCat);
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
    
    //listar todos los productos
    public List<producto> lisProductos(){
    List<producto> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    try{
        String sql="select cod_pro,desc_pro,pre_pro,stk_pro from Producto";
        PreparedStatement st=cn.prepareStatement(sql);
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
