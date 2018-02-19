package LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        Node n1 = new Node("Veronique");
        Node n2 = new Node("Ane");
        Node n3 = new Node("Martine");
        Node n4 = new Node("Philip");
        Node n5 = new Node("Sebastian");
        Node n6 = new Node("Morten");
        Node n7 = new Node("Abdal");
        Node n8 = new Node("Jonas");

        myList.setFirstNode(n1);
        myList.addNode(n2);
        myList.addNode(n3);
        myList.addNode(n4);
        myList.addNode(n5);
        myList.addNode(n6);
        myList.addNode(n7);
        myList.addNode(n8);
        // Tilføj n2 - n8 ved at kalde addNode

        myList.printAll();

        try {
            myList.deleteNode(87);
        }
        catch(MyLinkedListException e) {
            System.out.println("Der skete noget dårligt, men vi kører bare videre, øv bøv!");
        }

        System.out.println("-----------------------------");
        myList.printAll();
    }
}
