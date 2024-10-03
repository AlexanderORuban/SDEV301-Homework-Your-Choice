public class PartsManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        Part part1 = new Part("Left CrankCase", "Honda", "11211-ML3-000", "New", 2, 599.99);
        Part part2 = new Part("Crankshaft", "Honda", "13300-MAC-680", "Used", 1, 299.99);
        Part part3 = new Part("Rear Wheel Rim", "Yamaha", "94418-19049-00", "New", 5, 249.99);
        Part part4 = new Part("Swing Arm", "Kawasaki", "33001-0594", "Used", 3, 199.99);

        inventory.addPart(part1);
        inventory.addPart(part2);
        inventory.addPart(part3);
        inventory.addPart(part4);

        inventory.showInventory();

        inventory.updateQuantity("13300-MAC-680", 4);

        inventory.updatePrice("33001-0594", 349.99);

        inventory.findPart("94418-19049-00");

        System.out.println("Update Inventory:");
        inventory.showInventory();
    }
}
