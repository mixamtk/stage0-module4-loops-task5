package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
                    for (int i = 1; i <= cathetusLength; i++) {
                for (int a = 1; a <= cathetusLength; a++) {
                    if (a < i) {
                        System.out.print("8");
                    } else if (a == i) {
                        System.out.println("8");
                    }
                }
            }

    }
}
