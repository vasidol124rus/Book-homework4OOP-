import java.util.HashMap;

class Library {
    private HashMap<LibraryCard<Integer, Book<String>>, Boolean> issuedBooks = new HashMap<>();

    public void addBook(Book<String> book) {
        LibraryCard<Integer, Book<String>> card = new LibraryCard<>(issuedBooks.size() + 1, book);
        issuedBooks.put(card, false);
    }

    public void issueBook(int cardNumber) {
        for (LibraryCard<Integer, Book<String>> card : issuedBooks.keySet()) {
            if (card.getCardNumber() == cardNumber) {
                issuedBooks.put(card, true);
                break;
            }
        }
    }

    public void printIssuedBooks() {
        for (LibraryCard<Integer, Book<String>> card : issuedBooks.keySet()) {
            if (issuedBooks.get(card)) {
                System.out.println("Номер карточки: " + card.getCardNumber());
                System.out.println("Название книги: " + card.getBookInfo().getTitle());
                System.out.println();
            }
        }
    }
}