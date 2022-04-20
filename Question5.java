import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of integers:");
    int number=in.nextInt();
    int[] arr=new int[number]
    for(int i=0;i<number;i++){
      System.out.println("Enter a number:");
      arr[i]=in.nextInt();   
    }
    Arrays.sort(arr);
    for(i=0;i<arr.length;i++){
      int count=1;
      for(int j=i+1;j<arr.length;j++){
        if (arr[i]==arr[j]){
          count+=1;
        }
        else{
          break;
        }
      }
    }
    
  }
}
