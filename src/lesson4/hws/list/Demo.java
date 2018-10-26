package lesson4.hws.list;


    public class Demo {
        public static void main(String[] args) {
            Storage list = new Storage();
            list.add(1);
            list.add(2);
            list.add(10);
            list.add(10);
            list.add(99);

            list.print();

            list.remove(10);
            list.print();



        }
    }

