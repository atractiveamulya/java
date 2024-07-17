class AirConditioner{
static boolean isConnected=false;
static int currenttemperature=3;
static int mintemperature;
static int maxtemperature=6;

public static boolean onOroff(){
			System.out.println("onOroff is started");
isConnected=(isConnected==false)  ? true:false;

System.out.println("onOroff is ended");
return isConnected;
}	
public static void increaseTemperature(){
	System.out.println("the increaseTemperature started");
	if (isConnected==true){
	    if(currenttemperature<= maxtemperature){
		currenttemperature=currenttemperature+1;
		System.out.println("the increaseTempereture is:"+currenttemperature);
	    }else{
              System.out.println("the maxTempereture is reached..");
	    }
      System.out.println("the AirConditioner is on");
	 
	}
	else{
	System.out.println("increaseTemperature ended");
       return;
}	
}
	
public static void decreaseTemperature(){
     System.out.println("the decreaseTemperature started");
	if (isConnected==true){
	    if(currenttemperature> mintemperature){
		currenttemperature=currenttemperature-1;
		System.out.println("the decrease Tempereture is:"+currenttemperature);
	    }else{
              System.out.println("the min Tempereture is reached..");
	    }
      System.out.println("the AirConditioner is on");
	 
	}
	System.out.println("dicrease Temperature ended");
       return;
}	
public static void getDetail(){
	System.out.println("getDetail is started");
String name="samsong";
double price=79347.00;
boolean isworking=true;
System.out.println("the name of the product is:"+name);
System.out.println("the product price is:"+price);
System.out.println(" is product working:"+isworking);

System.out.println("getDetail is ended");

return;
}
}