import java.util.Scanner;
public class Tablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner console = new Scanner(System.in);
	        int num;
	        int iteracion=1;
	        int resultado=0;
	        System.out.print("Ingresa un número y te daré la tabla de ese número: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla del " + num);
	        while(iteracion<=10) {
	        	resultado=num*iteracion;
	        	System.out.println(num+"x"+iteracion+"="+resultado);
	        	iteracion++;
	        }//while
	        
	}//Main
	
}//tablas
