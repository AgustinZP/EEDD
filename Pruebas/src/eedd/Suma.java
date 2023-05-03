package eedd;

public class Suma {
	
	private int num1;
	private int num2;
	
	public Suma(int n1, int n2) {
		num1= n1;
		num2=n2;
	}
	
	public int sumaPositivos(int n1, int n2) {
		if(n1<0 || n2<0) {
			System.out.println("Los números tienen que ser positivos.");
		}
		int resultado= num1+num2;
		return resultado;
	}
	
	public int sumaNegativos(int n1, int n2) {
		if(n1>0 || n2>0) {
			System.out.println("Los números tienen que ser negativos.");
		}
		int resultado= n1+n2;
		return resultado;
	}
	
	public int sumaPositivoNegativo(int n1, int n2) {
		if((n1<0 && n2<0)|| (n1>0&&n2>0)) {
			System.out.println("Al menos un número tiene que ser negativo y otro positivo.");
		}
		int resultado=n1+n2;
		return resultado;
		
	}
	
	/*AÑADO ESTA LINEA PARA VER COMO SE MODIFICA EL RESPOSITORIO EN GITHUB AUTOMATICAMENTE*/

}
