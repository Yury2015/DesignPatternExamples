/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 10:48 PM.
 */
public class InterpreterPatternDemo {

    // Rule: Robert and John are mail
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomenExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String args[]) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        System.out.println("John is mail? " + isMale.interpret("John"));
        System.out.println("Julie is married women? " + isMarriedWomen.interpret("Married Julie"));
    }
}
