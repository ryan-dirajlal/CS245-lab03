import java.util.*;

public class sortColumns 
{       //required class and function with their respective names
   static List minDeletionSize(String[] A) 
   {
       List D = new ArrayList();        //initializes new array which will be returned as long as there are no errors

       for (int i = 0; i < A.length; i++) 
       {
           if (A[i].length() != A[1].length()) //ensures they are the same length
           {
               D.add(-1);
               return D; //returns the error (-1)
           }
           for (int j = 0; j < A[i].length(); j++) 
           {
               if (Character.isUpperCase(A[i].charAt(j))) //ensures they are not uppercase per the instructions
               {
                   D.add(-1);
                   return D; //returns error (-1)
               }
           }
       }

       for (int i = 0; i < A[1].length(); i++) 
       {
           for (int j = 0; j < A.length; j++) 
           {
            //after checking for everything, it performs the operation, returning the indices that are not sorted.
               if ((j + 1 != A.length) && (A[j].charAt(i) - A[j + 1].charAt(i) > 0) && (!D.contains(i)))         
                    D.add(i); //add the unsorted indicies to the array which will be returned   
           }
       }
       return D; //returns all indicies where they are unsorted (it returns a blank list if they are already sorted and -1 if there are errors)
   }

   public static void main(String[] args) 
   {
       String[] A = { "zyx", "wvu", "tsr"}; //used to test according to the examples in the lab
       List finalResult = minDeletionSize(A); //passes the string list through the function and gets the returned list

       for (int i = 0; i < finalResult.size(); i++) 
       {
           System.out.println(finalResult.get(i)); //prints the list one value at a time
       }
   }
}