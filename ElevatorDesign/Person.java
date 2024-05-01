

public class Person {

    int currentFloor;
    int destinedFloor;
    int weight;

    public Person(int currentFloor ,int destinedFloor,int weight)
    {
        this.currentFloor = currentFloor;
        this.destinedFloor = destinedFloor;
        this.weight = weight;
        
    }

    public int getWeight()
   {
    return weight;
   }

    
    public void setCurrentFloor(int currentFloor)
    {
        this.currentFloor = currentFloor;
    }

    public void setDestinedFloor(int destinedFloor)
    {
        this.destinedFloor = destinedFloor;
    }

    public int getCurrentFloor()
    {
        return  currentFloor;
    }

    public int getDestinedFloor()
    {
        return destinedFloor;
    }
}
