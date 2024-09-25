public class Input extends Game {

    public void type(String location) {
        while (true) {
            System.out.println("(Type 'inv' for inventory, 'quit' to exit, 'health' to show your HP, 'use' and item name to use an item.)");
            String input = scanner.nextLine().toLowerCase();
            String action = location + ":" + input;

            switch (action) {
                case "center:north":
                    forest.north();
                    return; 
                case "center:east":
                    forest.east();
                    break;
                case "east forest:west":
                    forest.center();
                    break;
                case "north forest:south":
                    forest.center();
                    break;
                case "north forest:west":
                    System.out.println("The branches are too pointy. You lost 1 HP.");
                    left.loseLife(1);
                    break;
                default:
                    switch (input) {
                        case "inv":
                            inventory.showInventory();
                            break;
                        case "quit":
                            System.out.println("Thanks for playing!");
                            command.waitForSeconds(2);
                            System.exit(0);
                            break;
                        case "health":
                            left.isAlive();
                            break;
                        default:
                            if (input.contains("use")) {
                                System.out.println("Now's not the time for that.");
                            } else {
                                System.out.println("Unknown command.");
                            }
                            break;
                    }
            }
        }
    }
}
