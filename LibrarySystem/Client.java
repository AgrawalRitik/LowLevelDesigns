

public class Client {
    public static void main(String[]args)
    {
        LibPerson person1 = new LibPerson();
        LibPerson person2 = new LibPerson();
        LibPerson person3 = new LibPerson();
        LibPerson person4 = new LibPerson();


        Library library = new Library();

        LibraryAgent libraryAgent = new LibraryAgent("Harish", library);

        library.setLibraryAgent(libraryAgent);
       
        //History
        Book book1 = new Book("History123","Spectururm","400","History");
        Book book2 = new Book("History124","Spectururm","400","History");
        Book book3 = new Book("History125","Spectururm","400","History");
        Book book4 = new Book("History126","StoneAge","400","History");
        Book book5 = new Book("History127","StoneAge","400","History");
        Book book6 = new Book("History128","StoneAge","400","History");
        Book book7 = new Book("History129","Medieval","400","History");


        //Geography
        Book book8 = new Book("Geo149","Land","400","Geography");
        Book book9 = new Book("Geo139","Crust","400","Geography");
        Book book10 = new Book("Geo129","Glacier","400","Geography");
        Book book11 = new Book("Geo119","Landforms","400","Geography");


        


        //Adding books into library;
        libraryAgent.addBooks(book11);
        libraryAgent.addBooks(book10);
        libraryAgent.addBooks(book9);
        libraryAgent.addBooks(book8);
        libraryAgent.addBooks(book7);
        libraryAgent.addBooks(book6);
        libraryAgent.addBooks(book5);
        libraryAgent.addBooks(book4);
        libraryAgent.addBooks(book3);
        libraryAgent.addBooks(book2);
        libraryAgent.addBooks(book1);

     


        person1.requestIssueBook(library, "Spectururm");
         person1.requestIssueBook(library, "Spectururm");
         person1.requestIssueBook(library,"Crust");
         person1.requestIssueBook(library,"Landforms");  //should give message "LIMIT REACHED";
         person2.requestIssueBook(library,"Crust");  //Should give message "Already Issued";
         person3.requestIssueBook(library,"Glacier");
        person2.requestIssueBook(library,"Medieval");
         person2.requestReturnBook(library, book7);
         person3.requestIssueBook(library,"Medieval");






        

    }
}
