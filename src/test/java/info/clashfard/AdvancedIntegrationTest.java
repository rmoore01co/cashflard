package info.clashfard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import info.configuration.AppConfig;

@ContextConfiguration(classes=AppConfig.class, loader=AnnotationConfigContextLoader.class)
public class AdvancedIntegrationTest {
	private static final Logger log = LoggerFactory.getLogger(AdvancedIntegrationTest.class);

	@Test
	public void testMe() {
		log.debug("I have been called");
	}
}