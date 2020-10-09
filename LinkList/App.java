package ds.LinkList;

public class App {

    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data=10;
        Node nodeB = new Node();
        nodeB.data=20;
        Node nodeC = new Node();
        nodeC.data=30;
        Node nodeD = new Node();
        nodeD.data=40;

        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        nodeD.next=null;

        System.out.println(listlength(nodeA));
    }
    public static int  listlength(Node aNode){
        int length=0;
        Node current_node=aNode;
        while(current_node != null){

            length++;
            current_node=current_node.next;
        }
        return length;
    }
}
