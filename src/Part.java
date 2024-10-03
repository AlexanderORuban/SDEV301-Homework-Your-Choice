public class Part {
    private String name;
    private String brand;
    private String partNumber;
    private String condition;
    private int quantity;
    private double price;

    public Part(String name, String brand, String partNumber, 
        String condition, int quantity, double price) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.condition = condition;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getCondition() {
        return condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Part name: %s, Brand: %s, Part Number: %s, Condition: %s, Quantity: %d, Price %.2f", 
            name, brand, partNumber, condition, quantity, price);
    }
}