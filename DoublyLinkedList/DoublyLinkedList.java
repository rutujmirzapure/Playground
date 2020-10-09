package ds.DoublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private  Node last;

    public DoublyLinkedList(){
        this.first=null;
        this.last=null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(int data){

        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty() ){
            last=newNode;
        }else{
            first.previous = newNode;
        }
        newNode.next =first;
        this.first=newNode;
    }
}
