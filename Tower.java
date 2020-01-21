import java.util.*;
/**
 * Write a description of class Tower here.
 * 
 * @author GivenName FamilyName
 * @version 1.0 yyyy-mm-dd
 */
public class Tower
{
   private Stack startPole = new Stack();
   private  Stack middlePole = new Stack();
   private Stack endPole = new Stack();
   private int n;
    /**
    * Write a description of method main here.
    *
    * @param argument not used
    */
   public  void run()
   {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int x;
      for (int i=1; i<=n; i++)
      {
          x = i;
          startPole.push(x);
        }
        System.out.println(startPole.toString());
       solve(n,startPole, middlePole, endPole, 1,2,3); 
       System.out.println(endPole.toString());
   } // end of method main(String[] argument)
   
 private void solve(int n, Stack start, Stack auxiliary, Stack end, int s, int m, int e) {
       if (n == 1 && !start.isEmpty()) {
           end.push(start.pop());
           System.out.println("Move disk 1 from rod " +  s + " to rod " + e); 
       } else {
           solve(n - 1, start, end, auxiliary, s,e,m);
           end.push(start.pop());
           System.out.println("Move disk " + n + " from rod " +  s + " to rod " + e);
           solve(n - 1, auxiliary, start, end, m,s,e);
       }
   }
}