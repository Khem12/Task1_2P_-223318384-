package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 addition result with input validation
     */
    public static Double q1Addition(String number1, String number2) {
        try {
            return Double.parseDouble(number1) + Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * Calculate Q2 subtraction result with input validation
     */
    public static Double q2Subtraction(String number1, String number2) {
        try {
            return Double.parseDouble(number1) - Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * New Q3 multiplication function
     */
    public static Double q3Multiplication(String number1, String number2) {
        try {
            return Double.parseDouble(number1) * Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}