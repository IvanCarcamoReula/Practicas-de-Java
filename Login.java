import java.util.Scanner;
public class Login{
 public static void main(String args[]){
 
  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Ingresa tu nombre tu usuario: ");
  usuario = entrada.nextLine();

  System.out.println("Ingresa tu contraseña: ");
  password = entrada.nextLine();

  if(usuario.equals("Ivan") && password.equals("Ivan123")){
    System.out.println("Bienvenido Ivan");
  }else{
    System.out.println("Nombre de usuario o contraseña incorrectos");
  }
 }
}