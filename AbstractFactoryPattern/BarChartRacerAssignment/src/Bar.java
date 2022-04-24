
public class Bar implements Comparable<Bar> {

    private final String na;
    private final int val;
    private final String cat;

    // Creates a new bar.
    public Bar(String name, int value, String category) {
        if (name == null || value < 0 || category == null) {
            throw new IllegalArgumentException("Wrong data");
        }
        na = name;
        val = value;
        cat = category;
    }

    // Returns the name of this bar.
    public String getName() {
        return na;
    }

    // Returns the value of this bar.
    public int getValue() {
        return val;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return cat;
    }

    // Compare two bars by value.
    public int compareTo(Bar that) {
        if (that == null) {
            throw new NullPointerException();
        }
        return Integer.compare(this.val, that.val);
    }

    public static void main(String[] args) {


    }
}
