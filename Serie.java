import java.util.Scanner;	
	public class Serie {
     public static void main(String[] args) {
         int tam;
        Scanner lee = new Scanner(System.in);
	System.out.println("\n\nIngrese numero : ");
	tam = lee.nextInt();
        Primo obj1 = new Primo(tam,tam); 
        obj1.mostrarSerie();
         
     }
    
}
