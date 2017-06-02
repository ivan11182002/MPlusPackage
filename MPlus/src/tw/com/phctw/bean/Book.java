package tw.com.phctw.bean;

public class Book {

    private String isbn;
    private String title;
    private Integer editionNumber;
    private String copyright;
    private String author;
    private String publisher;
    private Double price;

    public void setIsbn( String isbn ) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setEditionNumber( Integer editionNumber ) {
        this.editionNumber = editionNumber;
    }

    public Integer getEditionNumber() {
        return editionNumber;
    }

    public void setCopyright( String copyright ) {
        this.copyright = copyright;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setAuthor( String author ) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher( String publisher ) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
