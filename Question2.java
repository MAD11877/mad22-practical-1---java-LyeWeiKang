import java.util.Scanner;
javac Question2.java
public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Height:");
    double height = in.nextDouble();
    System.out.println("Enter Weight:");
    double weight=in.nextDouble();
    double bmi=weight/(height*2);
    System.out.println("Your bmi is"+fmt.format(bmi));
  }
}
