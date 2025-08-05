package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger than the last");
            return;
        }

        int skippedSum = 0;
        int countedSum = 0;

        for (int i = 0; i <= lastInRow; i++) {
            if (i == numberToSkip) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }

        System.out.println("skipped sum is number " + skippedSum);
        System.out.println("counted sum is number " + countedSum);
    }

    public static void main(String[] args) {
        TwoRangesSum runner = new TwoRangesSum();

        runner.printSumOfTwoRanges(3, 5);
        runner.printSumOfTwoRanges(7, 5);
        runner.printSumOfTwoRanges(2, -1);
    }
}