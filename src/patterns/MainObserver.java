package patterns;

public class MainObserver {

    public static void main(String[] args) {
        Observable observable1 = new Observable(); // KingPost woodworks.

        Observer obs1 = new Observer("Christian");
        Observer obs2 = new Observer("Martin");
        Observer obs3 = new Observer("Max");
        Observer obs4 = new Observer("Sidney");

        observable1.subscribe(obs1);
        observable1.subscribe(obs2);
        observable1.subscribe(obs4);

        observable1.postVideo("Making a chair");
    }
}
