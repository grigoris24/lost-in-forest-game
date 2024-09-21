public class Input extends Game {

    public void type() {
        while (true) {
            System.out.println("(Type 'inv' to check your inventory, use 'item' to use item from inventory or 'quit' to exit.)");
            String input = scanner.nextLine();
            
            if (input.equals("inv")) {
                inventory.showInventory();
            } else if (input.equals("quit")) {
                System.exit(0);
            } else if (input.equals("north")) {
                north.north();
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
