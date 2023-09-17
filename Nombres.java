import java.util.Scanner;
public class Nombres{
 public static void main(String args []){

  String nombre_1 = "", nombre_2 = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Por favor ingresa el primer nombre: ");
  nombre_1 = entrada.nextLine();

  System.out.print("Por favor ingresa el segundo nombre: ");
  nombre_2 = entrada.nextLine();

  if(nombre_1.equals(nombre_2) ){
    System.out.println("Los nombres son iguales");
  }else{
    System.out.println("Los nombres son diferentes");
  }


 }
}