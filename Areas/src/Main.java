import java.util.*;  

public class Main {

	public static void main(String[] args) {
		
		float base = 0;
		float high = 0;
		float result = 0;
		
		int opc = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			opc = ShowMenu();
			
			switch(opc) {
				case 1:
					
					System.out.print("\nIngrese el lado: ");  
					base = sc.nextInt();  
					
					result = Logic.CalculateSquareArea(base);
					
					break;
					
				case 2:
					
					System.out.print("\nIngrese la base: ");  
					base = sc.nextInt();  
					
					System.out.print("Ingrese la altura: ");  
					high = sc.nextInt(); 
					
					result = Logic.CalculateRectangleArea(base, high);
					
					break;
					
				case 3:
					
					System.out.print("\nIngrese la base: ");  
					base = sc.nextInt();  
					
					System.out.print("Ingrese la altura: ");  
					high = sc.nextInt();  
					
					result = Logic.CalculateTriangleArea(base, high);
					
					break;
					
				default:
					
					System.out.print("\nNo existe esa opci�n\n\n");  
					
					break;
			}
			
		}while(opc > 3 || opc < 1);
		
		
		System.out.print("\nEl �rea es: " + result); 

	}
	
	private static int ShowMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("** �REAS **");  
		
		System.out.print("\n1. Calcular �rea del cuadrado");  
		System.out.print("\n2. Calcular �rea del rect�ngulo");  
		System.out.print("\n3. Calcular �rea del tri�ngulo");  
		
		System.out.print("\n\nQu� opci�n desea: ");  
		int opc = sc.nextInt();  
		
		return opc;
		
	}

}
