import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float base = 0;
		float result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("** �REA DEL CUADRADO **");  
		
		System.out.print("\n\nIngrese el lado: ");  
		base = sc.nextInt();  
		
		result = base * base;
		
		System.out.print("\nEl �rea es: " + result); 
		
	}

}
