public class Gravitacija {
    public static void main(String[] args) {

        System.out.println("OIS je zakon!");

        int h = 0;

        double C = 6.67408 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double R = 6371000;
        double g = C * M / Math.pow(R + h, 2);

        System.out.println("Gravitacijska pospešek na površju Zemlje je " + g + " m/s^2");

    }
}
