package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");

            for (int i = 0; i <= numberToGoUntil; i++) {
                System.out.println(i);
                }

        } else {

            for (int j = 0; j <= toBreakWith; j++) {
                System.out.println(j);
                if (j == toBreakWith) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        numberToBreakOn.printNumbersUntilWithBreakOn(10, 9);
        numberToBreakOn.printNumbersUntilWithBreakOn(8, 10);

    }
}
