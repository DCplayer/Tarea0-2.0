// Generated from decaf.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafParser}.
 */
public interface decafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(decafParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(decafParser.ProgContext ctx);
}