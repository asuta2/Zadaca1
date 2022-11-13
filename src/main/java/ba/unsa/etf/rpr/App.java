package ba.unsa.etf.rpr;

public class App 
{
    public static void main(String[] args)
    {
        ExpressionEvaluator temp = new ExpressionEvaluator();
        double ispis= temp.evaluate(spoji(args));
        System.out.println(ispis);

    }
    public static String spoji(String[] args)
    {
        String ispis="";
        String sp="";
        for(String x: args) {
            ispis = ispis + sp + x;
            sp = " ";
        }
        return ispis;
    }
}
