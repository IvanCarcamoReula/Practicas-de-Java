import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario7 extends JFrame implements ActionListener{

 private JComboBox combo1, combo2, combo3;
 private JButton boton1;
 private JLabel label1, label2, label3;

 public Formulario7(){

 setLayout(null);
 label1 = new JLabel("Rojo");
 label1.setBounds(10,10,50,20);
 add(label1);

 combo1 = new JComboBox();
 combo1.setBounds(100,10,200,30);
 for(int i = 0; i <= 255; i++){
  combo1.addItem(String.valueOf(i));
 }
 add(combo1);

 label2 = new JLabel("Verde");
 label2.setBounds(10,50,50,20);
 add(label2);

 combo2 = new JComboBox();
 combo2.setBounds(100,50,200,30);
 for(int i = 0; i <= 255; i++){
  combo2.addItem(String.valueOf(i));
 }
 add(combo2);

 label3 = new JLabel("Azul");
 label3.setBounds(10,80,50,20);
 add(label3);

 combo3 = new JComboBox();
 combo3.setBounds(100,80,200,30);
 for(int i = 0; i <= 255; i++){
  combo3.addItem(String.valueOf(i));
 }
 add(combo3);

 boton1 = new JButton("Fijar Color");
 boton1.setBounds(15,130,150,30);
 add(boton1);
 boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    String cad1 = combo1.getSelectedItem().toString();
    String cad2 = combo2.getSelectedItem().toString();
    String cad3 = combo3.getSelectedItem().toString();

    int rojo = Integer.parseInt(cad1);
    int verde = Integer.parseInt(cad2);
    int azul = Integer.parseInt(cad3);

    Color color1 = new Color(rojo,verde,azul);

    boton1.setBackground(color1);
  }
 }

public static void main(String args[]){

 Formulario7 formulario1 = new Formulario7();
 formulario1.setBounds(0,0,400,200);
 formulario1.setVisible(true);
 formulario1.setResizable(false);
 formulario1.setLocationRelativeTo(null);
 }
}