package behavioral.interpreter;
//Interpreter(해석) Pattern : 문법 규칙을 정의하고 해석하는 패턴
public class InterpreterPattern {
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedExpression();
		System.out.println("kim male ? "+isMale.interpreter("kim male"));
		System.out.println("park male ? "+isMale.interpreter("park male"));
		System.out.println("park married ? "+isMarried.interpreter("park married"));
		System.out.println("lee married ? "+isMarried.interpreter("lee married"));
	}
	public static Expression getMaleExpression() {
		Expression kim  = new TerminalExpression("kim");
		Expression lee  = new TerminalExpression("lee");
		return new OrExpression(kim, lee);
	}
	public static Expression getMarriedExpression() {
		Expression park = new TerminalExpression("park");
		Expression married = new TerminalExpression("married");
		return new AndExpression(park, married);
	}
}
