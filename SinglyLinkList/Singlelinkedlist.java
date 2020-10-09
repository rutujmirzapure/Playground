package ds.SinglyLinkList;

public class Singlelinkedlist {
    private Node first;



    public Singlelinkedlist() {

    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=first;
        first=newNode;

    }
    public void insertLast(int data){
        Node current =first;

        while(current.next != null ){
           current=current.next;
        }
        Node newNode = new Node();
        newNode.data=data;
        current.next=newNode;
    }
    public Node deleteNode(){
        Node temp= first;
        first=first.next;
        return temp;
    }
    public void displayList(){
        Node current = first;
        while(current != null){
            current.displayNode();
            current=current.next;
        }
    }


}
