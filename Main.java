import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       sc.nextLine();
       
       String y = sc.nextLine();
       
       y = y.replaceAll("\\s+", "");
       
       int s = 0;
       int r ;
       for (int i = 0; i< y.length(); i++)
       {
           r = Character.getNumericValue(y.charAt(i)); 
           if(r > 5 )
           s = s+1;
           
       }
        System.out.println(s);
        System.out.println(y.length());
    }
}