package Package1;

public class Publisher {
    private String publisherId;
    private String publisherName;
    private String publisherCity;
    private int rating;

    public Publisher(String publisherId, String publisherName, String publisherCity, int rating) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherCity = publisherCity;
        this.rating = rating;
    }

    public String getPublisherName() {
        return publisherName;
    }
}
