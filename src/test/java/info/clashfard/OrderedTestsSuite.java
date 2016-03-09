package info.clashfard;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BeginnerIntegrationTest.class,
		IntermediateIntegrationTest.class,
		AdvancedIntegrationTest.class
})
public class OrderedTestsSuite
{
}

