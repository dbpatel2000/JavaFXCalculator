package sample;

public class Model {
    public static float calculate(long num1, long num2, String operator){

        // add your calculation code
        switch(operator){
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                if(num2 ==0 ){
                    return 0;
                }
                else
                    return num1 / num2;
            default :
                return 0;
        }
    }
}
