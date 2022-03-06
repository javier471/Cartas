package sieteMedia;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws CartaException {
		// TODO Auto-generated method stub

		BarajaEspanola b1=new BarajaEspanola();
		
		b1.barajar();
		System.out.println(b1);


		
	}

}
