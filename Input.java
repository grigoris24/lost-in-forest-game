public class Input extends Game {

    public void type(String location) {
        while (true) {
            System.out.println("(Type 'inv' for inventory, 'quit' to exit, 'health' to show your HP.)");
            String input = scanner.nextLine().toLowerCase();

            
            
            if (input.equals("inv")) {
                inventory.showInventory();
            } else if (input.equals("quit")) {
                System.out.println("Thanks for playing!");
                command.waitForSeconds(2);
                System.exit(0);
            } else if (location.equals("center") && input.equals("north")) {
                forest.north();
                break;
            } else if (location.equals("center") && input.equals("east")) {
                forest.east();
            } else if (location.equals("east forest") && input.equals("west")) {
                forest.center();
            } else if (location.equals("north forest") && input.equals("south")) {
                forest.center();
            } else if (location.equals("north forest") && input.equals("west")) {
                System.out.println("The branches are too pointy. You lost 1 HP.");
                left.loseLife(1);
            } else if (input.equals("health")) {
                left.isAlive();
            } else if (input.contains("use")) {
                System.out.println("Now's not the time for that.");
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
