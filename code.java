/*** This program calculates whther three numbers are  increasing, decreasing, or neither.
 * @author Fikri Şan Köktaş
 * @version 1 December 2020
 */
import java.util.Scanner;
public class KFS_IncreasingNumbersV2_Main 
{
    public static void main (String[]args)
    {
       Scanner in = new Scanner(System.in);
       
       System.out.println("strict or lenient?");
       String question = in.nextLine();
       
       System.out.println("First number:");
       int number1 = in.nextInt();
       
       System.out.println("Second number:");
       int number2 = in.nextInt();
       
       System.out.println("Third number:");
       int number3 = in.nextInt(); 
       
            if (question.equals("lenient"))
                {
                    if (number1<number2 && number2<number3)
                    {
                        System.out.println("increasing order");
                    }
                    
                   else if (number1<number2 && number2==number3)
                    {
                        System.out.println("increasing order");
                    }
       
                    else if (number3<number2 && number2<number1)
                    { 
                        System.out.println("decreasing order");
                    }
                    
                    else if (number3<number2 && number2==number1)
                    { 
                        System.out.println("decreasing order");
                    }
                    
                    else if (number1==number2 && number2==number1)
                    {
                        System.out.print("both increasing and decreasing"); 
                    }
            
                    else
                    {
                        System.out.println("The numbers are in not in any order"); 
                    }
                }
            else if (question.equals("strict"))
               {
                    if (number1<number2 && number2<number3)
                    {
                        System.out.println("increasing order");
                    }
       
                    else if (number3<number2 && number2<number1)
                    { 
                        System.out.println("decreasing order");
                    }
            
                    else
                    {
                        System.out.println("not in any order"); 
                    }
               }
           }
}
