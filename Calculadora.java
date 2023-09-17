public class Calculadora{
  public static void main(String args[]){

   int operacion = 1;
   int num_1 = 8 ;
   int num_2 = 4 ;
   int resultado = 0;

   System.out.println("Elija una operacion:");
   System.out.println("Suma = 1");
   System.out.println("Resta = 2");
   System.out.println("Multiplicacion = 3");
   System.out.println("Division = 4");



   if(operacion == 1){
    resultado = num_1 + num_2;
    System.out.println("El resultado es: " + resultado);
  } else if(operacion == 2){
     resultado = num_1 - num_2;
     System.out.println("El resultado es: " + resultado);
  } else if(operacion == 3){
      resultado = num_1 * num_2;
      System.out.println("El resultado es: " + resultado);
  } else if(operacion == 4){
       resultado = num_1 / num_2;
       System.out.println("El resultado es: " + resultado);
  } else {
    System.out.println("ERROR: no elegiste una opcion valida");
  }
 }
}