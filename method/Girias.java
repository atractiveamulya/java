class Girias{
static String name="Giriasshop";
static String userName="Dalini";
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createhomeAppliances(String homeAppliance){
 boolean ishomeAppliances=false;
 if(homeAppliances!=null){
 homeAppliances[index]=homeAppliance;
 index++;
 ishomeAppliances=true;
 }else{
 
 System.out.println("the given name is not home appliances name ,give currect name");
 }
 return ishomeAppliances;
 
 }
 public static void gethomeAppliances(){
	 for(String homeAppliances: homeAppliances){
		 System.out.println(homeAppliances);
	 }
	 return;
 }
public static boolean updateHomeAppliances(String oldName,String newName){
	System.out.println("the update homeAppliance started");
	boolean isupdateHomeAppliances=false;
	for(int index=0;index<homeAppliances.length-1;index++){
		if(oldName==homeAppliances[index]){
			homeAppliances[index]=newName;
			isupdateHomeAppliances=true;
		}
	}
	if(isupdateHomeAppliances==false){
		System.out.println(oldName+"not fount");
	}
	System.out.println("the updateHomeAppliances is ended");
	return isupdateHomeAppliances;
}


}