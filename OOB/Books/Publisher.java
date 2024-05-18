package OOB.Books;

public class Publisher {
    private int id;
    private String publisherName;

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + publisherName + "\'}";
    }

    public Object getId() {
        return id;
    }

    public Object getName() {
        return publisherName;
    };

}
