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
        // 1: Find sidste position i listen
        // 2: Indsæt n, sidst i listen

    }
    public void deleteNode(int index) {
        // 0 = første pos.

        // Slet node på i's plads

        // 1: Find positionen før den node vi vil slette
        // 2: Sæt den node som den peger på, til at være noden efter (next.next)
        // 3: Hvis vi vil slette den første node, skal dette håndteres for sig.

        if (firstNode == null) {
            System.out.println("Out of bounds");
            return;
        }


        if (index == 0) {
            firstNode = firstNode.getNext();
        }

        Node temp = firstNode;
        for (int i=0; i < index-1; i++) {
            temp = temp.getNext();

            if (temp.getNext() == null) {
                System.out.println("Index out of bounds!"); // el. kast exception
                return;
            }
        }





        temp.setNext(temp.getNext().getNext());





    }


    public void addNode(Node n) {
        // Tilføj n til linked list'en.
        n.setNext(firstNode); // 1:
        firstNode = n; // 2
    }


}
