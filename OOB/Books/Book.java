package OOB.Books;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {

    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private CoverType coverType;

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
            BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "\nBook :\t{ " +
                "\n\t  id : " + id +
                ",\n\t  name : '" + name + "'" +
                ",\n\t  authors : " + Arrays.toString(authors) +
                ",\n\t  publisher : " + publisher +
                ",\n\t  publishingYear : " + publishingYear +
                ",\n\t  amountOfPages : " + amountOfPages +
                ",\n\t  price : " + price +
                ",\n\t  coverType : " + coverType +
                "\n\t}\n";
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYearPublished() {
        return publishingYear;
    }

}
