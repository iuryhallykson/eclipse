/**
 * 
 */
package br.com.iuryhallykson.git;

/**
 * @author iuryh
 * Exemplo de integração do Eclipse com o GitHub
 */
import java.util.Locale;
import java.util.Scanner;

public class HelloGit {

	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	   String x;
	   int y;
	   double z;
	   x = sc.next();
	   y = sc.nextInt();
	   z = sc.nextDouble();
	   
	   System.out.println("Dados digitados: ");
	   System.out.println(x);
	   System.out.println(y);
	   System.out.println(z);
	    
	    sc.close();
	 

	}

}
