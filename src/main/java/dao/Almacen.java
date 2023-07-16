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
import modelo.Producto;
import util.Conexion;

/**
 *
 * @author lesly
 */
public class Almacen {
    //lista categorias con cantidad de productos por cada una
    public List<Producto> lisCategoria(){
    List<Producto> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    try{
        String sql="{call sp_cantCategoria}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            Producto c=new Producto();
            c.setNomcat(rs.getString(1));
            c.setCantcat(rs.getInt(2));
            lis.add(c);        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return lis;
    }
}
