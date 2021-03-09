import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base = 0;
		float high = 0;
		float result = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("** ÁREA DEL TRIÁNGULO **");  
		
		System.out.print("\n\nIngrese la base: ");  
		base = sc.nextInt();  
		
		System.out.print("Ingrese la altura: ");  
		high = sc.nextInt();  
		
		result = base * high / 2;
		
		System.out.print("\nEl área es: " + result); 
	}
}
