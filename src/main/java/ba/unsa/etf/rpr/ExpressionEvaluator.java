/**
 * Pomoćna klasa korištena za evaluaciju artimetičkih izraza iz main klase
 * te u slučaju pogrešnog artimetičkog izraza bacanje odgovarajućeg izuzetka.
 */

package ba.unsa.etf.rpr;

import java.util.Stack;

public class ExpressionEvaluator {
    private Stack<Double> operandi = new Stack<>();
    private Stack <String> operatori= new Stack<>();
    public static boolean daLiJeBroj(String temp){
        if(temp.equals(null))
            return false;
        try{
            double num= Double.parseDouble(temp);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static boolean checkZnak(String temp){
        return temp.equals("*") || temp.equals("+") || temp.equals("/") || temp.equals("-");
    }
    private double calculate(Stack<Double> a, Stack<String> b){
            double t1;
            t1 = a.pop();
            double t2 = a.pop();
            String op = b.pop();
            switch (op){
                case "*":
                    return t1 * t2;
                case "/":
                    return (double) t2/t1;
                case "+":
                    return t1+t2;
                case "-":
                    return t2-t1;
            }
            return 0;
    }
    public double evaluate(String temp){
        String[] owo= temp.split(" ");
        for(String x: owo)
        {
            if(daLiJeBroj(x))
            {
                operandi.push(Double.parseDouble(x));
            } else if (checkZnak(x)) {
                operatori.push(x);
            } else if (x.equals(")")) {
                operandi.push(calculate(operandi,operatori));
            }else if(!x.equals("("))
            {
                throw new RuntimeException("Nije artimeticki validan");
            }
        }
        return operandi.pop();
    }
    }


