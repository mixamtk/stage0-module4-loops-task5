package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
                if (sideLength % 2 !=0)
            for (int i = 1; i <= sideLength; i++) {
                for (int a = 1; a <= sideLength; a++) {
                    if (a == sideLength / 2 + 1) {
                        System.out.print("8");
                    }
                    else
                        if (i == sideLength / 2 + 1)
                            System.out.print("8");
                        else
                            System.out.print(" ");
                        if (a == sideLength)
                            System.out.println(" ");

                }
            }
System.out.println();
    }
}
