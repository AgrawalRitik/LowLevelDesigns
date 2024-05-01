

public class OpenButton  {
    
    int floor;
    ElevatorController controller;

    public OpenButton(ElevatorController  controller)
    {
        this.controller = controller;
    }
    public void  requestToFloor(Person person,Elevator elevator)
    {
          this.floor = person.getCurrentFloor();
          int elevatorCurrentFloor = elevator.getCurrentFloor();

          boolean goingUp = false;

          if(elevatorCurrentFloor>floor)
        {  
            System.out.println("Elevator is at openButton and submitting request to controller "+floor+" at Elevator Current Floor "+elevatorCurrentFloor);
            controller.handleRequest(floor,false); 
         }  

          else if(elevatorCurrentFloor< floor)
          {  
            System.out.println("Elevator is at openButton and submitting request to controller "+floor+" "+" at Elveator Current floor "+elevatorCurrentFloor);
            controller.handleRequest(floor, true);
          }

    }
}
