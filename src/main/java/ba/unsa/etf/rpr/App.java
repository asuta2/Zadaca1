package ba.unsa.etf.rpr;

public class App 
{
    public static void main(String[] args)
    {
        ExpressionEvaluator temp = new ExpressionEvaluator();
        System.out.println(temp.evaluate(args[0]));
    }
}
