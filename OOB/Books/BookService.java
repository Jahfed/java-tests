package OOB.Books;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public Book[] filterBooksByAuthor(Author authorToFilter, Book[] books) {
        List<Book> filteredBooksList = new ArrayList<>();

        for (Book book : books) {
            for (Author bookAuthor : book.getAuthors()) {

                if ((bookAuthor.getId() == authorToFilter.getId() &&
                        bookAuthor.getFirstName().equals(authorToFilter.getFirstName()) &&
                        bookAuthor.getLastName().equals(authorToFilter.getLastName()))) {
                    filteredBooksList.add(book);

                    break;
                }
            }
        }

        Book[] filteredBooks = new Book[filteredBooksList.size()];
        filteredBooksList.toArray(filteredBooks);

        return filteredBooks;
    }

    public Book[] filterBooksByPublisher(Publisher publisherToFilter, Book[] books) {
        List<Book> filteredBooksList = new ArrayList<>();

        for (Book book : books) {
            Publisher bookPublisher = book.getPublisher();
            if (bookPublisher.getId() == publisherToFilter.getId() &&
                    bookPublisher.getName().equals(publisherToFilter.getName())) {
                filteredBooksList.add(book);
            }
        }

        Book[] filteredBooks = new Book[filteredBooksList.size()];
        filteredBooksList.toArray(filteredBooks);

        return filteredBooks;
    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        List<Book> filteredBooksList = new ArrayList<>();

        for (Book book : books) {
            int yearPublished = book.getYearPublished();
            if (yearFromInclusively <= yearPublished) {
                filteredBooksList.add(book);
            }
        }

        Book[] filteredBooks = new Book[filteredBooksList.size()];
        filteredBooksList.toArray(filteredBooks);

        return filteredBooks;
    }
}
