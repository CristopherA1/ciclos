import java.util.Scanner;

public class Forejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
	    System.out.println("Escribe una palabra y la deletrearé por ti: ");
	    String palabra= in.nextLine();
	    int cantidad = String.valueOf(palabra).length();
	    for(int num=0;num<=cantidad;num++) {
	    	System.out.println(palabra.charAt(num));
	    }//For
	    in.close();
	}//Main

}//Forejercicio
