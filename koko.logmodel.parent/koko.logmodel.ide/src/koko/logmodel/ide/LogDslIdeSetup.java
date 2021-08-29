/*
 * generated by Xtext 2.25.0
 */
package koko.logmodel.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import koko.logmodel.LogDslRuntimeModule;
import koko.logmodel.LogDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LogDslIdeSetup extends LogDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LogDslRuntimeModule(), new LogDslIdeModule()));
	}
	
}
