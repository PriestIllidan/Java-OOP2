public class CalcDouble implements Calc{

    @Override
    public void calc() {
        double n1 = NumberDouble.getNumber();

        String operation = Operation.getOperation();

        double n2 = NumberDouble.getNumber();

        switch (operation) {
            case "+":
                System.out.println("Result = " + (n1 + n2));
                break;
            case "-":
                System.out.println("Result = " + (n1 - n2));
                break;
            case "*":
                System.out.println("Result = " + (n1 * n2));
                break;
            case "/":
                System.out.println("Result = " + (n1 / n2));
                break;

            default:
                break;
        }
        
    }

    // Проверка
    // public static void main(String[] args) {
    //     calcDouble();

    // }
}