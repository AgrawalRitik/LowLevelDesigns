public class Book {
    
   public String Id;
   public  String name;
   public String pages;
  public   String subject;
   public  String status = "NonIssued";
  public   String date;

    public Book(String Id, String name, String pages, String subject)
    {
        this.Id = Id;
        this.name  = name;
        this.pages = pages;
        this.subject = subject;
    }

    public String getId()
    {
        return Id;
    }

    public void  setStatus(String issue)
    {
         this.status = issue;
    }

    public String getStatus()
    {
        return status;
    }

    public void setIssueDate(String date)
    {
        this.date = date;
    }
}
