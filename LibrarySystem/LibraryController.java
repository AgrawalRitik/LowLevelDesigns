import java.util.*;
public class LibraryController {
   
    static HashMap<String,HashSet<Book>>availableBooks = new HashMap<>();         //We search through name
   static   HashMap<String,Integer>issuedBooks = new HashMap<>();          //We search through ID
   //static HashSet<Book>avBookSet = new HashSet<>();
 
    //search facility

    public static void addBooks(Book book)
    {
         if(!availableBooks.containsKey(book.name))
         {
            availableBooks.put(book.name,new HashSet<>());
         }
         availableBooks.get(book.name).add(book);
    }
    
    public static void  issueBook(LibPerson person, String bookName)
    {
       
    
      if(person.bookList.size()>2)
      {
        
        System.out.println("Limit is reached");
      }

      else if(availableBooks.containsKey(bookName) && availableBooks.get(bookName).size()>0)
       {
        
        //Imporved logic
        List<Book> booklst = new ArrayList<>(availableBooks.get(bookName));
         Book book = booklst.get(booklst.size()-1);

         booklst.remove(booklst.size()-1);

         HashSet<Book>hset = new HashSet<>(booklst);
         availableBooks.put(bookName,hset);



        person.goToShelf(book.subject);

        person.bookList.add(book.getId());
        System.out.println("Adding in personBookList "+person.bookList.size());
       // System.out.println(person.bookList.size()+"Size of book list");
        System.out.println("Adding book to person.....");
        book.setStatus("Issued");
        book.setIssueDate("4/5/2001");
        System.out.println("Adding status and date.....");
         issuedBooks.put(book.getId(),1);
       }
      
       else
       {
        System.out.println("Book is not available");
       }
    }

    public static void returnBook(LibPerson person, Book book)
    { 
        if((issuedBooks.get(book.getId())!=null) && (person.getBookList().contains(book.getId())))
        {
            person.bookList.remove(book.getId());
            issuedBooks.remove(book.getId());
            availableBooks.get(book.name).add(book);
            book.setStatus("Non Issued");
            book.setIssueDate("null");

            System.out.println("Payment Amount from issue Date to current Date");

        }
        else
        {
            System.out.println("Book is not issued to this person");
        }
         
    }
}
