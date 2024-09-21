import java.util.Scanner;

public class Game{
    public static ASCII art = new ASCII();
    public static Commands command = new Commands();
    public static Inventory inventory = new Inventory();
    public static NorthForest north = new NorthForest();
    public static Health left = new Health(10);
    public static Input input = new Input();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        inventory.addItem(new Item("Dagger"));
        command.clearConsole();
        art.title();
        
        command.waitForSeconds  (3);
        command.clearConsole();

        art.forest();
        System.out.println("You wake up in a forest. You have no idea where you are or why you are here.");
        System.out.println("(Press ENTER to continue, type 'inv' for inventory. Type 'quit' to exit. You start with 10 HP.");
        System.out.println("You search your pockets. You find a dagger.");
        command.waitForEnter();
        command.clearConsole();

        System.out.println("There are two paths you can take. One to the north and one to the east, which one will you choose?");
        input.type();
       
       
    }

}
