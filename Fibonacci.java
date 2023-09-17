public class Fibonacci{
 public static void main(String args[]){

 int a = 0, b = 1, c = 0, i = 0;


 System.out.println("Sucecion de Fibonacci con bucle For:");
 System.out.println("");

 for(i = 0; i < 10; i++){
  if(i < 9){
  System.out.print(a + ",");
   }else{
    System.out.print(a);
   }
  c = a + b;
  a = b;
  b = c;
  }

 System.out.println("");
 System.out.println("");
 System.out.println("");

 System.out.println("Sucecion de Fibonacci con bucle While:");
 System.out.println("");

  i = 0;
  a = 0;
  b = 1;
  c = 0;

 while(i < 10){
  if(i < 9){
   System.out.print(a + ",");
   }else{
    System.out.print(a);
   }
  c = a + b;
  a = b;
  b = c;
  i++;
  }

 System.out.println("");
 System.out.println("");
 System.out.println("");

 System.out.println("Sucecion de Fibonacci con bucle Do While:");
 System.out.println("");

  i = 0;
  a = 0;
  b = 1;
  c = 0;

  do{
  if(i < 9){
   System.out.print(a + ",");
  }else{
   System.out.print(a);
  }
  c = a + b;
  a = b;
  b = c;
  i++;
  }while(i < 10);
 }
}