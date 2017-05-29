public class HumanPowerCycles {

	    public int gearNum = 0, wheelNum= 0;

	 int currentGear;

      public String color, name;

	public int currentSpeed =0 ;

      

	public HumanPowerCycles(int numberofwheel,int numberofgear,String Name,String Color, int Speed){

		wheelNum = numberofwheel;

		gearNum = numberofgear;

		color = Color;

		name= Name;
currentSpeed  = Speed;
	}
	
	public int SetCurrentGear(int gear){


			currentGear = gear;
return gear;
	}
	 public void setCurrentSpeed(int increment){

	        currentSpeed = increment;

	    }

public int getGear(){

    return currentGear;

}



	public int GetCurrentSpeed(){

		return currentSpeed ;

	}
	 public String toString(){

	        return("Number of wheels: " + wheelNum + " Number of gears: "+ gearNum + " Name: "+ name + " Color: " + color + " Speed: " + currentSpeed);

	    }

	



}