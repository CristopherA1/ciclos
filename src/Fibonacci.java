import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int iti=0;
	    int ayu=1;
	    int resultado=1;
	    int contador=0;
		Scanner in= new Scanner(System.in);
	    System.out.println("Escribe las veces que quieras que se haga el cálculo de Fibonacci: ");
	    int veces= in.nextInt();
	    
	    do {
	    	
	    	System.out.println("n="+contador+"  "+iti);
	    	resultado=iti+ayu;
	    	iti=ayu;
	    	ayu=resultado;
	    	contador++;
	    }while(contador<=veces);
	    in.close();
	}//Main

}//Fibonacci
