public class LineComparison implements Comparable<LineComparison>{
    private final Point start;
    private final Point end;

    public LineComparison(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distanceTo(end);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof LineComparison)) return false;
        LineComparison other = (LineComparison) obj;
        return this.start.equals(other.start) && this.end.equals(other.end);
    }

    @Override
    public int compareTo(LineComparison other) {
        double thisLength = this.length();
        double otherLength = other.length();

        return Double.compare(thisLength, otherLength);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(1, 2);

        LineComparison line1 = new LineComparison(p1, p2);
        LineComparison line2 = new LineComparison(p1, p3);

        System.out.println("Length of line1: " + line1.length());
        System.out.println("Length of line2: " + line2.length());


        System.out.println("line1 equals line2: " + line1.equals(line2));

        System.out.println("Comparing line1 to line2: " + line1.compareTo(line2));
    }
}
