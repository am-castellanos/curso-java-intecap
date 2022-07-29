/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intecap.curso.data.base.colegio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author amcc
 */
public class Formulario {
    JFrame f = new JFrame();
    JPanel pl= new JPanel();
    
    public void form(){
        f.setTitle("Ejemplo");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setBounds(50, 100, 400, 400);
        f.setVisible(true);
        
        pl.setBackground(Color.yellow);
        pl.setLayout(null);
        f.add(pl);
        
        JLabel l1 = new JLabel("Codigo:");
        l1.setBounds(50, 50, 100, 25);
        pl.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 100, 25);
        pl.add(t1);
        
        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(50, 125, 100, 25);
        pl.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(150, 125, 100, 25);
        pl.add(t2);
        
        JLabel l3 = new JLabel("Direccion:");
        l3.setBounds(50, 200, 100, 25);
        pl.add(l3);
        
        JTextField t3 = new JTextField();
        t3.setBounds(150, 200, 100, 25);
        pl.add(t3);
        
        JLabel l4 = new JLabel("telefono:");
        l4.setBounds(50, 275, 100, 25);
        pl.add(l4);
        
        JPasswordField t4 = new JPasswordField();
        t4.setBounds(150, 275, 100, 25);
        pl.add(t4);
        
        JButton b1 = new JButton();
        b1.setBounds(125, 325, 100, 25);
        pl.add(b1);
        
        ActionListener guardar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CrudConsola base = new CrudConsola();
                base.crear(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(), Integer.parseInt(t4.getText()));
            }
        };
        
        b1.addActionListener(guardar);
    }
    
    public static void main(String[] args){
        Formulario f = new Formulario();
        f.form();
    }
    
}
