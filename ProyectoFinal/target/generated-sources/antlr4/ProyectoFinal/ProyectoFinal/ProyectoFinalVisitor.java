// Generated from ProyectoFinal/ProyectoFinal/ProyectoFinal.g4 by ANTLR 4.5.1
package ProyectoFinal.ProyectoFinal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProyectoFinalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProyectoFinalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ProyectoFinalParser.StartContext ctx);
}