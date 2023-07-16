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
import javax.swing.JOptionPane;
import modelo.Categoria;
import util.Conexion;

/**
 *
 * @author lesly
 */
public class categoriaDAO {
    //lista categorias con cantidad de productos por cada una
    public List<Categoria> lisCantxCat(){
    List<Categoria> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    try{
        String sql="{call sp_cantCategoria}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            Categoria c=new Categoria();
            c.setNomcat(rs.getString(1));
            c.setCantcat(rs.getInt(2));
            lis.add(c);        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return lis;
    }
    //lista de categorias con su ubicacion 
    public List<Categoria> lisCategoria(){
    List<Categoria> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    try{
        String sql="select cod_cat,nom_cat,Ubicacion_cod_ubi from Categoria";
        PreparedStatement st=cn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            Categoria c=new Categoria();
            c.setCodcat(rs.getString(1));
            c.setNomcat(rs.getString(2));
            c.setUbi(rs.getString(3));
            lis.add(c);        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return lis;
    }
    //agregar categoria
    public boolean agregar(Categoria c) {
        try {
            String sql = "insert into categoria (cod_cat, nom_cat)"
                    + " values (?, ?)";
            Connection cn=Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, c.getCodcat());
            ps.setString(2, c.getNomcat());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from categoria where cod_cat = '"+codigo+"'";
            Connection cn=Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente con sus productos");
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
