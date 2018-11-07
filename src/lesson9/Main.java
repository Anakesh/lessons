package lesson9;

import lesson9.classes.Book;
import lesson9.classes.Car;
import lesson9.storage.Storage;

public class Main {

    public static void main(String[] args) {
        Book tails = new Book("Сказки", 500);
        Book flowers = new Book("Цветы", 600);

        Car car = new Car("green", 1000);

        Storage bookStorage = new Storage();
        bookStorage.add(tails);
        bookStorage.add(flowers);
        bookStorage.add(car);

        // ClassCastException возникает на моменте исполнения
        Book bookFromStorage = (Book) bookStorage.get(2);
        System.out.println(bookFromStorage);

    }
}
