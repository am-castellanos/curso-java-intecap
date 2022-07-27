/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.intecap.curso.data.base.colegio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author amcc
 */
public class CrudConsola {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();

    public void menu(){
        while(true){
            Scanner sp = new Scanner(System.in);
            System.out.println("=======================================");
            System.out.println("|             Menu Principal          |");
            System.out.println("| 1. Mostrar                          |");
            System.out.println("| 2. Crear                            |");
            System.out.println("| 3. Modificar                        |");
            System.out.println("| 4. Eliminar                         |");
            System.out.println("| 5. Salir                            |");
            System.out.println("=======================================");
            int respuesta = sp.nextInt();
            
            switch(respuesta){
                case 1 -> listar();
                case 2 -> {
                    Scanner sa = new Scanner(System.in);
                    Scanner sb = new Scanner(System.in);
                    Scanner sc = new Scanner(System.in);
                    Scanner sd = new Scanner(System.in);
                    System.out.println("Ingresar usuario");
                    System.out.println("Ingrese codigo");
                    int codigo = sa.nextInt();
                    
                    System.out.println("Ingrese nombre");
                    String nombre = sb.nextLine();
                    
                    System.out.println("Ingrese direccion");
                    String direccion = sc.nextLine();
                    
                    System.out.println("Ingrese telefono");
                    int telefono = sd.nextInt();
                    
                    crear(codigo, nombre, direccion, telefono);
                    
                    System.out.println("Usuario creado");
                }
                case 3 -> {
                    Scanner sa = new Scanner(System.in);
                    Scanner sb = new Scanner(System.in);
                    Scanner sc = new Scanner(System.in);
                    Scanner sd = new Scanner(System.in);
                    System.out.println("Modificar usuario");
                    System.out.println("Ingrese codigo");
                    int codigo = sa.nextInt();
                    
                    System.out.println("Ingrese nombre");
                    String nombre = sb.nextLine();
                    
                    System.out.println("Ingrese direccion");
                    String direccion = sc.nextLine();
                    
                    System.out.println("Ingrese telefono");
                    int telefono = sd.nextInt();
                    
                    System.out.println("Usuario modificado");
                    modificar(codigo, nombre, direccion, telefono);
                }
                case 4 -> {
                    int codigo = sp.nextInt();
                    eliminar(codigo);
                }
                case 5 -> System.exit(0);
            }

        }
    }
    
    public void listar(){
        String instruccion = "select * from alumno";
        
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(instruccion);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println("=================");
            }
            
            rs.close();
            ps.close();
            con.close();
            
        } catch (Exception e){
            
            e.printStackTrace();
        }
    }

    public void crear(int codigo, String nombre, String direccion, int telefono){
        String sql = "insert into alumno(codigo,nombre,direccion,telefono) values(?,?,?,?)";
        
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setInt(4, telefono);
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
        } catch (Exception e){}
    }

    public void modificar(int codigo, String nombre, String direccion, int telefono){
        String sql = "update alumno set nombre = ?, direccion = ?, telefono = ? where codigo = ?";
                
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, telefono);
            ps.setInt(4, codigo);
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
        }catch (Exception e){}
    }

    public void eliminar(int codigo){
        String sql = "delete from alumno where codigo = ?";
        
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
        } catch (Exception e){}
    }
    
    public static void main(String[] args) {
        
        final var crudConsola = new CrudConsola();
        
        crudConsola.menu();
    }
    
}
