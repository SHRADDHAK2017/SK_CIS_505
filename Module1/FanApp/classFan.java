
class Fan{
// Four constants named STOPPED, SLOW, MEDIUM, and FAST.
// The constants are to hold the values of 0, 1, 2, and 3 respectively.
public static int stopped=0;
public static int slow=1;
public static int medium=2;
public static int fast=3;


// A private field named speed that holds one of the constant values with the default being STOPPED.
private int speed = stopped;
// A private Boolean field titled on that specifies whether the fan is off.
private boolean off= false;
   // A private field named radius that holds the radius of the fan with a default value of 6.
private double radius = 6;
   // A String field that holds the color, with the default being white.
private String color = "White";

 // A no-argument constructor that sets all fields with a default value.
public Fan(){

}
//Method created to increase speed
public void increaseSpeed(){

if(speed == stopped)
   speed = slow;
	
else if (speed == slow)
	speed = medium;

else if (speed == medium)
         speed = fast;

 }
////Method created to decrease speed
public void decreaseSpeed(){

if (speed == fast)
    speed = medium;

else if (speed == medium)
	speed = slow;
else if (speed == slow)
	speed = stopped;


}
// // Setter and getter methods for all  fields.
public int getSpeed(){

return speed;

}

public void setSpeed(int newSpeed){

speed = newSpeed;

}

public boolean isOff(){

return off;
}

public void turnOff(){

off = true;
}

public void turnOn(){

off = false;
}   

public double getRadius(){

return radius;
}

public void setRadius(double newRadius){

radius = newRadius;
}

public String getColor(){

return color;
}

public void setColor(String newColor){

    color = newColor;
}

//Override using toString method to get return description of the fan. 

public String toString(){

 
if (isOff())

return " The fan is "  + color + " with a radius of "  + radius + " and the fan is off ";

else 

return " The fan speed is set to "  + speed + " with a color of " + color + " and radius of " + radius;


}


}