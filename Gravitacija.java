import java.util.Scanner;

public class Gravitacija {
    public static void main(String[] args) {

        System.out.println("OIS je zakon!");

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        double C = 6.67408 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double R = 6371000;
        double g = C * M / Math.pow(R + h, 2);

        System.out.println(h);

        System.out.println(g);

    }
}
