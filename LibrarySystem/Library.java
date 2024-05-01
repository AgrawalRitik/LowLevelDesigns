import java.util.*;
public class Library implements LibraryInterface {
    
      int shelf;

 List<String>subjectList  = new ArrayList<>();
 LibraryAgent agent;
 LibraryController controller;
 HashMap<String,List<Shelf>> allotShelfMap= new HashMap<>();             

    public void addSubjects(String subject)
    {  
             subjectList.add(subject);
    }

    public void allotShelf(String subject)
    {
         if(!allotShelfMap.containsKey(subject))
         {
            allotShelfMap.put(subject,new ArrayList<>());
         }

          List<Shelf>sf = allotShelfMap.get(subject);
          sf.add(new Shelf());
          
          allotShelfMap.put(subject,sf);
    }

    public void setLibraryAgent(LibraryAgent agent)
    {
        this.agent = agent;
    }


    public void setLibraryController(LibraryController controller)
    {
        this.controller  = controller;
    }

    


}
