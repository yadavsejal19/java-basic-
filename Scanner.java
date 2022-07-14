/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

// take input from user 
//"Mistakes : Scanner ,nextInt,System.in,"
public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt ();
      sc.nextLine ();		//writimg again sc.nextLine becouse hee if i write  int and string value at one by one then once it d't move carsur auotmatically so we have to write that to move into nextline 
    String name = sc.nextLine ();
    char gender = sc.next ().charAt (0);
    float marks1 = sc.nextFloat ();
    float marks2 = sc.nextFloat ();
    float marks3 = sc.nextFloat ();
    double result = marks1 + marks2 + marks3;

      System.out.println ("Result" + result);
      System.out.println (id + " " + name + " " + gender + " " + marks1 +
			  " " + marks2 + " " + marks3 + " " + result);
      System.out.println (id + "\n" + name + "\n" + gender + "\n" + marks1 +
			  "\n" + marks2 + "\n" + marks3 + "\n" + result);

    //upto 4 decimal point 
    String Round off String.format ("%4f", result);
     */
      //type conversion 
      //automatic [interger to double and 10.0]
    int x = 10;
    double y = x;
      System.out.println (y);	//10.00


    //explicit conversion [double to interger error manualy do type casting ]

    double x1 = 10.11;
    int y1 = (int) x1;
      System.out.println (y1);	//10*/


    //here 9/2 so here both interger if we divide then we wil get integer  answer but actually we want to 4.5 so for 
    float a = 9 / 2;
      System.out.println (a);	//4.0
    float a1 = (float) 9 / 2;
      System.out.println (a1);	//4.5


    //oprator precodence 

    double d1 = 5 + 4 * 5;
      System.out.println (d1);	//25.0

    double d2 = (5 + 4) * 5;
      System.out.println (d2);	//45.0

  }
}
