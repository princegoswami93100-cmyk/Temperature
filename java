 - // Create a class Temperature with a private variable celsius (float). 
//Write a setter, and a function that returns the value in Fahrenheit. Formula: F = (C x 9/5) + 32.
package Practice;
import java.util.Scanner;
/**
 *
 * @author Prince
 */
public class Temperature {
    private float celsius;
    public void set_celsius(float c) {
        celsius = c;
    }
    public double getFaherenit() {
        return(celsius *9/5) + 32;
    }
    
}
package Practice;
import java.util.Scanner;

/**
 *
 * @author Prince
 */
public class Main2 {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  Temperature T1 = new Temperature();
  System.out.println("enter temp in celsius :");
  float c = sc.nextFloat();
  T1.set_celsius(c);
System.out.println("temp in celsius :" + c);
System.out.println("temp in farhenit :" + T1.getFaherenit());
sc.close();}
}
    
