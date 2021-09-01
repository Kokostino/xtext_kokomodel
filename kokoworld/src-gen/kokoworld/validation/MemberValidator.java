/**
 *
 * $Id$
 */
package kokoworld.validation;

import kokoworld.Document;

/**
 * A sample validator interface for {@link kokoworld.Member}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MemberValidator {
	boolean validate();

	boolean validateDocument(Document value);
}
