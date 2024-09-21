import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commands command = new Commands();
        ASCII art = new ASCII();
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Dagger"));
        command.clearConsole();
        art.title();
        Health left = new Health(10);
        command.waitForSeconds(3);
        command.clearConsole();

        art.forest();
        System.out.println("You wake up in a forest. You have no idea where you are or why you are here.");
        System.out.println("(Press ENTER to continue, type 'inv' for inventory. Type 'quit' to exit. You start with 10 HP.");
        System.out.println("You search your pockets. You find a dagger.");
        command.waitForEnter();
        command.clearConsole();

        System.out.println("There are two paths you can take. One to the north and one to the east, which one will you choose?");
        while (true) {
            System.out.println("Type 'inv' to check your inventory, or 'quit' to exit.");
            String input = scanner.nextLine();
            
            if (input.equals("inv")) {
                inventory.showInventory();
            } else if (input.equals("quit")) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }
       
       
    }

}
