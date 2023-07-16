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
import modelo.Proveedor;
import util.Conexion;

public class proveedorDAO {
    //lista de proveedores
    public List<Proveedor> lisProveedor(){
    List<Proveedor> lis=new ArrayList();
    Connection cn=Conexion.getConexion();
    try{
        String sql="select cod_prov,nom_prov,telf_prov,Direccion_cod_direc from Proveedor";
        PreparedStatement st=cn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            Proveedor prov=new Proveedor();
            prov.setCodprov(rs.getString(1));
            prov.setNombre(rs.getString(2));
            prov.setTelf(rs.getString(3));
            prov.setDireccion(rs.getString(4));
            lis.add(prov);        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return lis;
    }
}
