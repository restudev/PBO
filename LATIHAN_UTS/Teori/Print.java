import java.sql.Date;

public class Print extends Resource{
    private String author;
    private String publisher;
    private String category;
    private int isbn;
    
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String name){
        this.author = name;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisherName){
        this.publisher = publisherName;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String categoryName){
        this.category = categoryName;
    }

    public int getISBN(){
        return isbn;
    }

    public void setISBN(int number){
        this.isbn = number;
    }

    public String dueDate(Date borrowedDate){
        super.setDueDate(borrowedDate);
        return dueDate(borrowedDate);
    }
}
