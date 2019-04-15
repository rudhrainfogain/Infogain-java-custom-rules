package org.sonar.samples.java.checks;

import java.util.List;

import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree.Kind;

public class InfogainCustomMethodParameterRule  extends IssuableSubscriptionVisitor {

	@Override
	public List<Kind> nodesToVisit() {
		// TODO Auto-generated method stub
		return null;
	}

}
