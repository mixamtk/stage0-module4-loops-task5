package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
       int incDec = 0;
            for (int i = 1; i <= height; i++) {
                for (int a = 1; a <= height; a++) {

                        if (a > incDec && a <=(height - incDec)) {
                            if (a == height) System.out.println("8");
                            else
                            System.out.print("8");
                        }

                        else {
                            if (a == height) System.out.println(" ");
                            else
                                System.out.print(" ");
                        }
                }
                if (i < height / 2) incDec++;
                if (height % 2 != 0 && i == height / 2) incDec++;
                if (i > height / 2) incDec--;
            }
    }
}
