import java.util.Locale;
import java.util.Scanner;
import java.text.*;

class FormatOutput
{
  public static void main ( String[] args )
  {
    int value = 123456789 ;
    
    System.out.println( "Default Locale = " + Locale.getDefault() );
    DecimalFormat d = new DecimalFormat();  
    System.out.println( "value = " + d.format(value) );
    
    Scanner in = new Scanner(System.in);
    
    String line = in.nextLine();
    
    System.out.println(line);
  }
}