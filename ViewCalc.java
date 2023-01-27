import java.util.Scanner;

public class ViewCalc implements View {

    @Override
    public void clickButton() {
        System.out.println("Select calc: 1 - double; 2 - int; 3 - complex *Пока нет* 3 - exit");
        Scanner scanner = new Scanner(System.in);
        int calc = scanner.nextInt();
        switch (calc) {
            case 1:
                Calc calcDouble = new CalcDouble();
                calcDouble.calc();
                break;
            case 2:
                Calc calcInt = new CalcInt();
                calcInt.calc();
                break;
            // case 3:
            // .......
            default:
                break;
        }
        scanner.close();

    }

}
