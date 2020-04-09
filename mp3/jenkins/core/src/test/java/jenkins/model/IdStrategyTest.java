package jenkins.model;

import static org.junit.Assert.*;
import org.junit.Test;
import jenkins.model.IdStrategy.CaseSensitive;

public class IdStrategyTest {

	@Test
	public void testIdFromFilenameStandardCharacters() {
        	CaseSensitive a = new CaseSensitive();
			assertEquals("filename", a.idFromFilename("filename"));
    	}
    
    	@Test
	public void testIdFromFilenameStringOtherCharacters() {
        	CaseSensitive a = new CaseSensitive();
			assertEquals("_filename", a.idFromFilename("_filename"));
	}

}
