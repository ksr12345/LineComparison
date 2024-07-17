public class LineComparison {
    private final double x1, y1;
    private final double x2, y2;

    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineComparison other = (LineComparison) obj;
        return Double.compare(other.x1, x1) == 0 &&
                Double.compare(other.y1, y1) == 0 &&
                Double.compare(other.x2, x2) == 0 &&
                Double.compare(other.y2, y2) == 0;
    }

    public static void main(String[] args) {
        LineComparison line1 = new LineComparison(2, 3, 5, 7);
        LineComparison line2 = new LineComparison(2, 3, 5, 7);
        LineComparison line3 = new LineComparison(1, 2, 4, 6);

        // Testing equality
        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));
    }


}
