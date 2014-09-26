package inter;
import lexer.*; import symbols.*;
public class Expr extends Node {
	public Token op;
	public Type type;
	Expr(Token tok, Type, p) { op = tok; type = p; }
	public Expr gen() {return this;}
	public Expr reduce() {return this;}
	public 
}