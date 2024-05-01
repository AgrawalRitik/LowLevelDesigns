



public class FloorButton{
    
     int floor;
     ElevatorController controller;
     public FloorButton(int floor,ElevatorController  controller)
     {   this.floor = floor;
         this.controller = controller;
     }
    public void  requestToFloor(Person person,Elevator elevator)
    {
        
          int elevatorFloor = elevator.getCurrentFloor();

          if(elevatorFloor>floor)
          {
            controller.handleRequest(elevatorFloor, false);
          }
          else if(elevatorFloor<floor)
          {
            controller.handleRequest(elevatorFloor, true);
          }

    }
}
