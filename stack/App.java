package ds.stack;

public class App {
    public static void main(String[] args) {
        String str="hello";
        int strlength=str.length();
        stack thestack = new stack(strlength);
        for (int i = 0; i < strlength; i++) {
            thestack.push(str.charAt(i));
        }




        while(!thestack.isEmpty()){
            char value =thestack.pop();
            System.out.print(value);
        }


    }
}
