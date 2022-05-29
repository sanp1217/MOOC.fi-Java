
public class Book {
    String title;
    int pages, publicationYear;
    
    public Book(String title, int pages, int publicationYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPubYear(){
        return this.publicationYear;
    }
    
    public String toString(){
        return (this.title + ", " + this.pages + " pages, " + this.publicationYear);
    }
}
