package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
                    for (int i = 1; i <= height; i++) {
                for (int a = 1; a <= length; a++) {
                    if (i == 1 || i == height || a == 1) {
                        if (a == length) System.out.println("8");
                        else
                            System.out.print("8");
                    }
                    else {
                        if (a == length) System.out.println("8");
                        else
                            System.out.print(" ");
                    }
                }
            }

    }
}
