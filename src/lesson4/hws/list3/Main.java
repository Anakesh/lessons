package lesson4.hws.list3;

public class Main
{
    public static void main(String[] args) {
        Node node = new Node(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);

        node.print();
        node.removeByValue(3);
        System.out.println();
        node.print();
        node.removeByValue(5);
        System.out.println();
        node.print();
    }
}
