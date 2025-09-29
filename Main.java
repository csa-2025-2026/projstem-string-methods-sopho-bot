import java.util.Scanner; 

public class Main
{
  public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   System.out.println("Input two words");
   String word1 = scan.nextLine();
   String word2 = scan.nextLine();
   
   System.out.println("Give a number");
   int N = scan.nextInt(); 

   lastFirstN(word1, word2, N);

    Scanner scan = new Scanner(System.in);
   System.out.println("Input two words");
   String word1 = scan.nextLine();
   String word2 = scan.nextLine();
   
   System.out.println("Give a number");
   int N = scan.nextInt(); 
  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()*/
  
  public static void lastFirstN(String s1, String s2, int n)
  {
  String output; 
  String firstN;
  String lastN;

  firstN = s2.substring(0,n); // substring(0,1) - 1st letter
  lastN = s1.substring(s1.length() - n);

  output = lastN + firstN; 
  System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
   String case;
   String upperCase;
   String upperLower;

  
   upperCase = s1.toUpperCase();
   upperLower = 

   
   
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
