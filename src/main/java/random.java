
import java.util.Scanner;
public class random {
   public static void main(String[] agrs){
      Scanner scanner = new Scanner(System.in);
      int number1 = (int)(Math.random() * 100);
      int number2 = (int)(Math.random() * 100);
          
       System.out.println("what is "+number1+" + "+number2+" ?" );
       int answer = scanner.nextInt();
       
       if(number1 + number2 == answer){
           System.out.println("you are correct !");
     }
       else{
           System.out.println("you are wrong " +number1+" + "+number2+" should be "+(number1+number2) );
     }


 } 
}
