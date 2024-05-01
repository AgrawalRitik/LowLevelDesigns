public class LibraryAgent {
    
    String name;
    Library  library;
    

    public LibraryAgent(String name, Library library)
    {
        this.name = name;
        this.library  = library;
    }

    public void issueBook(LibPerson person, String bookName)
    {
        LibraryController.issueBook(person,bookName);
    }
    public void returnBook(LibPerson person, Book book)
    {
          LibraryController.returnBook(person,book);
    }
    public void addBooks(Book book)
    { 
       LibraryController.addBooks(book);
    }
}
