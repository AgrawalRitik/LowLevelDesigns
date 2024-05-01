
import java.util.*;

public class ElevatorController {
    
    Elevator elevator;

    private PriorityQueue<Integer>upQueue = new PriorityQueue<>();               //for direction purpose  we need to make 2 queues. and put request according to elevator current requests.
    private PriorityQueue<Integer>downQueue= new PriorityQueue<>((a,b)->b-a);

    public ElevatorController(Elevator elevator)
    {
        this.elevator = elevator;
        
    }

    public  void handleRequest(int floor, boolean goingUp)
    {
        if(goingUp)
        {
            upQueue.offer(floor);
            System.out.println("Submitting request for upQueue");
        }
        else 
        {
            downQueue.offer(floor);
            System.out.println("Submitting request for DownQueue");
        }

        moveElevator(); 
    }

    public void moveElevator()
    {
        //Logic
        if(elevator.getState() ==0)
        {
            if(!upQueue.isEmpty())
            {  System.out.println("UpQueue"+upQueue.peek());
                moveToFloor(upQueue.peek());
            }
            else if(!downQueue.isEmpty())
            {   
                System.out.println("DownQueue"+downQueue.peek());
                 moveToFloor(downQueue.peek());
            }
        }
        else if(elevator.getState()==1)
        {
           
           if(upQueue.isEmpty() && !downQueue.isEmpty())
            {   
                System.out.println("Moving down with downside" + downQueue.peek());
                moveToFloor( downQueue.poll());
                elevator.setState(-1);
            }
           else  if(!upQueue.isEmpty() && upQueue.peek()>elevator.getCurrentFloor())
            {   
                System.out.println("Moving UP" +upQueue.peek());
                moveToFloor(upQueue.poll());
            }

        }

        else if(elevator.getState()== -1)
        {
           
              if(downQueue.isEmpty() && !upQueue.isEmpty())
             {  
                System.out.println("Moving up" + upQueue.peek());
                moveToFloor(upQueue.poll());
                elevator.setState(1);
             }
             if(!downQueue.isEmpty() && downQueue.peek()<elevator.getCurrentFloor())
             {
                System.out.println("Moving Down" +downQueue.peek());
                moveToFloor(downQueue.poll());
            
             }

        }
    }



    public void moveToFloor(int floor)
    {
        if(floor>elevator.currentFloor)
        {
            elevator.moveUp();
            System.out.println("Elevator is moving Up ");
        }
        else if(floor<elevator.currentFloor)
        {
            elevator.moveDown();

            System.out.println("Elevator is moving down ");
        }

        if(floor==elevator.currentFloor)
        {
            System.out.println("Elevator door opens. "+elevator.getCurrentFloor());
        }
    }
     

}
