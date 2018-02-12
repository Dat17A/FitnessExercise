package LinkedList;

public class LinkedList {
    private Node firstNode;

    public void setFirstNode(Node jensPeter) {
        this.firstNode = jensPeter;
    }

    public void printAll() {
//        System.out.println(firstNode.getName());
        firstNode.printAll();

        // printe hele listen, ikke kun Veronique
        /*
        Node n = firstNode;
        boolean nullValue = false;
        while (!nullValue) {
            if (n == null) {
                nullValue = true;
            }
            System.out.println(n);
            if (n.getNext() != null) {
                n = n.getNext();
            }
            else {
                nullValue = true;
            }
        }
        */
    }

    public void addNodeLast(Node n) {
        // Tilføj den nye node sidst i listen..

    }
    public void deleteNode(int i) {
        // Slet node på i's plads
    }


    public void addNode(Node n) {
        // Tilføj n til linked list'en.
        n.setNext(firstNode); // 1:
        firstNode = n; // 2
    }


}
