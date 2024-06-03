public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Mutt", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

    }

    @Override
    public void moves(String speed) {
        super.moves(speed);
        //System.out.println("Dogs walks, runs and wags tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("Woof ");
        System.out.println();
    }

    private void walk() {
        System.out.println("Dog is walking ");
        System.out.println();
    }

    private void run() {
        System.out.println("Dog is running ");
        System.out.println();
    }

    private void wagTail() {
        System.out.println("Wagging tail ");
        System.out.println();
    }
}
