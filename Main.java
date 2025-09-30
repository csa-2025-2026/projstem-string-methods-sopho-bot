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

   stringManip("unicorn","rainbow"); 
  
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
   String upperCase;
   String upperLower;

  
   upperCase = s1.toUpperCase();
   upperLower = s2.substring(0,1).toUpperCase() + s2.substring(1).toLowerCase();
   System.out.printf("Your two words are %n%s%n%s%n  ", upperCase, upperLower);


   
   
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output;
    String before; 
    String after; 
    
    int indexofs2 = s1.indexof(s2);
    int indexofEnds2 = indexOfs2 + s2.length();

    before = s1.substring(0,indexofs2);
    after = s1. substring( indexOfEnds1);

    output = before + after;
    return output;
  }
}
