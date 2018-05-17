package ex2;

public class MyMath {

    public static String number = "";

    public static float resolve(String expression){
        expression = expression.replaceAll(" ", "");

        char[] chars = expression.toCharArray();



        // S'ha de buscar quin es l'últim operador que s'hauria d'executar.
        // Serà una suma o resta fora de parèntesis.
        int idx = getLastOperator(chars);

        //Arribats a aquest punt tenim:
        // O bé un número a number
        // O bé l'operador de menys prioritat

        if(idx < 0) {
            //CAS BASE:
            return currentNumberToFloat(number);
        }
        else {
            //CAS RECURSIU
            float left = resolve(expression.substring(0, idx));
            float right = resolve(expression.substring(idx+1));

            switch (chars[idx]){
                case '+':
                    return left + right;

                case '-':
                    return left - right;

                case '*':
                    return left * right;

                case '/':
                    return left / right;

                default:
                    throw  new RuntimeException(String.format("Operator '%s' not allowed.", chars[idx]));

            }
        }
    }

    protected static int getLastOperator(char[] chars) {
        int selected_index = -1;
        int selected_priority = Integer.MAX_VALUE;
        int current_priority = 1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') current_priority++;        //Obre paréntesis, el que hi ha dins té prioritat
            else if (chars[i] == ')') current_priority--;   //Tanca paréntesis, s'acaba la prioritat
            else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '/' || chars[i] == '*') {

                if (chars[i] == '/' || chars[i] == '*')                current_priority += 1;


                //Es tracta d'un operador de baixa prioritat, es fará l'últim sempre que no estigui dins un parentesis
                if (selected_priority >= current_priority) {
                    selected_priority = current_priority;
                    selected_index = i;
                }

                if (chars[i] == '/' || chars[i] == '*')                current_priority -= 1;

            }
        }
        return selected_index;
    }

    private static float currentNumberToFloat(String number){
        return Float.parseFloat(number);
    }
}