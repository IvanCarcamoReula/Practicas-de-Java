public class Bucles{

  public static void main(String args[]){

   int i = 0;

   System.out.println("Serie con For: ");
  
   for(i = 1; i <= 10; i++){

    if(i < 10){
      System.out.print(i + ",");
     }else{
      System.out.print(i);
     }
    }
      System.out.println("");
      System.out.println("");
      System.out.println("");
   i = 1;
   System.out.println("Serie con While: ");

   while(i <= 10){
 
    if(i < 10){
     System.out.print(i + ",");
    }else{
     System.out.print(i);
    }
    i++;
   }
      System.out.println("");
      System.out.println("");
      System.out.println("");

   System.out.println("Serie con Do While: ");
   
   i = 1;
   do{

    if(i < 10){
     System.out.print(i + ",");
      }else{
       System.out.print(i);
     }
     i++;
    }while(i <= 10);
 }
}