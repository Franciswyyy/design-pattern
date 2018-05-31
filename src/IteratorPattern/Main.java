package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("one book"));
        bookShelf.appendBook(new Book("two book"));
        bookShelf.appendBook(new Book("three book"));
        bookShelf.appendBook(new Book("four book"));
        //bookShelf.appendBook(new Book("1our book"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
