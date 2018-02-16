package patterns;

public class Observer {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    public void notified(String video) {
        System.out.println(name + " was notified about " + video);
    }
}
