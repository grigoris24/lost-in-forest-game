public class Forest extends Game {
    public void north() {
        command.clearConsole();
        art.northForest();
        System.out.println("You arrive to a grassy glade. There's a small waterfall to the east and a\nline of big trees to the west. It doesn't look you can go through but you can try.");
        System.out.println("You can go back 'south' or try 'west' through the trees.");
        input.type("north forest");
    }

    public void east() {
        command.clearConsole();
        art.northForest();
        System.out.println("The forest keeps going and going.");
        System.out.println("You can keep going 'east' or go back 'west'.");
        input.type("east forest");
    }

    public void center() {
        command.clearConsole();
        art.forest();
        System.out.println("You arrive to the place your journey begun.");
        System.out.println("There are two paths you can take. One to the 'north' and one to the 'east'.");
        input.type("center");
    }
}