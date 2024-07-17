class WatchShop{
static String name="watchshop";
static String username="Amulya";
static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addWatchShop(String watchName){
System.out.println("thr addWatchShop is started");
boolean isAddWatchName=false;
if(watchNames!=null){
watchNames[index]=watchName;
index++;
isAddWatchName=true;
}else{
System.out.println("the given name is not currect ,plz give valid name");
}
return isAddWatchName;
}
public static void getWatch(){
	for(String watchNames:watchNames){
		System.out.println(watchNames);
	}
	return;
}
public static boolean updatedWatchNames(String oldname ,String newName){
	System.out.println("the updatedWatchNames started");
	boolean isupdatevallue=false;
	for(int index=0;index<watchNames.length-1;index++){
		if(oldname==watchNames[index]){
			watchNames[index]=newName;
			isupdatevallue=true;
		}
	}
	if(isupdatevallue==false){
		System.out.println(oldname+"is not found");
	}
	System.out.println("the updatedWatchNames ended");
	return isupdatevallue;
}
}