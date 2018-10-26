package lesson4.hws.list3;

public class Node {
    private int i;
    private Node node;

    public Node(int i)
    {
        this.i = i;
        this.node = null;
    }

    public void add(int i) {
        if (this.node == null) {
            this.node = new Node(i);
        }
        else {
            this.node.add(i);
        }
    }

    public void removeByValue(int value) {
        if (this.i == value) {
            this.i = this.node.getI();
            this.node = this.node.getNode();
        }
    }

    public void print() {
        System.out.print(this.i + " ");
        if (this.node != null) {
            this.node.print();
        }
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Node getNode() {
        return this.node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
