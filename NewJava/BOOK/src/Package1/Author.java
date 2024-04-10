package Package1;

public class Author {
    private String authorId;
    private String authorName;
    private String contactNumber;
    private String emailId;
    private String bookCategory;

    public Author(String authorId, String authorName, String contactNumber, String emailId, String bookCategory) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.bookCategory = bookCategory;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getBookCategory() {
        return bookCategory;
    }
}
