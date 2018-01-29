public class RunHorse {
    public static void main(String[] args) {
        System.out.println("Test");

        // Created an object of Horse
        Horse nix = new Horse("Beauty","black",
                1.69, "Wallack");

        Horse horse2 = new Horse("Usain","yellow",
                1.19, "Pony");

        Horse horse3 = new Horse("Charles Hestern","white",
                2.75, "Mustang");

        // Calling a method.
        nix.jump();
        horse2.jump();
        horse3.jump();

        horse2.setColor("brown");

        System.out.println(horse2.getColor());

        horse2.getName();
    }

}
