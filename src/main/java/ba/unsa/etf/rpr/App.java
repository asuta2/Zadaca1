package ba.unsa.etf.rpr;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExpressionEvaluator temp = new ExpressionEvaluator();
        double ispis= temp.evaluate(args[0]);
        System.out.println(ispis);

    }
}
