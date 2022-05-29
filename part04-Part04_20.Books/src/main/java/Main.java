import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String title;
        int pages, pubYear;
        
        while(true){
            System.out.print("Title: ");
            title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            pages = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Publication Year: ");
            pubYear = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        String response;
        System.out.println("What information will be printed? ");
        response = scanner.nextLine();
        
        if(response.contains("everything")){
            for(Book book: books){
                System.out.println(book.toString());
            }
        }
        else if(response.contains("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
        

    }
}
