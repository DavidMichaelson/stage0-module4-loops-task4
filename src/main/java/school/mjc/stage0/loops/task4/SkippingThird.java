package school.mjc.stage0.loops.task4;

import javax.swing.plaf.SliderUI;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        int count = 0;

        for (int i = 1; i <= lastPrinted; i++) {
            count++;

            if (count % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SkippingThird skippingThird = new SkippingThird();
        skippingThird.printUntilButThird(30);
    }
}
