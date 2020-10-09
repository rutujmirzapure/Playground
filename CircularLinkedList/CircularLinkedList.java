package ds.CircularLinkedList;

public class CircularLinkedList {
    public Node First;
    public Node Last;

    public CircularLinkedList(){
        First=null;
        Last=null;
    }
    public boolean isEmpty(){
        return (First == null);
    }
    public void insertFirst(int data){
        Node newNode =new Node();
        newNode.data=data;

        if(isEmpty()){
            Last = newNode;
        }
        newNode.next=First;
        First=newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            First=newNode;
        }else{
            Last.next=newNode;
            Last=newNode;
        }
    }
    public int deletefirst(){
        int temp=First.data;
        if(First.next==null){
            Last=null;
        }
        First=First.next;
        return temp;
    }

    public void displayList(){
        Node current = First;
        while(current != null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }
}
