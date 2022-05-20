package ss8_clean_code.practice.RefactoringConstant;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperand, char oprerand) {
        switch (oprerand) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
