package ds.stack;

public class stack {

    private int maxsize;
    private char[] stackArray;
    private int top;


     stack(int maxsize) {
        this.maxsize = maxsize;
        this.stackArray = new char[maxsize];
        this.top=-1;

    }
    public void push(char j ){
         if(isFull()){
             System.out.println("the stack is full");

         }else{
             top++;
             stackArray[top]=j;
         }

    }
    public char pop(){
        if (isEmpty()) {
            System.out.println("stack is empty");
            return  0;

        }else{
            int old_top=top;
            top--;
            return stackArray[old_top];
        }

    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return(top ==-1);
    }
    public boolean isFull(){
        return (maxsize-1==top);
    }

}
