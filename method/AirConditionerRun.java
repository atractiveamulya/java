class AirConditionerRun{

public static void main(String [] args){
System.out.println("the main started");
 AirConditioner.getDetail();
 AirConditioner.onOroff();
 AirConditioner.onOroff();
 AirConditioner.onOroff();
 AirConditioner.onOroff();

AirConditioner.decreaseTemperature();
if(isConnected==true)
	AirConditioner.	increaseTemperature();
else
    System.out.println();

 System.out.println("the main Ended");
 return;
 }
}