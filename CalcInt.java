public class CalcInt implements Calc {
    @Override
    public void calc() {
        int n1 = NumberInt.getNumber();

        String operation = Operation.getOperation();

        int n2 = NumberInt.getNumber();

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

        // Проверка
        // public static void main(String[] args) {
        // calcInt();

        // }
    }
}