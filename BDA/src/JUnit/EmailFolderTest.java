package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import BDA.EmailAPI;

public class EmailFolderTest {

	/**
	 * Testa o folder estar a null imediatamente ap�s a instancia��o da API
	
	 * @author Adil
	 * 
	 */
	//
	@Test
	public void test() throws Exception {
		EmailAPI test= new EmailAPI();
	
		assertEquals(null,test.getFolder());
	}

}
