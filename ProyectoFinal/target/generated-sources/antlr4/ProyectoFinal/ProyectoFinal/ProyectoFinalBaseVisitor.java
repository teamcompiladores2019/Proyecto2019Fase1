// Generated from ProyectoFinal/ProyectoFinal/ProyectoFinal.g4 by ANTLR 4.5.1
package ProyectoFinal.ProyectoFinal;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ProyectoFinalVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ProyectoFinalBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ProyectoFinalVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(ProyectoFinalParser.StartContext ctx) { return visitChildren(ctx); }
}