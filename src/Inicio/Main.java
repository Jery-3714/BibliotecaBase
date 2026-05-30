package Inicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
							
			do {
				System.out.println("===== BIBLIOTECA BASE =====");
				System.out.println("1. Registrar libro");
				System.out.println("2. Mostrar libros");
				System.out.println("3. salir");
			
				opcion = Integer.parseInt(sc.nextLine());
			
			
			if(opcion == 1) {
				System.out.println("Registrando libro...");
			}
			else if(opcion == 2) {
				System.out.println("Mostrando libros...");
			}
			else if(opcion == 3) {
				System.out.println("Saliendo...");
			}
			else {
			System.out.println("Opcion invalida");
			}
			
			} while(opcion != 3); 
			
			
			
			sc.close();

			}
			}
	