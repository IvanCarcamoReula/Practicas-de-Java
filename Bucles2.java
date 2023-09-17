public class Bucles2{
  public static void main(String args []){

 int i = 1, j = 99;

  System.out.println("Esta es una serie con For: ");

  for(i = 1; i <= 5; i++){
   if(i < 5){
     System.out.print(i + ",");
     System.out.print(j + ",");
   }else {
     System.out.print(i + ",");
     System.out.print(j);
   }
    j--;
  }

  System.out.println("");
  System.out.println("");
  System.out.println("");

  System.out.println("Esta es una serie con While: ");

  i = 1;
  j = 99;

  while(i <= 5){
  if(i < 5){
    System.out.print(i + ",");
    System.out.print(j + ",");
   }else {
    System.out.print(i + ",");
    System.out.print(j);
   }
    i++;
    j--;
  }

  System.out.println("");
  System.out.println("");
  System.out.println("");

  System.out.println("Esta es una serie con Do While: ");

  i = 1;
  j = 99;

  do{
  if(i < 5){
    System.out.print(i + ",");
    System.out.print(j + ",");
   }else {
    System.out.print(i + ",");
    System.out.print(j);
   }
    i++;
    j--;
  }while (i <= 5);



 }
}