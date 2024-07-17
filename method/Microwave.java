class Microwave{
static boolean isConnected=false;
static int currentTemp=5;
static int maxTem=10;
static int minTem;
public static void onORoff(){
System.out.println("onORoff is started");
if(isConnected==false){
 isConnected=true;
System.out.println("the Microwave is on");
}else if(isConnected==true){
isConnected=false;
System.out.println("the Microwave is off");
}
System.out.println("the Microwave is ended");
return;
}
public static void increasesTemp(){
	System.out.println("the increasesTemp is started");
	if(isConnected==true){
		if(currentTemp<=maxTem){
			currentTemp=currentTemp+1;
			System.out.println("the increases Temperature is:"+currentTemp);
		}else{
			System.out.println("the temerature will crosed");
		
	    }
	 System.out.println("could you on the microwave");
	}
System.out.println("the increasesTemp is ended");
return;
}
public static void decreasesTemp(){
	System.out.println("the dereasesTemp is started");
	if(isConnected==true){
		if(currentTemp<=maxTem){
			currentTemp=currentTemp-1;
			System.out.println("the decreases Temperature is:"+currentTemp);
		}else{
			System.out.println("the temerature will crosed");
		
	    }
	 System.out.println("could you on the microwave");
	}
System.out.println("the decreases Temp is ended");
return;
}
public static void getdetail(){
	System.out.println("the detail of the product started");
	String name="microwave";
	int id=34;
	double price=2000.00;
	System.out.println("the name of the product is "+name);
	System.out.println("the id of the product is :"+id);
	System.out.println("the price of the product is:"+price);
	System.out.println("the detail of the product is ended");
}
}