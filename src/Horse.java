public class Horse extends Animal {
    // Attributes
    // Encapsulation -
    private String color;
    private double height; // meter
    private String race;


    public void jump() {
        System.out.println("Hurray I am jumping. " +
                "I am " + this.height + " meter tall.");
    }

    public String getName() {
        System.out.println("I am a horse");
        return "";
    }
    //public Horse() {}

    // Constructor - no return type, same name as class
    public Horse(String name, String color, double height, String race) {
        super(name);
        setColor(color);
        setHeight(height);
        setRace(race);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Set method and if sentence
    public void setColor(String color){
        if (color.equalsIgnoreCase("white")
                || color.equalsIgnoreCase("black")
                || color.equalsIgnoreCase("brown")) {
            this.color = color;
        }
        else {
            System.out.println("Invalid color");
        }
    }

    // A method that returns color
    public String getColor() {
        return color;
    }

}
