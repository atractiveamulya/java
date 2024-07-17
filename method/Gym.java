import java.util.*;
class Gym{
static String name="NewGym";
static String userName="Amulya";
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean createGymEquipments(String gymEquipment){
 boolean isGymEquipmentsName=false;
 if(gymEquipments!=null){
 gymEquipments[index]=gymEquipment;
 index++;
 isGymEquipmentsName=true;
 }else{
 System.out.println("the given name is not equipments name ,give currect name");
 }
 return isGymEquipmentsName;
 }
 public static void getGymEquipments(){
	 for(String gymEquipments: gymEquipments){
		 System.out.println(gymEquipments);
	 }
	 return;
 }
 public static boolean updatesgymEquipments(String oldName,String newName){
	 System.out.println("updatesgymEquipments is started");
	 boolean isupdatesgymEquipments=false;
	 for(int index=0;index<gymEquipments.length-1;index++){
		 if(oldName==gymEquipments[index]){
			 gymEquipments[index]=newName;
			 isupdatesgymEquipments=true;
		 }
	 }
	 if(isupdatesgymEquipments==false){
		 System.out.println(oldName+"not found");
	 }
	 System.out.println("the updatesgymEquipments ended");
	 return isupdatesgymEquipments;
 }
 public static boolean deleteEquipmentName(String gymEquipmentsdelete){
	System.out.println("the gymEquipmentdelete is started");
	boolean isdeletegymEquipment=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<gymEquipments.length;oldIndex++){
		if(gymEquipments[oldIndex]!=gymEquipmentsdelete){
		gymEquipments[newIndex]=gymEquipments[oldIndex];
		newIndex++;
		
		}
	}
	gymEquipments=Arrays.copyOf(gymEquipments,newIndex);
	if(gymEquipments!=null){
		isdeletegymEquipment=true;
	}
	if(isdeletegymEquipment==false){
		System.out.println( gymEquipmentsdelete+"not found");
	}
	System.out.println("the delete gymEquipmentsdelete is ended");
	return isdeletegymEquipment;
}
}