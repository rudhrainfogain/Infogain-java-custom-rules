package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class InfogainCustomMethodParameterRuleTest {

/**
 * @author Rudhra Koul
 * Method to test our custom rule against test data
 */
	  @Test
	  public void check() {
	    // Verifies that the check will raise the adequate issues with the expected message.
	    // In the test file, lines which should raise an issue have been commented out
	    // by using the following syntax: "// Noncompliant {{EXPECTED_MESSAGE}}"
	    JavaCheckVerifier.verify("src/test/files/InfogainCustomMethodParameterRuleTestData.java", new InfogainCustomMethodParameterRule());
	  }
}
