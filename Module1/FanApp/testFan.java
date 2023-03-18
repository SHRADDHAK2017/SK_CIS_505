
public class testFan{

public static void main (String[] args){
//Instance 1- Fan1 with default values for speed, radius and fan color.
Fan fan1 = new Fan();
fan1.setSpeed(Fan.stopped);
fan1.setRadius(6);
fan1.setColor("white");
fan1.turnOff();
System.out.println(fan1.toString());

//Instance 2- Fan2 with Radius =8. Blue color and speed set to 2.
Fan fan2 = new Fan();
fan2.setSpeed(Fan.slow);
fan2.setRadius(8);
fan2.setColor("Blue");
fan1.turnOn();
fan2.increaseSpeed();
System.out.println(fan2.toString());


}

}