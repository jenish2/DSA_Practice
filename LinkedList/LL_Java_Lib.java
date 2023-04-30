package LinkedList;

import java.util.*;;

public class LL_Java_Lib {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        
        ll.addFirst("Great");
        ll.addFirst("The");
        ll.addLast("Champion");

        System.out.println(ll);
        
        ll.remove(2);
        
        System.out.println(ll);

        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i) + "-->");
        }
        System.out.println("Null");
    }
}
