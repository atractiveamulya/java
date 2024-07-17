import java.util.*;
class RedChilliesEntertainment{
static String name="Actors";
static String userName="Dalini";
static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMovieActors(String movieActor){
 boolean ismovieActors=false;
 if(movieActors!=null){
 movieActors[index]=movieActor;
 index++;
 ismovieActors=true;
 }else{
 
 System.out.println("the given name is not Actor name ,give currect name");
 }
 return ismovieActors;
 
 }
 public static void getmovieActors(){
	 for(String movieActors: movieActors){
		 System.out.println(movieActors);
	 }
	 return;
 }
 public static boolean updatesmovieActorsNames(String oldName,String newName){
	System.out.println("the isupdatesmovieActorsNames is started");
	boolean isupdatesmovieActorsNames=false;
	for(int index=0;index<movieActors.length-1;index++){
		if(oldName==movieActors[index]){
			movieActors[index]=newName;
			isupdatesmovieActorsNames=true;
		}
	}
	if(isupdatesmovieActorsNames==false){
		System.out.println(oldName+"not found");
	}
	System.out.println("the isupdatesmovieActorsNames is ended");
	return isupdatesmovieActorsNames;
}

public static boolean deletemovieActors(String deletemovieActors){
	System.out.println("the deletemovieActors is started");
	boolean isdeletemovieActors=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex]!=deletemovieActors){
		movieActors[newIndex]=movieActors[oldIndex];
		newIndex++;
	    }
	}
	movieActors=Arrays.copyOf(movieActors,newIndex);
	if(movieActors!=null){
		isdeletemovieActors=true;
	}
	if(isdeletemovieActors==false){
		System.out.println( deletemovieActors+"not found");
	}
	System.out.println("the delete gymEquipmentsdelete is ended");
	return isdeletemovieActors;
}

}