class Car{
    String carModel;
}


class ComputerCourse {
    
    String name;
    
    ComputerCourse(String cName){
        this.name = cName;
    }
    
}

public class DemoConstructor {
    
    public static void main (String args[]){
        
        Car cc1 = new Car();     //constructor with out argument
        ComputerCourse cc2 = new ComputerCourse("Java"); //constructor with  argument
    }
}
