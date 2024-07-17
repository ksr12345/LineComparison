public class LineComparison {
    private double length;

    public LineComparison(){
        this.length = length;
    }

    public double calculateLength(double x1, double y1, double x2, double y2) {
        length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    public void compare(double l1, double l2){
        if (l1 == l2){
            System.out.println("They are equal lines.");
        } else if (l1 > l2) {
            System.out.println("First line is greater than second.");
        } else {
            System.out.println("Second line is greater than first.");
        }
    }


    public static void main(String[] args) {
        LineComparison len = new LineComparison();
        double len1 = len.calculateLength(2, 1,5,6);
        double len2 = len.calculateLength(1, 1,4,7);

        len.compare(len1, len2);
    }
}
