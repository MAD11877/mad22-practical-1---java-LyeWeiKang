import java.util.Scanner;
import java.util.ArrayList;


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
    int number=in.nextInt();
    ArrayList<Integer>numberList = new ArrayList<>();
    for(int i=0;i<number;i++){
        int numbers=in.nextInt();
        numberList.add(numbers);
    }
    Collections.sort(numberList);
    ArrayList<Integer>occurenceList = new ArrayList<>();
    for (int i = 0; i < numberList.Count; i++){
      int count = 1;
      if(i+1<numberList.Count;i++){
        if (numberList[i]==numberList[i+1]){
          count+=1;
          i++;
          while(i+1<numberList.Count&&numberList[i+1]==numberList[i]){
            count+=1;
            i++;
          }
        }
      }
      occurenceList.add(count)
    }
    int highest=0;
    for(int i=0;i<occurenceList.Count;i++){
      if(occurenceList[i]>highest){
        highest=occurenceList[i];
      }
    }
    System.out.println(numberList[highest]);
          
      
                
            
