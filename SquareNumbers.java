
/**
 * Write a description of class SquareNumbers here.
 * 
 * @author GivenName FamilyName
 * @version 1.0 yyyy-mm-dd
 */
public class SquareNumbers
{
   /**
    * Write a description of method main here.
    *
    * @param argument not used
    */
   public static void main(String[] argument)
   {
   } // end of method main(String[] argument)

   public static int squareNumbers(int n)
   {
       if (n == 0)
       return 0;
       return (2*n - 1 + squareNumbers(n -1)) ;
    }
    
    public static int cube(int n)
    {
        if (n == 0)
        return 0;
        return (cube(n-1) + 3*(squareNumbers(n))- 3*n + 1);
}

public static int sum(int[] array, int index)
{
      if (index == array.length )
      return 0;
      return (array[index] + sum( array, index+1));
}

public static int sum(int[] array)
{
     return sum(array, 0);
}

public static boolean palindrome(String str)
{
    if(str.length() <= 1)
    return true;
if (str.charAt(0)!= str.charAt(str.length()-1))
    return false;
    return palindrome(str.substring(1,str.length()-2) );
}
} // end of class SquareNumbers