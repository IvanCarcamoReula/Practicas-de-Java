import javax.swing.*;
import java.awt.event.*;

public class Formulario5 extends JFrame implements ActionListener{

 private JLabel label1, label2, label3;
 private JTextField textfield1, textfield2;
 private JButton boton1;

 public Formulario5(){

  setLayout(null);

  label1 = new JLabel("Valor 1:");
  label1.setBounds(20,10,50,20);
  add(label1);

  label2 = new JLabel("Valor 2:");
  label2.setBounds(20,30,50,20);
  add(label2);

  label3 = new JLabel("Resultado:");
  label3.setBounds(150,80,150,20);
  add(label3);

  textfield1 = new JTextField();
  textfield1.setBounds(100,10,100,20);
  add(textfield1);

  textfield2 = new JTextField();
  textfield2.setBounds(100,30,100,20);
  add(textfield2);

  boton1 = new JButton("Calcular");
  boton1.setBounds(20,80,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    int valor1 = 0, valor2 = 0, resultado = 0;

    valor1 = Integer.parseInt(textfield1.getText());
    valor2 = Integer.parseInt(textfield2.getText());
    resultado  = valor1 + valor2;

    label3.setText("resultado: " + resultado);
  }
 }

 public static void main(String args[]){

 Formulario5 formulario1 = new Formulario5();
  formulario1.setBounds(0,0,300,160);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}