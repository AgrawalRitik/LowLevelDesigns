import java.util.*;
public class LibPerson {
    

  public  HashSet<String>bookList= new HashSet<>();
//   public LibPerson()
//   {
    
//   }
    
    
    public void requestIssueBook(Library library,String bookName)
    {
         library.agent.issueBook(this,bookName);  
    }

    public void requestReturnBook(Library library,Book book)
    {
        library.agent.returnBook(this,book);
    }

    public HashSet<String> getBookList()
    {
        return bookList;
    }
  
    public void goToShelf(String subject)
    {
       System.out.println("Go to shelf of "+subject);
    }

  



}
