/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package upb.du.dti.isc.ui;

import com.google.inject.Injector;
import finalComp1.ui.internal.FinalComp1Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CompExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FinalComp1Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FinalComp1Activator activator = FinalComp1Activator.getInstance();
		return activator != null ? activator.getInjector(FinalComp1Activator.UPB_DU_DTI_ISC_COMP) : null;
	}

}
