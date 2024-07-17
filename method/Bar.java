class Bar{
static String name="Manja Bar Store";
static String userName="Manju";
static String wineBrandNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addWineBrand(String wineBrandName){
	System.out.println("the user name is:"+userName);
	System.out.println(" manja bro bar start aythu hoguva baa...");
	boolean isAddWineBrandNames=false;
	if(wineBrandNames!=null){
		wineBrandNames[index]=wineBrandName;
		index++;
		isAddWineBrandNames=true;
	}else{
		System.out.println("the given name is not currect ,give valid name");
	}
	System.out.println(" manja bar end admele karkond bandidyalla buddi elva...");
	return isAddWineBrandNames;
	
}
public static void getbarName(){
	System.out.println("lo yav brand");
	for(String wineBrandNames:wineBrandNames){
		System.out.println(wineBrandNames);
	}
	System.out.println("loo ee brand kali agoythalla nin ajji");
	return;
}
public static boolean updateWineBrandName(String oldName,String newName){
	System.out.println("manja yav new brand name chappu...");
	boolean isupdatedvalue=false;
	for(int index=0;index<wineBrandNames.length-1;index++){
		if(oldName==wineBrandNames[index]){
			wineBrandNames[index]=newName;
			isupdatedvalue=true;
		}
	}
	if(isupdatedvalue==false){
		System.out.println(oldName+"not found");
	}
		System.out.println("manju close agoythu bar muchkond manege nedi...");

	return isupdatedvalue;
}
}