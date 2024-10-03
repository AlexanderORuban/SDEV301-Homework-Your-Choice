import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Part> parts;

    public Inventory() {
        parts = new HashMap<>();
    }

    public void addPart(Part part) {
        if (parts.containsKey(part.getPartNumber())) {
            System.out.println("A part with this part number already exists. Please update the quantity of the part or use a different part number.");
        } else {
            parts.put(part.getPartNumber(), part);
        }
    }

    public void updateQuantity(String partNumber, int newQuantity) {
        Part part = parts.get(partNumber);
        if (part != null) {
            part.setQuantity(newQuantity);
            System.out.println("Updated quantity of " + partNumber + " to " + newQuantity);
        } else {
            System.out.println("Part not found");
        }
    }

    public void updatePrice(String partNumber, double newPrice) {
        if (newPrice < 0) {
            System.out.println("Price cannot be negative.");
            return;
        }
        
        Part part = parts.get(partNumber);
        if (part != null) {
            part.setPrice(newPrice);
            System.out.println("Updated price of " + partNumber + " to " + newPrice);
        } else {
            System.out.println("Part not found.");
        }
    }

    public Part findPart(String partNumber) {
        Part part = parts.get(partNumber);
        if (part == null) {
            System.out.println("Part with part number " + " not found.");
        }
        
        return part;
    }
    
    public void showInventory() {
        if (parts.isEmpty()) {
            System.out.println("No parts are currently in inventory.");
        } else {
            System.out.println("Inventory Parts:");
            for (Part part : parts.values()) {
                System.out.println(part);
            }
        }
    }
}
