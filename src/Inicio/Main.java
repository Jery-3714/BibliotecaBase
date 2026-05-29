package Inicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("===== BIBLIOTECA BASE =====");

String titulo;
String autor;
int anio;


System.out.println("Ingrese el titulo del libro:");
titulo = sc.nextLine();
System.out.println("Ingrese el autor del libro:");
autor = sc.nextLine();
System.out.println("Ingrese el año de publicación del libro:");
anio = Integer.parseInt(sc.nextLine());

if(anio >= 1500 && anio <= 2026) {
	System.out.println("Libro registrado ");
	System.out.println("Titulo: " + titulo);
	System.out.println("Autor: " + autor);
	System.out.println("Año de publicacion :" + anio);
}
else {
	System.out.println("Año inválido");
}


sc.close();


	}

}

