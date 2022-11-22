package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class FigurasGeometricasTest {	
	 
	 @Before
	 public void setUp() throws TrianguloException {
		 Singleton.getSingleton().setCirculo(10);
		 Singleton.getSingleton().setQuadrado(10);
		 Singleton.getSingleton().setQuadrado(10);
		 Singleton.getSingleton().setTriangulo(70,70,40);
		 Singleton.getSingleton().setTriangulo(90,10,80);
		 Singleton.getSingleton().setTriangulo(60,60,60);
	}
	
	//teste de saida
	 @Test
	 public void getTOstring() {
		 assertEquals(Singleton.getSingleton().toString(),"FigurasGeometricas [Circulo [raio: 10.0, Perimetro: 62.800000000000004, Area: 314.0], [Quadrado [lado: 10, Perimetro: 40.0, Area: 100.0], Quadrado [lado: 10, Perimetro: 40.0, Area: 100.0]], [Triangulo [ tipo: Isoceles, angulo1: 70.0, angulo2: 70.0, angulo3: 40.0], Triangulo [ tipo: Retangulo, angulo1: 90.0, angulo2: 10.0, angulo3: 80.0], Triangulo [ tipo: Equilatero, angulo1: 60.0, angulo2: 60.0, angulo3: 60.0]]]");
	}
	
	

}
