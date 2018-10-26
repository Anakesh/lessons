package lesson4.hws.list2;

public class SingleList {
    public static void main(String[] args) {
        Node tail = SingleListLib.gen(5, 2, 3, 4, 7);
        System.out.println(SingleListLib.toString(tail));
//        System.out.println(SingleListLib.toString(SingleListLib.add(tail, 3, 9)));
//        System.out.println(SingleListLib.toString(SingleListLib.remove(tail, 3)));

    }
}
