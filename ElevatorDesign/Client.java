



public class Client {
    
    public static void main(String []args)
    {
        Elevator elevator = new Elevator(200, 0, 0);
        ElevatorController controller= new ElevatorController(elevator);
    

        //Person
        Person person1 = new Person(4, 10,40);
        Person person2 = new Person(2,6,70);
        Person person3 = new Person(3,9,80);
        Person person4 = new Person(2,7,80);



        OpenButton openButton = new OpenButton(controller);
        

        //Floorbuttons
        FloorButton floorButton1 = new FloorButton(1, controller);
        FloorButton floorButton2  = new FloorButton(2, controller);
        FloorButton floorButton3  = new FloorButton(3, controller);
        FloorButton floorButton4  = new FloorButton(4, controller);
        FloorButton floorButton5  = new FloorButton(5, controller);
        FloorButton floorButton6  = new FloorButton(6, controller);
        FloorButton floorButton7  = new FloorButton(7, controller);
        FloorButton floorButton8  = new FloorButton(8, controller);
        FloorButton floorButton9  = new FloorButton(9, controller);
        FloorButton floorButton10  = new FloorButton(10, controller);


       //perosn1 press open button.
       //elevator reaches firstly current floor;
       //elevator adds, 
       //Person1 presses destined floor;


       openButton.requestToFloor(person1,elevator);
       openButton.requestToFloor(person2,elevator);
       openButton.requestToFloor(person3,elevator);
       openButton.requestToFloor(person4,elevator);

        
       
       


     }
}
