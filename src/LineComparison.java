public class LineComparison {
    public static void main(String[] args) {
        double len = calculateLength(2, 3, 5, 7);
        System.out.println("Length of the line segment: " + len);
    }

    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
