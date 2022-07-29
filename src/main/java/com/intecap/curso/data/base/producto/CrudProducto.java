/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intecap.curso.data.base.producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 *
 * @author amcc
 */
public class CrudProducto {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void listar(){
        String instruccion = "select * from celular";

        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(instruccion);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getDate(5));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

        public void crear(int Codigo, String Producto, int Cantidad, String Lugar_Fabricacion, String Fecha_Ingreso){
        String sql = "insert into celular(Codigo,Producto,Cantidad,Lugar_Fabricacion,Fecha_Ingreso) values(?,?,?,?,?)";
        
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Codigo);
            ps.setString(2, Producto);
            ps.setInt(3, Cantidad);
            ps.setString(4, Lugar_Fabricacion);
            ps.setString(5, Fecha_Ingreso);
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
        } catch (Exception e){}
    }
        
        public static void main(String[] args){
            CrudProducto cp = new CrudProducto();
            cp.listar();
        }
}
    
