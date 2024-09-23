public class Health {
    private int number;

    public Health(int left) {
        this.number = left;
    }
    
    public void isAlive() {
        if (number<=0) {
            System.out.println("You have died. Maybe next time you'll do better.");
            System.exit(0);
        } else {
            System.out.println("You have " + number + " HP left.");
        }
    }

    public void loseLife(int lost) {
        this.number -= lost;
        isAlive();
    }
}
