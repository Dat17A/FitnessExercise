package LinkedList;

public class Node {
    private String name;
    private Node next;

    public void printAll() {
        System.out.println(name);
        if (next != null) {
            next.printAll();
        }
    }

    @Override
    public String toString(){
        return name;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node n) {
        this.next = n;
    }

    public Node(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
