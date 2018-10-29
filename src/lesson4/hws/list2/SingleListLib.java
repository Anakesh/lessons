package lesson4.hws.list2;

import java.util.Arrays;

public class SingleListLib {
    public static Node gen(int... values){
        return (values.length == 0) ? null : new Node(values[0], gen(Arrays.copyOfRange(values, 1, values.length)));
    }

    public static String toString(Node tail){
        return (tail == null) ? "null" : tail.value + " -> " + toString(tail.next);
    }

    public static Node add(Node tail, int pos, int num){
        Node tailNew = null;
        for (int i = 1; i < pos; i++){
            tailNew = new Node(tail.value, tailNew);
            tail = tail.next;
        }

        tail = new Node(num, tail);

        while (tailNew != null){
            tail = new Node(tailNew.value, tail);
            tailNew = tailNew.next;
        }
        return tail;
    }

    public static Node remove(Node tail, int pos){
        Node tailNew = null;
        for (int i = 1; i < pos; i++){
            tailNew = new Node(tail.value, tailNew);
            tail = tail.next;
        }

        tail = tail.next;
        while (tailNew != null){
            tail = new Node(tailNew.value, tail);
            tailNew = tailNew.next;
        }
        return tail;
    }
}
