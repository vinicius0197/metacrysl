/*
 * generated by Xtext 2.21.0
 */
package org.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.CryslRuntimeModule;
import org.CryslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CryslIdeSetup extends CryslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CryslRuntimeModule(), new CryslIdeModule()));
	}
	
}
