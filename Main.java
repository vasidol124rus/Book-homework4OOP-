public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>("Изучаем Java");
        Book<String> book2 = new Book<>("Java эффективное програмирование");

        library.addBook(book1);
        library.addBook(book2);

        library.issueBook(1);
        library.issueBook(2);

        library.printIssuedBooks();
    }
}