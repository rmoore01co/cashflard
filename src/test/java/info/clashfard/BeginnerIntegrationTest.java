package info.clashfard;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext-test.xml"})
public class BeginnerIntegrationTest
{
	private static final Logger log = LoggerFactory.getLogger(BeginnerIntegrationTest.class);

	@Test
	public void testMe()
	{
		log.debug("I have been called");
	}
}
