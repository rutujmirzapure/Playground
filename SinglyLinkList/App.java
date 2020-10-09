package ds.SinglyLinkList;

public class App {
    public static void main(String[] args) {
        Singlelinkedlist mylist = new Singlelinkedlist();
        mylist.insertFirst(10);
        mylist.insertFirst(30);
        mylist.insertFirst(70);
        mylist.insertFirst(20);
        mylist.insertLast(77);
        mylist.displayList();

    }
}
