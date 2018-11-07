package lesson9;

import lesson9.classes.Book;
import lesson9.classes.Car;
import lesson9.classes.ChildBook;
import lesson9.storage.Storage;

public class Main {

    public static void main(String[] args) {
        Book tails = new Book("Сказки", 500);
        Book flowers = new Book("Цветы", 600);

        Car car = new Car("green", 1000);

        Storage<Book> bookStorage = new Storage<>();
        bookStorage.add(tails);
        bookStorage.add(flowers);
//        bookStorage.add(car); //

        Book bookFromStorage = bookStorage.get(1);
        System.out.println(bookFromStorage);

        Storage<ChildBook> childBookStorage = new Storage<>();
        ChildBook bears = new ChildBook("Маша и медведи",
                200, "pic");
        ChildBook coloring = new ChildBook("Coloring",
                100, "pic");
        childBookStorage.add(bears);

//        Book firstBook = getFirstBook(bookStorage);
//        Book firstBook = getFirstBook(childBookStorage);
        Book firstBook = getFirstBook(childBookStorage); // Storage<ChildBook>


    }
    // ChildBook
//    public static Book getFirstBook(Storage<Book> storage){
//        return storage.get(0);
//    }
    // extends                      //Storage<ChildBook> storage
    public static Book getFirstBook(Storage<? extends Book> storage){
//        ChildBook b = new ChildBook("book", 10, "pic");
//        storage.add(b);
        return storage.get(0);
    }

    // super
    public static void addToStorage(Storage<? super Book> storage){
        Book book = new Book("book", 10);
        storage.add(book);
//        Book b = storage.get(0);
        Object b = storage.get(0);
        System.out.println(b);
    }

//    public void someVoid(Storage<String> storage) {}
//    public void someVoid(Storage<Integer> storage) {}
//        T someType = new T();
//     public static T staticVoid(){}

//    public static void storage(Storage<?> storage){
//        Book book = new Book("book", 10);
//        storage.add(book);
//        storage.add(null);
//
//        Book b1 = storage.get(0);
//        Object b = storage.get(0);
//        System.out.println(b);
//    }




}
