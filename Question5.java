import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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
    for (int i = 0; i < numberList.size(); i++){
      int count = 1;
      if(i+1<numberList.size()){
        if (numberList.get(i)==numberList.get(i+1)){
          count+=1;
          i++;
          while(i+1<numberList.size()&&numberList.get(i+1)==numberList.get(i)){
            count+=1;
            i++;
          }
        }
      }
      occurenceList.add(count);
    }
    int highest=0;
    for(int i=0;i<occurenceList.size();i++){
      if(occurenceList.get(i)>highest){
        highest=occurenceList.get(i);
      }
    }
    System.out.println(numberList.get(highest));
    int index=occurenceList.indexOf(highest);
    for(int i=0;i<index;i++){
      highest+=occurenceList.get(i);
    }
    System.out.println(numberList.get(highest-1));
  }
}
          
      
                
            
