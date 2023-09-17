public class Promedio{
  public static void main(String args[]){

   int mate = 5;
   int bio = 8;
   int qui = 7;
   int promedio = 0;

   promedio = (mate + bio + qui) / 3;

   if(promedio >= 6){
    System.out.println("El alumno aprobo " + promedio);
  } else {
    System.out.println("El alumno reprobo " + promedio);
  }
 }
}