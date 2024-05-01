

public class Elevator
{
    int capacity;
 int state;        //0 idle, //1 UP  and -1 //Down

    
     int weight;
 int currentFloor;
    public Elevator(int capacity, int state,int currentFloor)
    {
           this.capacity = capacity;
           this.state = state;
           this.currentFloor = currentFloor ;
    }
    
    public  void setCurrentFloor(int cFloor)
    {
        this.currentFloor  = cFloor;
    }
    public  int  getCurrentFloor()
    {
        return currentFloor;
    }

    public  int getCapacity()
    {
        return this.capacity;
    }

    public  int getState()
    {
        return this.state;
    }

    public   void setCapacity(int cpcty)
    {
       this.capacity = cpcty;
    }

    public  void setState(int st)
     {
        this.state = st;
     }

     public  boolean addPerson(int wt)
     {
        this.weight = this.weight + wt;

        if(weight > capacity)
        {
            return false;
        }

        return true;
     }

     public void moveUp()
    {
        state = 1;
        currentFloor++;
    }

    public void moveDown()
    {
        state = -1;
        currentFloor--;
    }


    public void stop()                      //emergency.
    {
        state = 0;
    }


     



}