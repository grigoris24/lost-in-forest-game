import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("You have the following items in your inventory:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
