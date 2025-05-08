package linkedList;

public class Learn {
    int data;
    Learn next;

    public Learn(int data)
    {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Learn firstNode = new Learn(10);
        Learn secondNode = new Learn(12);
        Learn thirdNode = new Learn(20);
        Learn forthNode = new Learn(5);
        Learn fifthNode = new Learn(45);

        //linking nodes together
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        Learn currentNode = firstNode;

        //printing linked list
        while ( currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }    
}
