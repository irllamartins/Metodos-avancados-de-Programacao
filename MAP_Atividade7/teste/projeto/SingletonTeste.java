package projeto;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SingletonTeste {
	@Test
	public void instancia() {
		assertSame(Singleton.getSingleton(), Singleton.getSingleton());
	}
}
