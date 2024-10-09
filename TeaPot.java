public class Teapot {
    private int capacity;
    private double price;
    private String color;
    private boolean isElectric;

    // Default Constructor
    public Teapot() {
        this.capacity = 0;
        this.price = 0.0;
        this.color = "Unknown";
        this.isElectric = false;
    }

    // Parameterized Constructor
    public Teapot(int capacity, double price, String color, boolean isElectric) {
        this.capacity = capacity;
        this.price = price;
        this.color = color;
        this.isElectric = isElectric;
    }

    // Method to get the capacity
    public int getCapacity() {
        return capacity;
    }

    // Method to get the price
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "capacity=" + capacity +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    public static void main(String[] args) {
        Teapot teapot1 = new Teapot();
        Teapot teapot2 = new Teapot(1, 29.99, "Red", true);

        System.out.println(teapot1.toString());
        System.out.println(teapot2.toString());

        System.out.println("Teapot 1 Capacity: " + teapot1.getCapacity());
        System.out.println("Teapot 2 Price: " + teapot2.getPrice());
    }
}
