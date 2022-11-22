package projeto;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Singleton.getSingleton().setCirculo(10));
		Singleton.getSingleton().setQuadrado(10);
		Singleton.getSingleton().setQuadrado(10);
		System.out.println(	Singleton.getSingleton().getQuadrado().toString());
		
		try {
			System.out.println(	Singleton.getSingleton().setTriangulo(70,70,40));
		}
		catch (TrianguloException e) {		
		}
		
		try {
			System.out.println(	Singleton.getSingleton().setTriangulo(90,10,80));
		} 
		catch (TrianguloException e) {
			
		}
		try {
			System.out.println(	Singleton.getSingleton().setTriangulo(60,60,60));
		} 
		catch (TrianguloException e) {
		}
		
		
		
		System.out.println(Singleton.getSingleton().toString());
	

	}


}
