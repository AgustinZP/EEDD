package eedd;

public class PruebaSuma {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		Suma s= new Suma(2,3);
		System.out.println(s.sumaPositivos(2, 3));
		System.out.println(s.sumaNegativos(-2, -3));
		System.out.println(s.sumaPositivoNegativo(-1, 3));

	}

}
