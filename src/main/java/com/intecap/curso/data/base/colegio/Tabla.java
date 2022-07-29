/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intecap.curso.data.base.colegio;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author amcc
 */
public class Tabla extends JFrame{
    JTable table = new JTable();
    JPanel p1 = new JPanel();
    
    public void listar_tabla(){
        setTitle("Tabla");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 400, 400);
        setVisible(true);
        
        p1.setBackground(Color.yellow);
        p1.setLocale(null);
        add(p1);
    }
    
    public void tabla(){
        String [] columnas = {"Codigo","Producto"};
    }
    
    public static void main(String[] args){
        Tabla t = new Tabla();
        t.listar_tabla();
    }
    
}
