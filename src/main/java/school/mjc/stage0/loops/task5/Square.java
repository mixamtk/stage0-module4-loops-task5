package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
            for (int i = 1; i <= sideLength; i++) {
                for (int a = 1; a <= sideLength; a++) {
                    if (i == 1 || i == sideLength) {
                        if (a == sideLength)
                            System.out.println("8");
                        else
                            System.out.print("8");
                    } else {
                        if (a == 1 )
                            System.out.print("8");
                        else
                        if (a > 1 && a < sideLength)
                            System.out.print(" ");
                        else
                            System.out.println("8");
                    }
                }
            }
    }
}
