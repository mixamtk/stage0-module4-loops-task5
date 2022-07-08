package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int a = 1; a <= cathetusLength; a++) {
                if (a <= i) {
                    if (i == cathetusLength && a == i)
                        System.out.println(8);
                    else
                    System.out.print("8");
                } else if (a == cathetusLength) {
                    System.out.println(" ");
                } else
                    System.out.print(" ");
            }
        }
    }
}
